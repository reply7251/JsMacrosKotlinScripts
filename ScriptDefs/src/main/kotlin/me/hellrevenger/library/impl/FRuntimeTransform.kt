package me.hellrevenger.library.impl

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.language.impl.incrementalScriptSourceCounter
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.additionalclassprovider.InstrumentationClassProvider
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.utils.ASMUtils
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
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
                incrementalScriptSourceCounter++
            }
        } else {
            disposed()
        }
        manager = TransformerManager(InstrumentationClassProvider(instrumentation))
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
        addTransformer(ASMUtils.fromBytes(BasicClassProvider(transformer.java.classLoader).getClass(transformer.java.name)))
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
