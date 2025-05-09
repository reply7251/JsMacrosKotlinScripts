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
     * method_56435
     */
    fun <B, V, C, T1, T2>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, to: BiFunction<T1, T2, C>) = PacketCodec.method_56435<B, C, T1, T2>(codec1, from1, codec2, from2, to)
    /**
     * method_58024
     */
    fun <B, V, T>recursive(codecGetter: UnaryOperator<PacketCodec<B, T>>) = PacketCodec.method_58024<B, T>(codecGetter)
    /**
     * method_58025
     */
    fun <B, V, C, T1, T2, T3, T4, T5, T6>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, codec4: PacketCodec<in B, T4>, from4: function_Function<C, T4>, codec5: PacketCodec<in B, T5>, from5: function_Function<C, T5>, codec6: PacketCodec<in B, T6>, from6: function_Function<C, T6>, to: Function6<T1, T2, T3, T4, T5, T6, C>) = PacketCodec.method_58025<B, C, T1, T2, T3, T4, T5, T6>(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, codec6, from6, to)
    /**
     * method_56431
     */
    fun <B, V>unit(value: V) = PacketCodec.method_56431<B, V>(value)
    /**
     * method_56436
     */
    fun <B, V, C, T1, T2, T3>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, to: Function3<T1, T2, T3, C>) = PacketCodec.method_56436<B, C, T1, T2, T3>(codec1, from1, codec2, from2, codec3, from3, to)
    /**
     * method_56906
     */
    fun <B, V, C, T1, T2, T3, T4, T5>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, codec4: PacketCodec<in B, T4>, from4: function_Function<C, T4>, codec5: PacketCodec<in B, T5>, from5: function_Function<C, T5>, to: Function5<T1, T2, T3, T4, T5, C>) = PacketCodec.method_56906<B, C, T1, T2, T3, T4, T5>(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, to)
    /**
     * method_56905
     */
    fun <B, V, C, T1, T2, T3, T4>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, codec4: PacketCodec<in B, T4>, from4: function_Function<C, T4>, to: Function4<T1, T2, T3, T4, C>) = PacketCodec.method_56905<B, C, T1, T2, T3, T4>(codec1, from1, codec2, from2, codec3, from3, codec4, from4, to)
    /**
     * method_65036
     */
    fun <B, V, C, T1, T2, T3, T4, T5, T6, T7, T8>tuple(codec1: PacketCodec<in B, T1>, from1: function_Function<C, T1>, codec2: PacketCodec<in B, T2>, from2: function_Function<C, T2>, codec3: PacketCodec<in B, T3>, from3: function_Function<C, T3>, codec4: PacketCodec<in B, T4>, from4: function_Function<C, T4>, codec5: PacketCodec<in B, T5>, from5: function_Function<C, T5>, codec6: PacketCodec<in B, T6>, from6: function_Function<C, T6>, codec7: PacketCodec<in B, T7>, from7: function_Function<C, T7>, codec8: PacketCodec<in B, T8>, from8: function_Function<C, T8>, to: Function8<T1, T2, T3, T4, T5, T6, T7, T8, C>) = PacketCodec.method_65036<B, C, T1, T2, T3, T4, T5, T6, T7, T8>(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, codec6, from6, codec7, from7, codec8, from8, to)
    /**
     * method_56434
     */
    fun <B, V, C, T1>tuple(codec: PacketCodec<in B, T1>, from: function_Function<C, T1>, to: function_Function<T1, C>) = PacketCodec.method_56434<B, C, T1>(codec, from, to)
}