package me.hellrevenger.generated.Map_ChunkSectionPos
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkSectionPosKt {
    /**
     * method_18678
     */
    fun offset(packed: Long, arg1: Int, x: Int, y: Int) = ChunkSectionPos.method_18678(packed, arg1, x, y)
    /**
     * method_18682
     */
    fun from(pos: BlockPos) = ChunkSectionPos.method_18682(pos)
    /**
     * method_30552
     */
    fun unpackLocalY(packedLocalPos: Short) = ChunkSectionPos.method_30552(packedLocalPos)
    /**
     * method_51687
     */
    fun withZeroY(x: Int, z: Int) = ChunkSectionPos.method_51687(x, z)
    /**
     * method_32204
     */
    fun getSectionCoord(coord: Double) = ChunkSectionPos.method_32204(coord)
    /**
     * method_18689
     */
    fun unpackY(packed: Long) = ChunkSectionPos.method_18689(packed)
    /**
     * method_39490
     */
    fun forEachChunkSectionAround(pos: Long, arg1: LongConsumer) = ChunkSectionPos.method_39490(pos, arg1)
    /**
     * method_30551
     */
    fun unpackLocalX(packedLocalPos: Short) = ChunkSectionPos.method_30551(packedLocalPos)
    /**
     * method_42615
     */
    fun getSectionCoordFloored(coord: Double) = ChunkSectionPos.method_42615(coord)
    /**
     * method_18686
     */
    fun unpackX(packed: Long) = ChunkSectionPos.method_18686(packed)
    /**
     * method_18690
     */
    fun unpackZ(packed: Long) = ChunkSectionPos.method_18690(packed)
    /**
     * method_19454
     */
    fun packLocal(pos: BlockPos) = ChunkSectionPos.method_19454(pos)
    /**
     * method_18688
     */
    fun getBlockCoord(sectionCoord: Int) = ChunkSectionPos.method_18688(sectionCoord)
    /**
     * method_20439
     */
    fun stream(center: ChunkSectionPos, radius: Int) = ChunkSectionPos.method_20439(center, radius)
    /**
     * method_30553
     */
    fun unpackLocalZ(packedLocalPos: Short) = ChunkSectionPos.method_30553(packedLocalPos)
    /**
     * method_18691
     */
    fun fromBlockPos(blockPos: Long) = ChunkSectionPos.method_18691(blockPos)
    /**
     * method_18684
     */
    fun getLocalCoord(coord: Int) = ChunkSectionPos.method_18684(coord)
    /**
     * method_33706
     */
    fun toLong(pos: BlockPos) = ChunkSectionPos.method_33706(pos)
    /**
     * method_32205
     */
    fun getOffsetPos(chunkCoord: Int, offset: Int) = ChunkSectionPos.method_32205(chunkCoord, offset)
}