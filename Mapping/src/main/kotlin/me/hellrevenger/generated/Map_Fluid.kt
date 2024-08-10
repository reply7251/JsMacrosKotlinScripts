package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Fluid

val Fluid.STATE_IDS by aliasStatic(Fluid::field_15904)
fun Fluid.getBucketItem() = this.method_15774()
fun Fluid.isIn(arg0: TagKey<Fluid>) = this.method_15791(arg0)
fun Fluid.isStill(arg0: FluidState) = this.method_15793(arg0)
fun Fluid.getHeight(arg0: FluidState, arg1: BlockView, arg2: BlockPos) = this.method_15788(arg0, arg1, arg2)
fun Fluid.getTickRate(arg0: WorldView) = this.method_15789(arg0)
fun Fluid.getBucketFillSound() = this.method_32359()
fun Fluid.getLevel(arg0: FluidState) = this.method_15779(arg0)
fun Fluid.matchesType(arg0: Fluid) = this.method_15780(arg0)
fun Fluid.getShape(arg0: FluidState, arg1: BlockView, arg2: BlockPos) = this.method_17775(arg0, arg1, arg2)
fun Fluid.getHeight(arg0: FluidState) = this.method_20784(arg0)
