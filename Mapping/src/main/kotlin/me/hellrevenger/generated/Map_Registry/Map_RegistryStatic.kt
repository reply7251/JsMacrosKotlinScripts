package me.hellrevenger.generated.Map_Registry
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryKt {
    /**
     * method_47984
     */
    fun <T>registerReference(registry: Registry<T>, key: RegistryKey<T>, entry: T) = Registry.method_47984<T>(registry, key, entry)
    /**
     * method_10230
     */
    fun <T, V>register(registry: Registry<V>, id: Identifier, entry: T) where T: V = Registry.method_10230<V, T>(registry, id, entry)
}