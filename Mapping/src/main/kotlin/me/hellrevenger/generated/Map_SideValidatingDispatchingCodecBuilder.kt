package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SideValidatingDispatchingCodecBuilder

fun <L, T, B>SideValidatingDispatchingCodecBuilder<B, L>.add(arg0: PacketType<T>, arg1: PacketCodec<in B, T>) where L: PacketListener, T: Packet<in L>, B: ByteBuf = this.method_56446<T>(arg0, arg1)
fun <L, B>SideValidatingDispatchingCodecBuilder<B, L>.build() where L: PacketListener, B: ByteBuf = this.method_56445()
