package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CandleBlock

val CandleBlock.CANDLES by aliasStatic(CandleBlock::field_27174)
val CandleBlock.LIT by aliasStatic(CandleBlock::field_27175)
val CandleBlock.WATERLOGGED by aliasStatic(CandleBlock::field_27176)
val CandleBlock.STATE_TO_LUMINANCE by aliasStatic(CandleBlock::field_27177)
val CandleBlock.MAX_CANDLE_AMOUNT by aliasStatic(CandleBlock::field_31051)
fun KClass<CandleBlock>.canBeLit(arg0: BlockState) = CandleBlock.method_31630(arg0)
