package me.hellrevenger.generated.Map_ChunkErrorHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60998
 */
fun ChunkErrorHandler.onChunkMisplacement(arg0: ChunkPos, arg1: ChunkPos, arg2: StorageKey) = this.method_60998(arg0, arg1, arg2)
/**
 * method_57822
 */
fun ChunkErrorHandler.onChunkSaveFailure(arg0: Throwable, arg1: StorageKey, arg2: ChunkPos) = this.method_57822(arg0, arg1, arg2)
/**
 * method_57821
 */
fun ChunkErrorHandler.onChunkLoadFailure(arg0: Throwable, arg1: StorageKey, arg2: ChunkPos) = this.method_57821(arg0, arg1, arg2)
/**
 * method_60997
 */
fun KClass<ChunkErrorHandler>.createMisplacementException(arg0: ChunkPos, arg1: ChunkPos) = ChunkErrorHandler.method_60997(arg0, arg1)
