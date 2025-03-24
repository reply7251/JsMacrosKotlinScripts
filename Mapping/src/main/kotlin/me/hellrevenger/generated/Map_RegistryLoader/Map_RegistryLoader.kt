package me.hellrevenger.generated.Map_RegistryLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_39968
 */
val KClass<RegistryLoader>.DYNAMIC_REGISTRIES by aliasStatic(RegistryLoader::field_39968)
/**
 * field_48709
 */
val KClass<RegistryLoader>.SYNCED_REGISTRIES by aliasStatic(RegistryLoader::field_48709)
/**
 * field_39969
 */
val KClass<RegistryLoader>.DIMENSION_REGISTRIES by aliasStatic(RegistryLoader::field_39969)
/**
 * method_56519
 */
fun KClass<RegistryLoader>.loadFromNetwork(arg0: Map<RegistryKey<out Registry<*>>, net.minecraft.class_7655.class_9841>, arg1: ResourceFactory, arg2: MutableList<net.minecraft.class_7225.class_7226<*>>, arg3: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56519(arg0, arg1, arg2, arg3)
/**
 * method_56515
 */
fun KClass<RegistryLoader>.loadFromResource(arg0: ResourceManager, arg1: MutableList<net.minecraft.class_7225.class_7226<*>>, arg2: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56515(arg0, arg1, arg2)
