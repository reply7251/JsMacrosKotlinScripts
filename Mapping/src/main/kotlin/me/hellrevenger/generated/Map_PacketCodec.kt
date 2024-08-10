package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PacketCodec

fun <B, V, O>PacketCodec<B, V>.mapBuf(arg0: Function<O, out B>) where O: ByteBuf = this.method_56439<O>(arg0)
fun <B, V>KClass<PacketCodec<B, V>>.ofStatic(arg0: PacketEncoder<B, V>, arg1: PacketDecoder<B, V>) = PacketCodec.method_56437<B, V>(arg0, arg1)
fun <U, B, V>PacketCodec<B, V>.dispatch(arg0: Function<in U, out V>, arg1: Function<in V, out PacketCodec<in B, out U>>) = this.method_56440<U>(arg0, arg1)
fun <B, V, O>PacketCodec<B, V>.xmap(arg0: Function<in V, out O>, arg1: Function<in O, out V>) = this.method_56432<O>(arg0, arg1)
fun <B, V, O>PacketCodec<B, V>.collect(arg0: net.minecraft.class_9139.class_9140<B, V, O>) = this.method_56433<O>(arg0)
fun <B, V>KClass<PacketCodec<B, V>>.of(arg0: ValueFirstEncoder<B, V>, arg1: PacketDecoder<B, V>) = PacketCodec.method_56438<B, V>(arg0, arg1)
fun <B, C, T1, V, T2>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: Function<C, T2>, arg4: BiFunction<T1, T2, C>) = PacketCodec.method_56435<B, C, T1, T2>(arg0, arg1, arg2, arg3, arg4)
fun <T, B, V>KClass<PacketCodec<B, V>>.recursive(arg0: UnaryOperator<PacketCodec<B, T>>) = PacketCodec.method_58024<B, T>(arg0)
fun <T4, T5, B, T6, C, V, T1, T2, T3>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: Function<C, T5>, arg10: PacketCodec<in B, T6>, arg11: Function<C, T6>, arg12: Function6<T1, T2, T3, T4, T5, T6, C>) = PacketCodec.method_58025<B, C, T1, T2, T3, T4, T5, T6>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
fun <B, V>KClass<PacketCodec<B, V>>.unit(arg0: V) = PacketCodec.method_56431<B, V>(arg0)
fun <B, C, T1, V, T2, T3>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: Function<C, T3>, arg6: Function3<T1, T2, T3, C>) = PacketCodec.method_56436<B, C, T1, T2, T3>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun <T4, T5, B, C, V, T1, T2, T3>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: Function<C, T4>, arg8: PacketCodec<in B, T5>, arg9: Function<C, T5>, arg10: Function5<T1, T2, T3, T4, T5, C>) = PacketCodec.method_56906<B, C, T1, T2, T3, T4, T5>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
fun <T4, B, C, V, T1, T2, T3>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: PacketCodec<in B, T2>, arg3: Function<C, T2>, arg4: PacketCodec<in B, T3>, arg5: Function<C, T3>, arg6: PacketCodec<in B, T4>, arg7: Function<C, T4>, arg8: Function4<T1, T2, T3, T4, C>) = PacketCodec.method_56905<B, C, T1, T2, T3, T4>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
fun <B, V, S>PacketCodec<B, V>.cast() where S: B = this.method_56430<S>()
fun <B, C, T1, V>KClass<PacketCodec<B, V>>.tuple(arg0: PacketCodec<in B, T1>, arg1: Function<C, T1>, arg2: Function<T1, C>) = PacketCodec.method_56434<B, C, T1>(arg0, arg1, arg2)
