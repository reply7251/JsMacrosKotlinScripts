package me.hellrevenger.library.api


import com.sun.jna.NativeLibrary
import com.sun.jna.ptr.IntByReference
import com.sun.jna.ptr.PointerByReference
import javassist.ClassPool
import me.hellrevenger.SharedLibraries
import net.bytebuddy.ByteBuddy
import net.bytebuddy.asm.Advice
import net.bytebuddy.asm.AsmVisitorWrapper
import net.bytebuddy.description.field.FieldDescription
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.description.modifier.Visibility
import net.bytebuddy.description.type.TypeDescription
import net.bytebuddy.dynamic.ClassFileLocator
import net.bytebuddy.dynamic.Transformer.ForField
import net.bytebuddy.dynamic.VisibilityBridgeStrategy
import net.bytebuddy.dynamic.loading.ClassInjector
import net.bytebuddy.dynamic.scaffold.TypeValidation
import net.bytebuddy.implementation.Implementation
import net.bytebuddy.implementation.MethodDelegation
import net.bytebuddy.jar.asm.AnnotationVisitor
import net.bytebuddy.jar.asm.MethodVisitor
import net.bytebuddy.matcher.ElementMatcher
import net.bytebuddy.matcher.ElementMatchers
import net.bytebuddy.pool.TypePool
import net.bytebuddy.utility.OpenedClassReader
import net.bytebuddy.utility.RandomString
import org.objectweb.asm.Type
import org.spongepowered.tools.agent.MixinAgent
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import java.io.File
import java.lang.instrument.ClassDefinition
import java.lang.instrument.ClassFileTransformer
import java.lang.instrument.Instrumentation
import java.lang.reflect.Modifier
import java.security.ProtectionDomain
import kotlin.jvm.internal.Intrinsics

private fun tryGetInstrumentation(): Instrumentation {
//    try {
//        return net.bytebuddy.agent.ByteBuddyAgent.install()
//    } catch (_: Exception) {}
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

val classInjector = ClassInjector.UsingUnsafe.Factory.resolve(instrumentation).make(SharedLibraries.Client.minecraft::class.java.classLoader)

var classInjectorInited = false
private fun initClassInjector() {
    if(!classInjectorInited) {
        classInjectorInited = true

        val jvmClasses = arrayOf(
            KotlinNullPointerException::class.java,
            UninitializedPropertyAccessException::class.java,
            Intrinsics::class.java,
        )

        classInjector.inject(jvmClasses.associate { TypeDescription.ForLoadedType.of(it) to ClassFileLocator.ForClassLoader.read(it) })
    }
}

class KotlinFinalRemovalMethodVisitor(visitor: MethodVisitor) : MethodVisitor(OpenedClassReader.ASM_API, visitor) {
    enum class Status {
        None,
        LoadReturnValue
    }

    val parameters = mutableListOf<String?>()
    var returnValueParameter = ""
    var returnValueParameterIndex = -1
    var shadowReturnValueIndex = -1
    var status = Status.None

    override fun visitParameterAnnotation(parameter: Int, descriptor: String?, visible: Boolean): AnnotationVisitor {
        if(Type.getDescriptor(Advice.Return::class.java) == descriptor) {
            returnValueParameterIndex = parameter
        }
        return super.visitParameterAnnotation(parameter, descriptor, visible)
    }

    override fun visitParameter(name: String?, access: Int) {
        parameters.add(name)
        super.visitParameter(name,access and Modifier.FINAL.inv())
    }

    override fun visitVarInsn(opcode: Int, varIndex: Int) {
        var varIndex0 = varIndex

        if(varIndex0 == returnValueParameterIndex && shadowReturnValueIndex == -1) {
            status = Status.LoadReturnValue
        } else if(status == Status.LoadReturnValue) {
            status = Status.None
            shadowReturnValueIndex = varIndex0
        } else if(varIndex0 == shadowReturnValueIndex) {
            varIndex0 = returnValueParameterIndex
        }

        super.visitVarInsn(opcode, varIndex0)
    }

    override fun visitIincInsn(varIndex: Int, increment: Int) {
        var varIndex0 = varIndex
        if(varIndex0 == shadowReturnValueIndex) {
            varIndex0 = returnValueParameterIndex
        }
        super.visitIincInsn(varIndex0, increment)
    }

    override fun visitEnd() {
        super.visitEnd()
        reset()
    }

    fun reset() {
        parameters.clear()
        returnValueParameter = ""
        returnValueParameterIndex = -1
        shadowReturnValueIndex = -1
        status = Status.None
    }
}

class KotlinFinalRemovalWrapper : AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
    override fun wrap(
        typeDescription: TypeDescription,
        methodDescription: MethodDescription,
        visitor: MethodVisitor,
        context: Implementation.Context,
        typePool: TypePool,
        p5: Int,
        p6: Int
    ): MethodVisitor {
        return KotlinFinalRemovalMethodVisitor(visitor)
    }
}

