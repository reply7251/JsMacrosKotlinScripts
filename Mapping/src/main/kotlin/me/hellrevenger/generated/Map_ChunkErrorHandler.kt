package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkErrorHandler

fun ChunkErrorHandler.onChunkMisplacement(arg0: ChunkPos, arg1: ChunkPos, arg2: StorageKey) = this.method_60998(arg0, arg1, arg2)
fun ChunkErrorHandler.onChunkSaveFailure(arg0: Throwable, arg1: StorageKey, arg2: ChunkPos) = this.method_57822(arg0, arg1, arg2)
fun ChunkErrorHandler.onChunkLoadFailure(arg0: Throwable, arg1: StorageKey, arg2: ChunkPos) = this.method_57821(arg0, arg1, arg2)
fun KClass<ChunkErrorHandler>.createMisplacementException(arg0: ChunkPos, arg1: ChunkPos) = ChunkErrorHandler.method_60997(arg0, arg1)
