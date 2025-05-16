package me.hellrevenger.generated.Map_OptionalChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
object OptionalChunkKt {
    /**
     * method_57123
     */
    fun <T, R>orElse(optionalChunk: OptionalChunk<out R>?, other: R) = OptionalChunk.method_57123<R>(optionalChunk, other)
    /**
     * method_57125
     */
    fun <T>of(error: String?) = OptionalChunk.method_57125<T>(error)
    /**
     * method_57128
     */
    fun <T>of(error: Supplier<String>?) = OptionalChunk.method_57128<T>(error)
    /**
     * method_57124
     */
    fun <T>of(chunk: T) = OptionalChunk.method_57124<T>(chunk)
}