package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlaySoundS2CPacket

val PlaySoundS2CPacket.COORDINATE_SCALE by aliasStatic(PlaySoundS2CPacket::field_33353)
fun PlaySoundS2CPacket.getX() = this.method_11890()
fun PlaySoundS2CPacket.getZ() = this.method_11893()
fun PlaySoundS2CPacket.getY() = this.method_11889()
fun PlaySoundS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11895(arg0)
