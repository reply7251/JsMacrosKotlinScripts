package me.hellrevenger.generated.Map_BlockEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_3563
 */
fun <T>BlockEntityRenderer<T>.rendersOutsideBoundingBox(blockEntity: T) where T: BlockEntity = this.method_3563(blockEntity)
/**
 * method_3569
 */
fun <T>BlockEntityRenderer<T>.render(entity: T, tickDelta: Float, matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, light: Int, overlay: Int) where T: BlockEntity = this.method_3569(entity, tickDelta, matrices, vertexConsumers, light, overlay)
/**
 * method_33893
 */
fun <T>BlockEntityRenderer<T>.getRenderDistance() where T: BlockEntity = this.method_33893()
/**
 * method_33892
 */
fun <T>BlockEntityRenderer<T>.isInRenderDistance(blockEntity: T, pos: Vec3d?) where T: BlockEntity = this.method_33892(blockEntity, pos)
