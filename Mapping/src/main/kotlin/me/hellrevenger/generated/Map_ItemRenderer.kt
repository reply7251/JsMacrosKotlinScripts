package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemRenderer

val KClass<ItemRenderer>.SPYGLASS_IN_HAND by aliasStatic(ItemRenderer::field_40531)
val KClass<ItemRenderer>.ENTITY_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43086)
val KClass<ItemRenderer>.COMPASS_WITH_GLINT_FIRST_PERSON_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32936)
val KClass<ItemRenderer>.ITEM_ENCHANTMENT_GLINT by aliasStatic(ItemRenderer::field_43087)
val KClass<ItemRenderer>.TRIDENT_IN_HAND by aliasStatic(ItemRenderer::field_40530)
val KClass<ItemRenderer>.COMPASS_WITH_GLINT_GUI_MODEL_MULTIPLIER by aliasStatic(ItemRenderer::field_32935)
fun KClass<ItemRenderer>.getArmorGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: Boolean) = ItemRenderer.method_27952(arg0, arg1, arg2)
fun KClass<ItemRenderer>.getDynamicDisplayGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: net.minecraft.class_4587.class_4665) = ItemRenderer.method_30114(arg0, arg1, arg2)
fun ItemRenderer.renderItem(arg0: LivingEntity, arg1: ItemStack, arg2: ModelTransformationMode, arg3: Boolean, arg4: MatrixStack, arg5: VertexConsumerProvider, arg6: world_World, arg7: Int, arg8: Int, arg9: Int) = this.method_23177(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun KClass<ItemRenderer>.getItemGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: Boolean, arg3: Boolean) = ItemRenderer.method_23181(arg0, arg1, arg2, arg3)
fun ItemRenderer.getModels() = this.method_4012()
fun ItemRenderer.renderItem(arg0: ItemStack, arg1: ModelTransformationMode, arg2: Boolean, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int, arg6: Int, arg7: BakedModel) = this.method_23179(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun ItemRenderer.getModel(arg0: ItemStack, arg1: world_World, arg2: LivingEntity, arg3: Int) = this.method_4019(arg0, arg1, arg2, arg3)
fun ItemRenderer.renderItem(arg0: ItemStack, arg1: ModelTransformationMode, arg2: Int, arg3: Int, arg4: MatrixStack, arg5: VertexConsumerProvider, arg6: world_World, arg7: Int) = this.method_23178(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun KClass<ItemRenderer>.getDirectItemGlintConsumer(arg0: VertexConsumerProvider, arg1: RenderLayer, arg2: Boolean, arg3: Boolean) = ItemRenderer.method_29711(arg0, arg1, arg2, arg3)
