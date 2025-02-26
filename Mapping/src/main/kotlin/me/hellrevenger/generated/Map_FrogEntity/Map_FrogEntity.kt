package me.hellrevenger.generated.Map_FrogEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_37451
 */
val FrogEntity.longJumpingAnimationState by alias(FrogEntity::field_37451)
/**
 * field_37452
 */
val FrogEntity.croakingAnimationState by alias(FrogEntity::field_37452)
/**
 * field_37453
 */
val FrogEntity.usingTongueAnimationState by alias(FrogEntity::field_37453)
/**
 * field_37456
 */
val FrogEntity.idlingInWaterAnimationState by alias(FrogEntity::field_37456)
/**
 * field_38720
 */
val KClass<FrogEntity>.VARIANT_KEY by aliasStatic(FrogEntity::field_38720)
/**
 * method_41354
 */
fun FrogEntity.getVariant() = this.method_41354()
/**
 * method_41352
 */
fun FrogEntity.setFrogTarget(arg0: Entity) = this.method_41352(arg0)
/**
 * method_41360
 */
fun FrogEntity.getFrogTarget() = this.method_41360()
/**
 * method_41359
 */
fun FrogEntity.clearFrogTarget() = this.method_41359()
/**
 * method_43398
 */
fun KClass<FrogEntity>.canSpawn(arg0: EntityType<out AnimalEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = FrogEntity.method_43398(arg0, arg1, arg2, arg3, arg4)
/**
 * method_41353
 */
fun FrogEntity.setVariant(arg0: RegistryEntry<FrogVariant>) = this.method_41353(arg0)
/**
 * method_41355
 */
fun KClass<FrogEntity>.createFrogAttributes() = FrogEntity.method_41355()
/**
 * method_41358
 */
fun KClass<FrogEntity>.isValidFrogFood(arg0: LivingEntity) = FrogEntity.method_41358(arg0)
