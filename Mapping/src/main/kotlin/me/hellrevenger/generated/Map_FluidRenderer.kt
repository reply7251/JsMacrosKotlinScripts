package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FluidRenderer

fun KClass<FluidRenderer>.shouldRenderSide(arg0: BlockRenderView, arg1: BlockPos, arg2: FluidState, arg3: BlockState, arg4: Direction, arg5: FluidState) = FluidRenderer.method_29708(arg0, arg1, arg2, arg3, arg4, arg5)
fun FluidRenderer.render(arg0: BlockRenderView, arg1: BlockPos, arg2: VertexConsumer, arg3: BlockState, arg4: FluidState) = this.method_3347(arg0, arg1, arg2, arg3, arg4)
