package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Path

fun Path.getLength() = this.method_38()
fun Path.setLength(arg0: Int) = this.method_36(arg0)
fun Path.toBuf(arg0: PacketByteBuf) = this.method_35498(arg0)
fun Path.equalsPath(arg0: Path) = this.method_41(arg0)
fun Path.setCurrentNodeIndex(arg0: Int) = this.method_42(arg0)
fun Path.isStart() = this.method_30849()
fun Path.getTarget() = this.method_48()
fun Path.getLastNode() = this.method_30850()
fun Path.next() = this.method_44()
fun Path.getEnd() = this.method_45()
fun Path.isFinished() = this.method_46()
fun Path.getCurrentNode() = this.method_29301()
fun Path.getCurrentNodePos() = this.method_31032()
fun Path.getManhattanDistanceFromTarget() = this.method_21656()
fun Path.getCurrentNodeIndex() = this.method_39()
fun Path.getNodePosition(arg0: Entity) = this.method_49(arg0)
fun Path.reachesTarget() = this.method_21655()
fun Path.setNode(arg0: Int, arg1: PathNode) = this.method_33(arg0, arg1)
fun Path.getNodePos(arg0: Int) = this.method_31031(arg0)
fun Path.getDebugNodeInfos() = this.method_52604()
fun KClass<Path>.fromBuf(arg0: PacketByteBuf) = Path.method_34(arg0)
fun Path.getNode(arg0: Int) = this.method_40(arg0)
fun Path.copy() = this.method_52605()
fun Path.getNodePosition(arg0: Entity, arg1: Int) = this.method_47(arg0, arg1)
