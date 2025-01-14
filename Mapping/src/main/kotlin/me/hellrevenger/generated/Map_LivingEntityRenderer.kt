package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LivingEntityRenderer

fun <T, M>KClass<LivingEntityRenderer<T, M>>.getOverlay(arg0: LivingEntity, arg1: Float) where T: LivingEntity, M: EntityModel<T> = LivingEntityRenderer.method_23622(arg0, arg1)
fun <T, M>LivingEntityRenderer<T, M>.render(arg0: T, arg1: Float, arg2: Float, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int) where T: LivingEntity, M: EntityModel<T> = this.method_4054(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T, M>KClass<LivingEntityRenderer<T, M>>.shouldFlipUpsideDown(arg0: LivingEntity) where T: LivingEntity, M: EntityModel<T> = LivingEntityRenderer.method_38563(arg0)
