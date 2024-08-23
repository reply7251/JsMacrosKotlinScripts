package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryLoader

val KClass<RegistryLoader>.DYNAMIC_REGISTRIES by aliasStatic(RegistryLoader::field_39968)
val KClass<RegistryLoader>.SYNCED_REGISTRIES by aliasStatic(RegistryLoader::field_48709)
val KClass<RegistryLoader>.DIMENSION_REGISTRIES by aliasStatic(RegistryLoader::field_39969)
fun KClass<RegistryLoader>.loadFromNetwork(arg0: Map<RegistryKey<out Registry<*>>, MutableList<net.minecraft.class_7782.class_9176>>, arg1: ResourceFactory, arg2: DynamicRegistryManager, arg3: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56519(arg0, arg1, arg2, arg3)
fun KClass<RegistryLoader>.loadFromResource(arg0: ResourceManager, arg1: DynamicRegistryManager, arg2: MutableList<net.minecraft.class_7655.class_7657<*>>) = RegistryLoader.method_56515(arg0, arg1, arg2)
