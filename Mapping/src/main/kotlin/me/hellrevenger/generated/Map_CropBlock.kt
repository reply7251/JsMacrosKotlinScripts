package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CropBlock

val CropBlock.AGE by aliasStatic(CropBlock::field_10835)
val CropBlock.MAX_AGE by aliasStatic(CropBlock::field_31079)
fun CropBlock.withAge(arg0: Int) = this.method_9828(arg0)
fun CropBlock.applyGrowth(arg0: world_World, arg1: BlockPos, arg2: BlockState) = this.method_9826(arg0, arg1, arg2)
fun CropBlock.getMaxAge() = this.method_9827()
fun CropBlock.isMature(arg0: BlockState) = this.method_9825(arg0)
fun CropBlock.getAge(arg0: BlockState) = this.method_9829(arg0)
