package me.hellrevenger.generated.Map_PacketCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketCodecKt {
    /**
     * method_56437
     */
    fun <B, V>ofStatic(encoder: PacketEncoder<B, V>, decoder: PacketDecoder<B, V>) = PacketCodec.method_56437<B, V>(encoder, decoder)
    /**
     * method_56438
     */
    fun <B, V>of(encoder: ValueFirstEncoder<B, V>, decoder: PacketDecoder<B, V>) = PacketCodec.method_56438<B, V>(encoder, decoder)
    /**
     * method_64265
     */
    fun <B, V, C, T1, T2, T3, T4, T5, T6, T7>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, codec4: PacketCodec<in B, T4>, from4: function_Function<C, T4>, codec5: PacketCodec<in B, T5>, from5: function_Function<C, T5>, codec6: PacketCodec<in B, T6>, from6: function_Function<C, T6>, codec7: PacketCodec<in B, T7>, from7: function_Function<C, T7>, to: Function7<T1, T2, T3, T4, T5, T6, T7, C>) = PacketCodec.method_64265<B, C, T1, T2, T3, T4, T5, T6, T7>(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, codec6, from6, codec7, from7, to)
    /**
     * method_58024
     */
    fun <B, V, T>recursive(codecGetter: UnaryOperator<PacketCodec<B, T>>) = PacketCodec.method_58024<B, T>(codecGetter)
    /**
     * method_56431
     */
    fun <B, V>unit(value: V) = PacketCodec.method_56431<B, V>(value)
}