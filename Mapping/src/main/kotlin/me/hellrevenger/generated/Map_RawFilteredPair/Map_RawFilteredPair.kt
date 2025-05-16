package me.hellrevenger.generated.Map_RawFilteredPair
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57141
 */
fun <T, U>RawFilteredPair<T>.resolve(resolver: function_Function<T, Optional<U>>?) = this.method_57141<U>(resolver)
/**
 * method_57140
 */
fun <T>RawFilteredPair<T>.get(shouldFilter: Boolean) = this.method_57140(shouldFilter)
/**
 * method_57138
 */
fun <T, U>RawFilteredPair<T>.map(mapper: function_Function<T, U>?) = this.method_57138<U>(mapper)
/**
 * comp_2370
 */
fun <T>RawFilteredPair<T>.filtered() = this.comp_2370()
/**
 * comp_2369
 */
fun <T>RawFilteredPair<T>.raw() = this.comp_2369()
