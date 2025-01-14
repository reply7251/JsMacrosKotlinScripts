package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockColors

fun BlockColors.registerColorProvider(arg0: BlockColorProvider, arg1: Array<Block>) = this.method_1690(arg0, *arg1)
fun BlockColors.getParticleColor(arg0: BlockState, arg1: world_World, arg2: BlockPos) = this.method_1691(arg0, arg1, arg2)
fun KClass<BlockColors>.create() = BlockColors.method_1689()
fun BlockColors.getColor(arg0: BlockState, arg1: BlockRenderView, arg2: BlockPos, arg3: Int) = this.method_1697(arg0, arg1, arg2, arg3)
fun BlockColors.getProperties(arg0: Block) = this.method_21592(arg0)
