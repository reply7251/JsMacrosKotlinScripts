package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComponentType

fun <T>KClass<ComponentType<T>>.builder() = ComponentType.method_57873<T>()
fun <T>ComponentType<T>.getCodec() = this.method_57875()
fun <T>ComponentType<T>.getPacketCodec() = this.method_57878()
fun <T>ComponentType<T>.getCodecOrThrow() = this.method_57876()
fun <T>ComponentType<T>.shouldSkipSerialization() = this.method_57877()
