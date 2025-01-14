package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PathNode

val PathNode.x by alias(PathNode::field_40)
val PathNode.y by alias(PathNode::field_39)
var PathNode.heapWeight by alias(PathNode::field_47)
var PathNode.heapIndex by alias(PathNode::field_37)
var PathNode.penalty by alias(PathNode::field_43)
var PathNode.visited by alias(PathNode::field_42)
var PathNode.previous by alias(PathNode::field_35)
var PathNode.type by alias(PathNode::field_41)
var PathNode.penalizedPathLength by alias(PathNode::field_36)
var PathNode.distanceToNearestTarget by alias(PathNode::field_34)
val PathNode.z by alias(PathNode::field_38)
var PathNode.pathLength by alias(PathNode::field_46)
fun PathNode.getSquaredDistance(arg0: PathNode) = this.method_32(arg0)
fun PathNode.getDistance(arg0: BlockPos) = this.method_35494(arg0)
fun PathNode.getDistance(arg0: PathNode) = this.method_31(arg0)
fun KClass<PathNode>.hash(arg0: Int, arg1: Int, arg2: Int) = PathNode.method_30(arg0, arg1, arg2)
fun PathNode.getBlockPos() = this.method_22879()
fun PathNode.getPos() = this.method_35496()
fun PathNode.getSquaredDistance(arg0: BlockPos) = this.method_35497(arg0)
fun PathNode.getHorizontalDistance(arg0: PathNode) = this.method_44022(arg0)
fun PathNode.copyWithNewPosition(arg0: Int, arg1: Int, arg2: Int) = this.method_26(arg0, arg1, arg2)
fun PathNode.getManhattanDistance(arg0: PathNode) = this.method_21653(arg0)
fun KClass<PathNode>.fromBuf(arg0: PacketByteBuf) = PathNode.method_28(arg0)
fun PathNode.write(arg0: PacketByteBuf) = this.method_35495(arg0)
fun PathNode.isInHeap() = this.method_27()
fun PathNode.getManhattanDistance(arg0: BlockPos) = this.method_21654(arg0)
