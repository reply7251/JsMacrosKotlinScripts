package me.hellrevenger.generated.Map_ChunkErrorHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60998
 */
fun ChunkErrorHandler.onChunkMisplacement(actualPos: ChunkPos?, expectedPos: ChunkPos?, key: StorageKey?) = this.method_60998(actualPos, expectedPos, key)
/**
 * method_57822
 */
fun ChunkErrorHandler.onChunkSaveFailure(exception: Throwable?, key: StorageKey?, chunkPos: ChunkPos?) = this.method_57822(exception, key, chunkPos)
/**
 * method_57821
 */
fun ChunkErrorHandler.onChunkLoadFailure(exception: Throwable?, key: StorageKey?, chunkPos: ChunkPos?) = this.method_57821(exception, key, chunkPos)
