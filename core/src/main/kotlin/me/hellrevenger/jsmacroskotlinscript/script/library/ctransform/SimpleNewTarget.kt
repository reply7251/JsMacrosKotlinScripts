package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.library.api.slash
import net.lenni0451.classtransform.annotations.CSlice
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.targets.IInjectionTarget
import net.lenni0451.classtransform.utils.ASMUtils.slash
import net.lenni0451.classtransform.utils.Types
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

class SimpleNewTarget : IInjectionTarget {
    companion object {
        val argCountRegex = "(.+)\\((\\d+)\\)".toRegex()
    }
    override fun getTargets(
        injectionTargets: Map<String, IInjectionTarget?>,
        method: MethodNode,
        target: CTarget,
        slice: CSlice?
    ): List<AbstractInsnNode> {
        var i = 0
        val (className, argCount) = argCountRegex.matchEntire(target.target)?.let { matchResult ->
            matchResult.groupValues[1].slash() to matchResult.groupValues[2].toInt()
        } ?: (target.target.slash() to -1)
        val targets = mutableListOf<AbstractInsnNode>()
        for(slice in getSlice(injectionTargets, method, slice)) {
            if(slice !is MethodInsnNode || slice.opcode != Opcodes.INVOKESPECIAL) continue
            if(slice.name != "<init>") continue
            if (!slice.owner.endsWith(className)) continue
            if (argCount != -1 && Types.argumentTypes(slice).size != argCount) continue
            if (target.ordinal == -1 || target.ordinal == i) targets.add(slice)
            i++
        }
        return targets
    }
}