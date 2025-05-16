package me.hellrevenger.generated.Map_StorageIoWorker
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_23698
 */
fun StorageIoWorker.completeAll(sync: Boolean) = this.method_23698(sync)
/**
 * method_61004
 */
fun StorageIoWorker.getStorageKey() = this.method_61004()
/**
 * method_31738
 */
fun StorageIoWorker.readChunkData(pos: ChunkPos?) = this.method_31738(pos)
/**
 * method_42330
 */
fun StorageIoWorker.needsBlending(chunkPos: ChunkPos?, checkRadius: Int) = this.method_42330(chunkPos, checkRadius)
/**
 * method_23703
 */
fun StorageIoWorker.setResult(pos: ChunkPos?, nbt: NbtCompound?) = this.method_23703(pos, nbt)
/**
 * method_61773
 */
fun StorageIoWorker.setResult(pos: ChunkPos?, nbtSupplier: Supplier<NbtCompound>?) = this.method_61773(pos, nbtSupplier)
