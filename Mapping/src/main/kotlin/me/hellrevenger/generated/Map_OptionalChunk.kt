package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.OptionalChunk

fun <T, R>KClass<OptionalChunk<T>>.orElse(arg0: OptionalChunk<out R>, arg1: R) = OptionalChunk.method_57123<R>(arg0, arg1)
fun <T>KClass<OptionalChunk<T>>.of(arg0: String) = OptionalChunk.method_57125<T>(arg0)
fun <T>OptionalChunk<T>.orElse(arg0: T) = this.method_57130(arg0)
fun <T>KClass<OptionalChunk<T>>.of(arg0: Supplier<String>) = OptionalChunk.method_57128<T>(arg0)
fun <T>OptionalChunk<T>.isPresent() = this.method_57122()
fun <T, R>OptionalChunk<T>.map(arg0: Function<T, R>) = this.method_57127<R>(arg0)
fun <T>KClass<OptionalChunk<T>>.of(arg0: T) = OptionalChunk.method_57124<T>(arg0)
fun <T, E>OptionalChunk<T>.orElseThrow(arg0: Supplier<E>) where E: Throwable = this.method_57132<E>(arg0)
fun <T>OptionalChunk<T>.ifPresent(arg0: Consumer<T>) = this.method_57126(arg0)
fun <T>OptionalChunk<T>.getError() = this.method_57129()
