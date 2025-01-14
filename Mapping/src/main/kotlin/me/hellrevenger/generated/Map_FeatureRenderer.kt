package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureRenderer

fun <T, M>FeatureRenderer<T, M>.getContextModel() where T: Entity, M: EntityModel<T> = this.method_17165()
fun <T, M>FeatureRenderer<T, M>.render(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: T, arg4: Float, arg5: Float, arg6: Float, arg7: Float, arg8: Float, arg9: Float) where T: Entity, M: EntityModel<T> = this.method_4199(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
