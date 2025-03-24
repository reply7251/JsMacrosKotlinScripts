package me.hellrevenger.generated.Map_AbstractBoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54446
 */
val KClass<AbstractBoatEntity>.EMIT_SOUND_EVENT_PADDLE_ROTATION by aliasStatic(AbstractBoatEntity::field_54446)
/**
 * field_54433
 */
var AbstractBoatEntity.location by alias(AbstractBoatEntity::field_54433)
/**
 * method_64488
 */
fun AbstractBoatEntity.isSmallerThanBoat(arg0: Entity) = this.method_64488(arg0)
/**
 * method_64486
 */
fun KClass<AbstractBoatEntity>.canCollide(arg0: Entity, arg1: Entity) = AbstractBoatEntity.method_64486(arg0, arg1)
/**
 * method_64495
 */
fun AbstractBoatEntity.getWaterHeightBelow() = this.method_64495()
/**
 * method_64485
 */
fun AbstractBoatEntity.lerpPaddlePhase(arg0: Int, arg1: Float) = this.method_64485(arg0, arg1)
/**
 * method_64491
 */
fun AbstractBoatEntity.isPaddleMoving(arg0: Int) = this.method_64491(arg0)
/**
 * method_64498
 */
fun AbstractBoatEntity.initPosition(arg0: Double, arg1: Double, arg2: Double) = this.method_64498(arg0, arg1, arg2)
/**
 * method_64490
 */
fun AbstractBoatEntity.setPaddlesMoving(arg0: Boolean, arg1: Boolean) = this.method_64490(arg0, arg1)
/**
 * method_64484
 */
fun AbstractBoatEntity.lerpBubbleWobble(arg0: Float) = this.method_64484(arg0)
/**
 * method_64487
 */
fun AbstractBoatEntity.setInputs(arg0: Boolean, arg1: Boolean, arg2: Boolean, arg3: Boolean) = this.method_64487(arg0, arg1, arg2, arg3)
/**
 * method_64497
 */
fun AbstractBoatEntity.getNearbySlipperiness() = this.method_64497()
