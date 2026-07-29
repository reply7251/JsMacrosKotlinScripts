package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.RemoveFinal
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.getAnnotationName
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import java.lang.reflect.Modifier
import kotlin.collections.iterator

class FinalRemover : ForEachMethodPreprocessor() {
    companion object {
        val removeFinalDesc = getAnnotationName(RemoveFinal::class)
    }

    var isStatic = 1
    override fun process(method: MethodNode) {
        isStatic = if (Modifier.isStatic(method.access)) { 0 } else { 1 }

        var success = true
        while (success) {
            success = false
            val (varInst, varInst2) = findAssign(method)
            if (varInst == null || varInst2 == null)
                continue
            if (!findReassignTo(method, varInst2))
                continue

            method.instructions.remove(varInst)
            method.instructions.remove(varInst2)

            val from: Int = varInst.`var`
            val to: Int = varInst2.`var`

            for (inst in method.instructions.iterator()) {

                if ((inst.opcode == Opcodes.ASTORE || inst.opcode == Opcodes.ALOAD) && (inst as VarInsnNode).`var` == to) {
                    inst.`var` = from
                }
            }

            success = true
        }
    }

    fun findAssign(method: MethodNode): Pair<VarInsnNode?, VarInsnNode?> {
        val needToRemove = method.invisibleParameterAnnotations
            ?.mapIndexedNotNull { index, nodes ->
                if (nodes?.any { it.desc == removeFinalDesc } == true) {
                    index + isStatic
                } else { null }
            }?.toSet() ?: return null to null

        for(inst in method.instructions.iterator()) {
            if (inst.opcode != Opcodes.ALOAD) {
                continue
            }
            // find where `var varInst2 = varInst`
            val varInst = inst as VarInsnNode
            if (varInst.next.opcode != Opcodes.ASTORE || !needToRemove.contains(varInst.`var`)) {
                continue
            }
            val varInst2 = varInst.next as VarInsnNode
            if (varInst.`var` == varInst2.`var`) {
                continue
            }
            return varInst to varInst2
        }
        return null to null
    }

    fun findReassignTo(method: MethodNode, varInst: VarInsnNode): Boolean {
        for(inst in method.instructions.iterator()) {
            if (inst.opcode != Opcodes.ASTORE) {
                continue
            }
            val varInst2 = inst as VarInsnNode
            if (varInst != varInst2) return true
        }
        return false
    }
}