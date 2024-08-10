package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryEntryList

fun <T>RegistryEntryList<T>.contains(arg0: RegistryEntry<T>) = this.method_40241(arg0)
fun <T>RegistryEntryList<T>.getRandom(arg0: Random) = this.method_40243(arg0)
fun <T>RegistryEntryList<T>.get(arg0: Int) = this.method_40240(arg0)
fun <T>RegistryEntryList<T>.getStorage() = this.method_40248()
fun <T>RegistryEntryList<T>.getTagKey() = this.method_45925()
fun <T, E>KClass<RegistryEntryList<T>>.of(arg0: Function<E, RegistryEntry<T>>, arg1: Collection<E>) = RegistryEntryList.method_40244<E, T>(arg0, arg1)
fun <T, E>KClass<RegistryEntryList<T>>.of(arg0: Function<E, RegistryEntry<T>>, arg1: Array<E>) = RegistryEntryList.method_40245<E, T>(arg0, *arg1)
fun <T>RegistryEntryList<T>.size() = this.method_40247()
fun <T>KClass<RegistryEntryList<T>>.of(arg0: Array<RegistryEntry<T>>) = RegistryEntryList.method_40246<T>(*arg0)
fun <T>KClass<RegistryEntryList<T>>.of(arg0: RegistryEntryOwner<T>, arg1: TagKey<T>) = RegistryEntryList.method_45924<T>(arg0, arg1)
fun <T>RegistryEntryList<T>.stream() = this.method_40239()
fun <T>KClass<RegistryEntryList<T>>.of(arg0: List<out RegistryEntry<T>>) = RegistryEntryList.method_40242<T>(arg0)
fun <T>RegistryEntryList<T>.ownerEquals(arg0: RegistryEntryOwner<T>) = this.method_46768(arg0)
fun <T>KClass<RegistryEntryList<T>>.empty() = RegistryEntryList.method_58563<T>()
