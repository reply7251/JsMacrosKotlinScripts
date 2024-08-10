package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DoorBlock

val DoorBlock.HALF by aliasStatic(DoorBlock::field_10946)
val DoorBlock.FACING by aliasStatic(DoorBlock::field_10938)
val DoorBlock.OPEN by aliasStatic(DoorBlock::field_10945)
val DoorBlock.HINGE by aliasStatic(DoorBlock::field_10941)
val DoorBlock.POWERED by aliasStatic(DoorBlock::field_10940)
fun KClass<DoorBlock>.canOpenByHand(arg0: BlockState) = DoorBlock.method_24796(arg0)
fun DoorBlock.isOpen(arg0: BlockState) = this.method_30841(arg0)
fun KClass<DoorBlock>.canOpenByHand(arg0: world_World, arg1: BlockPos) = DoorBlock.method_24795(arg0, arg1)
fun DoorBlock.setOpen(arg0: Entity, arg1: world_World, arg2: BlockState, arg3: BlockPos, arg4: Boolean) = this.method_10033(arg0, arg1, arg2, arg3, arg4)
