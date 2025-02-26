package me.hellrevenger.generated.Map_SlimeEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30496
 */
val KClass<SlimeEntity>.MIN_SIZE by aliasStatic(SlimeEntity::field_30496)
/**
 * field_7388
 */
var SlimeEntity.stretch by alias(SlimeEntity::field_7388)
/**
 * field_7389
 */
var SlimeEntity.targetStretch by alias(SlimeEntity::field_7389)
/**
 * field_30497
 */
val KClass<SlimeEntity>.MAX_SIZE by aliasStatic(SlimeEntity::field_30497)
/**
 * field_7387
 */
var SlimeEntity.lastStretch by alias(SlimeEntity::field_7387)
/**
 * method_7161
 */
fun SlimeEntity.setSize(arg0: Int, arg1: Boolean) = this.method_7161(arg0, arg1)
/**
 * method_7157
 */
fun SlimeEntity.isSmall() = this.method_7157()
/**
 * method_20685
 */
fun KClass<SlimeEntity>.canSpawn(arg0: EntityType<SlimeEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = SlimeEntity.method_20685(arg0, arg1, arg2, arg3, arg4)
/**
 * method_7152
 */
fun SlimeEntity.getSize() = this.method_7152()
