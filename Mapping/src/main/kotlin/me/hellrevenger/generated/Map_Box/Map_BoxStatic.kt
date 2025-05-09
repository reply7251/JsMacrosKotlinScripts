package me.hellrevenger.generated.Map_Box
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BoxKt {
    /**
     * method_1010
     */
    fun raycast(boxes: Iterable<Box>, from: Vec3d, to: Vec3d, pos: BlockPos) = Box.method_1010(boxes, from, to, pos)
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
}