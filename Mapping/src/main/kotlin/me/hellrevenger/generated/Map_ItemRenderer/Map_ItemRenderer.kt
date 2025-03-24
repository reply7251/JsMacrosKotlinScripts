package me.hellrevenger.generated.Map_ItemRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_43087
 */
val KClass<ItemRenderer>.ITEM_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43087)
/**
 * field_43086
 */
val KClass<ItemRenderer>.ENTITY_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43086)
/**
 * field_32935
 */
val KClass<ItemRenderer>.COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32935)
/**
 * field_32936
 */
val KClass<ItemRenderer>.COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32936)
/**
 * method_62476
 */
fun KClass<ItemRenderer>.renderItem(arg0: ModelTransformationMode, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int, arg4: Int, arg5: IntArray, arg6: BakedModel, arg7: RenderLayer, arg8: net.minecraft.class_10444.class_10445) = ItemRenderer.method_62476(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
/**
 * method_27952
 */
fun KClass<ItemRenderer>.getArmorGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: Boolean) = ItemRenderer.method_27952(arg0, arg1, arg2)
/**
 * method_23178
 */
fun ItemRenderer.renderItem(arg0: ItemStack, arg1: ModelTransformationMode, arg2: Int, arg3: Int, arg4: MatrixStack, arg5: VertexConsumerProvider, arg6: world_World, arg7: Int) = this.method_23178(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_23177
 */
fun ItemRenderer.renderItem(arg0: LivingEntity, arg1: ItemStack, arg2: ModelTransformationMode, arg3: Boolean, arg4: MatrixStack, arg5: VertexConsumerProvider, arg6: world_World, arg7: Int, arg8: Int, arg9: Int) = this.method_23177(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
/**
 * method_23181
 */
fun KClass<ItemRenderer>.getItemGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: Boolean, arg3: Boolean) = ItemRenderer.method_23181(arg0, arg1, arg2, arg3)
