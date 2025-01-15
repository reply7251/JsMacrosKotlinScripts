package me.hellrevenger.generated.Map_BreezeEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

var BreezeEntity.inhalingAnimationState by alias(BreezeEntity::field_47280)
var BreezeEntity.shootingAnimationState by alias(BreezeEntity::field_47281)
var BreezeEntity.slidingAnimationState by alias(BreezeEntity::field_47277)
fun BreezeEntity.playWhirlSound() = this.method_55747()
fun BreezeEntity.isWithinShortRange(arg0: Vec3d) = this.method_55013(arg0)
fun BreezeEntity.addLongJumpingParticles() = this.method_55008()
fun BreezeEntity.addBlockParticles(arg0: Int) = this.method_55007(arg0)
fun BreezeEntity.resetLongJumpingParticleAddCount() = this.method_55015()
fun BreezeEntity.getChargeY() = this.method_55009()
fun BreezeEntity.getHurtBy() = this.method_56562()
fun KClass<BreezeEntity>.createBreezeAttributes() = BreezeEntity.method_55014()
