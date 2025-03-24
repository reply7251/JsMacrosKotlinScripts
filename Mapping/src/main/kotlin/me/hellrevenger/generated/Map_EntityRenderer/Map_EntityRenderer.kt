package me.hellrevenger.generated.Map_EntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_62425
 */
fun <T, S>EntityRenderer<T, S>.getAndUpdateRenderState(arg0: T, arg1: Float) where T: Entity, S: EntityRenderState = this.method_62425(arg0, arg1)
/**
 * method_55269
 */
fun <T, S>EntityRenderer<T, S>.createRenderState() where T: Entity, S: EntityRenderState = this.method_55269()
/**
 * method_24088
 */
fun <T, S>EntityRenderer<T, S>.getLight(arg0: T, arg1: Float) where T: Entity, S: EntityRenderState = this.method_24088(arg0, arg1)
/**
 * method_23169
 */
fun <T, S>EntityRenderer<T, S>.getPositionOffset(arg0: S) where T: Entity, S: EntityRenderState = this.method_23169(arg0)
/**
 * method_3936
 */
fun <T, S>EntityRenderer<T, S>.render(arg0: S, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int) where T: Entity, S: EntityRenderState = this.method_3936(arg0, arg1, arg2, arg3)
/**
 * method_3933
 */
fun <T, S>EntityRenderer<T, S>.shouldRender(arg0: T, arg1: Frustum, arg2: Double, arg3: Double, arg4: Double) where T: Entity, S: EntityRenderState = this.method_3933(arg0, arg1, arg2, arg3, arg4)
/**
 * method_62354
 */
fun <T, S>EntityRenderer<T, S>.updateRenderState(arg0: T, arg1: S, arg2: Float) where T: Entity, S: EntityRenderState = this.method_62354(arg0, arg1, arg2)
/**
 * method_3932
 */
fun <T, S>EntityRenderer<T, S>.getTextRenderer() where T: Entity, S: EntityRenderState = this.method_3932()
