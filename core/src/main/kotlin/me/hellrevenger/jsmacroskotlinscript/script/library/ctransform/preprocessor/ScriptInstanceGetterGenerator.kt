package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.api.ScriptHolder
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.IRequireScriptHolderSetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.generateScriptInstanceGetter
import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import org.objectweb.asm.tree.VarInsnNode
import java.lang.reflect.Modifier
import kotlin.collections.iterator

class ScriptInstanceGetterGenerator(val requireScriptHolderSetter: IRequireScriptHolderSetter) : IAnnotationHandlerPreprocessor {
    override fun process(classNode: ClassNode) {
        classNode.methods.removeIf { it.name == "<init>" }
        classNode.methods.forEach {
            process(it)
        }
        classNode.fields.removeIf { it.name == "this$0" }
    }

    fun process(methodNode: MethodNode) {
        if (Modifier.isStatic(methodNode.access)) return
        generateScriptInstanceGetter(methodNode, requireScriptHolderSetter)
    }
}

