package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TargetPathNode

fun TargetPathNode.markReached() = this.method_21665()
fun KClass<TargetPathNode>.fromBuffer(arg0: PacketByteBuf) = TargetPathNode.method_21663(arg0)
fun TargetPathNode.isReached() = this.method_35501()
fun TargetPathNode.updateNearestNode(arg0: Float, arg1: PathNode) = this.method_21662(arg0, arg1)
