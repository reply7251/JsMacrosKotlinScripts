package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WallHangingSignBlock

val KClass<WallHangingSignBlock>.FACING by aliasStatic(WallHangingSignBlock::field_40319)
val KClass<WallHangingSignBlock>.NORTH_SOUTH_SHAPE by aliasStatic(WallHangingSignBlock::field_40322)
val KClass<WallHangingSignBlock>.EAST_WEST_SHAPE by aliasStatic(WallHangingSignBlock::field_40323)
val KClass<WallHangingSignBlock>.NORTH_SOUTH_COLLISION_SHAPE by aliasStatic(WallHangingSignBlock::field_40320)
val KClass<WallHangingSignBlock>.EAST_WEST_COLLISION_SHAPE by aliasStatic(WallHangingSignBlock::field_40321)
fun WallHangingSignBlock.canAttachAt(arg0: BlockState, arg1: WorldView, arg2: BlockPos) = this.method_45461(arg0, arg1, arg2)
fun WallHangingSignBlock.canAttachTo(arg0: WorldView, arg1: BlockState, arg2: BlockPos, arg3: Direction) = this.method_45460(arg0, arg1, arg2, arg3)
