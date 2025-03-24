package me.hellrevenger.generated.Map_PacketCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_56439
 */
fun <B, V, O>PacketCodec<B, V>.mapBuf(arg0: function_Function<O, out B>) where O: ByteBuf = this.method_56439<O>(arg0)
/**
 * method_56437
 */
fun <B, V>KClass<PacketCodec<B, V>>.ofStatic(arg0: PacketEncoder<B, V>, arg1: PacketDecoder<B, V>) = PacketCodec.method_56437<B, V>(arg0, arg1)
/**
 * method_56440
 */
fun <B, V, U>PacketCodec<B, V>.dispatch(arg0: function_Function<in U, out V>, arg1: function_Function<in V, out PacketCodec<in B, out U>>) = this.method_56440<U>(arg0, arg1)
/**
 * method_56432
 */
fun <B, V, O>PacketCodec<B, V>.xmap(arg0: function_Function<in V, out O>, arg1: function_Function<in O, out V>) = this.method_56432<O>(arg0, arg1)
/**
 * method_56433
 */
fun <B, V, O>PacketCodec<B, V>.collect(arg0: net.minecraft.class_9139.class_9140<B, V, O>) = this.method_56433<O>(arg0)
/**
 * method_56438
 */
fun <B, V>KClass<PacketCodec<B, V>>.of(arg0: ValueFirstEncoder<B, V>, arg1: PacketDecoder<B, V>) = PacketCodec.method_56438<B, V>(arg0, arg1)
/**
 * method_64265
 */
fun <B, V, C, T1, T2, T3, T4, T5, T6, T7>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: function_Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: function_Function<C, T5>, arg10: PacketCodec<in B, T6>, arg11: function_Function<C, T6>, arg12: PacketCodec<in B, T7>, arg13: function_Function<C, T7>, arg14: Function7<T1, T2, T3, T4, T5, T6, T7, C>) = PacketCodec.method_64265<B, C, T1, T2, T3, T4, T5, T6, T7>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14)
/**
 * method_56435
 */
fun <B, V, C, T1, T2>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: BiFunction<T1, T2, C>) = PacketCodec.method_56435<B, C, T1, T2>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_58024
 */
fun <B, V, T>KClass<PacketCodec<B, V>>.recursive(arg0: UnaryOperator<PacketCodec<B, T>>) = PacketCodec.method_58024<B, T>(arg0)
/**
 * method_58025
 */
fun <B, V, C, T1, T2, T3, T4, T5, T6>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: function_Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: function_Function<C, T5>, arg10: PacketCodec<in B, T6>, arg11: function_Function<C, T6>, arg12: Function6<T1, T2, T3, T4, T5, T6, C>) = PacketCodec.method_58025<B, C, T1, T2, T3, T4, T5, T6>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
/**
 * method_56431
 */
fun <B, V>KClass<PacketCodec<B, V>>.unit(arg0: V) = PacketCodec.method_56431<B, V>(arg0)
/**
 * method_56436
 */
fun <B, V, C, T1, T2, T3>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: Function3<T1, T2, T3, C>) = PacketCodec.method_56436<B, C, T1, T2, T3>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_56906
 */
fun <B, V, C, T1, T2, T3, T4, T5>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: function_Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: function_Function<C, T5>, arg10: Function5<T1, T2, T3, T4, T5, C>) = PacketCodec.method_56906<B, C, T1, T2, T3, T4, T5>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
/**
 * method_56905
 */
fun <B, V, C, T1, T2, T3, T4>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: function_Function<C, T4>, arg8: Function4<T1, T2, T3, T4, C>) = PacketCodec.method_56905<B, C, T1, T2, T3, T4>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
/**
 * method_65036
 */
fun <B, V, C, T1, T2, T3, T4, T5, T6, T7, T8>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: function_Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: function_Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: function_Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: function_Function<C, T5>, arg10: PacketCodec<in B, T6>, arg11: function_Function<C, T6>, arg12: PacketCodec<in B, T7>, arg13: function_Function<C, T7>, arg14: PacketCodec<in B, T8>, arg15: function_Function<C, T8>, arg16: Function8<T1, T2, T3, T4, T5, T6, T7, T8, C>) = PacketCodec.method_65036<B, C, T1, T2, T3, T4, T5, T6, T7, T8>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16)
/**
 * method_56430
 */
fun <B, V, S>PacketCodec<B, V>.cast() where S: B = this.method_56430<S>()
/**
 * method_56434
 */
fun <B, V, C, T1>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: function_Function<C, T1>, arg2: function_Function<T1, C>) = PacketCodec.method_56434<B, C, T1>(arg0, arg1, arg2)
