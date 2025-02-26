package me.hellrevenger.generated.Map_BellBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_17095
 */
var BellBlockEntity.ringTicks by alias(BellBlockEntity::field_17095)
/**
 * field_17097
 */
var BellBlockEntity.lastSideHit by alias(BellBlockEntity::field_17097)
/**
 * field_17096
 */
var BellBlockEntity.ringing by alias(BellBlockEntity::field_17096)
/**
 * method_31659
 */
fun KClass<BellBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BellBlockEntity) = BellBlockEntity.method_31659(arg0, arg1, arg2, arg3)
/**
 * method_31657
 */
fun KClass<BellBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BellBlockEntity) = BellBlockEntity.method_31657(arg0, arg1, arg2, arg3)
/**
 * method_17031
 */
fun BellBlockEntity.activate(arg0: Direction) = this.method_17031(arg0)
