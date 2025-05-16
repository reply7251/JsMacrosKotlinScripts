package me.hellrevenger.generated.Map_LivingEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_4054
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.render(arg0: S, arg1: MatrixStack?, arg2: VertexConsumerProvider?, arg3: Int) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_4054(arg0, arg1, arg2, arg3)
/**
 * method_3885
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.getTexture(state: S) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_3885(state)
/**
 * method_62355
 */
fun <T, S, M>LivingEntityRenderer<T, S, M>.updateRenderState(arg0: T, arg1: S, arg2: Float) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = this.method_62355(arg0, arg1, arg2)
