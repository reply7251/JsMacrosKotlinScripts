package me.hellrevenger.generated.Map_Box
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_1325
 */
val Box.maxY by alias(Box::field_1325)
/**
 * field_1321
 */
val Box.minZ by alias(Box::field_1321)
/**
 * field_1322
 */
val Box.minY by alias(Box::field_1322)
/**
 * field_1323
 */
val Box.minX by alias(Box::field_1323)
/**
 * field_1324
 */
val Box.maxZ by alias(Box::field_1324)
/**
 * field_1320
 */
val Box.maxX by alias(Box::field_1320)
/**
 * method_35576
 */
fun Box.withMinZ(minZ: Double) = this.method_35576(minZ)
/**
 * method_61126
 */
fun Box.getMaxPos() = this.method_61126()
/**
 * method_997
 */
fun Box.offset(vec: Vec3d) = this.method_997(vec)
/**
 * method_1008
 */
fun Box.contains(x: Double, arg1: Double, y: Double) = this.method_1008(x, arg1, y)
/**
 * method_993
 */
fun Box.intersects(pos1: Vec3d, pos2: Vec3d) = this.method_993(pos1, pos2)
/**
 * method_994
 */
fun Box.intersects(box: Box) = this.method_994(box)
/**
 * method_17939
 */
fun Box.getLengthX() = this.method_17939()
/**
 * method_996
 */
fun Box.offset(blockPos: BlockPos) = this.method_996(blockPos)
/**
 * method_992
 */
fun Box.raycast(from: Vec3d, to: Vec3d) = this.method_992(from, to)
/**
 * method_61125
 */
fun Box.getMinPos() = this.method_61125()
/**
 * method_18804
 */
fun Box.stretch(scale: Vec3d) = this.method_18804(scale)
/**
 * method_1002
 */
fun Box.shrink(x: Double, arg1: Double, y: Double) = this.method_1002(x, arg1, y)
/**
 * method_17940
 */
fun Box.getLengthY() = this.method_17940()
/**
 * method_35577
 */
fun Box.withMaxX(maxX: Double) = this.method_35577(maxX)
/**
 * method_1014
 */
fun Box.expand(value: Double) = this.method_1014(value)
/**
 * method_35574
 */
fun Box.withMinX(minX: Double) = this.method_35574(minX)
/**
 * method_1001
 */
fun Box.getMin(axis: net.minecraft.class_2350.class_2351) = this.method_1001(axis)
/**
 * method_64032
 */
fun Box.collides(arg0: Vec3d, boundingBoxes: MutableList<Box>) = this.method_64032(arg0, boundingBoxes)
/**
 * method_1013
 */
fun Box.isNaN() = this.method_1013()
/**
 * method_1006
 */
fun Box.contains(pos: Vec3d) = this.method_1006(pos)
/**
 * method_991
 */
fun Box.union(box: Box) = this.method_991(box)
/**
 * method_17941
 */
fun Box.getLengthZ() = this.method_17941()
/**
 * method_1003
 */
fun Box.intersects(minX: Double, arg1: Double, minY: Double, arg3: Double, minZ: Double, arg5: Double) = this.method_1003(minX, arg1, minY, arg3, minZ, arg5)
/**
 * method_60314
 */
fun Box.offset(offset: Vector3f) = this.method_60314(offset)
/**
 * method_999
 */
fun Box.intersection(box: Box) = this.method_999(box)
/**
 * method_990
 */
fun Box.getMax(axis: net.minecraft.class_2350.class_2351) = this.method_990(axis)
/**
 * method_35578
 */
fun Box.withMaxY(maxY: Double) = this.method_35578(maxY)
/**
 * method_35575
 */
fun Box.withMinY(minY: Double) = this.method_35575(minY)
/**
 * method_1011
 */
fun Box.contract(value: Double) = this.method_1011(value)
/**
 * method_64033
 */
fun Box.getHorizontalCenter() = this.method_64033()
/**
 * method_989
 */
fun Box.offset(x: Double, arg1: Double, y: Double) = this.method_989(x, arg1, y)
/**
 * method_35580
 */
fun Box.contract(x: Double, arg1: Double, y: Double) = this.method_35580(x, arg1, y)
/**
 * method_1009
 */
fun Box.expand(x: Double, arg1: Double, y: Double) = this.method_1009(x, arg1, y)
/**
 * method_1005
 */
fun Box.getCenter() = this.method_1005()
/**
 * method_49271
 */
fun Box.squaredMagnitude(pos: Vec3d) = this.method_49271(pos)
/**
 * method_1012
 */
fun Box.stretch(x: Double, arg1: Double, y: Double) = this.method_1012(x, arg1, y)
/**
 * method_35579
 */
fun Box.withMaxZ(maxZ: Double) = this.method_35579(maxZ)
/**
 * method_995
 */
fun Box.getAverageSideLength() = this.method_995()
