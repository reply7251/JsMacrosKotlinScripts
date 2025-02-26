package me.hellrevenger.generated.Map_RegistryEntryList
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_40241
 */
fun <T>RegistryEntryList<T>.contains(arg0: RegistryEntry<T>) = this.method_40241(arg0)
/**
 * method_40243
 */
fun <T>RegistryEntryList<T>.getRandom(arg0: Random) = this.method_40243(arg0)
/**
 * method_40240
 */
fun <T>RegistryEntryList<T>.get(arg0: Int) = this.method_40240(arg0)
/**
 * method_40248
 */
fun <T>RegistryEntryList<T>.getStorage() = this.method_40248()
/**
 * method_45925
 */
fun <T>RegistryEntryList<T>.getTagKey() = this.method_45925()
/**
 * method_40244
 */
fun <T, E>KClass<RegistryEntryList<T>>.of(arg0: function_Function<E, RegistryEntry<T>>, arg1: Collection<E>) = RegistryEntryList.method_40244<E, T>(arg0, arg1)
/**
 * method_40245
 */
fun <T, E>KClass<RegistryEntryList<T>>.of(arg0: function_Function<E, RegistryEntry<T>>, arg1: Array<E>) = RegistryEntryList.method_40245<E, T>(arg0, *arg1)
/**
 * method_40247
 */
fun <T>RegistryEntryList<T>.size() = this.method_40247()
/**
 * method_40246
 */
fun <T>KClass<RegistryEntryList<T>>.of(arg0: Array<RegistryEntry<T>>) = RegistryEntryList.method_40246<T>(*arg0)
/**
 * method_45924
 */
fun <T>KClass<RegistryEntryList<T>>.of(arg0: RegistryEntryOwner<T>, arg1: TagKey<T>) = RegistryEntryList.method_45924<T>(arg0, arg1)
/**
 * method_40239
 */
fun <T>RegistryEntryList<T>.stream() = this.method_40239()
/**
 * method_40242
 */
fun <T>KClass<RegistryEntryList<T>>.of(arg0: MutableList<out RegistryEntry<T>>) = RegistryEntryList.method_40242<T>(arg0)
/**
 * method_46768
 */
fun <T>RegistryEntryList<T>.ownerEquals(arg0: RegistryEntryOwner<T>) = this.method_46768(arg0)
/**
 * method_58563
 */
fun <T>KClass<RegistryEntryList<T>>.empty() = RegistryEntryList.method_58563<T>()
