package me.hellrevenger.generated.Map_VersionedChunkStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VersionedChunkStorageKt {
    /**
     * field_36219
     */
    val FEATURE_UPDATING_VERSION by aliasStatic(VersionedChunkStorage::field_36219)
    /**
     * method_17908
     */
    fun getDataVersion(nbt: NbtCompound?) = VersionedChunkStorage.method_17908(nbt)
    /**
     * method_39799
     */
    fun saveContextToNbt(nbt: NbtCompound?, worldKey: RegistryKey<world_World>?, generatorCodecKey: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>?) = VersionedChunkStorage.method_39799(nbt, worldKey, generatorCodecKey)
}