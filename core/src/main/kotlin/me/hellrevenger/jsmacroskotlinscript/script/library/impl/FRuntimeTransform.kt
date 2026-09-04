package me.hellrevenger.jsmacroskotlinscript.script.library.impl

import me.hellrevenger.jsmacroskotlinscript.ctransform.MixinClassLoaderCallback
import me.hellrevenger.jsmacroskotlinscript.script.language.CompilerSetting
import me.hellrevenger.jsmacroskotlinscript.script.language.KotlinLanguageDefinition
import me.hellrevenger.jsmacroskotlinscript.script.language.KotlinScriptContext
import me.hellrevenger.jsmacroskotlinscript.ScriptReceiver
import me.hellrevenger.jsmacroskotlinscript.script.language.incrementalScriptSourceCounter
import me.hellrevenger.jsmacroskotlinscript.script.library.api.CTargetType
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.FinalRemover
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ScriptHolder
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.StaticRemover
import me.hellrevenger.jsmacroskotlinscript.script.library.api.getBytes
import me.hellrevenger.jsmacroskotlinscript.script.library.api.instrumentation
import me.hellrevenger.jsmacroskotlinscript.script.library.api.literal
import me.hellrevenger.jsmacroskotlinscript.script.library.api.sendToPlayer
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.KnownIllegalStateException
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.SimpleFieldTarget
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.SimpleInvokeTarget
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.SimpleNewTarget
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.AnnotationAdder
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.AnnotationChecker
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.IRequireScriptHolderSetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.InvokeDynamicPreprocessor
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.ScriptInstanceGetterGenerator
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.ScriptStaticConverter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor.ShadowChecker
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import net.lenni0451.classtransform.utils.ASMUtils
import net.lenni0451.classtransform.utils.FailStrategy
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
import net.minecraft.network.chat.ClickEvent
import net.minecraft.network.chat.Style
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.Remapper
import org.objectweb.asm.tree.ClassNode
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import java.io.File
import java.io.IOException
import java.lang.reflect.Modifier
import java.util.*
import kotlin.reflect.KClass
/*
boolean	Z
byte	B
char	C
double	D
float	F
int	I
long	J
short	S
void	V
Arrays	[ + the element type: int[] -> [I
Objects	L + the internal name + ;: String -> Ljava/lang/String;
 */
/**
 * `init()` -> `addTransformer()` -> `transform()`
 */
@Library(value = "RuntimeTransform", languages = [KotlinLanguageDefinition::class])
class FRuntimeTransform(val context: BaseScriptContext<*>) : PerExecLibrary(context), IRequireScriptHolderSetter {
    private var manager: TransformerManager? = null
    private var transformed = false
    var anyForceLoad = false
    val forceLoadedClasses = mutableSetOf<String>()

    private val invokeDynamicPreprocessor = InvokeDynamicPreprocessor()
    private val useInvokeDynamic get() = invokeDynamicPreprocessor.owner != null
    private var shouldUseInvokeDynamicSet = false

    /**
     * dump transformer bytecode
     */
    private var dump = false
    var requireScriptHolder = false

    /**
     * `init()` -> `addTransformer()` -> `transform()`
     */
    context(receiver: ScriptReceiver)
    fun init(dump: Boolean = false, disableAnnotationChecker: Boolean = false) {
        if(manager == null) {
            (context as? KotlinScriptContext)?.onContextClosed {
                disposed()
            }
        } else {
            disposed()
        }
        setManager(TransformerManager(BasicClassProvider()))
        this.dump = dump
    }

