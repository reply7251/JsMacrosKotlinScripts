package me.hellrevenger.generated.Map_BeaconBlockEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BeaconBlockEntityRendererKt {
    /**
     * field_32822
     */
    val MAX_BEAM_HEIGHT by aliasStatic(BeaconBlockEntityRenderer::field_32822)
    /**
     * field_4338
     */
    val BEAM_TEXTURE by aliasStatic(BeaconBlockEntityRenderer::field_4338)
    /**
     * method_3545
     */
    fun renderBeam(matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, textureId: Identifier, tickDelta: Float, heightScale: Float, worldTime: Long, arg6: Int, yOffset: Int, maxY: Int, color: Float, innerRadius: Float) = BeaconBlockEntityRenderer.method_3545(matrices, vertexConsumers, textureId, tickDelta, heightScale, worldTime, arg6, yOffset, maxY, color, innerRadius)
}