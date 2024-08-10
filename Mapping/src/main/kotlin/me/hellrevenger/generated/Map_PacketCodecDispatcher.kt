package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PacketCodecDispatcher

val <B, V, T>PacketCodecDispatcher<B, V, T>.typeToIndex where B: ByteBuf by alias(PacketCodecDispatcher<B, V, T>::field_48579)
fun <B, T, V>PacketCodecDispatcher<B, V, T>.encode(arg0: B, arg1: V) where B: ByteBuf = this.method_56426(arg0, arg1)
fun <B, T, V>PacketCodecDispatcher<B, V, T>.decode(arg0: B) where B: ByteBuf = this.method_56425(arg0)
fun <B, T, V>KClass<PacketCodecDispatcher<B, V, T>>.builder(arg0: Function<V, out T>) where B: ByteBuf = PacketCodecDispatcher.method_56427<B, V, T>(arg0)
