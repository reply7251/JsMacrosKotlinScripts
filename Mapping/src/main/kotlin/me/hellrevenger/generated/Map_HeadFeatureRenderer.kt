package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.HeadFeatureRenderer

fun <T, M>HeadFeatureRenderer<T, M>.render(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: T, arg4: Float, arg5: Float, arg6: Float, arg7: Float, arg8: Float, arg9: Float) where T: LivingEntity, M: EntityModel<T>, M: ModelWithHead = this.method_17159(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun <T, M>KClass<HeadFeatureRenderer<T, M>>.translate(arg0: MatrixStack, arg1: Boolean) where T: LivingEntity, M: EntityModel<T>, M: ModelWithHead = HeadFeatureRenderer.method_32798(arg0, arg1)
