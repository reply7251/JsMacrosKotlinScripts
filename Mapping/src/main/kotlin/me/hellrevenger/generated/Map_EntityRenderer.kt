package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityRenderer

fun <T>EntityRenderer<T>.render(arg0: T, arg1: Float, arg2: Float, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int) where T: Entity = this.method_3936(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T>EntityRenderer<T>.getTexture(arg0: T) where T: Entity = this.method_3931(arg0)
fun <T>EntityRenderer<T>.shouldRender(arg0: T, arg1: Frustum, arg2: Double, arg3: Double, arg4: Double) where T: Entity = this.method_3933(arg0, arg1, arg2, arg3, arg4)
fun <T>EntityRenderer<T>.getPositionOffset(arg0: T, arg1: Float) where T: Entity = this.method_23169(arg0, arg1)
fun <T>EntityRenderer<T>.getLight(arg0: T, arg1: Float) where T: Entity = this.method_24088(arg0, arg1)
