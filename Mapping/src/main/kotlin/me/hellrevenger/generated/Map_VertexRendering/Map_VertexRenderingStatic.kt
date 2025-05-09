package me.hellrevenger.generated.Map_VertexRendering
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VertexRenderingKt {
    /**
     * method_62297
     */
    fun drawSide(matrices: MatrixStack, vertexConsumers: VertexConsumer, side: Direction, minX: Float, minY: Float, minZ: Float, maxX: Float, maxY: Float, maxZ: Float, red: Float, green: Float, blue: Float, alpha: Float) = VertexRendering.method_62297(matrices, vertexConsumers, side, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha)
    /**
     * method_62298
     */
    fun drawVector(matrices: MatrixStack, vertexConsumers: VertexConsumer, offset: Vector3f, vec: Vec3d, argb: Int) = VertexRendering.method_62298(matrices, vertexConsumers, offset, vec, argb)
    /**
     * method_62292
     */
    fun drawBox(matrices: MatrixStack, vertexConsumers: VertexConsumer, x1: Double, arg3: Double, y1: Double, arg5: Double, z1: Double, arg7: Double, x2: Float, arg9: Float, y2: Float, arg11: Float) = VertexRendering.method_62292(matrices, vertexConsumers, x1, arg3, y1, arg5, z1, arg7, x2, arg9, y2, arg11)
    /**
     * method_62294
     */
    fun drawFilledBox(matrices: MatrixStack, vertexConsumers: VertexConsumer, minX: Float, minY: Float, minZ: Float, maxX: Float, maxY: Float, maxZ: Float, red: Float, green: Float, blue: Float, alpha: Float) = VertexRendering.method_62294(matrices, vertexConsumers, minX, minY, minZ, maxX, maxY, maxZ, red, green, blue, alpha)
    /**
     * method_62296
     */
    fun drawOutline(matrices: MatrixStack, vertexConsumers: VertexConsumer, shape: VoxelShape, offsetX: Double, arg4: Double, offsetY: Double, arg6: Int) = VertexRendering.method_62296(matrices, vertexConsumers, shape, offsetX, arg4, offsetY, arg6)
}