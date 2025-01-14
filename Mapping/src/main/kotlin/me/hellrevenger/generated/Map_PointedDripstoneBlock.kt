package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PointedDripstoneBlock

val KClass<PointedDripstoneBlock>.VERTICAL_DIRECTION by aliasStatic(PointedDripstoneBlock::field_28050)
val KClass<PointedDripstoneBlock>.WATERLOGGED by aliasStatic(PointedDripstoneBlock::field_28052)
val KClass<PointedDripstoneBlock>.THICKNESS by aliasStatic(PointedDripstoneBlock::field_28051)
fun KClass<PointedDripstoneBlock>.tryGrow(arg0: BlockState, arg1: ServerWorld, arg2: BlockPos, arg3: Random) = PointedDripstoneBlock.method_36375(arg0, arg1, arg2, arg3)
fun KClass<PointedDripstoneBlock>.createParticle(arg0: world_World, arg1: BlockPos, arg2: BlockState) = PointedDripstoneBlock.method_32899(arg0, arg1, arg2)
fun KClass<PointedDripstoneBlock>.dripTick(arg0: BlockState, arg1: ServerWorld, arg2: BlockPos, arg3: Float) = PointedDripstoneBlock.method_32772(arg0, arg1, arg2, arg3)
fun KClass<PointedDripstoneBlock>.getDripFluid(arg0: ServerWorld, arg1: BlockPos) = PointedDripstoneBlock.method_32775(arg0, arg1)
fun KClass<PointedDripstoneBlock>.canDrip(arg0: BlockState) = PointedDripstoneBlock.method_32783(arg0)
fun KClass<PointedDripstoneBlock>.getDripPos(arg0: world_World, arg1: BlockPos) = PointedDripstoneBlock.method_32767(arg0, arg1)
