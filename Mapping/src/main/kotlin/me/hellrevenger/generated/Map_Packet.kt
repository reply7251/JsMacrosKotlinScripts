package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Packet

fun <T, B>KClass<Packet<T>>.createCodec(arg0: ValueFirstEncoder<B, T>, arg1: PacketDecoder<B, T>) where T: PacketListener, T: Packet<*>, B: ByteBuf = Packet.method_56443<B, T>(arg0, arg1)
fun <T>Packet<T>.transitionsNetworkState() where T: PacketListener = this.method_55943()
fun <T>Packet<T>.isWritingErrorSkippable() where T: PacketListener = this.method_11051()
fun <T>Packet<T>.apply(arg0: T) where T: PacketListener = this.method_11054(arg0)
fun <T>Packet<T>.getPacketId() where T: PacketListener = this.method_55846()
