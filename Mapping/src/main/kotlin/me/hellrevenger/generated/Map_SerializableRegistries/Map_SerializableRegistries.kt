package me.hellrevenger.generated.Map_SerializableRegistries
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_48771
 */
val KClass<SerializableRegistries>.SYNCED_REGISTRIES by aliasStatic(SerializableRegistries::field_48771)
/**
 * method_45953
 */
fun KClass<SerializableRegistries>.streamRegistryManagerEntries(arg0: CombinedDynamicRegistries<ServerDynamicRegistryType>) = SerializableRegistries.method_45953(arg0)
/**
 * method_56598
 */
fun KClass<SerializableRegistries>.forEachSyncedRegistry(arg0: DynamicOps<NbtElement>, arg1: DynamicRegistryManager, arg2: Set<VersionedIdentifier>, arg3: BiConsumer<RegistryKey<out Registry<*>>, MutableList<net.minecraft.class_7782.class_9176>>) = SerializableRegistries.method_56598(arg0, arg1, arg2, arg3)
/**
 * method_47449
 */
fun KClass<SerializableRegistries>.streamDynamicEntries(arg0: CombinedDynamicRegistries<ServerDynamicRegistryType>) = SerializableRegistries.method_47449(arg0)
/**
 * method_62704
 */
fun KClass<SerializableRegistries>.isSynced(arg0: RegistryKey<out Registry<*>>) = SerializableRegistries.method_62704(arg0)
