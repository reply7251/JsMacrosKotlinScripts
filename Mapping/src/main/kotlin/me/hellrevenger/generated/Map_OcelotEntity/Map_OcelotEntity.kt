package me.hellrevenger.generated.Map_OcelotEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30341
 */
val KClass<OcelotEntity>.NORMAL_SPEED by aliasStatic(OcelotEntity::field_30341)
/**
 * field_30342
 */
val KClass<OcelotEntity>.SPRINTING_SPEED by aliasStatic(OcelotEntity::field_30342)
/**
 * field_30340
 */
val KClass<OcelotEntity>.CROUCHING_SPEED by aliasStatic(OcelotEntity::field_30340)
/**
 * method_16104
 */
fun OcelotEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_16104(arg0, arg1)
/**
 * method_20666
 */
fun KClass<OcelotEntity>.canSpawn(arg0: EntityType<OcelotEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = OcelotEntity.method_20666(arg0, arg1, arg2, arg3, arg4)
/**
 * method_26887
 */
fun KClass<OcelotEntity>.createOcelotAttributes() = OcelotEntity.method_26887()
