package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FenceGateBlock

val FenceGateBlock.IN_WALL by aliasStatic(FenceGateBlock::field_11024)
val FenceGateBlock.POWERED by aliasStatic(FenceGateBlock::field_11021)
val FenceGateBlock.OPEN by aliasStatic(FenceGateBlock::field_11026)
fun KClass<FenceGateBlock>.canWallConnect(arg0: BlockState, arg1: Direction) = FenceGateBlock.method_16703(arg0, arg1)
