package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.library.api.slash
import net.lenni0451.classtransform.annotations.CSlice
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.targets.IInjectionTarget
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodNode

class SimpleFieldTarget(val opcodes: IntArray) : IInjectionTarget {
    companion object {
        val GET_FIELD = intArrayOf(Opcodes.GETFIELD, Opcodes.GETSTATIC)
        val PUT_FIELD = intArrayOf(Opcodes.PUTFIELD, Opcodes.PUTSTATIC)

        fun getField() = SimpleFieldTarget(GET_FIELD)
        fun putField() = SimpleFieldTarget(PUT_FIELD)

        val ownerRegex = "(.+)\\.(.+)".toRegex()
    }

    constructor() : this(intArrayOf(-1))

    override fun getTargets(
        injectionTargets: Map<String?, IInjectionTarget?>,
        method: MethodNode,
        target: CTarget,
        slice: CSlice?
    ): List<AbstractInsnNode> {
        if(opcodes.isEmpty()) return emptyList()

        val allAccess = opcodes[0] == -1
        var i = 0

        val (owner, name) = ownerRegex.matchEntire(target.target)?.let { matchResult ->
            matchResult.groupValues[1].slash() to matchResult.groupValues[2]
        } ?: ("" to target.target)

        val targets = mutableListOf<AbstractInsnNode>()
        for(slice in getSlice(injectionTargets, method, slice)) {
            if(slice !is FieldInsnNode) continue
            if(!allAccess && slice.opcode !in opcodes) continue
            if (slice.name != name) continue
            if (!slice.owner.endsWith(owner)) continue
            if (target.ordinal == -1 || target.ordinal == i) targets.add(slice)
            i++
        }
        return targets
    }
}