    context(receiver: ScriptReceiver)
    fun setManager(manager: TransformerManager, disableAnnotationChecker: Boolean = false) {
        if (!shouldUseInvokeDynamicSet && CompilerSetting.shouldUseInvokeDynamic()) {
            setUseInvokeDynamic()
        }

        this.manager = manager.apply {
            addInjectionTarget(
                CTargetType.SIMPLE_INVOKE,
                SimpleInvokeTarget()
            )
            addInjectionTarget(
                CTargetType.SIMPLE_NEW,
                SimpleNewTarget()
            )
            addInjectionTarget(
                CTargetType.SIMPLE_FIELD,
                SimpleFieldTarget()
            )
            addInjectionTarget(CTargetType.SIMPLE_GET_FIELD, SimpleFieldTarget.getField())
            addInjectionTarget(CTargetType.SIMPLE_PUT_FIELD, SimpleFieldTarget.putField())
            failStrategy = FailStrategy.CANCEL
            listOf(
                StaticRemover(), FinalRemover(), AnnotationAdder(),
                invokeDynamicPreprocessor,

                ScriptStaticConverter(this@FRuntimeTransform),
                ScriptInstanceGetterGenerator(this@FRuntimeTransform),
                ShadowChecker(this),
            ).forEach(::addTransformerPreprocessor)

            if (!disableAnnotationChecker)
                addTransformerPreprocessor(AnnotationChecker(this))
        }
        transformed = false
    }

    fun addTransformerPreprocessor(processor: IAnnotationHandlerPreprocessor) {
        manager?.addTransformerPreprocessor(processor)
    }

    context(receiver: ScriptReceiver)
    fun setUseInvokeDynamic(enabled: Boolean = true) {
        if (enabled) {
            invokeDynamicPreprocessor.owner = receiver::class.java.name
        } else {
            invokeDynamicPreprocessor.owner = null
        }
        shouldUseInvokeDynamicSet = true
    }

    /**
     * add transformers before invoking this method will throw `IllegalStateException`
     */
    context(receiver: ScriptReceiver)
    fun transformInOneStep(dump: Boolean = false, disableAnnotationChecker: Boolean = false) {
        addAllTransformer(dump, disableAnnotationChecker)
        transform()
    }

    /**
     * `addAllTransformer()` -> `transform()`
     * add transformers before invoking this method will throw `IllegalStateException`
     */
    context(receiver: ScriptReceiver)
    fun addAllTransformer(dump: Boolean = false, disableAnnotationChecker: Boolean = false) {
        if (manager == null) {
            init(dump, disableAnnotationChecker)
        } else if (manager!!.registeredTransformer.isNotEmpty()) {
            throw IllegalStateException("Shouldn't call when already registered transformers")
        }
        receiver::class.java.declaredClasses.forEach {
            try {
                addTransformer(it)
            } catch (ignored: KnownIllegalStateException) { }
        }
    }

    /**
     * `init()` -> `addTransformer()` -> `transform()`
     */
    fun addTransformer(transformer: KClass<*>) {
        addTransformer(transformer.java)
    }

