package me.hellrevenger.generated.Map_AbstractRedstoneGateBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<AbstractRedstoneGateBlock>.POWERED by aliasStatic(AbstractRedstoneGateBlock::field_10911)
fun AbstractRedstoneGateBlock.isLocked(arg0: WorldView, arg1: BlockPos, arg2: BlockState) = this.method_9996(arg0, arg1, arg2)
fun AbstractRedstoneGateBlock.isTargetNotAligned(arg0: BlockView, arg1: BlockPos, arg2: BlockState) = this.method_9988(arg0, arg1, arg2)
fun KClass<AbstractRedstoneGateBlock>.isRedstoneGate(arg0: BlockState) = AbstractRedstoneGateBlock.method_9999(arg0)
