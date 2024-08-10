package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BellBlock

val BellBlock.POWERED by aliasStatic(BellBlock::field_20648)
val BellBlock.FACING by aliasStatic(BellBlock::field_16324)
val BellBlock.ATTACHMENT by aliasStatic(BellBlock::field_16326)
fun BellBlock.ring(arg0: world_World, arg1: BlockState, arg2: BlockHitResult, arg3: PlayerEntity, arg4: Boolean) = this.method_19285(arg0, arg1, arg2, arg3, arg4)
fun BellBlock.ring(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: Direction) = this.method_17026(arg0, arg1, arg2, arg3)
fun BellBlock.ring(arg0: world_World, arg1: BlockPos, arg2: Direction) = this.method_33600(arg0, arg1, arg2)
