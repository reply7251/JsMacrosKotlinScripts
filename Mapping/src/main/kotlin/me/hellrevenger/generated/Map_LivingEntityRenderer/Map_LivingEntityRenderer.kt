package me.hellrevenger.generated.Map_LivingEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_4054
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.render(arg0: S, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_4054(arg0, arg1, arg2, arg3)
/**
 * method_3885
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.getTexture(arg0: S) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_3885(arg0)
/**
 * method_62355
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.updateRenderState(arg0: T, arg1: S, arg2: Float) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_62355(arg0, arg1, arg2)
/**
 * method_23622
 */
fun <T, S, M>KClass<LivingEntityRenderer<T, S, M>>.getOverlay(arg0: LivingEntityRenderState, arg1: Float) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = LivingEntityRenderer.method_23622(arg0, arg1)
/**
 * method_38563
 */
fun <T, S, M>KClass<LivingEntityRenderer<T, S, M>>.shouldFlipUpsideDown(arg0: LivingEntity) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = LivingEntityRenderer.method_38563(arg0)
