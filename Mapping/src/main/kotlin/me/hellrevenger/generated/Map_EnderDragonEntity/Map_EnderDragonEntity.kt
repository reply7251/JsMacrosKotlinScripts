package me.hellrevenger.generated.Map_EnderDragonEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7026
 */
val EnderDragonEntity.segmentCircularBuffer by alias(EnderDragonEntity::field_7026)
/**
 * field_7019
 */
var EnderDragonEntity.prevWingPosition by alias(EnderDragonEntity::field_7019)
/**
 * field_7024
 */
var EnderDragonEntity.connectedCrystal by alias(EnderDragonEntity::field_7024)
/**
 * field_7010
 */
var EnderDragonEntity.latestSegment by alias(EnderDragonEntity::field_7010)
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
 * field_7017
 */
val EnderDragonEntity.head by alias(EnderDragonEntity::field_7017)
/**
 * field_20865
 */
var EnderDragonEntity.yawAcceleration by alias(EnderDragonEntity::field_20865)
/**
 * field_7013
 */
val KClass<EnderDragonEntity>.PHASE_TYPE by aliasStatic(EnderDragonEntity::field_7013)
/**
 * method_6816
 */
fun EnderDragonEntity.damagePart(arg0: EnderDragonPart, arg1: DamageSource, arg2: Float) = this.method_6816(arg0, arg1, arg2)
/**
 * method_51853
 */
fun EnderDragonEntity.setFightOrigin(arg0: BlockPos) = this.method_51853(arg0)
/**
 * method_6833
 */
fun EnderDragonEntity.findPath(arg0: Int, arg1: Int, arg2: PathNode) = this.method_6833(arg0, arg1, arg2)
/**
 * method_51852
 */
fun EnderDragonEntity.setFight(arg0: EnderDragonFight) = this.method_51852(arg0)
/**
 * method_6817
 */
fun EnderDragonEntity.getSegmentProperties(arg0: Int, arg1: Float) = this.method_6817(arg0, arg1)
/**
 * method_6828
 */
fun EnderDragonEntity.crystalDestroyed(arg0: EndCrystalEntity, arg1: BlockPos, arg2: DamageSource) = this.method_6828(arg0, arg1, arg2)
/**
 * method_6831
 */
fun EnderDragonEntity.getPhaseManager() = this.method_6831()
/**
 * method_6834
 */
fun EnderDragonEntity.getRotationVectorFromPhase(arg0: Float) = this.method_6834(arg0)
/**
 * method_26903
 */
fun KClass<EnderDragonEntity>.createEnderDragonAttributes() = EnderDragonEntity.method_26903()
/**
 * method_51854
 */
fun EnderDragonEntity.getFightOrigin() = this.method_51854()
/**
 * method_6829
 */
fun EnderDragonEntity.getFight() = this.method_6829()
/**
 * method_6822
 */
fun EnderDragonEntity.getNearestPathNodeIndex(arg0: Double, arg1: Double, arg2: Double) = this.method_6822(arg0, arg1, arg2)
/**
 * method_6823
 */
fun EnderDragonEntity.getChangeInNeckPitch(arg0: Int, arg1: DoubleArray, arg2: DoubleArray) = this.method_6823(arg0, arg1, arg2)
/**
 * method_6818
 */
fun EnderDragonEntity.getNearestPathNodeIndex() = this.method_6818()
/**
 * method_5690
 */
fun EnderDragonEntity.getBodyParts() = this.method_5690()
