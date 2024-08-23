package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkStateBuilder

fun <T, B>NetworkStateBuilder<T, B>.build(arg0: Function<ByteBuf, B>) where T: PacketListener, B: ByteBuf = this.method_56449(arg0)
fun <T, B>KClass<NetworkStateBuilder<T, B>>.s2c(arg0: NetworkPhase, arg1: Consumer<NetworkStateBuilder<T, B>>) where T: PacketListener, T: ClientPacketListener, B: ByteBuf = NetworkStateBuilder.method_56455<T, B>(arg0, arg1)
fun <T, B>KClass<NetworkStateBuilder<T, B>>.c2s(arg0: NetworkPhase, arg1: Consumer<NetworkStateBuilder<T, B>>) where T: PacketListener, T: ServerPacketListener, B: ByteBuf = NetworkStateBuilder.method_56451<T, B>(arg0, arg1)
fun <T, B, P>NetworkStateBuilder<T, B>.add(arg0: PacketType<P>, arg1: PacketCodec<in B, P>) where T: PacketListener, B: ByteBuf, P: Packet<in T> = this.method_56454<P>(arg0, arg1)
fun <T, B, P, D>NetworkStateBuilder<T, B>.addBundle(arg0: PacketType<P>, arg1: Function<Iterable<Packet<in T>>, P>, arg2: D) where T: PacketListener, B: ByteBuf, P: BundlePacket<in T>, D: BundleSplitterPacket<in T> = this.method_56453<P, D>(arg0, arg1, arg2)
fun <T, B>NetworkStateBuilder<T, B>.buildFactory() where T: PacketListener, B: ByteBuf = this.method_56447()
