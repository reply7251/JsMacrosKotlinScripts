package me.hellrevenger.generated.Map_RawFilteredPair
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57141
 */
fun <T, U>RawFilteredPair<T>.resolve(arg0: function_Function<T, Optional<U>>) = this.method_57141<U>(arg0)
/**
 * method_57137
 */
fun <T>KClass<RawFilteredPair<T>>.of(arg0: T) = RawFilteredPair.method_57137<T>(arg0)
/**
 * method_57139
 */
fun <T, B>KClass<RawFilteredPair<T>>.createPacketCodec(arg0: PacketCodec<B, T>) where B: ByteBuf = RawFilteredPair.method_57139<B, T>(arg0)
/**
 * method_57140
 */
fun <T>RawFilteredPair<T>.get(arg0: Boolean) = this.method_57140(arg0)
/**
 * method_57138
 */
fun <T, U>RawFilteredPair<T>.map(arg0: function_Function<T, U>) = this.method_57138<U>(arg0)
/**
 * method_57134
 */
fun <T>KClass<RawFilteredPair<T>>.of(arg0: FilteredMessage) = RawFilteredPair.method_57134(arg0)
/**
 * method_57135
 */
fun <T>KClass<RawFilteredPair<T>>.createCodec(arg0: Codec<T>) = RawFilteredPair.method_57135<T>(arg0)
/**
 * comp_2370
 */
fun <T>RawFilteredPair<T>.filtered() = this.comp_2370()
/**
 * comp_2369
 */
fun <T>RawFilteredPair<T>.raw() = this.comp_2369()
