package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SideValidatingDispatchingCodecBuilder

fun <B, L, T>SideValidatingDispatchingCodecBuilder<B, L>.add(arg0: PacketType<T>, arg1: PacketCodec<in B, T>) where B: ByteBuf, L: PacketListener, T: Packet<in L> = this.method_56446<T>(arg0, arg1)
fun <B, L>SideValidatingDispatchingCodecBuilder<B, L>.build() where B: ByteBuf, L: PacketListener = this.method_56445()
