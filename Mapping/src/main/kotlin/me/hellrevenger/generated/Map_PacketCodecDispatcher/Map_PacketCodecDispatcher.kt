package me.hellrevenger.generated.Map_PacketCodecDispatcher
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <B, V, T>PacketCodecDispatcher<B, V, T>.encode(arg0: B, arg1: V) where B: ByteBuf = this.method_56426(arg0, arg1)
fun <B, V, T>PacketCodecDispatcher<B, V, T>.decode(arg0: B) where B: ByteBuf = this.method_56425(arg0)
fun <B, V, T>KClass<PacketCodecDispatcher<B, V, T>>.builder(arg0: java.util.function.Function<V, out T>) where B: ByteBuf = PacketCodecDispatcher.method_56427<B, V, T>(arg0)
