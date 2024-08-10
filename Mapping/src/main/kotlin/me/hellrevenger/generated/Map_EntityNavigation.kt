package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityNavigation

fun EntityNavigation.findPathTo(arg0: BlockPos, arg1: Int, arg2: Int) = this.method_35141(arg0, arg1, arg2)
fun EntityNavigation.isNearPathStartPos() = this.method_31267()
fun EntityNavigation.startMovingTo(arg0: Entity, arg1: Double) = this.method_6335(arg0, arg1)
fun EntityNavigation.startMovingTo(arg0: Double, arg1: Double, arg2: Double, arg3: Double) = this.method_6337(arg0, arg1, arg2, arg3)
fun EntityNavigation.isFollowingPath() = this.method_23966()
fun EntityNavigation.tick() = this.method_6360()
fun EntityNavigation.stop() = this.method_6340()
fun EntityNavigation.findPathTo(arg0: BlockPos, arg1: Int) = this.method_6348(arg0, arg1)
fun EntityNavigation.isValidPosition(arg0: BlockPos) = this.method_6333(arg0)
fun EntityNavigation.startMovingAlong(arg0: Path, arg1: Double) = this.method_6334(arg0, arg1)
fun EntityNavigation.isIdle() = this.method_6357()
fun EntityNavigation.getTargetPos() = this.method_6355()
fun EntityNavigation.findPathTo(arg0: Double, arg1: Double, arg2: Double, arg3: Int) = this.method_6352(arg0, arg1, arg2, arg3)
fun EntityNavigation.setSpeed(arg0: Double) = this.method_6344(arg0)
fun EntityNavigation.setRangeMultiplier(arg0: Float) = this.method_23964(arg0)
fun EntityNavigation.shouldRecalculatePath(arg0: BlockPos) = this.method_18053(arg0)
fun EntityNavigation.canSwim() = this.method_6350()
fun EntityNavigation.setCanSwim(arg0: Boolean) = this.method_6354(arg0)
fun EntityNavigation.startMovingTo(arg0: Double, arg1: Double, arg2: Double, arg3: Int, arg4: Double) = this.method_58160(arg0, arg1, arg2, arg3, arg4)
fun EntityNavigation.resetRangeMultiplier() = this.method_23965()
fun EntityNavigation.findPathTo(arg0: Entity, arg1: Int) = this.method_6349(arg0, arg1)
fun EntityNavigation.recalculatePath() = this.method_6356()
fun EntityNavigation.findPathToAny(arg0: Stream<BlockPos>, arg1: Int) = this.method_21643(arg0, arg1)
fun EntityNavigation.canJumpToNext(arg0: PathNodeType) = this.method_48158(arg0)
fun EntityNavigation.findPathTo(arg0: Set<BlockPos>, arg1: Int) = this.method_29934(arg0, arg1)
