package me.hellrevenger.generated.Map_ServerChunkLoadingManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_17213
 */
val ServerChunkLoadingManager.currentChunkHolders by alias(ServerChunkLoadingManager::field_17213)
/**
 * field_17220
 */
val ServerChunkLoadingManager.chunkHolders by alias(ServerChunkLoadingManager::field_17220)
/**
 * field_18807
 */
val ServerChunkLoadingManager.chunksToUnload by alias(ServerChunkLoadingManager::field_18807)
/**
 * method_23272
 */
fun ServerChunkLoadingManager.getChunkLoadingDebugInfo(chunkPos: ChunkPos?) = this.method_23272(chunkPos)
/**
 * method_53688
 */
fun ServerChunkLoadingManager.getPostProcessedChunk(pos: Long) = this.method_53688(pos)
/**
 * method_31417
 */
fun ServerChunkLoadingManager.makeChunkAccessible(holder: ChunkHolder?) = this.method_31417(holder)
/**
 * method_17260
 */
fun ServerChunkLoadingManager.getLoadedChunkCount() = this.method_17260()
/**
 * method_39992
 */
fun ServerChunkLoadingManager.shouldDelayShutdown() = this.method_39992()
/**
 * method_18702
 */
fun ServerChunkLoadingManager.sendToOtherNearbyPlayers(entity: Entity?, packet: Packet<*>?) = this.method_18702(entity, packet)
/**
 * method_18713
 */
fun ServerChunkLoadingManager.updatePosition(player: ServerPlayerEntity?) = this.method_18713(player)
/**
 * method_40067
 */
fun ServerChunkLoadingManager.crash(exception: IllegalStateException?, details: String?) = this.method_40067(exception, details)
/**
 * method_53685
 */
fun ServerChunkLoadingManager.forceLighting(centerPos: ChunkPos?, radius: Int) = this.method_53685(centerPos, radius)
/**
 * method_17253
 */
fun ServerChunkLoadingManager.getTotalChunksLoadedCount() = this.method_17253()
/**
 * method_37907
 */
fun ServerChunkLoadingManager.getPlayersWatchingChunk(pos: ChunkPos?) = this.method_37907(pos)
/**
 * method_37476
 */
fun ServerChunkLoadingManager.getSaveDir() = this.method_37476()
/**
 * method_17235
 */
fun ServerChunkLoadingManager.makeChunkTickable(holder: ChunkHolder?) = this.method_17235(holder)
/**
 * method_17247
 */
fun ServerChunkLoadingManager.makeChunkEntitiesTickable(holder: ChunkHolder?) = this.method_17247(holder)
/**
 * method_49421
 */
fun ServerChunkLoadingManager.sendChunkBiomePackets(chunks: MutableList<Chunk>?) = this.method_49421(chunks)
/**
 * method_17263
 */
fun ServerChunkLoadingManager.getTicketManager() = this.method_17263()
