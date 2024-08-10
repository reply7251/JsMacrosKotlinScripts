package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BeaconBlockEntityRenderer

val BeaconBlockEntityRenderer.MAX_BEAM_HEIGHT by aliasStatic(BeaconBlockEntityRenderer::field_32822)
val BeaconBlockEntityRenderer.BEAM_TEXTURE by aliasStatic(BeaconBlockEntityRenderer::field_4338)
fun BeaconBlockEntityRenderer.isInRenderDistance(arg0: BeaconBlockEntity, arg1: Vec3d) = this.method_33891(arg0, arg1)
fun BeaconBlockEntityRenderer.render(arg0: BeaconBlockEntity, arg1: Float, arg2: MatrixStack, arg3: VertexConsumerProvider, arg4: Int, arg5: Int) = this.method_3541(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<BeaconBlockEntityRenderer>.renderBeam(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Identifier, arg3: Float, arg4: Float, arg5: Long, arg6: Int, arg7: Int, arg8: Int, arg9: Float, arg10: Float) = BeaconBlockEntityRenderer.method_3545(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
fun BeaconBlockEntityRenderer.rendersOutsideBoundingBox(arg0: BeaconBlockEntity) = this.method_3542(arg0)
