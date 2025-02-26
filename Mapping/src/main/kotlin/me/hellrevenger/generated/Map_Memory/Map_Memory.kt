package me.hellrevenger.generated.Map_Memory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_35127
 */
fun <T>Memory<T>.getExpiry() = this.method_35127()
/**
 * method_28355
 */
fun <T>KClass<Memory<T>>.permanent(arg0: T) = Memory.method_28355<T>(arg0)
/**
 * method_24913
 */
fun <T>Memory<T>.tick() = this.method_24913()
/**
 * method_24914
 */
fun <T>Memory<T>.isTimed() = this.method_24914()
/**
 * method_24634
 */
fun <T>Memory<T>.isExpired() = this.method_24634()
/**
 * method_24636
 */
fun <T>KClass<Memory<T>>.timed(arg0: T, arg1: Long) = Memory.method_24636<T>(arg0, arg1)
/**
 * method_24637
 */
fun <T>Memory<T>.getValue() = this.method_24637()
/**
 * method_28353
 */
fun <T>KClass<Memory<T>>.createCodec(arg0: Codec<T>) = Memory.method_28353<T>(arg0)
