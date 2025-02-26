package me.hellrevenger.generated.Map_RegistryKey
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_29179
 */
fun <T>KClass<RegistryKey<T>>.of(arg0: RegistryKey<out Registry<T>>, arg1: Identifier) = RegistryKey.method_29179<T>(arg0, arg1)
/**
 * method_29180
 */
fun <T>KClass<RegistryKey<T>>.ofRegistry(arg0: Identifier) = RegistryKey.method_29180<T>(arg0)
/**
 * method_41185
 */
fun <T>RegistryKey<T>.getRegistry() = this.method_41185()
/**
 * method_29177
 */
fun <T>RegistryKey<T>.getValue() = this.method_29177()
/**
 * method_31163
 */
fun <T>RegistryKey<T>.isOf(arg0: RegistryKey<out Registry<*>>) = this.method_31163(arg0)
/**
 * method_56038
 */
fun <T>KClass<RegistryKey<T>>.createPacketCodec(arg0: RegistryKey<out Registry<T>>) = RegistryKey.method_56038<T>(arg0)
/**
 * method_39752
 */
fun <T, E>RegistryKey<T>.tryCast(arg0: RegistryKey<out Registry<E>>) = this.method_39752<E>(arg0)
/**
 * method_58273
 */
fun <T>RegistryKey<T>.getRegistryRef() = this.method_58273()
/**
 * method_39154
 */
fun <T>KClass<RegistryKey<T>>.createCodec(arg0: RegistryKey<out Registry<T>>) = RegistryKey.method_39154<T>(arg0)
