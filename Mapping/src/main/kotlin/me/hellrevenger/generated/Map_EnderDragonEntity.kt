package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnderDragonEntity

val EnderDragonEntity.segmentCircularBuffer by alias(EnderDragonEntity::field_7026)
val EnderDragonEntity.prevWingPosition by alias(EnderDragonEntity::field_7019)
val EnderDragonEntity.connectedCrystal by alias(EnderDragonEntity::field_7024)
val EnderDragonEntity.latestSegment by alias(EnderDragonEntity::field_7010)
val EnderDragonEntity.wingPosition by alias(EnderDragonEntity::field_7030)
val EnderDragonEntity.slowedDownByBlock by alias(EnderDragonEntity::field_7027)
val EnderDragonEntity.ticksSinceDeath by alias(EnderDragonEntity::field_7031)
val EnderDragonEntity.head by alias(EnderDragonEntity::field_7017)
val EnderDragonEntity.yawAcceleration by alias(EnderDragonEntity::field_20865)
val EnderDragonEntity.PHASE_TYPE by aliasStatic(EnderDragonEntity::field_7013)
fun EnderDragonEntity.damagePart(arg0: EnderDragonPart, arg1: DamageSource, arg2: Float) = this.method_6816(arg0, arg1, arg2)
fun EnderDragonEntity.setFightOrigin(arg0: BlockPos) = this.method_51853(arg0)
fun EnderDragonEntity.findPath(arg0: Int, arg1: Int, arg2: PathNode) = this.method_6833(arg0, arg1, arg2)
fun EnderDragonEntity.setFight(arg0: EnderDragonFight) = this.method_51852(arg0)
fun EnderDragonEntity.getSegmentProperties(arg0: Int, arg1: Float) = this.method_6817(arg0, arg1)
fun EnderDragonEntity.crystalDestroyed(arg0: EndCrystalEntity, arg1: BlockPos, arg2: DamageSource) = this.method_6828(arg0, arg1, arg2)
fun EnderDragonEntity.getRotationVectorFromPhase(arg0: Float) = this.method_6834(arg0)
fun KClass<EnderDragonEntity>.createEnderDragonAttributes() = EnderDragonEntity.method_26903()
fun EnderDragonEntity.getNearestPathNodeIndex(arg0: Double, arg1: Double, arg2: Double) = this.method_6822(arg0, arg1, arg2)
fun EnderDragonEntity.getChangeInNeckPitch(arg0: Int, arg1: DoubleArray, arg2: DoubleArray) = this.method_6823(arg0, arg1, arg2)
fun EnderDragonEntity.getNearestPathNodeIndex() = this.method_6818()
fun EnderDragonEntity.getBodyParts() = this.method_5690()
