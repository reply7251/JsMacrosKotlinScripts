package me.hellrevenger.generated.Map_RegistryLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryLoaderKt {
    /**
     * field_39968
     */
    val DYNAMIC_REGISTRIES by aliasStatic(RegistryLoader::field_39968)
    /**
     * field_48709
     */
    val SYNCED_REGISTRIES by aliasStatic(RegistryLoader::field_48709)
    /**
     * field_39969
     */
    val DIMENSION_REGISTRIES by aliasStatic(RegistryLoader::field_39969)
    /**
     * method_56519
     */
    fun loadFromNetwork(data: Map<RegistryKey<out Registry<*>>, net.minecraft.class_7655.class_9841>, factory: ResourceFactory, registries: MutableList<net.minecraft.class_7225.class_7226<*>>, entries: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56519(data, factory, registries, entries)
    /**
     * method_56515
     */
    fun loadFromResource(resourceManager: ResourceManager, registries: MutableList<net.minecraft.class_7225.class_7226<*>>, entries: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56515(resourceManager, registries, entries)
}