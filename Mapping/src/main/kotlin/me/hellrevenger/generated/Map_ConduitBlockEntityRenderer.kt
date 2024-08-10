package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConduitBlockEntityRenderer

val ConduitBlockEntityRenderer.WIND_VERTICAL_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4371)
val ConduitBlockEntityRenderer.CLOSED_EYE_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4380)
val ConduitBlockEntityRenderer.OPEN_EYE_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4379)
val ConduitBlockEntityRenderer.CAGE_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4378)
val ConduitBlockEntityRenderer.BASE_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4377)
val ConduitBlockEntityRenderer.WIND_TEXTURE by aliasStatic(ConduitBlockEntityRenderer::field_4373)
fun ConduitBlockEntityRenderer.render(arg0: ConduitBlockEntity, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider, arg4: Int, arg5: Int) = this.method_22750(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ConduitBlockEntityRenderer>.getPlainTexturedModelData() = ConduitBlockEntityRenderer.method_32153()
fun KClass<ConduitBlockEntityRenderer>.getShellTexturedModelData() = ConduitBlockEntityRenderer.method_32152()
fun KClass<ConduitBlockEntityRenderer>.getWindTexturedModelData() = ConduitBlockEntityRenderer.method_32151()
fun KClass<ConduitBlockEntityRenderer>.getEyeTexturedModelData() = ConduitBlockEntityRenderer.method_32150()
