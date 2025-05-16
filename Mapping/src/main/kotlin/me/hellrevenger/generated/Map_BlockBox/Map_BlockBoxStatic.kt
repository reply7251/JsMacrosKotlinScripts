package me.hellrevenger.generated.Map_BlockBox
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockBoxKt {
    /**
     * method_14665
     */
    fun infinite() = BlockBox.method_14665()
    /**
     * method_34390
     */
    fun create(first: Vec3i?, second: Vec3i?) = BlockBox.method_34390(first, second)
    /**
     * method_14667
     */
    fun rotated(x: Int, y: Int, z: Int, offsetX: Int, offsetY: Int, offsetZ: Int, sizeX: Int, sizeY: Int, sizeZ: Int, facing: Direction?) = BlockBox.method_14667(x, y, z, offsetX, offsetY, offsetZ, sizeX, sizeY, sizeZ, facing)
    /**
     * method_35411
     */
    fun encompassPositions(positions: Iterable<BlockPos>?) = BlockBox.method_35411(positions)
    /**
     * method_35413
     */
    fun encompass(boxes: Iterable<BlockBox>?) = BlockBox.method_35413(boxes)
}