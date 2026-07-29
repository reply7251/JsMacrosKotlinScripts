package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import org.objectweb.asm.tree.ClassNode

class StaticRemover : IAnnotationHandlerPreprocessor {
    override fun process(classNode: ClassNode) {
        classNode.fields.removeIf { it.name == "INSTANCE" }
        classNode.methods.removeIf { it.name == "<clinit>" || it.name == "<init>" }
    }
}