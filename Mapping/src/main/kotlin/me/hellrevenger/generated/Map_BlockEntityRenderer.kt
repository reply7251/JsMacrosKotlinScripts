package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockEntityRenderer

fun <T>BlockEntityRenderer<T>.rendersOutsideBoundingBox(arg0: T) where T: BlockEntity = this.method_3563(arg0)
fun <T>BlockEntityRenderer<T>.render(arg0: T, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider, arg4: Int, arg5: Int) where T: BlockEntity = this.method_3569(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T>BlockEntityRenderer<T>.getRenderDistance() where T: BlockEntity = this.method_33893()
fun <T>BlockEntityRenderer<T>.isInRenderDistance(arg0: T, arg1: Vec3d) where T: BlockEntity = this.method_33892(arg0, arg1)
