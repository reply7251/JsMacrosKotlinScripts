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
fun Box.withMinZ(arg0: Double) = this.method_35576(arg0)
/**
 * method_61126
 */
fun Box.getMaxPos() = this.method_61126()
/**
 * method_997
 */
fun Box.offset(arg0: Vec3d) = this.method_997(arg0)
/**
 * method_1008
 */
fun Box.contains(arg0: Double, arg1: Double, arg2: Double) = this.method_1008(arg0, arg1, arg2)
/**
 * method_1010
 */
fun KClass<Box>.raycast(arg0: Iterable<Box>, arg1: Vec3d, arg2: Vec3d, arg3: BlockPos) = Box.method_1010(arg0, arg1, arg2, arg3)
/**
 * method_61885
 */
fun KClass<Box>.raycast(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Vec3d, arg7: Vec3d) = Box.method_61885(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_993
 */
fun Box.intersects(arg0: Vec3d, arg1: Vec3d) = this.method_993(arg0, arg1)
/**
 * method_994
 */
fun Box.intersects(arg0: Box) = this.method_994(arg0)
/**
 * method_17939
 */
fun Box.getLengthX() = this.method_17939()
/**
 * method_996
 */
fun Box.offset(arg0: BlockPos) = this.method_996(arg0)
/**
 * method_992
 */
fun Box.raycast(arg0: Vec3d, arg1: Vec3d) = this.method_992(arg0, arg1)
/**
 * method_61125
 */
fun Box.getMinPos() = this.method_61125()
/**
 * method_18804
 */
fun Box.stretch(arg0: Vec3d) = this.method_18804(arg0)
/**
 * method_30048
 */
fun KClass<Box>.of(arg0: Vec3d, arg1: Double, arg2: Double, arg3: Double) = Box.method_30048(arg0, arg1, arg2, arg3)
/**
 * method_1002
 */
fun Box.shrink(arg0: Double, arg1: Double, arg2: Double) = this.method_1002(arg0, arg1, arg2)
/**
 * method_17940
 */
fun Box.getLengthY() = this.method_17940()
/**
 * method_35577
 */
fun Box.withMaxX(arg0: Double) = this.method_35577(arg0)
/**
 * method_1014
 */
fun Box.expand(arg0: Double) = this.method_1014(arg0)
/**
 * method_35574
 */
fun Box.withMinX(arg0: Double) = this.method_35574(arg0)
/**
 * method_1001
 */
fun Box.getMin(arg0: net.minecraft.class_2350.class_2351) = this.method_1001(arg0)
/**
 * method_64032
 */
fun Box.collides(arg0: Vec3d, arg1: MutableList<Box>) = this.method_64032(arg0, arg1)
/**
 * method_1013
 */
fun Box.isNaN() = this.method_1013()
/**
 * method_1006
 */
fun Box.contains(arg0: Vec3d) = this.method_1006(arg0)
/**
 * method_991
 */
fun Box.union(arg0: Box) = this.method_991(arg0)
/**
 * method_17941
 */
fun Box.getLengthZ() = this.method_17941()
/**
 * method_1003
 */
fun Box.intersects(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = this.method_1003(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_60314
 */
fun Box.offset(arg0: Vector3f) = this.method_60314(arg0)
/**
 * method_999
 */
fun Box.intersection(arg0: Box) = this.method_999(arg0)
/**
 * method_990
 */
fun Box.getMax(arg0: net.minecraft.class_2350.class_2351) = this.method_990(arg0)
/**
 * method_35578
 */
fun Box.withMaxY(arg0: Double) = this.method_35578(arg0)
/**
 * method_35575
 */
fun Box.withMinY(arg0: Double) = this.method_35575(arg0)
/**
 * method_1011
 */
fun Box.contract(arg0: Double) = this.method_1011(arg0)
/**
 * method_54784
 */
fun KClass<Box>.enclosing(arg0: BlockPos, arg1: BlockPos) = Box.method_54784(arg0, arg1)
/**
 * method_64033
 */
fun Box.getHorizontalCenter() = this.method_64033()
/**
 * method_989
 */
fun Box.offset(arg0: Double, arg1: Double, arg2: Double) = this.method_989(arg0, arg1, arg2)
/**
 * method_35580
 */
fun Box.contract(arg0: Double, arg1: Double, arg2: Double) = this.method_35580(arg0, arg1, arg2)
/**
 * method_1009
 */
fun Box.expand(arg0: Double, arg1: Double, arg2: Double) = this.method_1009(arg0, arg1, arg2)
/**
 * method_1005
 */
fun Box.getCenter() = this.method_1005()
/**
 * method_19316
 */
fun KClass<Box>.from(arg0: BlockBox) = Box.method_19316(arg0)
/**
 * method_29968
 */
fun KClass<Box>.from(arg0: Vec3d) = Box.method_29968(arg0)
/**
 * method_49271
 */
fun Box.squaredMagnitude(arg0: Vec3d) = this.method_49271(arg0)
/**
 * method_1012
 */
fun Box.stretch(arg0: Double, arg1: Double, arg2: Double) = this.method_1012(arg0, arg1, arg2)
/**
 * method_35579
 */
fun Box.withMaxZ(arg0: Double) = this.method_35579(arg0)
/**
 * method_995
 */
fun Box.getAverageSideLength() = this.method_995()
