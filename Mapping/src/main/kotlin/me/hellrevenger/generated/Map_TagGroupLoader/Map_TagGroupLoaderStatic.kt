package me.hellrevenger.generated.Map_TagGroupLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TagGroupLoaderKt {
    /**
     * method_61313
     */
    fun <T>collectRegistries(registryManager: net.minecraft.class_5455.class_6890, tagLoads: MutableList<net.minecraft.class_2378.class_10106<*>>) = TagGroupLoader.method_61313(registryManager, tagLoads)
    /**
     * method_61307
     */
    fun <T>startReload(resourceManager: ResourceManager, registryManager: DynamicRegistryManager) = TagGroupLoader.method_61307(resourceManager, registryManager)
    /**
     * method_61309
     */
    fun <T>loadFromNetwork(tags: net.minecraft.class_6864.class_5748, registry: MutableRegistry<T>) = TagGroupLoader.method_61309<T>(tags, registry)
    /**
     * method_61308
     */
    fun <T>loadInitial(resourceManager: ResourceManager, registry: MutableRegistry<T>) = TagGroupLoader.method_61308<T>(resourceManager, registry)
}