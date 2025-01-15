package me.hellrevenger.generated.Map_CatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<CatEntity>.NORMAL_SPEED by aliasStatic(CatEntity::field_30311)
val KClass<CatEntity>.CROUCHING_SPEED by aliasStatic(CatEntity::field_30310)
val KClass<CatEntity>.SPRINTING_SPEED by aliasStatic(CatEntity::field_30312)
fun CatEntity.getSleepAnimation(arg0: Float) = this.method_16082(arg0)
fun CatEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6573(arg0, arg1)
fun CatEntity.setInSleepingPose(arg0: Boolean) = this.method_16088(arg0)
fun CatEntity.isInSleepingPose() = this.method_16086()
fun KClass<CatEntity>.createCatAttributes() = CatEntity.method_26881()
fun CatEntity.setVariant(arg0: RegistryEntry<CatVariant>) = this.method_47842(arg0)
fun CatEntity.getTailCurlAnimation(arg0: Float) = this.method_16091(arg0)
fun CatEntity.getHeadDownAnimation(arg0: Float) = this.method_16095(arg0)
fun CatEntity.getTexture() = this.method_16092()
fun CatEntity.getCollarColor() = this.method_16096()
fun CatEntity.getVariant() = this.method_47843()
fun CatEntity.hiss() = this.method_16089()
