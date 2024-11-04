package me.hellrevenger.library.api


import com.sun.jna.NativeLibrary
import com.sun.jna.ptr.IntByReference
import com.sun.jna.ptr.PointerByReference
import net.bytebuddy.ByteBuddy
import net.bytebuddy.asm.AsmVisitorWrapper
import net.bytebuddy.dynamic.ClassFileLocator
import net.bytebuddy.dynamic.VisibilityBridgeStrategy
import net.bytebuddy.dynamic.scaffold.TypeValidation
import org.spongepowered.tools.agent.MixinAgent
import java.lang.instrument.ClassDefinition
import java.lang.instrument.ClassFileTransformer
import java.lang.instrument.Instrumentation
import java.security.ProtectionDomain

private fun tryGetInstrumentation(): Instrumentation {
    val field = MixinAgent::class.java.getDeclaredField("instrumentation")
    if(field.trySetAccessible()) {
        val result = field.get(null)
        if(result != null) {
            return result as Instrumentation
        }

        val libJVM = NativeLibrary.getInstance("jvm")
        val libInstrument = NativeLibrary.getInstance("instrument")

        val jvmPointer = PointerByReference()
        val jvmCountPointer = IntByReference()
        var error = libJVM.getFunction("JNI_GetCreatedJavaVMs").invokeInt(arrayOf(jvmPointer, 1, jvmCountPointer))
        if(error != 0) {
            throw Error("error code: $error occurred when invoking JNI_GetCreatedJavaVMs")
        }
        if(jvmCountPointer.value != 1) {
            throw  Error("jvm not found or more than 1")
        }
        val jvm = jvmPointer.value
        var path = MixinAgent::class.java.protectionDomain.codeSource.location.path
        if(path.startsWith("/")) path = path.substring(1)

        error = libInstrument.getFunction("Agent_OnAttach").invokeInt(arrayOf(jvm, path, null))

        if(error != 0) {
            throw Error("error code: $error occurred when invoking Agent_OnAttach")
        }
        return field.get(null) as Instrumentation
    }
    throw Error("cannot access MixinAgent.instrumentation")
}

public val instrumentation = tryGetInstrumentation()


class GetByteCode : ClassFileTransformer {
    companion object {
        fun getByteCode(clazz: Class<*>): ByteArray? {
            val transformer = GetByteCode()
            instrumentation.addTransformer(transformer, true)
            instrumentation.retransformClasses(clazz)
            instrumentation.removeTransformer(transformer)
            return transformer.data
        }
    }

    var data: ByteArray? = null

    override fun transform(
        loader: ClassLoader?,
        className: String?,
        classBeingRedefined: Class<*>?,
        protectionDomain: ProtectionDomain?,
        classfileBuffer: ByteArray?
    ): ByteArray {
        data = classfileBuffer
        return super.transform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer)
    }
}

class RuntimeMixin {
    companion object {
        private val originalByteCodes = mutableMapOf<Class<*>, ByteArray>()
        private val proceedByteCodes = mutableMapOf<Class<*>, ByteArray>()
        private val mixinSteps = mutableMapOf<Class<*>, MutableList<AsmVisitorWrapper>>()

        fun getOriginalByteCode(kClass: Class<*>) = originalByteCodes[kClass] ?: GetByteCode.getByteCode(kClass)

        fun getProceedByteCode(kClass: Class<*>) = proceedByteCodes[kClass] ?: GetByteCode.getByteCode(kClass)

        fun getMixinSteps(targetClass: Class<*>): MutableList<AsmVisitorWrapper> {
            var result = mixinSteps[targetClass]
            if(result != null) return result
            result = mutableListOf()
            mixinSteps[targetClass] = result
            return result
        }

        fun addMixin(targetClass: Class<*>, visitor: AsmVisitorWrapper) {
            getMixinSteps(targetClass).add(visitor)
        }

        fun removeMixin(targetClass: Class<*>, visitor: AsmVisitorWrapper) {
            getMixinSteps(targetClass).remove(visitor)
        }

        fun doMixin(targetClass: Class<*>) {
            val oldByteCode = getOriginalByteCode(targetClass) ?: return
            originalByteCodes[targetClass] = oldByteCode
            instrumentation.redefineClasses(ClassDefinition(targetClass, oldByteCode))

            var builder = ByteBuddy()
                .with(TypeValidation.DISABLED)
                .with(VisibilityBridgeStrategy.Default.NEVER)
                .redefine(targetClass, ClassFileLocator.ForInstrumentation.of(instrumentation, targetClass))

            getMixinSteps(targetClass).forEach {
                builder = builder.visit(it)
            }

            val newByteCode = builder.make().bytes

            proceedByteCodes[targetClass] = newByteCode

            instrumentation.redefineClasses(ClassDefinition(targetClass, newByteCode))
        }
    }
}