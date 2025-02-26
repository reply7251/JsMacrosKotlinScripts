package me.hellrevenger.generated.Map_PathNode
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40
 */
val PathNode.x by alias(PathNode::field_40)
/**
 * field_39
 */
val PathNode.y by alias(PathNode::field_39)
/**
 * field_47
 */
var PathNode.heapWeight by alias(PathNode::field_47)
/**
 * field_37
 */
var PathNode.heapIndex by alias(PathNode::field_37)
/**
 * field_43
 */
var PathNode.penalty by alias(PathNode::field_43)
/**
 * field_42
 */
var PathNode.visited by alias(PathNode::field_42)
/**
 * field_35
 */
var PathNode.previous by alias(PathNode::field_35)
/**
 * field_41
 */
var PathNode.type by alias(PathNode::field_41)
/**
 * field_36
 */
var PathNode.penalizedPathLength by alias(PathNode::field_36)
/**
 * field_34
 */
var PathNode.distanceToNearestTarget by alias(PathNode::field_34)
/**
 * field_38
 */
val PathNode.z by alias(PathNode::field_38)
/**
 * field_46
 */
var PathNode.pathLength by alias(PathNode::field_46)
/**
 * method_32
 */
fun PathNode.getSquaredDistance(arg0: PathNode) = this.method_32(arg0)
/**
 * method_35494
 */
fun PathNode.getDistance(arg0: BlockPos) = this.method_35494(arg0)
/**
 * method_31
 */
fun PathNode.getDistance(arg0: PathNode) = this.method_31(arg0)
/**
 * method_30
 */
fun KClass<PathNode>.hash(arg0: Int, arg1: Int, arg2: Int) = PathNode.method_30(arg0, arg1, arg2)
/**
 * method_22879
 */
fun PathNode.getBlockPos() = this.method_22879()
/**
 * method_35496
 */
fun PathNode.getPos() = this.method_35496()
/**
 * method_35497
 */
fun PathNode.getSquaredDistance(arg0: BlockPos) = this.method_35497(arg0)
/**
 * method_44022
 */
fun PathNode.getHorizontalDistance(arg0: PathNode) = this.method_44022(arg0)
/**
 * method_26
 */
fun PathNode.copyWithNewPosition(arg0: Int, arg1: Int, arg2: Int) = this.method_26(arg0, arg1, arg2)
/**
 * method_21653
 */
fun PathNode.getManhattanDistance(arg0: PathNode) = this.method_21653(arg0)
/**
 * method_28
 */
fun KClass<PathNode>.fromBuf(arg0: PacketByteBuf) = PathNode.method_28(arg0)
/**
 * method_35495
 */
fun PathNode.write(arg0: PacketByteBuf) = this.method_35495(arg0)
/**
 * method_27
 */
fun PathNode.isInHeap() = this.method_27()
/**
 * method_21654
 */
fun PathNode.getManhattanDistance(arg0: BlockPos) = this.method_21654(arg0)
