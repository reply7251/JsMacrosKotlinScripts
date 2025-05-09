package me.hellrevenger.generated.Map_Memory
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MemoryKt {
    /**
     * method_28355
     */
    fun <T>permanent(value: T) = Memory.method_28355<T>(value)
    /**
     * method_24636
     */
    fun <T>timed(value: T, expiry: Long) = Memory.method_24636<T>(value, expiry)
    /**
     * method_28353
     */
    fun <T>createCodec(codec: Codec<T>) = Memory.method_28353<T>(codec)
}