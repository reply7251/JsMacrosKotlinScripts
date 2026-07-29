package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.api._getPrivateValue
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_SHADOW_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.getAnnotationName
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.transformer.AnnotationHandler
import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import net.lenni0451.classtransform.transformer.types.RemovingAnnotationHandler
import org.objectweb.asm.tree.ClassNode

class ShadowChecker(manager: TransformerManager) : IAnnotationHandlerPreprocessor {

    val cAnnotations = manager._getPrivateValue<List<AnnotationHandler>>("annotationHandler")!!
        .filterIsInstance(RemovingAnnotationHandler::class.java)
        .mapNotNull { handler ->
            handler._getPrivateValue<Class<*>>("annotationClass")?.let {
                getAnnotationName(it.kotlin)
            }
        }.toSet() + setOf(C_SHADOW_NAME)


    override fun process(node: ClassNode) {
        node.fields.forEach { fieldNode ->
            if (fieldNode.invisibleAnnotations?.none { cAnnotations.contains(it.desc) } != false) {
//                throw IllegalArgumentException("field ${fieldNode.name} doesn't have Cxxx annotations")
            }
        }
        node.methods.forEach { methodNode ->
            if (methodNode.invisibleAnnotations?.none { cAnnotations.contains(it.desc) } != false) {
//                throw IllegalArgumentException("method ${methodNode.name} doesn't have Cxxx annotations")
            }
        }
    }
}