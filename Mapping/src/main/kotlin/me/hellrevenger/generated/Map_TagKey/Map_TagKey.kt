package me.hellrevenger.generated.Map_TagKey
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_40093
 */
fun <T>KClass<TagKey<T>>.codec(arg0: RegistryKey<out Registry<T>>) = TagKey.method_40093<T>(arg0)
/**
 * method_41007
 */
fun <T>TagKey<T>.isOf(arg0: RegistryKey<out Registry<*>>) = this.method_41007(arg0)
/**
 * comp_327
 */
fun <T>TagKey<T>.id() = this.comp_327()
/**
 * method_40090
 */
fun <T>KClass<TagKey<T>>.unprefixedCodec(arg0: RegistryKey<out Registry<T>>) = TagKey.method_40090<T>(arg0)
/**
 * method_41008
 */
fun <T, E>TagKey<T>.tryCast(arg0: RegistryKey<out Registry<E>>) = this.method_41008<E>(arg0)
/**
 * method_40092
 */
fun <T>KClass<TagKey<T>>.of(arg0: RegistryKey<out Registry<T>>, arg1: Identifier) = TagKey.method_40092<T>(arg0, arg1)
/**
 * comp_326
 */
fun <T>TagKey<T>.registry() = this.comp_326()
