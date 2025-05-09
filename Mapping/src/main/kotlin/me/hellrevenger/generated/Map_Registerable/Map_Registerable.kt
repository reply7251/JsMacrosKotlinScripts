package me.hellrevenger.generated.Map_Registerable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_46799
 */
fun <T, S>Registerable<T>.getRegistryLookup(registryRef: RegistryKey<out Registry<out S>>) = this.method_46799<S>(registryRef)
/**
 * method_46838
 */
fun <T>Registerable<T>.register(key: RegistryKey<T>, value: T) = this.method_46838(key, value)
/**
 * method_46800
 */
fun <T>Registerable<T>.register(key: RegistryKey<T>, value: T, lifecycle: Lifecycle) = this.method_46800(key, value, lifecycle)
