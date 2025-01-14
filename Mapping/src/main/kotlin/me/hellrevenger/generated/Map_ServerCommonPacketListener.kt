package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerCommonPacketListener

fun ServerCommonPacketListener.onPong(arg0: CommonPongC2SPacket) = this.method_52394(arg0)
fun ServerCommonPacketListener.onKeepAlive(arg0: KeepAliveC2SPacket) = this.method_52393(arg0)
fun ServerCommonPacketListener.onCustomPayload(arg0: CustomPayloadC2SPacket) = this.method_52392(arg0)
fun ServerCommonPacketListener.onClientOptions(arg0: ClientOptionsC2SPacket) = this.method_12069(arg0)
fun ServerCommonPacketListener.onResourcePackStatus(arg0: ResourcePackStatusC2SPacket) = this.method_52395(arg0)
