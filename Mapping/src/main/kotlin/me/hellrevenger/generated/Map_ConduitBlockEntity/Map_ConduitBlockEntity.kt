package me.hellrevenger.generated.Map_ConduitBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_11936
 */
var ConduitBlockEntity.ticks by alias(ConduitBlockEntity::field_11936)
/**
 * method_11061
 */
fun ConduitBlockEntity.getRotation(arg0: Float) = this.method_11061(arg0)
/**
 * method_11065
 */
fun ConduitBlockEntity.isActive() = this.method_11065()
/**
 * method_38247
 */
fun ConduitBlockEntity.toUpdatePacket() = this.method_38247()
/**
 * method_31675
 */
fun KClass<ConduitBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: ConduitBlockEntity) = ConduitBlockEntity.method_31675(arg0, arg1, arg2, arg3)
/**
 * method_31677
 */
fun KClass<ConduitBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: ConduitBlockEntity) = ConduitBlockEntity.method_31677(arg0, arg1, arg2, arg3)
/**
 * method_11066
 */
fun ConduitBlockEntity.isEyeOpen() = this.method_11066()
