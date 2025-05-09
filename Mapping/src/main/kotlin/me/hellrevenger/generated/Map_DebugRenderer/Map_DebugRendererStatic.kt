package me.hellrevenger.generated.Map_DebugRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DebugRendererKt {
    /**
     * method_23103
     */
    fun drawBox(matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, pos: BlockPos, expand: Float, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_23103(matrices, vertexConsumers, pos, expand, red, green, blue, alpha)
    /**
     * method_23105
     */
    fun drawString(matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, string: String, x: Double, arg4: Double, y: Double, arg6: Int) = DebugRenderer.method_23105(matrices, vertexConsumers, string, x, arg4, y, arg6)
    /**
     * method_23101
     */
    fun getTargetedEntity(entity: Entity, maxDistance: Int) = DebugRenderer.method_23101(entity, maxDistance)
    /**
     * method_62350
     */
    fun drawVoxelShapeOutlines(matrices: MatrixStack, vertexConsumer: VertexConsumer, shape: VoxelShape, offsetX: Double, arg4: Double, offsetY: Double, arg6: Float, offsetZ: Float, arg8: Float, red: Float, green: Boolean) = DebugRenderer.method_62350(matrices, vertexConsumer, shape, offsetX, arg4, offsetY, arg6, offsetZ, arg8, red, green)
    /**
     * method_54808
     */
    fun drawBlockBox(matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, pos: BlockPos, red: Float, green: Float, blue: Float, alpha: Float) = DebugRenderer.method_54808(matrices, vertexConsumers, pos, red, green, blue, alpha)
}