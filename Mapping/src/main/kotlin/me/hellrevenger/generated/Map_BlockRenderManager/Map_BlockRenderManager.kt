package me.hellrevenger.generated.Map_BlockRenderManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_3351
 */
fun BlockRenderManager.getModels() = this.method_3351()
/**
 * method_23071
 */
fun BlockRenderManager.renderDamage(state: BlockState, pos: BlockPos, world: BlockRenderView, matrices: MatrixStack, vertexConsumer: VertexConsumer) = this.method_23071(state, pos, world, matrices, vertexConsumer)
/**
 * method_3349
 */
fun BlockRenderManager.getModel(state: BlockState) = this.method_3349(state)
/**
 * method_3350
 */
fun BlockRenderManager.getModelRenderer() = this.method_3350()
/**
 * method_3352
 */
fun BlockRenderManager.renderFluid(pos: BlockPos, world: BlockRenderView, vertexConsumer: VertexConsumer, blockState: BlockState, fluidState: FluidState) = this.method_3352(pos, world, vertexConsumer, blockState, fluidState)
/**
 * method_3355
 */
fun BlockRenderManager.renderBlock(state: BlockState, pos: BlockPos, world: BlockRenderView, matrices: MatrixStack, vertexConsumer: VertexConsumer, cull: Boolean, random: Random) = this.method_3355(state, pos, world, matrices, vertexConsumer, cull, random)
/**
 * method_3353
 */
fun BlockRenderManager.renderBlockAsEntity(state: BlockState, matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, light: Int, overlay: Int) = this.method_3353(state, matrices, vertexConsumers, light, overlay)
