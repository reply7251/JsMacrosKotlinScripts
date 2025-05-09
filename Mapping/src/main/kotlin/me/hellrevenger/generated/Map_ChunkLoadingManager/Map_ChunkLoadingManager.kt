package me.hellrevenger.generated.Map_ChunkLoadingManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60443
 */
fun ChunkLoadingManager.createLoader(requestedStatus: ChunkStatus, pos: ChunkPos) = this.method_60443(requestedStatus, pos)
/**
 * method_60442
 */
fun ChunkLoadingManager.generate(chunkHolder: AbstractChunkHolder, step: ChunkGenerationStep, chunks: BoundedRegionArray<AbstractChunkHolder>) = this.method_60442(chunkHolder, step, chunks)
/**
 * method_60450
 */
fun ChunkLoadingManager.updateChunks() = this.method_60450()
/**
 * method_60448
 */
fun ChunkLoadingManager.acquire(pos: Long) = this.method_60448(pos)
/**
 * method_60441
 */
fun ChunkLoadingManager.release(chunkHolder: AbstractChunkHolder) = this.method_60441(chunkHolder)
