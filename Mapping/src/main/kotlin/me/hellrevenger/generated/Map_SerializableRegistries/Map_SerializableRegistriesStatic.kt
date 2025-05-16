package me.hellrevenger.generated.Map_SerializableRegistries
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SerializableRegistriesKt {
    /**
     * field_48771
     */
    val SYNCED_REGISTRIES by aliasStatic(SerializableRegistries::field_48771)
    /**
     * method_45953
     */
    fun streamRegistryManagerEntries(combinedRegistries: CombinedDynamicRegistries<ServerDynamicRegistryType>?) = SerializableRegistries.method_45953(combinedRegistries)
    /**
     * method_56598
     */
    fun forEachSyncedRegistry(nbtOps: DynamicOps<NbtElement>?, registryManager: DynamicRegistryManager?, knownPacks: Set<VersionedIdentifier>?, callback: BiConsumer<RegistryKey<out Registry<*>>, MutableList<net.minecraft.class_7782.class_9176>>?) = SerializableRegistries.method_56598(nbtOps, registryManager, knownPacks, callback)
    /**
     * method_47449
     */
    fun streamDynamicEntries(combinedRegistries: CombinedDynamicRegistries<ServerDynamicRegistryType>?) = SerializableRegistries.method_47449(combinedRegistries)
    /**
     * method_62704
     */
    fun isSynced(key: RegistryKey<out Registry<*>>?) = SerializableRegistries.method_62704(key)
}