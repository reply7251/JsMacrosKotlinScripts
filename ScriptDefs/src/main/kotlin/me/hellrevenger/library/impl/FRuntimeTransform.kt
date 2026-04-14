package me.hellrevenger.library.impl

import com.jsmacrosce.jsmacros.core.language.BaseScriptContext
import com.jsmacrosce.jsmacros.core.library.Library
import com.jsmacrosce.jsmacros.core.library.PerExecLibrary
import me.hellrevenger.ctransform.SimpleFieldTarget
import me.hellrevenger.ctransform.SimpleInvokeTarget
import me.hellrevenger.ctransform.SimpleNewTarget
import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.language.impl.incrementalScriptSourceCounter
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.getBytes
import me.hellrevenger.library.api.instrumentation
import me.hellrevenger.mixins.MixinClassLoaderCallback
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.utils.ASMUtils
import net.lenni0451.classtransform.utils.FailStrategy
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.Remapper
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import java.io.IOException
import java.lang.reflect.Modifier
import java.util.*
import kotlin.reflect.KClass

@Library(value = "RuntimeTransform", languages = [KotlinLanguageDefinition::class])
class FRuntimeTransform(val context: BaseScriptContext<*>) : PerExecLibrary(context) {
    private var manager: TransformerManager? = null
    private var transformed = false
    val forceLoadedClasses = mutableSetOf<String>()

    fun init() {
        if(manager == null) {
            (context as? KotlinScriptContext)?.let {
                it.onContextClosed {
                    disposed()
                }
                incrementalScriptSourceCounter++
            }
        } else {
            disposed()
        }
        setManager(TransformerManager(BasicClassProvider()))
    }

    fun setManager(manager: TransformerManager) {
        this.manager = manager.apply {
            addInjectionTarget(CTargetType.SIMPLE_INVOKE, SimpleInvokeTarget())
            addInjectionTarget(CTargetType.SIMPLE_NEW, SimpleNewTarget())
            addInjectionTarget(CTargetType.SIMPLE_FIELD, SimpleFieldTarget())
            addInjectionTarget(CTargetType.SIMPLE_GET_FIELD, SimpleFieldTarget.getField())
            addInjectionTarget(CTargetType.SIMPLE_PUT_FIELD, SimpleFieldTarget.putField())
            failStrategy = FailStrategy.CANCEL
        }
        transformed = false
    }

    private fun getAnnotationName(annotation: KClass<*>) = "L" + annotation.java.name.replace(".","/") + ";"

    private fun addAnnotation(annotations: MutableList<AnnotationNode>, annotation: KClass<*>) {
        val annotationName = getAnnotationName(annotation)
        var node = annotations.find { it.desc == annotationName }
        if(node == null) {
            node = AnnotationNode(annotationName)
            annotations.add(node)
        }
    }

    fun addTransformer(transformer: KClass<*>) {
        addTransformer(transformer.java)
    }

    fun addTransformer(transformer: Class<*>) {
        val bytes = transformer.getBytes()
        try {
            val relativeClasses = Collector.getClassesUsedBy(transformer.classLoader, bytes, transformer.declaringClass.name)
            relativeClasses.forEach {
                if (Modifier.isStatic(it.modifiers) && it.name != transformer.name) {
                    println("auto force-loading class $it")
                    forceLoad(it)
                }
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

        addTransformer(ASMUtils.fromBytes(bytes))
    }

    fun addTransformer(transformer: ClassNode) {
        manager?.let { manager ->
            arrayOf(transformer.invisibleAnnotations, transformer.visibleAnnotations).forEach { annotations ->
                if(annotations?.any { it.desc == getAnnotationName(CTransformer::class) } == true) {
                    addAnnotation(annotations, CReplaceCallback::class)
                }
            }
            transformer.methods.forEach {
                arrayOf(it.invisibleAnnotations, it.visibleAnnotations).forEach { annotations ->
                    if(annotations?.any {
                        it.desc.startsWith("Lnet/lenni0451/classtransform/annotations/injection/C")
                    } == true) {
                        addAnnotation(annotations, CInline::class)
                    }
                }
            }
            manager.addTransformer(transformer)
        }
    }

    fun transform() {
        if(!transformed) {
            transformed = true
            manager?.hookInstrumentation(instrumentation)
        }
    }

    fun forceLoad(clazz: KClass<*>) {
        forceLoad(clazz.java)
    }

    fun forceLoad(clazz: Class<*>) {
        if (forceLoadedClasses.add(clazz.name)) {
            MixinClassLoaderCallback.forceLoadedClasses[clazz.name] = clazz
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
            forceLoadedClasses.forEach {
                MixinClassLoaderCallback.forceLoadedClasses.remove(it)
            }
            forceLoadedClasses.clear()
        }
        transformed = false
    }

    private class Collector(private val classLoader: ClassLoader, private val classNames: MutableSet<Class<*>>, private val prefix: String = "") : Remapper() {
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
