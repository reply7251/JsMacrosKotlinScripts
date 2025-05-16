package me.hellrevenger.generated.Map_ItemRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ItemRendererKt {
    /**
     * field_43087
     */
    val ITEM_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43087)
    /**
     * field_43086
     */
    val ENTITY_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43086)
    /**
     * field_32935
     */
    val COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32935)
    /**
     * field_32936
     */
    val COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32936)
    /**
     * method_62476
     */
    fun renderItem(transformationMode: ModelTransformationMode?, matrices: MatrixStack?, vertexConsumers: VertexConsumerProvider?, light: Int, overlay: Int, tints: IntArray?, model: BakedModel?, layer: RenderLayer?, glint: net.minecraft.class_10444.class_10445?) = ItemRenderer.method_62476(transformationMode, matrices, vertexConsumers, light, overlay, tints, model, layer, glint)
    /**
     * method_27952
     */
    fun getArmorGlintConsumer(provider: VertexConsumerProvider?, layer: RenderLayer?, glint: Boolean) = ItemRenderer.method_27952(provider, layer, glint)
    /**
     * method_23181
     */
    fun getItemGlintConsumer(vertexConsumers: VertexConsumerProvider?, layer: RenderLayer?, solid: Boolean, glint: Boolean) = ItemRenderer.method_23181(vertexConsumers, layer, solid, glint)
}