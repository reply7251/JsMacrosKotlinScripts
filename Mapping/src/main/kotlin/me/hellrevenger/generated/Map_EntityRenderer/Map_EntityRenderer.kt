package me.hellrevenger.generated.Map_EntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_62425
 */
fun <T, S>EntityRenderer<T, S>.getAndUpdateRenderState(entity: T, tickDelta: Float) where T: Entity, S: EntityRenderState = this.method_62425(entity, tickDelta)
/**
 * method_55269
 */
fun <T, S>EntityRenderer<T, S>.createRenderState() where T: Entity, S: EntityRenderState = this.method_55269()
/**
 * method_24088
 */
fun <T, S>EntityRenderer<T, S>.getLight(entity: T, tickDelta: Float) where T: Entity, S: EntityRenderState = this.method_24088(entity, tickDelta)
/**
 * method_23169
 */
fun <T, S>EntityRenderer<T, S>.getPositionOffset(state: S) where T: Entity, S: EntityRenderState = this.method_23169(state)
/**
 * method_3936
 */
fun <T, S>EntityRenderer<T, S>.render(state: S, matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, light: Int) where T: Entity, S: EntityRenderState = this.method_3936(state, matrices, vertexConsumers, light)
/**
 * method_3933
 */
fun <T, S>EntityRenderer<T, S>.shouldRender(entity: T, frustum: Frustum, x: Double, arg3: Double, y: Double) where T: Entity, S: EntityRenderState = this.method_3933(entity, frustum, x, arg3, y)
/**
 * method_62354
 */
fun <T, S>EntityRenderer<T, S>.updateRenderState(entity: T, state: S, tickDelta: Float) where T: Entity, S: EntityRenderState = this.method_62354(entity, state, tickDelta)
/**
 * method_3932
 */
fun <T, S>EntityRenderer<T, S>.getTextRenderer() where T: Entity, S: EntityRenderState = this.method_3932()
