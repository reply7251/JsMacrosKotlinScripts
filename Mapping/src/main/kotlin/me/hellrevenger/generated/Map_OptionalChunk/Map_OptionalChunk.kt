package me.hellrevenger.generated.Map_OptionalChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57130
 */
fun <T>OptionalChunk<T>.orElse(other: T) = this.method_57130(other)
/**
 * method_57122
 */
fun <T>OptionalChunk<T>.isPresent() = this.method_57122()
/**
 * method_57127
 */
fun <T, R>OptionalChunk<T>.map(mapper: function_Function<T, R>) = this.method_57127<R>(mapper)
/**
 * method_57132
 */
fun <T, E>OptionalChunk<T>.orElseThrow(exceptionSupplier: Supplier<E>) where E: Throwable = this.method_57132<E>(exceptionSupplier)
/**
 * method_57126
 */
fun <T>OptionalChunk<T>.ifPresent(callback: Consumer<T>) = this.method_57126(callback)
/**
 * method_57129
 */
fun <T>OptionalChunk<T>.getError() = this.method_57129()
