package me.hellrevenger.generated.Map_SculkSensorBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_28111
 */
val KClass<SculkSensorBlock>.SCULK_SENSOR_PHASE by aliasStatic(SculkSensorBlock::field_28111)
/**
 * field_28112
 */
val KClass<SculkSensorBlock>.POWER by aliasStatic(SculkSensorBlock::field_28112)
/**
 * field_28113
 */
val KClass<SculkSensorBlock>.WATERLOGGED by aliasStatic(SculkSensorBlock::field_28113)
/**
 * method_32904
 */
fun SculkSensorBlock.setActive(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: BlockState, arg4: Int, arg5: Int) = this.method_32904(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_32909
 */
fun KClass<SculkSensorBlock>.isInactive(arg0: BlockState) = SculkSensorBlock.method_32909(arg0)
/**
 * method_32903
 */
fun KClass<SculkSensorBlock>.setCooldown(arg0: world_World, arg1: BlockPos, arg2: BlockState) = SculkSensorBlock.method_32903(arg0, arg1, arg2)
/**
 * method_32908
 */
fun KClass<SculkSensorBlock>.getPhase(arg0: BlockState) = SculkSensorBlock.method_32908(arg0)
/**
 * method_51166
 */
fun SculkSensorBlock.getCooldownTime() = this.method_51166()
/**
 * method_49822
 */
fun KClass<SculkSensorBlock>.tryResonate(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: Int) = SculkSensorBlock.method_49822(arg0, arg1, arg2, arg3)