    /**
     * `init()` -> `addTransformer()` -> `transform()`
     */
    fun addTransformer(transformer: Class<*>) {
        val bytes = transformer.getBytes()

        addTransformer(ASMUtils.fromBytes(bytes))

        try {
            val relativeClasses = Collector.getClassesUsedBy(transformer.classLoader, bytes, transformer.declaringClass.name)
            relativeClasses.forEach {
                if (Modifier.isStatic(it.modifiers) && it.name != transformer.name) {
                    println("auto force-loading $it")
                    forceLoad(it)
                }
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

        if (requireScriptHolder) {
            try {
                var c = transformer
                while (c.declaringClass != null) {
                    c = c.declaringClass
                }
                println("auto force-loading $c")
                forceLoad(c)
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }
    }

    fun addTransformer(transformer: ClassNode) {
        manager?.let { manager ->
            manager.addTransformer(transformer)
            if (dump) {
                context.file?.let {
                    val outputFolder = File(it.parentFile, "output")
                    outputFolder.mkdirs()
                    val outputFile = File(outputFolder, "${transformer.name}.class")
                    "dump to $outputFile".literal()
                        .withStyle(Style.EMPTY.withClickEvent(ClickEvent.OpenFile(outputFolder)))
                        .sendToPlayer()
                    outputFile.writeBytes(ASMUtils.toBytes(transformer, manager))
                }
            }
        }
    }

    /**
     * `init()` -> `addTransformer()` -> `transform()`
     */
    context(receiver: ScriptReceiver)
    fun transform() {
        if(!transformed) {
            if (requireScriptHolder && !CompilerSetting.shouldPatchClassloader()) {
                throw IllegalArgumentException("some transformers require script instance while classloader patch is disabled")
            }
            if (requireScriptHolder || useInvokeDynamic) {
                ScriptHolder.put(receiver)
                receiver.context.onContextClosed {
                    ScriptHolder.remove(receiver)
                }
            }
            if (useInvokeDynamic) {
                receiver::class.java.declaredClasses.filter {
                    invokeDynamicPreprocessor.requiredClasses.contains(it.name)
                }.forEach { klass ->
                    ScriptHolder.put(klass.name, klass)
                    receiver.context.onContextClosed {
                        ScriptHolder.remove(klass.name)
                    }
                }
            }
            transformed = true

            manager?.hookInstrumentation(instrumentation)
        }
    }

    fun forceLoad(clazz: KClass<*>) {
        forceLoad(clazz.java)
    }

    fun forceLoad(clazz: Class<*>) {
        if (useInvokeDynamic) return
        if (forceLoadedClasses.add(clazz.name)) {
            MixinClassLoaderCallback.forceLoadedClasses[clazz.name] = clazz
        }
        if (!anyForceLoad) {
            anyForceLoad = true
            incrementalScriptSourceCounter++
        }
    }

    fun disposed() {
        manager?.let { manager ->
            instrumentation.removeTransformer(manager)
            if(transformed) {
                instrumentation.retransformClasses(*instrumentation.allLoadedClasses.filter {
                    manager.transformedClasses.contains(it.name)
                }.toTypedArray())
            }
            forceLoadedClasses.forEach(MixinClassLoaderCallback.forceLoadedClasses::remove)
            forceLoadedClasses.clear()
        }
        manager = null
        transformed = false
        requireScriptHolder = false
        anyForceLoad = false
    }

    override fun setRequireScriptHolder() {
        requireScriptHolder = true
    }

    private class Collector(private val classLoader: ClassLoader, private val classNames: MutableSet<Class<*>>, private val prefix: String = "") : Remapper(Opcodes.ASM9) {
        companion object {
            @Throws(IOException::class)
            fun getClassesUsedBy(
                classLoader: ClassLoader,
                bytes: ByteArray,  // class name
                prefix: String = "" // common prefix for all classes
            ): MutableSet<Class<*>> {
                val reader = ClassReader(bytes)
                val writer = ClassWriter(0)
                val classes = TreeSet<Class<*>>(Comparator<Class<*>> { c1, c2 -> c1.getName().compareTo(c2.getName()) })
                val remapper: Remapper = Collector(classLoader, classes, prefix)
                val visitor: ClassVisitor = ClassRemapper(writer, remapper)
                reader.accept(visitor, 0)
                return classes
            }
        }

        override fun mapDesc(desc: String): String? {
            if (desc.startsWith("L")) {
                this.addType(desc.substring(1, desc.length - 1))
            }
            return super.mapDesc(desc)
        }

        override fun mapTypes(types: Array<String>): Array<String?>? {
            for (type in types) {
                this.addType(type)
            }
            return super.mapTypes(types)
        }

        private fun addType(type: String) {
            val className = type.replace('/', '.')
            if (className.startsWith(this.prefix)) {
                try {
                    this.classNames.add(Class.forName(className, false, classLoader))
                } catch (e: ClassNotFoundException) {
                    throw IllegalStateException(e)
                }
            }
        }

        override fun mapType(type: String): String {
            this.addType(type)
            return type
        }
    }
}
