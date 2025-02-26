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
fun BlockEntityRenderDispatcher.configure(arg0: world_World, arg1: Camera, arg2: HitResult) = this.method_3549(arg0, arg1, arg2)
/**
 * method_3555
 */
fun <E>BlockEntityRenderDispatcher.render(arg0: E, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider) where E: BlockEntity = this.method_3555<E>(arg0, arg1, arg2, arg3)
/**
 * method_3550
 */
fun <E>BlockEntityRenderDispatcher.get(arg0: E) where E: BlockEntity = this.method_3550<E>(arg0)
/**
 * method_23077
 */
fun <E>BlockEntityRenderDispatcher.renderEntity(arg0: E, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int, arg4: Int) where E: BlockEntity = this.method_23077<E>(arg0, arg1, arg2, arg3, arg4)
