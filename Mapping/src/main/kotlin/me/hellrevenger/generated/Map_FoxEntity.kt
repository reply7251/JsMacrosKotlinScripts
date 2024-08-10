package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FoxEntity

val FoxEntity.CROUCHING_FLAG by aliasStatic(FoxEntity::field_30328)
val FoxEntity.CHASING_FLAG by aliasStatic(FoxEntity::field_30330)
val FoxEntity.ROLLING_HEAD_FLAG by aliasStatic(FoxEntity::field_30329)
fun FoxEntity.isSitting() = this.method_18272()
fun FoxEntity.setChasing(arg0: Boolean) = this.method_18296(arg0)
fun FoxEntity.setVariant(arg0: net.minecraft.class_4019.class_4039) = this.method_47844(arg0)
fun KClass<FoxEntity>.createFoxAttributes() = FoxEntity.method_26885()
fun FoxEntity.isRollingHead() = this.method_18277()
fun FoxEntity.isWalking() = this.method_18273()
fun FoxEntity.setCrouching(arg0: Boolean) = this.method_18297(arg0)
fun KClass<FoxEntity>.canSpawn(arg0: EntityType<FoxEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = FoxEntity.method_39449(arg0, arg1, arg2, arg3, arg4)
fun FoxEntity.getVariant() = this.method_47845()
fun FoxEntity.isChasing() = this.method_18274()
fun FoxEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_18260(arg0, arg1)
fun FoxEntity.isJumping() = this.method_35172()
fun FoxEntity.setSitting(arg0: Boolean) = this.method_18294(arg0)
fun FoxEntity.getHeadRoll(arg0: Float) = this.method_18298(arg0)
fun FoxEntity.isFullyCrouched() = this.method_18275()
fun FoxEntity.setRollingHead(arg0: Boolean) = this.method_18299(arg0)
fun FoxEntity.getBodyRotationHeightOffset(arg0: Float) = this.method_18300(arg0)
fun KClass<FoxEntity>.canJumpChase(arg0: FoxEntity, arg1: LivingEntity) = FoxEntity.method_18257(arg0, arg1)
