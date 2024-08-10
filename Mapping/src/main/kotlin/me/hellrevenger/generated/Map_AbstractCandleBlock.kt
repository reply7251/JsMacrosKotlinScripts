package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractCandleBlock

val AbstractCandleBlock.LIT by aliasStatic(AbstractCandleBlock::field_27083)
fun KClass<AbstractCandleBlock>.isLitCandle(arg0: BlockState) = AbstractCandleBlock.method_35245(arg0)
fun KClass<AbstractCandleBlock>.extinguish(arg0: PlayerEntity, arg1: BlockState, arg2: WorldAccess, arg3: BlockPos) = AbstractCandleBlock.method_31614(arg0, arg1, arg2, arg3)
