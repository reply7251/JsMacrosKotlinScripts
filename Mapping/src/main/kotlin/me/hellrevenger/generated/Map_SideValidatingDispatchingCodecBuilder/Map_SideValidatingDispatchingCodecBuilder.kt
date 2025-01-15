package me.hellrevenger.generated.Map_SideValidatingDispatchingCodecBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <B, L, T>SideValidatingDispatchingCodecBuilder<B, L>.add(arg0: PacketType<T>, arg1: PacketCodec<in B, T>) where B: ByteBuf, L: PacketListener, T: Packet<in L> = this.method_56446<T>(arg0, arg1)
fun <B, L>SideValidatingDispatchingCodecBuilder<B, L>.build() where B: ByteBuf, L: PacketListener = this.method_56445()
