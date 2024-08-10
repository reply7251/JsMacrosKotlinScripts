package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RawFilteredPair

fun <T, U>RawFilteredPair<T>.resolve(arg0: Function<T, Optional<U>>) = this.method_57141<U>(arg0)
fun <T>KClass<RawFilteredPair<T>>.of(arg0: T) = RawFilteredPair.method_57137<T>(arg0)
fun <T, B>KClass<RawFilteredPair<T>>.createPacketCodec(arg0: PacketCodec<B, T>) where B: ByteBuf = RawFilteredPair.method_57139<B, T>(arg0)
fun <T>RawFilteredPair<T>.get(arg0: Boolean) = this.method_57140(arg0)
fun <T, U>RawFilteredPair<T>.map(arg0: Function<T, U>) = this.method_57138<U>(arg0)
fun <T>KClass<RawFilteredPair<T>>.of(arg0: FilteredMessage) = RawFilteredPair.method_57134(arg0)
fun <T>KClass<RawFilteredPair<T>>.createCodec(arg0: Codec<T>) = RawFilteredPair.method_57135<T>(arg0)
fun <T>RawFilteredPair<T>.filtered() = this.comp_2370()
fun <T>RawFilteredPair<T>.raw() = this.comp_2369()
