package me.hellrevenger.generated.Map_TagGroupLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61313
 */
fun <T>KClass<TagGroupLoader<T>>.collectRegistries(arg0: net.minecraft.class_5455.class_6890, arg1: MutableList<net.minecraft.class_2378.class_10106<*>>) = TagGroupLoader.method_61313(arg0, arg1)
/**
 * method_61307
 */
fun <T>KClass<TagGroupLoader<T>>.startReload(arg0: ResourceManager, arg1: DynamicRegistryManager) = TagGroupLoader.method_61307(arg0, arg1)
/**
 * method_61309
 */
fun <T>KClass<TagGroupLoader<T>>.loadFromNetwork(arg0: net.minecraft.class_6864.class_5748, arg1: MutableRegistry<T>) = TagGroupLoader.method_61309<T>(arg0, arg1)
/**
 * method_61308
 */
fun <T>KClass<TagGroupLoader<T>>.loadInitial(arg0: ResourceManager, arg1: MutableRegistry<T>) = TagGroupLoader.method_61308<T>(arg0, arg1)
/**
 * method_33174
 */
fun <T>TagGroupLoader<T>.loadTags(arg0: ResourceManager) = this.method_33174(arg0)
/**
 * method_18242
 */
fun <T>TagGroupLoader<T>.buildGroup(arg0: Map<Identifier, MutableList<net.minecraft.class_3503.class_5145>>) = this.method_18242(arg0)
