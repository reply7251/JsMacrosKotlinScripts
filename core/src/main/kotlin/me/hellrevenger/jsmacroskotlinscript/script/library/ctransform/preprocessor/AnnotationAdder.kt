package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_ANNOTATION_PREFIX
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_TRANSFORMER_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.KnownIllegalStateException
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode
import kotlin.reflect.KClass

class AnnotationAdder : ForEachMethodPreprocessor() {
    override fun process(node: ClassNode) {
        if (!checkCTransformer(node))
            throw KnownIllegalStateException("transformer doesn't have @CTransformer")

        super.process(node)
    }

    override fun process(method: MethodNode) {
        val annotations = method.invisibleAnnotations
        if(annotations?.any {
                it.desc.startsWith(C_ANNOTATION_PREFIX)
            } == true) {
            addAnnotation(annotations, CInline::class)
        }
    }

    fun checkCTransformer(node: ClassNode): Boolean {
        val annotations = node.invisibleAnnotations
        // addAnnotation(annotations, CReplaceCallback::class)
        return annotations?.any { it.desc == C_TRANSFORMER_NAME } == true
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
}