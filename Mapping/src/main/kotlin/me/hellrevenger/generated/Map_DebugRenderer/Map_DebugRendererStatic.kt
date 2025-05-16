package me.hellrevenger.generated.Map_DebugRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DebugRendererKt {
    /**
     * method_23103
     */
    fun drawBox(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, pos: BlockPos?, expand: Float, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_23103(matrices, vertexConsumers, pos, expand, red, green, blue, alpha)
    /**
     * method_23105
     */
    fun drawString(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, string: String?, x: Double, arg4: Double, y: Double, arg6: Int) = DebugRenderer.method_23105(matrices, vertexConsumers, string, x, arg4, y, arg6)
    /**
     * method_23102
     */
    fun drawBox(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, box: Box?, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_23102(matrices, vertexConsumers, box, red, green, blue, alpha)
    /**
     * method_23101
     */
    fun getTargetedEntity(entity: Entity?, maxDistance: Int) = DebugRenderer.method_23101(entity, maxDistance)
    /**
     * method_23107
     */
    fun drawString(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, string: String?, x: Double, arg4: Double, y: Double, arg6: Int, z: Float, arg8: Boolean, color: Float, size: Boolean) = DebugRenderer.method_23107(matrices, vertexConsumers, string, x, arg4, y, arg6, z, arg8, color, size)
    /**
     * method_23098
     */
    fun drawBox(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, minX: Double, arg3: Double, minY: Double, arg5: Double, minZ: Double, arg7: Double, maxX: Float, arg9: Float, maxY: Float, arg11: Float) = DebugRenderer.method_23098(matrices, vertexConsumers, minX, arg3, minY, arg5, minZ, arg7, maxX, arg9, maxY, arg11)
    /**
     * method_23106
     */
    fun drawString(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, string: String?, x: Double, arg4: Double, y: Double, arg6: Int, z: Float) = DebugRenderer.method_23106(matrices, vertexConsumers, string, x, arg4, y, arg6, z)
    /**
     * method_23108
     */
    fun drawString(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, string: String?, x: Int, y: Int, z: Int, color: Int) = DebugRenderer.method_23108(matrices, vertexConsumers, string, x, y, z, color)
    /**
     * method_23104
     */
    fun drawBox(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, pos1: BlockPos?, pos2: BlockPos?, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_23104(matrices, vertexConsumers, pos1, pos2, red, green, blue, alpha)
    /**
     * method_62350
     */
    fun drawVoxelShapeOutlines(matrices: MatrixStack?, vertexConsumer: VertexConsumer?, shape: VoxelShape?, offsetX: Double, arg4: Double, offsetY: Double, arg6: Float, offsetZ: Float, arg8: Float, red: Float, green: Boolean) = DebugRenderer.method_62350(matrices, vertexConsumer, shape, offsetX, arg4, offsetY, arg6, offsetZ, arg8, red, green)
    /**
     * method_54808
     */
    fun drawBlockBox(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, pos: BlockPos?, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_54808(matrices, vertexConsumers, pos, red, green, blue, alpha)
}