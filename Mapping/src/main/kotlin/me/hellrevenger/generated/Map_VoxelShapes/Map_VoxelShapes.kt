package me.hellrevenger.generated.Map_VoxelShapes
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_17669
 */
val KClass<VoxelShapes>.UNBOUNDED by aliasStatic(VoxelShapes::field_17669)
/**
 * field_31880
 */
val KClass<VoxelShapes>.MIN_SIZE by aliasStatic(VoxelShapes::field_31880)
/**
 * method_1085
 */
fun KClass<VoxelShapes>.calculateMaxOffset(arg0: net.minecraft.class_2350.class_2351, arg1: Box, arg2: Iterable<VoxelShape>, arg3: Double) = VoxelShapes.method_1085(arg0, arg1, arg2, arg3)
/**
 * method_17786
 */
fun KClass<VoxelShapes>.union(arg0: VoxelShape, arg1: Array<VoxelShape>) = VoxelShapes.method_17786(arg0, *arg1)
/**
 * method_1081
 */
fun KClass<VoxelShapes>.cuboid(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = VoxelShapes.method_1081(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_1080
 */
fun KClass<VoxelShapes>.adjacentSidesCoverSquare(arg0: VoxelShape, arg1: VoxelShape, arg2: Direction) = VoxelShapes.method_1080(arg0, arg1, arg2)
/**
 * method_1082
 */
fun KClass<VoxelShapes>.combine(arg0: VoxelShape, arg1: VoxelShape, arg2: BooleanBiFunction) = VoxelShapes.method_1082(arg0, arg1, arg2)
/**
 * method_1072
 */
fun KClass<VoxelShapes>.combineAndSimplify(arg0: VoxelShape, arg1: VoxelShape, arg2: BooleanBiFunction) = VoxelShapes.method_1072(arg0, arg1, arg2)
/**
 * method_1074
 */
fun KClass<VoxelShapes>.matchesAnywhere(arg0: VoxelShape, arg1: VoxelShape, arg2: BooleanBiFunction) = VoxelShapes.method_1074(arg0, arg1, arg2)
/**
 * method_31943
 */
fun KClass<VoxelShapes>.cuboidUnchecked(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double) = VoxelShapes.method_31943(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_1077
 */
fun KClass<VoxelShapes>.fullCube() = VoxelShapes.method_1077()
/**
 * method_1073
 */
fun KClass<VoxelShapes>.empty() = VoxelShapes.method_1073()
/**
 * method_20713
 */
fun KClass<VoxelShapes>.unionCoversFullCube(arg0: VoxelShape, arg1: VoxelShape) = VoxelShapes.method_20713(arg0, arg1)
/**
 * method_1084
 */
fun KClass<VoxelShapes>.union(arg0: VoxelShape, arg1: VoxelShape) = VoxelShapes.method_1084(arg0, arg1)
/**
 * method_1078
 */
fun KClass<VoxelShapes>.cuboid(arg0: Box) = VoxelShapes.method_1078(arg0)
/**
 * method_1083
 */
fun KClass<VoxelShapes>.isSideCovered(arg0: VoxelShape, arg1: VoxelShape, arg2: Direction) = VoxelShapes.method_1083(arg0, arg1, arg2)
