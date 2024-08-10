package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockRenderManager

fun BlockRenderManager.renderDamage(arg0: BlockState, arg1: BlockPos, arg2: BlockRenderView, arg3: MatrixStack, arg4: VertexConsumer) = this.method_23071(arg0, arg1, arg2, arg3, arg4)
fun BlockRenderManager.getModel(arg0: BlockState) = this.method_3349(arg0)
fun BlockRenderManager.getModelRenderer() = this.method_3350()
fun BlockRenderManager.renderFluid(arg0: BlockPos, arg1: BlockRenderView, arg2: VertexConsumer, arg3: BlockState, arg4: FluidState) = this.method_3352(arg0, arg1, arg2, arg3, arg4)
fun BlockRenderManager.renderBlock(arg0: BlockState, arg1: BlockPos, arg2: BlockRenderView, arg3: MatrixStack, arg4: VertexConsumer, arg5: Boolean, arg6: Random) = this.method_3355(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun BlockRenderManager.renderBlockAsEntity(arg0: BlockState, arg1: MatrixStack, arg2: VertexConsumerProvider, arg3: Int, arg4: Int) = this.method_3353(arg0, arg1, arg2, arg3, arg4)
