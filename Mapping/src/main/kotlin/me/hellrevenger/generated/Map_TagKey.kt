package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TagKey

fun <T>KClass<TagKey<T>>.codec(arg0: RegistryKey<out Registry<T>>) = TagKey.method_40093<T>(arg0)
fun <T>TagKey<T>.isOf(arg0: RegistryKey<out Registry<*>>) = this.method_41007(arg0)
fun <T>TagKey<T>.id() = this.comp_327()
fun <T>KClass<TagKey<T>>.unprefixedCodec(arg0: RegistryKey<out Registry<T>>) = TagKey.method_40090<T>(arg0)
fun <T, E>TagKey<T>.tryCast(arg0: RegistryKey<out Registry<E>>) = this.method_41008<E>(arg0)
fun <T>KClass<TagKey<T>>.of(arg0: RegistryKey<out Registry<T>>, arg1: Identifier) = TagKey.method_40092<T>(arg0, arg1)
fun <T>TagKey<T>.registry() = this.comp_326()
