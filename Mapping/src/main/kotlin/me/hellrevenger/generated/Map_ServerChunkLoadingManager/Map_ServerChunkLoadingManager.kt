package me.hellrevenger.generated.Map_ServerChunkLoadingManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_29675
 */
val KClass<ServerChunkLoadingManager>.DEFAULT_VIEW_DISTANCE by aliasStatic(ServerChunkLoadingManager::field_29675)
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
fun ServerChunkLoadingManager.getChunkLoadingDebugInfo(arg0: ChunkPos) = this.method_23272(arg0)
/**
 * method_53688
 */
fun ServerChunkLoadingManager.getPostProcessedChunk(arg0: Long) = this.method_53688(arg0)
/**
 * method_31417
 */
fun ServerChunkLoadingManager.makeChunkAccessible(arg0: ChunkHolder) = this.method_31417(arg0)
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
fun ServerChunkLoadingManager.sendToOtherNearbyPlayers(arg0: Entity, arg1: Packet<*>) = this.method_18702(arg0, arg1)
/**
 * method_18713
 */
fun ServerChunkLoadingManager.updatePosition(arg0: ServerPlayerEntity) = this.method_18713(arg0)
/**
 * method_40067
 */
fun ServerChunkLoadingManager.crash(arg0: IllegalStateException, arg1: String) = this.method_40067(arg0, arg1)
/**
 * method_53685
 */
fun ServerChunkLoadingManager.forceLighting(arg0: ChunkPos, arg1: Int) = this.method_53685(arg0, arg1)
/**
 * method_17253
 */
fun ServerChunkLoadingManager.getTotalChunksLoadedCount() = this.method_17253()
/**
 * method_37907
 */
fun ServerChunkLoadingManager.getPlayersWatchingChunk(arg0: ChunkPos) = this.method_37907(arg0)
/**
 * method_37476
 */
fun ServerChunkLoadingManager.getSaveDir() = this.method_37476()
/**
 * method_17235
 */
fun ServerChunkLoadingManager.makeChunkTickable(arg0: ChunkHolder) = this.method_17235(arg0)
/**
 * method_17247
 */
fun ServerChunkLoadingManager.makeChunkEntitiesTickable(arg0: ChunkHolder) = this.method_17247(arg0)
/**
 * method_49421
 */
fun ServerChunkLoadingManager.sendChunkBiomePackets(arg0: MutableList<Chunk>) = this.method_49421(arg0)
/**
 * method_17263
 */
fun ServerChunkLoadingManager.getTicketManager() = this.method_17263()
