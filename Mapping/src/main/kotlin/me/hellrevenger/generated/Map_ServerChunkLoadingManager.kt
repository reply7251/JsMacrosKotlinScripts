package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerChunkLoadingManager

val ServerChunkLoadingManager.DEFAULT_VIEW_DISTANCE by aliasStatic(ServerChunkLoadingManager::field_29675)
val ServerChunkLoadingManager.currentChunkHolders by alias(ServerChunkLoadingManager::field_17213)
val ServerChunkLoadingManager.chunkHolders by alias(ServerChunkLoadingManager::field_17220)
val ServerChunkLoadingManager.chunksToUnload by alias(ServerChunkLoadingManager::field_18807)
fun ServerChunkLoadingManager.getChunkLoadingDebugInfo(arg0: ChunkPos) = this.method_23272(arg0)
fun ServerChunkLoadingManager.getPostProcessedChunk(arg0: Long) = this.method_53688(arg0)
fun ServerChunkLoadingManager.makeChunkAccessible(arg0: ChunkHolder) = this.method_31417(arg0)
fun ServerChunkLoadingManager.getLoadedChunkCount() = this.method_17260()
fun ServerChunkLoadingManager.shouldDelayShutdown() = this.method_39992()
fun ServerChunkLoadingManager.sendToOtherNearbyPlayers(arg0: Entity, arg1: Packet<*>) = this.method_18702(arg0, arg1)
fun ServerChunkLoadingManager.updatePosition(arg0: ServerPlayerEntity) = this.method_18713(arg0)
fun ServerChunkLoadingManager.crash(arg0: IllegalStateException, arg1: String) = this.method_40067(arg0, arg1)
fun ServerChunkLoadingManager.forceLighting(arg0: ChunkPos, arg1: Int) = this.method_53685(arg0, arg1)
fun ServerChunkLoadingManager.getPlayersWatchingChunk(arg0: ChunkPos) = this.method_37907(arg0)
fun ServerChunkLoadingManager.makeChunkTickable(arg0: ChunkHolder) = this.method_17235(arg0)
fun ServerChunkLoadingManager.makeChunkEntitiesTickable(arg0: ChunkHolder) = this.method_17247(arg0)
fun ServerChunkLoadingManager.sendChunkBiomePackets(arg0: List<Chunk>) = this.method_49421(arg0)
