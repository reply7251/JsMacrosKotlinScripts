package me.hellrevenger.generated.Map_VoxelShapes
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VoxelShapesKt {
    /**
     * field_17669
     */
    val UNBOUNDED by aliasStatic(VoxelShapes::field_17669)
    /**
     * field_31880
     */
    val MIN_SIZE by aliasStatic(VoxelShapes::field_31880)
    /**
     * method_1085
     */
    fun calculateMaxOffset(axis: net.minecraft.class_2350.class_2351, box: Box, shapes: Iterable<VoxelShape>, maxDist: Double) = VoxelShapes.method_1085(axis, box, shapes, maxDist)
    /**
     * method_17786
     */
    fun union(first: VoxelShape, others: Array<VoxelShape>) = VoxelShapes.method_17786(first, *others)
    /**
     * method_1081
     */
    fun cuboid(minX: Double, arg1: Double, minY: Double, arg3: Double, minZ: Double, arg5: Double) = VoxelShapes.method_1081(minX, arg1, minY, arg3, minZ, arg5)
    /**
     * method_1080
     */
    fun adjacentSidesCoverSquare(one: VoxelShape, two: VoxelShape, direction: Direction) = VoxelShapes.method_1080(one, two, direction)
    /**
     * method_1082
     */
    fun combine(one: VoxelShape, two: VoxelShape, function: BooleanBiFunction) = VoxelShapes.method_1082(one, two, function)
    /**
     * method_1072
     */
    fun combineAndSimplify(first: VoxelShape, second: VoxelShape, function: BooleanBiFunction) = VoxelShapes.method_1072(first, second, function)
    /**
     * method_1074
     */
    fun matchesAnywhere(shape1: VoxelShape, shape2: VoxelShape, predicate: BooleanBiFunction) = VoxelShapes.method_1074(shape1, shape2, predicate)
    /**
     * method_31943
     */
    fun cuboidUnchecked(minX: Double, arg1: Double, minY: Double, arg3: Double, minZ: Double, arg5: Double) = VoxelShapes.method_31943(minX, arg1, minY, arg3, minZ, arg5)
    /**
     * method_1077
     */
    fun fullCube() = VoxelShapes.method_1077()
    /**
     * method_1073
     */
    fun empty() = VoxelShapes.method_1073()
    /**
     * method_20713
     */
    fun unionCoversFullCube(one: VoxelShape, two: VoxelShape) = VoxelShapes.method_20713(one, two)
    /**
     * method_1083
     */
    fun isSideCovered(shape: VoxelShape, neighbor: VoxelShape, direction: Direction) = VoxelShapes.method_1083(shape, neighbor, direction)
}