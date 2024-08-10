package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CatEntity

val CatEntity.NORMAL_SPEED by aliasStatic(CatEntity::field_30311)
val CatEntity.CROUCHING_SPEED by aliasStatic(CatEntity::field_30310)
val CatEntity.SPRINTING_SPEED by aliasStatic(CatEntity::field_30312)
fun CatEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6573(arg0, arg1)
fun CatEntity.setInSleepingPose(arg0: Boolean) = this.method_16088(arg0)
fun CatEntity.isInSleepingPose() = this.method_16086()
fun KClass<CatEntity>.createCatAttributes() = CatEntity.method_26881()
fun CatEntity.setVariant(arg0: RegistryEntry<CatVariant>) = this.method_47842(arg0)
fun CatEntity.getTexture() = this.method_16092()
fun CatEntity.getCollarColor() = this.method_16096()
fun CatEntity.getVariant() = this.method_47843()
fun CatEntity.hiss() = this.method_16089()
