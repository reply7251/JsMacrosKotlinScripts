package me.hellrevenger.generated.Map_FeatureRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_4199
 */
fun <S, M>FeatureRenderer<S, M>.render(matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, light: Int, state: S, limbAngle: Float, limbDistance: Float) where S: EntityRenderState, M: EntityModel<in S> = this.method_4199(matrices, vertexConsumers, light, state, limbAngle, limbDistance)
/**
 * method_17165
 */
fun <S, M>FeatureRenderer<S, M>.getContextModel() where S: EntityRenderState, M: EntityModel<in S> = this.method_17165()
