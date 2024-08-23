package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CamelEntity

val CamelEntity.standingTransitionAnimationState by alias(CamelEntity::field_40143)
val CamelEntity.dashingAnimationState by alias(CamelEntity::field_40145)
val KClass<CamelEntity>.DASHING by aliasStatic(CamelEntity::field_40139)
val CamelEntity.idlingAnimationState by alias(CamelEntity::field_40144)
val CamelEntity.sittingTransitionAnimationState by alias(CamelEntity::field_40142)
val CamelEntity.sittingAnimationState by alias(CamelEntity::field_40734)
val KClass<CamelEntity>.LAST_POSE_TICK by aliasStatic(CamelEntity::field_40140)
fun CamelEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_45347(arg0, arg1)
fun CamelEntity.isDashing() = this.method_45361()
fun CamelEntity.isChangingPose() = this.method_45351()
fun CamelEntity.startSitting() = this.method_45352()
fun CamelEntity.setStanding() = this.method_45354()
fun CamelEntity.canChangePose() = this.method_52548()
fun CamelEntity.setDashing(arg0: Boolean) = this.method_45362(arg0)
fun CamelEntity.isSitting() = this.method_45350()
fun KClass<CamelEntity>.createCamelAttributes() = CamelEntity.method_45360()
fun CamelEntity.shouldUpdateSittingAnimations() = this.method_48573()
fun CamelEntity.startStanding() = this.method_45353()
fun CamelEntity.isStationary() = this.method_45357()
fun CamelEntity.getLastPoseTickDelta() = this.method_45355()
fun CamelEntity.setLastPoseTick(arg0: Long) = this.method_45344(arg0)