class RuntimeMixin {
    companion object {
        private val originalByteCodes = mutableMapOf<Class<*>, ByteArray>()
        private val proceedByteCodes = mutableMapOf<Class<*>, ByteArray>()
        private val mixinSteps = mutableMapOf<Class<*>, MutableList<AsmVisitorWrapper>>()
        private val intercepts = mutableMapOf<Class<*>, MutableMap<ElementMatcher<in MethodDescription>, Implementation>>()
        private val addedClassPath = mutableSetOf<String>()
        private val publicFields = mutableMapOf<Class<*>, MutableList<ElementMatcher<in FieldDescription>>>()
        private var hash = instrumentation.hashCode()
        private var enableDebug = false

        fun getOriginalByteCode(kClass: Class<*>) = originalByteCodes[kClass] ?: GetByteCode.getByteCode(kClass)

        fun getProceedByteCode(kClass: Class<*>) = proceedByteCodes[kClass] ?: GetByteCode.getByteCode(kClass)

        fun getMixinSteps(targetClass: Class<*>): MutableList<AsmVisitorWrapper> {
            var result = mixinSteps[targetClass]
            if(result != null) return result
            result = mutableListOf()
            mixinSteps[targetClass] = result
            return result
        }
        
        fun getIntercepts(targetClass: Class<*>): MutableMap<ElementMatcher<in MethodDescription>, Implementation> {
            var result = intercepts[targetClass]
            if(result != null) return result
            result = mutableMapOf()
            intercepts[targetClass] = result
            return result
        }

        fun getPublic(targetClass: Class<*>): MutableList<ElementMatcher<in FieldDescription>> {
            var result = publicFields[targetClass]
            if(result != null) return result
            result = mutableListOf()
            publicFields[targetClass] = result
            return result
        }

        fun setMethodDelegateIntercept(targetClass: Class<*>, matcher: ElementMatcher<in MethodDescription>, delegate: Class<*>) {
            setIntercept(targetClass, matcher, MethodDelegation.to(addClassPath(delegate)))
            return
        }

        fun setIntercept(targetClass: Class<*>, matcher: ElementMatcher<in MethodDescription>, implementation: Implementation) {
            getIntercepts(targetClass)[matcher] = implementation
        }

        fun removeIntercept(targetClass: Class<*>, matcher: ElementMatcher<in MethodDescription>) {
            getIntercepts(targetClass).remove(matcher)
        }

        fun addClassPath(targetClass: Class<*>, constant: Boolean = false): Class<out Any> {
            return if(constant) {
                if(!addedClassPath.contains(targetClass.name))
                    classInjector.inject(mapOf(TypeDescription.ForLoadedType.of(targetClass) to getOriginalByteCode(targetClass)))
                targetClass
            } else {
                val unloaded = ByteBuddy()
                    .with(TypeValidation.DISABLED)
                    .rebase(targetClass, ClassFileLocator.ForInstrumentation.of(instrumentation, targetClass))
                    .name(targetClass.name + "$$" + RandomString.hashOf(hash++))
                    .make()
                val bytes = unloaded.bytes
                val result = unloaded
                    .load(targetClass.classLoader)
                    .loaded

                classInjector.inject(mapOf(unloaded.typeDescription to bytes))
                result
            }
        }

        fun addMixin(targetClass: Class<*>, visitor: AsmVisitorWrapper) {
            getMixinSteps(targetClass).add(visitor)
        }

        fun removeMixin(targetClass: Class<*>, visitor: AsmVisitorWrapper) {
            getMixinSteps(targetClass).remove(visitor)
        }

        fun makePublic(targetClass: Class<*>, matcher: ElementMatcher<in FieldDescription>) {
            getPublic(targetClass).add(matcher)
        }

        fun removePublic(targetClass: Class<*>, matcher: ElementMatcher<in FieldDescription>) {
            getPublic(targetClass).remove(matcher)
        }

        fun doMixin(targetClass: Class<*>) {
            val oldByteCode = getOriginalByteCode(targetClass) ?: return

            originalByteCodes[targetClass] = oldByteCode
            instrumentation.redefineClasses(ClassDefinition(targetClass, oldByteCode))

            initClassInjector()

            var builder = ByteBuddy()
                .with(TypeValidation.DISABLED)
                .with(VisibilityBridgeStrategy.Default.NEVER)
                .redefine(targetClass, ClassFileLocator.ForInstrumentation.of(instrumentation, targetClass))


            getPublic(targetClass).forEach {
                builder = builder.field(it).transform(ForField.withModifiers(Visibility.PUBLIC))
            }

            getIntercepts(targetClass).forEach { (matcher, implementation) ->
                builder = builder.method(matcher).intercept(implementation)
            }

            getMixinSteps(targetClass).forEach {
                builder = builder.visit(it)
            }

            val newByteCode = builder.make().bytes

            proceedByteCodes[targetClass] = newByteCode

            instrumentation.redefineClasses(ClassDefinition(targetClass, newByteCode))
        }

        fun getPatchedImplementation(implementation: Class<*>, addToClassPath: Boolean = false): Advice {
            var implementation = implementation
            val builder = ByteBuddy()
                .with(TypeValidation.DISABLED)
                .with(VisibilityBridgeStrategy.Default.NEVER)
                .redefine(implementation)
                .field(ElementMatchers.any()).transform(ForField.withModifiers(Visibility.PUBLIC))
                .visit(AsmVisitorWrapper.ForDeclaredMethods().method(ElementMatchers.any(), KotlinFinalRemovalWrapper()))
            val bytes = builder.make().bytes

            instrumentation.redefineClasses(ClassDefinition(implementation, bytes))
            if(addToClassPath) {
                implementation = addClassPath(implementation)
            }

            return Advice.to(implementation, ClassFileLocator.ForInstrumentation.of(instrumentation, implementation))
        }

        fun writeResult(context: EventContainer<*>, targetClass: Class<*>, fileName: String = "dump.class") {
            getProceedByteCode(targetClass)?.let {
                File(File(context.ctx.containedFolder, "debug"), fileName).writeBytes(it)
            }
        }
    }
}