package me.hellrevenger.generated.Map_AbstractBoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54433
 */
var AbstractBoatEntity.location by alias(AbstractBoatEntity::field_54433)
/**
 * method_64488
 */
fun AbstractBoatEntity.isSmallerThanBoat(entity: Entity) = this.method_64488(entity)
/**
 * method_64495
 */
fun AbstractBoatEntity.getWaterHeightBelow() = this.method_64495()
/**
 * method_64485
 */
fun AbstractBoatEntity.lerpPaddlePhase(paddle: Int, tickDelta: Float) = this.method_64485(paddle, tickDelta)
/**
 * method_64491
 */
fun AbstractBoatEntity.isPaddleMoving(paddle: Int) = this.method_64491(paddle)
/**
 * method_64498
 */
fun AbstractBoatEntity.initPosition(x: Double, arg1: Double, y: Double) = this.method_64498(x, arg1, y)
/**
 * method_64490
 */
fun AbstractBoatEntity.setPaddlesMoving(left: Boolean, right: Boolean) = this.method_64490(left, right)
/**
 * method_64484
 */
fun AbstractBoatEntity.lerpBubbleWobble(tickDelta: Float) = this.method_64484(tickDelta)
/**
 * method_64487
 */
fun AbstractBoatEntity.setInputs(pressingLeft: Boolean, pressingRight: Boolean, pressingForward: Boolean, pressingBack: Boolean) = this.method_64487(pressingLeft, pressingRight, pressingForward, pressingBack)
/**
 * method_64497
 */
fun AbstractBoatEntity.getNearbySlipperiness() = this.method_64497()
