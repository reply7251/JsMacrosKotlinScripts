package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ShapeContext

fun ShapeContext.canWalkOnFluid(arg0: FluidState, arg1: FluidState) = this.method_27866(arg0, arg1)
fun ShapeContext.isAbove(arg0: VoxelShape, arg1: BlockPos, arg2: Boolean) = this.method_16192(arg0, arg1, arg2)
fun ShapeContext.isDescending() = this.method_16193()
fun KClass<ShapeContext>.of(arg0: Entity) = ShapeContext.method_16195(arg0)
fun KClass<ShapeContext>.absent() = ShapeContext.method_16194()
fun ShapeContext.isHolding(arg0: Item) = this.method_17785(arg0)
