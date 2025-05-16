package me.hellrevenger.generated.Map_BlockEntityRenderDispatcher
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_4344
 */
var BlockEntityRenderDispatcher.camera by alias(BlockEntityRenderDispatcher::field_4344)
/**
 * field_4350
 */
var BlockEntityRenderDispatcher.crosshairTarget by alias(BlockEntityRenderDispatcher::field_4350)
/**
 * field_4348
 */
var BlockEntityRenderDispatcher.world by alias(BlockEntityRenderDispatcher::field_4348)
/**
 * method_3549
 */
fun BlockEntityRenderDispatcher.configure(world: world_World?, camera: Camera?, crosshairTarget: HitResult?) = this.method_3549(world, camera, crosshairTarget)
/**
 * method_3555
 */
fun <E>BlockEntityRenderDispatcher.render(blockEntity: E, tickDelta: Float, matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?) where E: BlockEntity = this.method_3555<E>(blockEntity, tickDelta, matrices, vertexConsumers)
/**
 * method_3550
 */
fun <E>BlockEntityRenderDispatcher.get(blockEntity: E) where E: BlockEntity = this.method_3550<E>(blockEntity)
