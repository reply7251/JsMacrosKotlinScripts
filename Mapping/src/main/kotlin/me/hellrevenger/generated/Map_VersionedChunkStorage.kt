package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VersionedChunkStorage

val KClass<VersionedChunkStorage>.FEATURE_UPDATING_VERSION by aliasStatic(VersionedChunkStorage::field_36219)
fun VersionedChunkStorage.getNbt(arg0: ChunkPos) = this.method_23696(arg0)
fun KClass<VersionedChunkStorage>.getDataVersion(arg0: NbtCompound) = VersionedChunkStorage.method_17908(arg0)
fun VersionedChunkStorage.setNbt(arg0: ChunkPos, arg1: NbtCompound) = this.method_17910(arg0, arg1)
fun VersionedChunkStorage.updateChunkNbt(arg0: RegistryKey<world_World>, arg1: Supplier<PersistentStateManager>, arg2: NbtCompound, arg3: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>) = this.method_17907(arg0, arg1, arg2, arg3)
fun KClass<VersionedChunkStorage>.saveContextToNbt(arg0: NbtCompound, arg1: RegistryKey<world_World>, arg2: Optional<RegistryKey<MapCodec<out ChunkGenerator>>>) = VersionedChunkStorage.method_39799(arg0, arg1, arg2)
fun VersionedChunkStorage.needsBlending(arg0: ChunkPos, arg1: Int) = this.method_42328(arg0, arg1)
fun VersionedChunkStorage.getWorker() = this.method_39800()
fun VersionedChunkStorage.completeAll() = this.method_23697()
