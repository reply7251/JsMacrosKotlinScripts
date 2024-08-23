package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryKey

fun <T>KClass<RegistryKey<T>>.of(arg0: RegistryKey<out Registry<T>>, arg1: Identifier) = RegistryKey.method_29179<T>(arg0, arg1)
fun <T>KClass<RegistryKey<T>>.ofRegistry(arg0: Identifier) = RegistryKey.method_29180<T>(arg0)
fun <T>RegistryKey<T>.getRegistry() = this.method_41185()
fun <T>RegistryKey<T>.getValue() = this.method_29177()
fun <T>RegistryKey<T>.isOf(arg0: RegistryKey<out Registry<*>>) = this.method_31163(arg0)
fun <T>KClass<RegistryKey<T>>.createPacketCodec(arg0: RegistryKey<out Registry<T>>) = RegistryKey.method_56038<T>(arg0)
fun <T, E>RegistryKey<T>.tryCast(arg0: RegistryKey<out Registry<E>>) = this.method_39752<E>(arg0)
fun <T>RegistryKey<T>.getRegistryRef() = this.method_58273()
fun <T>KClass<RegistryKey<T>>.createCodec(arg0: RegistryKey<out Registry<T>>) = RegistryKey.method_39154<T>(arg0)
