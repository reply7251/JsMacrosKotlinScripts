package me.hellrevenger.generated.Map_PacketCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_56439
 */
fun <B, V, O>PacketCodec<B, V>.mapBuf(function: function_Function<O, out B>) where O: ByteBuf = this.method_56439<O>(function)
/**
 * method_56440
 */
fun <B, V, U>PacketCodec<B, V>.dispatch(type: function_Function<in U, out V>, codec: function_Function<in V, out PacketCodec<in B, out U>>) = this.method_56440<U>(type, codec)
/**
 * method_56432
 */
fun <B, V, O>PacketCodec<B, V>.xmap(to: function_Function<in V, out O>, from: function_Function<in O, out V>) = this.method_56432<O>(to, from)
/**
 * method_56433
 */
fun <B, V, O>PacketCodec<B, V>.collect(function: net.minecraft.class_9139.class_9140<B, V, O>) = this.method_56433<O>(function)
/**
 * method_56430
 */
fun <B, V, S>PacketCodec<B, V>.cast() where S: B = this.method_56430<S>()
