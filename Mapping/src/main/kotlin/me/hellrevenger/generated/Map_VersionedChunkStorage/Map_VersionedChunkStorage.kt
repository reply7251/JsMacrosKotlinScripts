package me.hellrevenger.generated.Map_VersionedChunkStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_36219
 */
val KClass<VersionedChunkStorage>.FEATURE_UPDATING_VERSION by aliasStatic(VersionedChunkStorage::field_36219)
/**
 * method_23696
 */
fun VersionedChunkStorage.getNbt(arg0: ChunkPos) = this.method_23696(arg0)
/**
 * method_17908
 */
fun KClass<VersionedChunkStorage>.getDataVersion(arg0: NbtCompound) = VersionedChunkStorage.method_17908(arg0)
/**
 * method_17910
 */
fun VersionedChunkStorage.setNbt(arg0: ChunkPos, arg1: NbtCompound) = this.method_17910(arg0, arg1)
/**
 * method_17907
 */
fun VersionedChunkStorage.updateChunkNbt(arg0: RegistryKey<world_World>, arg1: Supplier<PersistentStateManager>, arg2: NbtCompound, arg3: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>) = this.method_17907(arg0, arg1, arg2, arg3)
/**
 * method_39799
 */
fun KClass<VersionedChunkStorage>.saveContextToNbt(arg0: NbtCompound, arg1: RegistryKey<world_World>, arg2: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>) = VersionedChunkStorage.method_39799(arg0, arg1, arg2)
/**
 * method_42328
 */
fun VersionedChunkStorage.needsBlending(arg0: ChunkPos, arg1: Int) = this.method_42328(arg0, arg1)
/**
 * method_39800
 */
fun VersionedChunkStorage.getWorker() = this.method_39800()
/**
 * method_23697
 */
fun VersionedChunkStorage.completeAll() = this.method_23697()
