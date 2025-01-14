package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemEntityRenderer

fun KClass<ItemEntityRenderer>.getSeed(arg0: ItemStack) = ItemEntityRenderer.method_56856(arg0)
fun KClass<ItemEntityRenderer>.renderStack(arg0: ItemRenderer, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int, arg4: ItemStack, arg5: BakedModel, arg6: Boolean, arg7: Random) = ItemEntityRenderer.method_56858(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun ItemEntityRenderer.render(arg0: ItemEntity, arg1: Float, arg2: Float, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int) = this.method_3996(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ItemEntityRenderer>.renderStack(arg0: ItemRenderer, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int, arg4: ItemStack, arg5: Random, arg6: world_World) = ItemEntityRenderer.method_56857(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun ItemEntityRenderer.getTexture(arg0: ItemEntity) = this.method_3999(arg0)
