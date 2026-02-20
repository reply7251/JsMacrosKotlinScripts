package me.hellrevenger.ctransform

import net.lenni0451.classtransform.annotations.CSlice
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.targets.IInjectionTarget
import net.lenni0451.classtransform.utils.ASMUtils.slash
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

class SimpleNewTarget : IInjectionTarget {
    override fun getTargets(
        injectionTargets: Map<String, IInjectionTarget?>,
        method: MethodNode,
        target: CTarget,
        slice: CSlice?
    ): List<AbstractInsnNode> {
        var i = 0
        val targets = mutableListOf<AbstractInsnNode>()
        for(slice in getSlice(injectionTargets, method, slice)) {
            if(slice !is MethodInsnNode || slice.opcode != Opcodes.INVOKESPECIAL) continue
            if(slice.name != "<init>") continue
            if (!slice.owner.endsWith(slash(target.target))) continue
            if (target.ordinal == -1 || target.ordinal == i) targets.add(slice)
            i++
        }
        return targets
    }
}