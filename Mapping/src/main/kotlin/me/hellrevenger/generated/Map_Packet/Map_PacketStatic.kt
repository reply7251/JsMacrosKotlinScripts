package me.hellrevenger.generated.Map_Packet
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketKt {
    /**
     * method_56443
     */
    fun <T, B>createCodec(encoder: ValueFirstEncoder<B, T>?, decoder: PacketDecoder<B, T>?) where T: PacketListener, T: Packet<*>, B: ByteBuf = Packet.method_56443<B, T>(encoder, decoder)
}