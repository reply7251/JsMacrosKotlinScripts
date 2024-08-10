package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Memory

fun <T>KClass<Memory<T>>.permanent(arg0: T) = Memory.method_28355<T>(arg0)
fun <T>Memory<T>.tick() = this.method_24913()
fun <T>Memory<T>.isTimed() = this.method_24914()
fun <T>Memory<T>.isExpired() = this.method_24634()
fun <T>KClass<Memory<T>>.timed(arg0: T, arg1: Long) = Memory.method_24636<T>(arg0, arg1)
fun <T>KClass<Memory<T>>.createCodec(arg0: Codec<T>) = Memory.method_28353<T>(arg0)
