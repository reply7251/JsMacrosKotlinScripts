package me.hellrevenger.generated.Map_Blender
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlenderKt {
    /**
     * method_39815
     */
    fun createClosestDistanceFunction(data: BlendingData, neighborData: Map<EightWayDirection, BlendingData>) = Blender.method_39815(data, neighborData)
    /**
     * method_39342
     */
    fun getBlender(chunkRegion: ChunkRegion) = Blender.method_39342(chunkRegion)
    /**
     * method_39772
     */
    fun tickLeavesAndFluids(chunkRegion: ChunkRegion, chunk: Chunk) = Blender.method_39772(chunkRegion, chunk)
    /**
     * method_39336
     */
    fun getNoBlending() = Blender.method_39336()
    /**
     * method_39809
     */
    fun createCarvingMasks(world: StructureWorldAccess, chunk: ProtoChunk) = Blender.method_39809(world, chunk)
}