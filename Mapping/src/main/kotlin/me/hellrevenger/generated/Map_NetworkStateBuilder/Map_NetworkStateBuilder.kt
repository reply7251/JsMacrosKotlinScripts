package me.hellrevenger.generated.Map_NetworkStateBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_56449
 */
fun <T, B>NetworkStateBuilder<T, B>.build(bufUpgrader: function_Function<ByteBuf, B>) where T: PacketListener, B: ByteBuf = this.method_56449(bufUpgrader)
/**
 * method_56454
 */
fun <T, B, P>NetworkStateBuilder<T, B>.add(id: PacketType<P>, codec: PacketCodec<in B, P>) where T: PacketListener, B: ByteBuf, P: Packet<in T> = this.method_56454<P>(id, codec)
/**
 * method_56453
 */
fun <T, B, P, D>NetworkStateBuilder<T, B>.addBundle(id: PacketType<P>, bundler: function_Function<Iterable<Packet<in T>>, P>, splitter: D) where T: PacketListener, B: ByteBuf, P: BundlePacket<in T>, D: BundleSplitterPacket<in T> = this.method_56453<P, D>(id, bundler, splitter)
/**
 * method_56447
 */
fun <T, B>NetworkStateBuilder<T, B>.buildFactory() where T: PacketListener, B: ByteBuf = this.method_56447()
