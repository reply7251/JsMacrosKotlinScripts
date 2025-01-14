package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChatMessageC2SPacket

fun ChatMessageC2SPacket.acknowledgment() = this.comp_970()
fun ChatMessageC2SPacket.chatMessage() = this.comp_945()
fun ChatMessageC2SPacket.apply(arg0: ServerPlayPacketListener) = this.method_12115(arg0)
fun ChatMessageC2SPacket.timestamp() = this.comp_946()
fun ChatMessageC2SPacket.signature() = this.comp_948()
fun ChatMessageC2SPacket.salt() = this.comp_947()
