package me.hellrevenger.generated.Map_Registerable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_46799
 */
fun <T, S>Registerable<T>.getRegistryLookup(arg0: RegistryKey<out Registry<out S>>) = this.method_46799<S>(arg0)
/**
 * method_46838
 */
fun <T>Registerable<T>.register(arg0: RegistryKey<T>, arg1: T) = this.method_46838(arg0, arg1)
/**
 * method_46800
 */
fun <T>Registerable<T>.register(arg0: RegistryKey<T>, arg1: T, arg2: Lifecycle) = this.method_46800(arg0, arg1, arg2)
