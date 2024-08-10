package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FrogEntity

val FrogEntity.longJumpingAnimationState by alias(FrogEntity::field_37451)
val FrogEntity.croakingAnimationState by alias(FrogEntity::field_37452)
val FrogEntity.usingTongueAnimationState by alias(FrogEntity::field_37453)
val FrogEntity.idlingInWaterAnimationState by alias(FrogEntity::field_37456)
val FrogEntity.VARIANT_KEY by aliasStatic(FrogEntity::field_38720)
fun FrogEntity.getVariant() = this.method_41354()
fun FrogEntity.setFrogTarget(arg0: Entity) = this.method_41352(arg0)
fun FrogEntity.getFrogTarget() = this.method_41360()
fun FrogEntity.clearFrogTarget() = this.method_41359()
fun KClass<FrogEntity>.canSpawn(arg0: EntityType<out AnimalEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = FrogEntity.method_43398(arg0, arg1, arg2, arg3, arg4)
fun FrogEntity.setVariant(arg0: RegistryEntry<FrogVariant>) = this.method_41353(arg0)
fun KClass<FrogEntity>.createFrogAttributes() = FrogEntity.method_41355()
fun KClass<FrogEntity>.isValidFrogFood(arg0: LivingEntity) = FrogEntity.method_41358(arg0)
