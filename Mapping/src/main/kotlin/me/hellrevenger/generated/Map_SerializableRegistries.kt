package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SerializableRegistries

val KClass<SerializableRegistries>.SYNCED_REGISTRIES by aliasStatic(SerializableRegistries::field_48771)
fun KClass<SerializableRegistries>.streamRegistryManagerEntries(arg0: CombinedDynamicRegistries<ServerDynamicRegistryType>) = SerializableRegistries.method_45953(arg0)
fun KClass<SerializableRegistries>.forEachSyncedRegistry(arg0: DynamicOps<NbtElement>, arg1: DynamicRegistryManager, arg2: Set<VersionedIdentifier>, arg3: BiConsumer<RegistryKey<out Registry<*>>, MutableList<net.minecraft.class_7782.class_9176>>) = SerializableRegistries.method_56598(arg0, arg1, arg2, arg3)
fun KClass<SerializableRegistries>.streamDynamicEntries(arg0: CombinedDynamicRegistries<ServerDynamicRegistryType>) = SerializableRegistries.method_47449(arg0)
