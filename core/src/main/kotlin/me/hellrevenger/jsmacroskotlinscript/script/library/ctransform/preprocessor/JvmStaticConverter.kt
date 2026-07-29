package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.removeThisForStaticMethod
import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import java.lang.reflect.Modifier

class JvmStaticConverter : ForEachMethodPreprocessor() {
    var currentClass = ""
    override fun process(node: ClassNode) {
        currentClass = node.name
        if (node.innerClasses.find { it.name == node.name }?.let { it.access and Modifier.STATIC != 0 } == true) {
            super.process(node)
        }
    }
    override fun process(method: MethodNode) {
        if (Modifier.isStatic(method.access)) return
        // kotlin methods without @JvmStatic are instance method, so need to remove `this`
        method.access = method.access or Modifier.STATIC
        removeThisForStaticMethod(currentClass, method)
    }
}