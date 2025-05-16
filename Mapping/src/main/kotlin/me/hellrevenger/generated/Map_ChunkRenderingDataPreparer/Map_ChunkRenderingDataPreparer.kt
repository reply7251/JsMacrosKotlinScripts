package me.hellrevenger.generated.Map_ChunkRenderingDataPreparer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_52837
 */
fun ChunkRenderingDataPreparer.getInfo(chunk: net.minecraft.class_846.class_851?) = this.method_52837(chunk)
/**
 * method_62925
 */
fun ChunkRenderingDataPreparer.getOctree() = this.method_62925()
/**
 * method_52828
 */
fun ChunkRenderingDataPreparer.collectChunks(frustum: Frustum?, builtChunks: MutableList<net.minecraft.class_846.class_851>?, nearbyChunks: MutableList<net.minecraft.class_846.class_851>?) = this.method_52828(frustum, builtChunks, nearbyChunks)
/**
 * method_52817
 */
fun ChunkRenderingDataPreparer.scheduleTerrainUpdate() = this.method_52817()
/**
 * method_52826
 */
fun ChunkRenderingDataPreparer.setStorage(storage: BuiltChunkStorage?) = this.method_52826(storage)
/**
 * method_52819
 */
fun ChunkRenderingDataPreparer.addNeighbors(chunkPos: ChunkPos?) = this.method_52819(chunkPos)
/**
 * method_52834
 */
fun ChunkRenderingDataPreparer.updateSectionOcclusionGraph(cullChunks: Boolean, camera: Camera?, frustum: Frustum?, builtChunk: MutableList<net.minecraft.class_846.class_851>?, activeSections: LongOpenHashSet?) = this.method_52834(cullChunks, camera, frustum, builtChunk, activeSections)
/**
 * method_52827
 */
fun ChunkRenderingDataPreparer.schedulePropagationFrom(builtChunk: net.minecraft.class_846.class_851?) = this.method_52827(builtChunk)
