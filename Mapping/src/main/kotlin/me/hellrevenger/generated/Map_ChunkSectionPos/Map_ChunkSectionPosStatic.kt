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
    fun from(pos: BlockPos?) = ChunkSectionPos.method_18682(pos)
    /**
     * method_30552
     */
    fun unpackLocalY(packedLocalPos: Short) = ChunkSectionPos.method_30552(packedLocalPos)
    /**
     * method_33705
     */
    fun from(chunk: Chunk?) = ChunkSectionPos.method_33705(chunk)
    /**
     * method_18676
     */
    fun from(x: Int, y: Int, z: Int) = ChunkSectionPos.method_18676(x, y, z)
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
    fun forEachChunkSectionAround(pos: Long, arg1: LongConsumer?) = ChunkSectionPos.method_39490(pos, arg1)
    /**
     * method_18677
     */
    fun from(packed: Long) = ChunkSectionPos.method_18677(packed)
    /**
     * method_18693
     */
    fun withZeroY(pos: Long) = ChunkSectionPos.method_18693(pos)
    /**
     * method_30551
     */
    fun unpackLocalX(packedLocalPos: Short) = ChunkSectionPos.method_30551(packedLocalPos)
    /**
     * method_42615
     */
    fun getSectionCoordFloored(coord: Double) = ChunkSectionPos.method_42615(coord)
    /**
     * method_42614
     */
    fun from(entity: EntityLike?) = ChunkSectionPos.method_42614(entity)
    /**
     * method_18686
     */
    fun unpackX(packed: Long) = ChunkSectionPos.method_18686(packed)
    /**
     * method_18680
     */
    fun from(pos: Position?) = ChunkSectionPos.method_18680(pos)
    /**
     * method_39489
     */
    fun forEachChunkSectionAround(x: Int, y: Int, z: Int, consumer: LongConsumer?) = ChunkSectionPos.method_39489(x, y, z, consumer)
    /**
     * method_18690
     */
    fun unpackZ(packed: Long) = ChunkSectionPos.method_18690(packed)
    /**
     * method_18675
     */
    fun getSectionCoord(coord: Int) = ChunkSectionPos.method_18675(coord)
    /**
     * method_18685
     */
    fun asLong(x: Int, y: Int, z: Int) = ChunkSectionPos.method_18685(x, y, z)
    /**
     * method_19454
     */
    fun packLocal(pos: BlockPos?) = ChunkSectionPos.method_19454(pos)
    /**
     * method_18681
     */
    fun from(chunkPos: ChunkPos?, y: Int) = ChunkSectionPos.method_18681(chunkPos, y)
    /**
     * method_18688
     */
    fun getBlockCoord(sectionCoord: Int) = ChunkSectionPos.method_18688(sectionCoord)
    /**
     * method_20439
     */
    fun stream(center: ChunkSectionPos?, radius: Int) = ChunkSectionPos.method_20439(center, radius)
    /**
     * method_22446
     */
    fun stream(center: ChunkPos?, radius: Int, minY: Int, maxY: Int) = ChunkSectionPos.method_22446(center, radius, minY, maxY)
    /**
     * method_30553
     */
    fun unpackLocalZ(packedLocalPos: Short) = ChunkSectionPos.method_30553(packedLocalPos)
    /**
     * method_39491
     */
    fun forEachChunkSectionAround(pos: BlockPos?, consumer: LongConsumer?) = ChunkSectionPos.method_39491(pos, consumer)
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
    fun toLong(pos: BlockPos?) = ChunkSectionPos.method_33706(pos)
    /**
     * method_18679
     */
    fun offset(packed: Long, arg1: Direction?) = ChunkSectionPos.method_18679(packed, arg1)
    /**
     * method_20438
     */
    fun stream(minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = ChunkSectionPos.method_20438(minX, minY, minZ, maxX, maxY, maxZ)
    /**
     * method_32205
     */
    fun getOffsetPos(chunkCoord: Int, offset: Int) = ChunkSectionPos.method_32205(chunkCoord, offset)
}