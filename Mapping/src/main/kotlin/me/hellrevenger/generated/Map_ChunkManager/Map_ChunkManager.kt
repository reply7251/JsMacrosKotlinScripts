package me.hellrevenger.generated.Map_ChunkManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_12126
 */
fun ChunkManager.getWorldChunk(chunkX: Int, chunkZ: Int, create: Boolean) = this.method_12126(chunkX, chunkZ, create)
/**
 * method_14151
 */
fun ChunkManager.getLoadedChunkCount() = this.method_14151()
/**
 * method_12130
 */
fun ChunkManager.getLightingProvider() = this.method_12130()
/**
 * method_62872
 */
fun ChunkManager.onSectionStatusChanged(x: Int, sectionY: Int, z: Int, previouslyEmpty: Boolean) = this.method_62872(x, sectionY, z, previouslyEmpty)
/**
 * method_12122
 */
fun ChunkManager.getDebugString() = this.method_12122()
/**
 * method_12124
 */
fun ChunkManager.setChunkForced(pos: ChunkPos?, forced: Boolean) = this.method_12124(pos, forced)
/**
 * method_21730
 */
fun ChunkManager.getWorldChunk(chunkX: Int, chunkZ: Int) = this.method_21730(chunkX, chunkZ)
/**
 * method_12128
 */
fun ChunkManager.setMobSpawnOptions(spawnMonsters: Boolean) = this.method_12128(spawnMonsters)
/**
 * method_12121
 */
fun ChunkManager.getChunk(x: Int, z: Int, leastStatus: ChunkStatus?, create: Boolean) = this.method_12121(x, z, leastStatus, create)
/**
 * method_12123
 */
fun ChunkManager.isChunkLoaded(x: Int, z: Int) = this.method_12123(x, z)
/**
 * method_12127
 */
fun ChunkManager.tick(shouldKeepTicking: BooleanSupplier?, tickChunks: Boolean) = this.method_12127(shouldKeepTicking, tickChunks)
