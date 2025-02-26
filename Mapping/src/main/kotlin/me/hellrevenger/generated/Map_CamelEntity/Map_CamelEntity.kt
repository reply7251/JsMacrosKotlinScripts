package me.hellrevenger.generated.Map_CamelEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40143
 */
val CamelEntity.standingTransitionAnimationState by alias(CamelEntity::field_40143)
/**
 * field_40145
 */
val CamelEntity.dashingAnimationState by alias(CamelEntity::field_40145)
/**
 * field_40139
 */
val KClass<CamelEntity>.DASHING by aliasStatic(CamelEntity::field_40139)
/**
 * field_40144
 */
val CamelEntity.idlingAnimationState by alias(CamelEntity::field_40144)
/**
 * field_40142
 */
val CamelEntity.sittingTransitionAnimationState by alias(CamelEntity::field_40142)
/**
 * field_40734
 */
val CamelEntity.sittingAnimationState by alias(CamelEntity::field_40734)
/**
 * field_40140
 */
val KClass<CamelEntity>.LAST_POSE_TICK by aliasStatic(CamelEntity::field_40140)
/**
 * method_45347
 */
fun CamelEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_45347(arg0, arg1)
/**
 * method_45361
 */
fun CamelEntity.isDashing() = this.method_45361()
/**
 * method_45351
 */
fun CamelEntity.isChangingPose() = this.method_45351()
/**
 * method_45352
 */
fun CamelEntity.startSitting() = this.method_45352()
/**
 * method_45354
 */
fun CamelEntity.setStanding() = this.method_45354()
/**
 * method_52548
 */
fun CamelEntity.canChangePose() = this.method_52548()
/**
 * method_45362
 */
fun CamelEntity.setDashing(arg0: Boolean) = this.method_45362(arg0)
/**
 * method_45350
 */
fun CamelEntity.isSitting() = this.method_45350()
/**
 * method_45360
 */
fun KClass<CamelEntity>.createCamelAttributes() = CamelEntity.method_45360()
/**
 * method_48573
 */
fun CamelEntity.shouldUpdateSittingAnimations() = this.method_48573()
/**
 * method_45353
 */
fun CamelEntity.startStanding() = this.method_45353()
/**
 * method_45357
 */
fun CamelEntity.isStationary() = this.method_45357()
/**
 * method_45355
 */
fun CamelEntity.getLastPoseTickDelta() = this.method_45355()
/**
 * method_45344
 */
fun CamelEntity.setLastPoseTick(arg0: Long) = this.method_45344(arg0)
