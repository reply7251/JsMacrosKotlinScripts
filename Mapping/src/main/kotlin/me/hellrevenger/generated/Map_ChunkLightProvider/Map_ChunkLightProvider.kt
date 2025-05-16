package me.hellrevenger.generated.Map_ChunkLightProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_51568
 */
fun <M, S>ChunkLightProvider<M, S>.getStatus(sectionPos: Long) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_51568(sectionPos)
/**
 * method_20599
 */
fun <M, S>ChunkLightProvider<M, S>.setRetainColumn(pos: ChunkPos?, retainData: Boolean) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_20599(pos, retainData)
/**
 * method_15515
 */
fun <M, S>ChunkLightProvider<M, S>.enqueueSectionData(sectionPos: Long, arg1: ChunkNibbleArray?) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_15515(sectionPos, arg1)
/**
 * method_22875
 */
fun <M, S>ChunkLightProvider<M, S>.displaySectionLevel(sectionPos: Long) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_22875(sectionPos)
