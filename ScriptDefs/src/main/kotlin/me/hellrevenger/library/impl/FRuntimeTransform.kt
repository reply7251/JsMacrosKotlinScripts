package me.hellrevenger.library.impl

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.additionalclassprovider.InstrumentationClassProvider
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.utils.ASMUtils
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import kotlin.reflect.KClass

@Library(value = "RuntimeTransform", languages = [KotlinLanguageDefinition::class])
class FRuntimeTransform(val context: BaseScriptContext<*>) : PerExecLibrary(context) {
    private var manager: TransformerManager? = null
    private var transformed = false

    fun init() {
        if(manager == null) {
            (context as? KotlinScriptContext)?.let {
                it.onContextClosed {
                    disposed()
                }
            }
        } else {
            disposed()
        }
        manager = TransformerManager(InstrumentationClassProvider(instrumentation))
        transformed = false
    }

    private fun getAnnotationName(annotation: KClass<*>) = "L" + annotation.java.name.replace(".","/") + ";"

    private fun addAnnotation(annotations: MutableList<AnnotationNode>, annotation: KClass<*>): AnnotationNode {
        val annotationName = getAnnotationName(annotation)
        var node = annotations.find { it.desc == annotationName }
        if(node == null) {
            node = AnnotationNode(annotationName)
            annotations.add(node)
            return node
        }
        return node
    }

    fun addTransformer(transformer: KClass<*>) {
        manager?.let { manager ->
            addTransformer(ASMUtils.fromBytes(manager.classProvider.getClass(transformer.java.name)))
        }
    }

    fun addTransformer(transformer: ClassNode) {
        manager?.let { manager ->
            addAnnotation(transformer.visibleAnnotations, CReplaceCallback::class)
            transformer.methods.forEach {
                if(it.visibleAnnotations.any { it.desc.contains(getAnnotationName(CInject::class)) }) {
                    addAnnotation(it.visibleAnnotations, CInline::class)
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

    fun disposed() {
        manager?.let { manager ->
            instrumentation.removeTransformer(manager)
            if(transformed) {
                instrumentation.retransformClasses(*instrumentation.allLoadedClasses.filter {
                    manager.transformedClasses.contains(it.name)
                }.toTypedArray())
            }
        }
        transformed = false
    }
}