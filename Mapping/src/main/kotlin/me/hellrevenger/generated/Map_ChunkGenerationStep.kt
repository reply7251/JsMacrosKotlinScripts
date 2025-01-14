package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkGenerationStep

fun ChunkGenerationStep.run(arg0: ChunkGenerationContext, arg1: BoundedRegionArray<AbstractChunkHolder>, arg2: Chunk) = this.method_60560(arg0, arg1, arg2)
fun ChunkGenerationStep.getAdditionalLevel(arg0: ChunkStatus) = this.method_60559(arg0)
fun ChunkGenerationStep.directDependencies() = this.comp_2804()
fun ChunkGenerationStep.accumulatedDependencies() = this.comp_2805()
fun ChunkGenerationStep.targetStatus() = this.comp_2803()
fun ChunkGenerationStep.task() = this.comp_2807()
fun ChunkGenerationStep.blockStateWriteRadius() = this.comp_2806()
