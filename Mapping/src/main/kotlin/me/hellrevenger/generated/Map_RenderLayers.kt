package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RenderLayers

fun KClass<RenderLayers>.getItemLayer(arg0: ItemStack, arg1: Boolean) = RenderLayers.method_23678(arg0, arg1)
fun KClass<RenderLayers>.getEntityBlockLayer(arg0: BlockState, arg1: Boolean) = RenderLayers.method_23683(arg0, arg1)
fun KClass<RenderLayers>.getFluidLayer(arg0: FluidState) = RenderLayers.method_23680(arg0)
fun KClass<RenderLayers>.getBlockLayer(arg0: BlockState) = RenderLayers.method_23679(arg0)
fun KClass<RenderLayers>.getMovingBlockLayer(arg0: BlockState) = RenderLayers.method_29359(arg0)
fun KClass<RenderLayers>.setFancyGraphicsOrBetter(arg0: Boolean) = RenderLayers.method_23682(arg0)
