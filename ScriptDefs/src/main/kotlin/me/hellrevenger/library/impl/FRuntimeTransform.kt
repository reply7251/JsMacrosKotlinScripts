package me.hellrevenger.library.impl

import me.hellrevenger.ctransform.SimpleFieldTarget
import me.hellrevenger.ctransform.SimpleInvokeTarget
import me.hellrevenger.ctransform.SimpleNewTarget
import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.language.impl.incrementalScriptSourceCounter
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.getBytes
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.utils.ASMUtils
import net.lenni0451.classtransform.utils.FailStrategy
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import com.jsmacrosce.jsmacros.core.language.BaseScriptContext
import com.jsmacrosce.jsmacros.core.library.Library
import com.jsmacrosce.jsmacros.core.library.PerExecLibrary
import me.hellrevenger.mixins.MixinClassLoaderCallback
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
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
        try {
            val callback = transformer.java.classLoader.loadClass(transformer.java.name + "Callback")
            forceLoad(callback)
        } catch (e: Exception) {}
        addTransformer(ASMUtils.fromBytes(transformer.java.getBytes()))
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
        forceLoadedClasses.add(clazz.name)
        MixinClassLoaderCallback.forceLoadedClasses[clazz.name] = clazz
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
}
