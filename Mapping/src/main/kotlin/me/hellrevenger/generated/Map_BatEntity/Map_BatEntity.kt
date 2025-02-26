package me.hellrevenger.generated.Map_BatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_46969
 */
val BatEntity.roostingAnimationState by alias(BatEntity::field_46969)
/**
 * field_46968
 */
val BatEntity.flyingAnimationState by alias(BatEntity::field_46968)
/**
 * method_20661
 */
fun KClass<BatEntity>.canSpawn(arg0: EntityType<BatEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = BatEntity.method_20661(arg0, arg1, arg2, arg3, arg4)
/**
 * method_6449
 */
fun BatEntity.setRoosting(arg0: Boolean) = this.method_6449(arg0)
/**
 * method_6450
 */
fun BatEntity.isRoosting() = this.method_6450()
/**
 * method_26878
 */
fun KClass<BatEntity>.createBatAttributes() = BatEntity.method_26878()
