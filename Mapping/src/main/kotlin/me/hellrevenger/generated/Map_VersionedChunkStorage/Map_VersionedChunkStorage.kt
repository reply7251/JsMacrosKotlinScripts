package me.hellrevenger.generated.Map_VersionedChunkStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_17910
 */
fun VersionedChunkStorage.setNbt(chunkPos: ChunkPos?, nbtSupplier: Supplier<NbtCompound>?) = this.method_17910(chunkPos, nbtSupplier)
/**
 * method_23696
 */
fun VersionedChunkStorage.getNbt(chunkPos: ChunkPos?) = this.method_23696(chunkPos)
/**
 * method_17907
 */
fun VersionedChunkStorage.updateChunkNbt(worldKey: RegistryKey<world_World>?, persistentStateManagerFactory: Supplier<PersistentStateManager>?, nbt: NbtCompound?, generatorCodecKey: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>?) = this.method_17907(worldKey, persistentStateManagerFactory, nbt, generatorCodecKey)
/**
 * method_42328
 */
fun VersionedChunkStorage.needsBlending(chunkPos: ChunkPos?, checkRadius: Int) = this.method_42328(chunkPos, checkRadius)
/**
 * method_39800
 */
fun VersionedChunkStorage.getWorker() = this.method_39800()
/**
 * method_23697
 */
fun VersionedChunkStorage.completeAll() = this.method_23697()
