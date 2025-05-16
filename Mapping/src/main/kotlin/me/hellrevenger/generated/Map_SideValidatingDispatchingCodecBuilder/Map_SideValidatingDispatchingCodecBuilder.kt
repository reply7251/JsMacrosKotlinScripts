package me.hellrevenger.generated.Map_SideValidatingDispatchingCodecBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_56446
 */
fun <B, L, T>SideValidatingDispatchingCodecBuilder<B, L>.add(id: PacketType<T>?, codec: PacketCodec<in B, T>?) where B: ByteBuf, L: PacketListener, T: Packet<in L> = this.method_56446<T>(id, codec)
/**
 * method_56445
 */
fun <B, L>SideValidatingDispatchingCodecBuilder<B, L>.build() where B: ByteBuf, L: PacketListener = this.method_56445()
