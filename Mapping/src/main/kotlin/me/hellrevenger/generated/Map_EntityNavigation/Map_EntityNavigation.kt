package me.hellrevenger.generated.Map_EntityNavigation
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_35141
 */
fun EntityNavigation.findPathTo(target: BlockPos, minDistance: Int, maxDistance: Int) = this.method_35141(target, minDistance, maxDistance)
/**
 * method_31267
 */
fun EntityNavigation.isNearPathStartPos() = this.method_31267()
/**
 * method_6335
 */
fun EntityNavigation.startMovingTo(entity: Entity, speed: Double) = this.method_6335(entity, speed)
/**
 * method_6337
 */
fun EntityNavigation.startMovingTo(x: Double, arg1: Double, y: Double, arg3: Double) = this.method_6337(x, arg1, y, arg3)
/**
 * method_23966
 */
fun EntityNavigation.isFollowingPath() = this.method_23966()
/**
 * method_6360
 */
fun EntityNavigation.tick() = this.method_6360()
/**
 * method_6340
 */
fun EntityNavigation.stop() = this.method_6340()
/**
 * method_6348
 */
fun EntityNavigation.findPathTo(target: BlockPos, distance: Int) = this.method_6348(target, distance)
/**
 * method_6333
 */
fun EntityNavigation.isValidPosition(pos: BlockPos) = this.method_6333(pos)
/**
 * method_6334
 */
fun EntityNavigation.startMovingAlong(path: Path, speed: Double) = this.method_6334(path, speed)
/**
 * method_6357
 */
fun EntityNavigation.isIdle() = this.method_6357()
/**
 * method_6355
 */
fun EntityNavigation.getTargetPos() = this.method_6355()
/**
 * method_61441
 */
fun EntityNavigation.updateRange() = this.method_61441()
/**
 * method_6352
 */
fun EntityNavigation.findPathTo(x: Double, arg1: Double, y: Double, arg3: Int) = this.method_6352(x, arg1, y, arg3)
/**
 * method_6344
 */
fun EntityNavigation.setSpeed(speed: Double) = this.method_6344(speed)
/**
 * method_23964
 */
fun EntityNavigation.setRangeMultiplier(rangeMultiplier: Float) = this.method_23964(rangeMultiplier)
/**
 * method_6345
 */
fun EntityNavigation.getCurrentPath() = this.method_6345()
/**
 * method_6342
 */
fun EntityNavigation.getNodeMaker() = this.method_6342()
/**
 * method_18053
 */
fun EntityNavigation.shouldRecalculatePath(pos: BlockPos) = this.method_18053(pos)
/**
 * method_6350
 */
fun EntityNavigation.canSwim() = this.method_6350()
/**
 * method_6354
 */
fun EntityNavigation.setCanSwim(canSwim: Boolean) = this.method_6354(canSwim)
/**
 * method_58160
 */
fun EntityNavigation.startMovingTo(x: Double, arg1: Double, y: Double, arg3: Int, z: Double) = this.method_58160(x, arg1, y, arg3, z)
/**
 * method_35143
 */
fun EntityNavigation.getNodeReachProximity() = this.method_35143()
/**
 * method_23965
 */
fun EntityNavigation.resetRangeMultiplier() = this.method_23965()
/**
 * method_6349
 */
fun EntityNavigation.findPathTo(entity: Entity, distance: Int) = this.method_6349(entity, distance)
/**
 * method_6356
 */
fun EntityNavigation.recalculatePath() = this.method_6356()
/**
 * method_61439
 */
fun EntityNavigation.setMaxFollowRange(maxFollowRange: Float) = this.method_61439(maxFollowRange)
/**
 * method_21643
 */
fun EntityNavigation.findPathToAny(positions: Stream<BlockPos>, distance: Int) = this.method_21643(positions, distance)
/**
 * method_48158
 */
fun EntityNavigation.canJumpToNext(nodeType: PathNodeType) = this.method_48158(nodeType)
/**
 * method_29934
 */
fun EntityNavigation.findPathTo(positions: Set<BlockPos>, distance: Int) = this.method_29934(positions, distance)
