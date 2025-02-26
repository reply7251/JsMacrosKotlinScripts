package me.hellrevenger.generated.Map_DoorBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_10946
 */
val KClass<DoorBlock>.HALF by aliasStatic(DoorBlock::field_10946)
/**
 * field_10938
 */
val KClass<DoorBlock>.FACING by aliasStatic(DoorBlock::field_10938)
/**
 * field_10945
 */
val KClass<DoorBlock>.OPEN by aliasStatic(DoorBlock::field_10945)
/**
 * field_10941
 */
val KClass<DoorBlock>.HINGE by aliasStatic(DoorBlock::field_10941)
/**
 * field_10940
 */
val KClass<DoorBlock>.POWERED by aliasStatic(DoorBlock::field_10940)
/**
 * method_51169
 */
fun DoorBlock.getBlockSetType() = this.method_51169()
/**
 * method_24796
 */
fun KClass<DoorBlock>.canOpenByHand(arg0: BlockState) = DoorBlock.method_24796(arg0)
/**
 * method_30841
 */
fun DoorBlock.isOpen(arg0: BlockState) = this.method_30841(arg0)
/**
 * method_24795
 */
fun KClass<DoorBlock>.canOpenByHand(arg0: world_World, arg1: BlockPos) = DoorBlock.method_24795(arg0, arg1)
/**
 * method_10033
 */
fun DoorBlock.setOpen(arg0: Entity, arg1: world_World, arg2: BlockState, arg3: BlockPos, arg4: Boolean) = this.method_10033(arg0, arg1, arg2, arg3, arg4)
