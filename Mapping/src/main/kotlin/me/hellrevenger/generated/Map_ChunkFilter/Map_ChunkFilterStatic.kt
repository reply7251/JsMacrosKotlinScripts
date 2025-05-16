package me.hellrevenger.generated.Map_ChunkFilter
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkFilterKt {
    /**
     * method_52357
     */
    fun isWithinDistanceExcludingEdge(centerX: Int, centerZ: Int, viewDistance: Int, x: Int, z: Int) = ChunkFilter.method_52357(centerX, centerZ, viewDistance, x, z)
    /**
     * method_52360
     */
    fun forEachChangedChunk(oldFilter: ChunkFilter?, newFilter: ChunkFilter?, newlyIncluded: Consumer<ChunkPos>?, justRemoved: Consumer<ChunkPos>?) = ChunkFilter.method_52360(oldFilter, newFilter, newlyIncluded, justRemoved)
    /**
     * method_52362
     */
    fun cylindrical(center: ChunkPos?, viewDistance: Int) = ChunkFilter.method_52362(center, viewDistance)
    /**
     * method_52358
     */
    fun isWithinDistance(centerX: Int, centerZ: Int, viewDistance: Int, x: Int, z: Int, includeEdge: Boolean) = ChunkFilter.method_52358(centerX, centerZ, viewDistance, x, z, includeEdge)
}