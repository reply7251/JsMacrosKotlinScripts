package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BannerBlockEntityRenderer

val KClass<BannerBlockEntityRenderer>.BANNER by aliasStatic(BannerBlockEntityRenderer::field_32816)
fun BannerBlockEntityRenderer.render(arg0: BannerBlockEntity, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider, arg4: Int, arg5: Int) = this.method_3546(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<BannerBlockEntityRenderer>.getTexturedModelData() = BannerBlockEntityRenderer.method_32135()
fun KClass<BannerBlockEntityRenderer>.renderCanvas(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: Int, arg4: ModelPart, arg5: SpriteIdentifier, arg6: Boolean, arg7: DyeColor, arg8: BannerPatternsComponent, arg9: Boolean) = BannerBlockEntityRenderer.method_23802(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun KClass<BannerBlockEntityRenderer>.renderCanvas(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: Int, arg4: ModelPart, arg5: SpriteIdentifier, arg6: Boolean, arg7: DyeColor, arg8: BannerPatternsComponent) = BannerBlockEntityRenderer.method_29999(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
