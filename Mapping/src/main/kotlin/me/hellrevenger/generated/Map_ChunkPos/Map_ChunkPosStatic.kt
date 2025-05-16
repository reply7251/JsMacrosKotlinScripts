package me.hellrevenger.generated.Map_ChunkPos
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkPosKt {
    /**
     * field_35107
     */
    val ORIGIN by aliasStatic(ChunkPos::field_35107)
    /**
     * field_54975
     */
    val MAX_COORDINATE by aliasStatic(ChunkPos::field_54975)
    /**
     * field_17348
     */
    val MARKER by aliasStatic(ChunkPos::field_17348)
    /**
     * method_42307
     */
    fun hashCode(x: Int, z: Int) = ChunkPos.method_42307(x, z)
    /**
     * method_42306
     */
    fun fromRegionCenter(x: Int, z: Int) = ChunkPos.method_42306(x, z)
    /**
     * method_8331
     */
    fun toLong(chunkX: Int, chunkZ: Int) = ChunkPos.method_8331(chunkX, chunkZ)
    /**
     * method_8325
     */
    fun getPackedX(pos: Long) = ChunkPos.method_8325(pos)
    /**
     * method_42305
     */
    fun fromRegion(x: Int, z: Int) = ChunkPos.method_42305(x, z)
    /**
     * method_19281
     */
    fun stream(pos1: ChunkPos?, pos2: ChunkPos?) = ChunkPos.method_19281(pos1, pos2)
    /**
     * method_37232
     */
    fun toLong(pos: BlockPos?) = ChunkPos.method_37232(pos)
    /**
     * method_8332
     */
    fun getPackedZ(pos: Long) = ChunkPos.method_8332(pos)
    /**
     * method_19280
     */
    fun stream(center: ChunkPos?, radius: Int) = ChunkPos.method_19280(center, radius)
}