package me.hellrevenger.generated.Map_BlockRotation
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_11464
 */
val KClass<BlockRotation>.CLOCKWISE_180 by aliasEnum(BlockRotation::class, "field_11464")
/**
 * field_11465
 */
val KClass<BlockRotation>.COUNTERCLOCKWISE_90 by aliasEnum(BlockRotation::class, "field_11465")
/**
 * field_11467
 */
val KClass<BlockRotation>.NONE by aliasEnum(BlockRotation::class, "field_11467")
/**
 * field_11463
 */
val KClass<BlockRotation>.CLOCKWISE_90 by aliasEnum(BlockRotation::class, "field_11463")
/**
 * method_16548
 */
fun KClass<BlockRotation>.random(arg0: Random) = BlockRotation.method_16548(arg0)
/**
 * method_26383
 */
fun BlockRotation.getDirectionTransformation() = this.method_26383()
/**
 * method_10503
 */
fun BlockRotation.rotate(arg0: Direction) = this.method_10503(arg0)
/**
 * method_10501
 */
fun BlockRotation.rotate(arg0: BlockRotation) = this.method_10501(arg0)
/**
 * method_10502
 */
fun BlockRotation.rotate(arg0: Int, arg1: Int) = this.method_10502(arg0, arg1)
/**
 * method_16547
 */
fun KClass<BlockRotation>.randomRotationOrder(arg0: Random) = BlockRotation.method_16547(arg0)
