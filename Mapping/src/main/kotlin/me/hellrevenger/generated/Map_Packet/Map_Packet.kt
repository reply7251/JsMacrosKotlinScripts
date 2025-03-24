package me.hellrevenger.generated.Map_Packet
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_65081
 */
fun <T>Packet<T>.apply(arg0: T) where T: PacketListener = this.method_65081(arg0)
/**
 * method_56443
 */
fun <T, B>KClass<Packet<T>>.createCodec(arg0: ValueFirstEncoder<B, T>, arg1: PacketDecoder<B, T>) where T: PacketListener, T: Packet<*>, B: ByteBuf = Packet.method_56443<B, T>(arg0, arg1)
/**
 * method_55943
 */
fun <T>Packet<T>.transitionsNetworkState() where T: PacketListener = this.method_55943()
/**
 * method_11051
 */
fun <T>Packet<T>.isWritingErrorSkippable() where T: PacketListener = this.method_11051()
/**
 * method_65080
 */
fun <T>Packet<T>.getPacketType() where T: PacketListener = this.method_65080()
