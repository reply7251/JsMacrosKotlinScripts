package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SnifferEggBlock

val SnifferEggBlock.HATCH by aliasStatic(SnifferEggBlock::field_43250)
val SnifferEggBlock.FINAL_HATCH_STAGE by aliasStatic(SnifferEggBlock::field_43249)
fun KClass<SnifferEggBlock>.isAboveHatchBooster(arg0: BlockView, arg1: BlockPos) = SnifferEggBlock.method_49826(arg0, arg1)
fun SnifferEggBlock.getHatchStage(arg0: BlockState) = this.method_49827(arg0)
