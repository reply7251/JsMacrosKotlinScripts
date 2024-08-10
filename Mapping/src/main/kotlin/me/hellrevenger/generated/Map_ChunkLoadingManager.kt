package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkLoadingManager

fun ChunkLoadingManager.createLoader(arg0: ChunkStatus, arg1: ChunkPos) = this.method_60443(arg0, arg1)
fun ChunkLoadingManager.generate(arg0: AbstractChunkHolder, arg1: ChunkGenerationStep, arg2: BoundedRegionArray<AbstractChunkHolder>) = this.method_60442(arg0, arg1, arg2)
fun ChunkLoadingManager.updateChunks() = this.method_60450()
fun ChunkLoadingManager.acquire(arg0: Long) = this.method_60448(arg0)
fun ChunkLoadingManager.release(arg0: AbstractChunkHolder) = this.method_60441(arg0)
