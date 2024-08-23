package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemFrameEntityRenderer

val <T>KClass<ItemFrameEntityRenderer<T>>.GLOW_FRAME_BLOCK_LIGHT where T: ItemFrameEntity by aliasStatic({ItemFrameEntityRenderer.field_32932})
fun <T>ItemFrameEntityRenderer<T>.getPositionOffset(arg0: T, arg1: Float) where T: ItemFrameEntity = this.method_23174(arg0, arg1)
fun <T>ItemFrameEntityRenderer<T>.getTexture(arg0: T) where T: ItemFrameEntity = this.method_3993(arg0)
fun <T>ItemFrameEntityRenderer<T>.render(arg0: T, arg1: Float, arg2: Float, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int) where T: ItemFrameEntity = this.method_3994(arg0, arg1, arg2, arg3, arg4, arg5)
