package me.hellrevenger.generated.Map_JsonDataLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
object JsonDataLoaderKt {
    /**
     * method_65310
     */
    fun <T>load(manager: ResourceManager, registryRef: RegistryKey<out Registry<T>>, ops: DynamicOps<JsonElement>, codec: Codec<T>, results: Map<Identifier, T>) = JsonDataLoader.method_65310<T>(manager, registryRef, ops, codec, results)
}