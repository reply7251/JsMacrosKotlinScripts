package me.hellrevenger.generated.Map_BoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BoatEntity>.EMIT_SOUND_EVENT_PADDLE_ROTATION by aliasStatic(BoatEntity::field_30699)
fun BoatEntity.setPaddleMovings(arg0: Boolean, arg1: Boolean) = this.method_7538(arg0, arg1)
fun BoatEntity.getVariant() = this.method_47885()
fun BoatEntity.setVariant(arg0: net.minecraft.class_1690.class_1692) = this.method_47884(arg0)
fun BoatEntity.isSmallerThanBoat(arg0: Entity) = this.method_49182(arg0)
fun KClass<BoatEntity>.canCollide(arg0: Entity, arg1: Entity) = BoatEntity.method_30959(arg0, arg1)
fun BoatEntity.getNearbySlipperiness() = this.method_7548()
fun BoatEntity.interpolateBubbleWobble(arg0: Float) = this.method_7547(arg0)
fun BoatEntity.getWaterHeightBelow() = this.method_7544()
fun BoatEntity.isPaddleMoving(arg0: Int) = this.method_7556(arg0)
fun BoatEntity.interpolatePaddlePhase(arg0: Int, arg1: Float) = this.method_7551(arg0, arg1)
fun BoatEntity.setInputs(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean) = this.method_7535(arg0, arg1, arg2, arg3)
