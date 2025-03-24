package me.hellrevenger.generated.Map_ArmorFeatureRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64081
 */
fun <S, M, A>KClass<ArmorFeatureRenderer<S, M, A>>.hasModel(arg0: ItemStack, arg1: EquipmentSlot) where S: BipedEntityRenderState, M: BipedEntityModel<S>, A: BipedEntityModel<S> = ArmorFeatureRenderer.method_64081(arg0, arg1)
/**
 * method_17157
 */
fun <S, M, A>ArmorFeatureRenderer<S, M, A>.render(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: S, arg4: Float, arg5: Float) where S: BipedEntityRenderState, M: BipedEntityModel<S>, A: BipedEntityModel<S> = this.method_17157(arg0, arg1, arg2, arg3, arg4, arg5)
