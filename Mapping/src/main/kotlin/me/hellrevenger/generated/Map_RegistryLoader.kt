package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryLoader

val RegistryLoader.DYNAMIC_REGISTRIES by aliasStatic(RegistryLoader::field_39968)
val RegistryLoader.SYNCED_REGISTRIES by aliasStatic(RegistryLoader::field_48709)
val RegistryLoader.DIMENSION_REGISTRIES by aliasStatic(RegistryLoader::field_39969)
fun KClass<RegistryLoader>.loadFromNetwork(arg0: Map<RegistryKey<out Registry<*>>, List<net.minecraft.class_7782.class_9176>>, arg1: ResourceFactory, arg2: DynamicRegistryManager, arg3: List<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56519(arg0, arg1, arg2, arg3)
fun KClass<RegistryLoader>.loadFromResource(arg0: ResourceManager, arg1: DynamicRegistryManager, arg2: List<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56515(arg0, arg1, arg2)
