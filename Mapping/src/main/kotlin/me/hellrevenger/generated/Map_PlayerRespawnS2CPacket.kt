package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerRespawnS2CPacket

val PlayerRespawnS2CPacket.KEEP_TRACKED_DATA by aliasStatic(PlayerRespawnS2CPacket::field_41731)
val PlayerRespawnS2CPacket.KEEP_ATTRIBUTES by aliasStatic(PlayerRespawnS2CPacket::field_41730)
val PlayerRespawnS2CPacket.KEEP_ALL by aliasStatic(PlayerRespawnS2CPacket::field_41732)
fun PlayerRespawnS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11782(arg0)
fun PlayerRespawnS2CPacket.flag() = this.comp_1729()
fun PlayerRespawnS2CPacket.hasFlag(arg0: Byte) = this.method_48016(arg0)
fun PlayerRespawnS2CPacket.commonPlayerSpawnInfo() = this.comp_1728()
