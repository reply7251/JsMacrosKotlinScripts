package me.hellrevenger.generated.Map_EnderDragonEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7019
 */
var EnderDragonEntity.prevWingPosition by alias(EnderDragonEntity::field_7019)
/**
 * field_7024
 */
var EnderDragonEntity.connectedCrystal by alias(EnderDragonEntity::field_7024)
/**
 * field_7030
 */
var EnderDragonEntity.wingPosition by alias(EnderDragonEntity::field_7030)
/**
 * field_7027
 */
var EnderDragonEntity.slowedDownByBlock by alias(EnderDragonEntity::field_7027)
/**
 * field_7031
 */
var EnderDragonEntity.ticksSinceDeath by alias(EnderDragonEntity::field_7031)
/**
 * field_52493
 */
val EnderDragonEntity.frameTracker by alias(EnderDragonEntity::field_52493)
/**
 * field_7017
 */
val EnderDragonEntity.head by alias(EnderDragonEntity::field_7017)
/**
 * field_20865
 */
var EnderDragonEntity.yawAcceleration by alias(EnderDragonEntity::field_20865)
/**
 * method_51853
 */
fun EnderDragonEntity.setFightOrigin(fightOrigin: BlockPos) = this.method_51853(fightOrigin)
/**
 * method_6833
 */
fun EnderDragonEntity.findPath(from: Int, to: Int, pathNode: PathNode) = this.method_6833(from, to, pathNode)
/**
 * method_51852
 */
fun EnderDragonEntity.setFight(fight: EnderDragonFight) = this.method_51852(fight)
/**
 * method_6816
 */
fun EnderDragonEntity.damagePart(world: ServerWorld, part: EnderDragonPart, source: DamageSource, amount: Float) = this.method_6816(world, part, source, amount)
/**
 * method_6831
 */
fun EnderDragonEntity.getPhaseManager() = this.method_6831()
/**
 * method_6834
 */
fun EnderDragonEntity.getRotationVectorFromPhase(tickDelta: Float) = this.method_6834(tickDelta)
/**
 * method_51854
 */
fun EnderDragonEntity.getFightOrigin() = this.method_51854()
/**
 * method_6828
 */
fun EnderDragonEntity.crystalDestroyed(world: ServerWorld, crystal: EndCrystalEntity, pos: BlockPos, source: DamageSource) = this.method_6828(world, crystal, pos, source)
/**
 * method_6829
 */
fun EnderDragonEntity.getFight() = this.method_6829()
/**
 * method_6822
 */
fun EnderDragonEntity.getNearestPathNodeIndex(x: Double, arg1: Double, y: Double) = this.method_6822(x, arg1, y)
/**
 * method_6818
 */
fun EnderDragonEntity.getNearestPathNodeIndex() = this.method_6818()
/**
 * method_5690
 */
fun EnderDragonEntity.getBodyParts() = this.method_5690()
