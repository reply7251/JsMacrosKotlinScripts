package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScoreboardObjectiveUpdateS2CPacket

val KClass<ScoreboardObjectiveUpdateS2CPacket>.UPDATE_MODE by aliasStatic(ScoreboardObjectiveUpdateS2CPacket::field_33345)
val KClass<ScoreboardObjectiveUpdateS2CPacket>.REMOVE_MODE by aliasStatic(ScoreboardObjectiveUpdateS2CPacket::field_33344)
val KClass<ScoreboardObjectiveUpdateS2CPacket>.ADD_MODE by aliasStatic(ScoreboardObjectiveUpdateS2CPacket::field_33343)
fun ScoreboardObjectiveUpdateS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11838(arg0)
fun ScoreboardObjectiveUpdateS2CPacket.getDisplayName() = this.method_11836()
fun ScoreboardObjectiveUpdateS2CPacket.getNumberFormat() = this.method_55336()
fun ScoreboardObjectiveUpdateS2CPacket.getType() = this.method_11839()
fun ScoreboardObjectiveUpdateS2CPacket.getMode() = this.method_11837()
fun ScoreboardObjectiveUpdateS2CPacket.getName() = this.method_11835()
