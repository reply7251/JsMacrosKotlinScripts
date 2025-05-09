package me.hellrevenger.generated.Map_Box
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BoxKt {
    /**
     * method_1010
     */
    fun raycast(boxes: Iterable<Box>, from: Vec3d, to: Vec3d, pos: BlockPos) = Box.method_1010(boxes, from, to, pos)
    /**
     * method_61885
     */
    fun raycast(minX: Double, arg1: Double, minY: Double, arg3: Double, minZ: Double, arg5: Double, maxX: Vec3d, arg7: Vec3d) = Box.method_61885(minX, arg1, minY, arg3, minZ, arg5, maxX, arg7)
    /**
     * method_30048
     */
    fun of(center: Vec3d, dx: Double, arg2: Double, dy: Double) = Box.method_30048(center, dx, arg2, dy)
    /**
     * method_54784
     */
    fun enclosing(pos1: BlockPos, pos2: BlockPos) = Box.method_54784(pos1, pos2)
    /**
     * method_19316
     */
    fun from(mutable: BlockBox) = Box.method_19316(mutable)
    /**
     * method_29968
     */
    fun from(pos: Vec3d) = Box.method_29968(pos)
}