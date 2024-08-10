package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerListS2CPacket

fun PlayerListS2CPacket.getPlayerAdditionEntries() = this.method_46330()
fun PlayerListS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11721(arg0)
fun KClass<PlayerListS2CPacket>.entryFromPlayer(arg0: Collection<ServerPlayerEntity>) = PlayerListS2CPacket.method_43886(arg0)
