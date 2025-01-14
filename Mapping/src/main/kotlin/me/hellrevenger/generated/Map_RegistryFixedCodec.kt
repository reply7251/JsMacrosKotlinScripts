package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryFixedCodec

fun <E>KClass<RegistryFixedCodec<E>>.of(arg0: RegistryKey<out Registry<E>>) = RegistryFixedCodec.method_40400<E>(arg0)
fun <E, T>RegistryFixedCodec<E>.encode(arg0: RegistryEntry<E>, arg1: DynamicOps<T>, arg2: T) = this.method_40396<T>(arg0, arg1, arg2)
