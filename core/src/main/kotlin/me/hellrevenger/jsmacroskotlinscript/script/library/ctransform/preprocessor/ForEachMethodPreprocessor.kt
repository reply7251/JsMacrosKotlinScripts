package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

abstract class ForEachMethodPreprocessor : IAnnotationHandlerPreprocessor {
    override fun process(node: ClassNode) {
        for (methodNode in node.methods) {
            process(methodNode)
        }
    }

    abstract fun process(method: MethodNode)
}