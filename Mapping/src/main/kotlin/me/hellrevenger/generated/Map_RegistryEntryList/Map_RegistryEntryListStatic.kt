package me.hellrevenger.generated.Map_RegistryEntryList
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryEntryListKt {
    /**
     * method_40244
     */
    fun <T, E>of(mapper: function_Function<E, RegistryEntry<T>>, values: Collection<E>) = RegistryEntryList.method_40244<E, T>(mapper, values)
    /**
     * method_40245
     */
    fun <T, E>of(mapper: function_Function<E, RegistryEntry<T>>, values: Array<E>) = RegistryEntryList.method_40245<E, T>(mapper, *values)
    /**
     * method_40246
     */
    fun <T>of(entries: Array<RegistryEntry<T>>) = RegistryEntryList.method_40246<T>(*entries)
    /**
     * method_45924
     */
    fun <T>of(owner: RegistryEntryOwner<T>, tagKey: TagKey<T>) = RegistryEntryList.method_45924<T>(owner, tagKey)
    /**
     * method_40242
     */
    fun <T>of(entries: MutableList<out RegistryEntry<T>>) = RegistryEntryList.method_40242<T>(entries)
    /**
     * method_58563
     */
    fun <T>empty() = RegistryEntryList.method_58563<T>()
}