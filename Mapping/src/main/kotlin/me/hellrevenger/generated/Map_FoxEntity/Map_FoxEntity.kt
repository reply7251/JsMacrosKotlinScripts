package me.hellrevenger.generated.Map_FoxEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30328
 */
val KClass<FoxEntity>.CROUCHING_FLAG by aliasStatic(FoxEntity::field_30328)
/**
 * field_30330
 */
val KClass<FoxEntity>.CHASING_FLAG by aliasStatic(FoxEntity::field_30330)
/**
 * field_30329
 */
val KClass<FoxEntity>.ROLLING_HEAD_FLAG by aliasStatic(FoxEntity::field_30329)
/**
 * method_18272
 */
fun FoxEntity.isSitting() = this.method_18272()
/**
 * method_18296
 */
fun FoxEntity.setChasing(arg0: Boolean) = this.method_18296(arg0)
/**
 * method_47844
 */
fun FoxEntity.setVariant(arg0: net.minecraft.class_4019.class_4039) = this.method_47844(arg0)
/**
 * method_26885
 */
fun KClass<FoxEntity>.createFoxAttributes() = FoxEntity.method_26885()
/**
 * method_18277
 */
fun FoxEntity.isRollingHead() = this.method_18277()
/**
 * method_18273
 */
fun FoxEntity.isWalking() = this.method_18273()
/**
 * method_18297
 */
fun FoxEntity.setCrouching(arg0: Boolean) = this.method_18297(arg0)
/**
 * method_39449
 */
fun KClass<FoxEntity>.canSpawn(arg0: EntityType<FoxEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = FoxEntity.method_39449(arg0, arg1, arg2, arg3, arg4)
/**
 * method_47845
 */
fun FoxEntity.getVariant() = this.method_47845()
/**
 * method_18274
 */
fun FoxEntity.isChasing() = this.method_18274()
/**
 * method_18260
 */
fun FoxEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_18260(arg0, arg1)
/**
 * method_35172
 */
fun FoxEntity.isJumping() = this.method_35172()
/**
 * method_18294
 */
fun FoxEntity.setSitting(arg0: Boolean) = this.method_18294(arg0)
/**
 * method_18298
 */
fun FoxEntity.getHeadRoll(arg0: Float) = this.method_18298(arg0)
/**
 * method_18275
 */
fun FoxEntity.isFullyCrouched() = this.method_18275()
/**
 * method_18299
 */
fun FoxEntity.setRollingHead(arg0: Boolean) = this.method_18299(arg0)
/**
 * method_18300
 */
fun FoxEntity.getBodyRotationHeightOffset(arg0: Float) = this.method_18300(arg0)
/**
 * method_18257
 */
fun KClass<FoxEntity>.canJumpChase(arg0: FoxEntity, arg1: LivingEntity) = FoxEntity.method_18257(arg0, arg1)
