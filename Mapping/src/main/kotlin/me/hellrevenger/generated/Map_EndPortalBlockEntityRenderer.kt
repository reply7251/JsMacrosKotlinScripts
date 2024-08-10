package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EndPortalBlockEntityRenderer

val <T>EndPortalBlockEntityRenderer<T>.PORTAL_TEXTURE where T: EndPortalBlockEntity by aliasStatic({EndPortalBlockEntityRenderer.field_4407})
val <T>EndPortalBlockEntityRenderer<T>.SKY_TEXTURE where T: EndPortalBlockEntity by aliasStatic({EndPortalBlockEntityRenderer.field_4406})
fun <T>EndPortalBlockEntityRenderer<T>.render(arg0: T, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider, arg4: Int, arg5: Int) where T: EndPortalBlockEntity = this.method_3591(arg0, arg1, arg2, arg3, arg4, arg5)
