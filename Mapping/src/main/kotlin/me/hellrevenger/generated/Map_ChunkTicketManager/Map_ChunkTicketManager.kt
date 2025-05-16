package me.hellrevenger.generated.Map_ChunkTicketManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61262
 */
fun ChunkTicketManager.iterateChunkPosToTick() = this.method_61262()
/**
 * method_21683
 */
fun ChunkTicketManager.toDumpString() = this.method_21683()
/**
 * method_15892
 */
fun ChunkTicketManager.update(chunkLoadingManager: ServerChunkLoadingManager?) = this.method_15892(chunkLoadingManager)
/**
 * method_14048
 */
fun ChunkTicketManager.handleChunkEnter(pos: ChunkSectionPos?, player: ServerPlayerEntity?) = this.method_14048(pos, player)
/**
 * method_17290
 */
fun <T>ChunkTicketManager.addTicketWithLevel(type: ChunkTicketType<T>?, pos: ChunkPos?, level: Int, argument: T) = this.method_17290<T>(type, pos, level, argument)
/**
 * method_38630
 */
fun ChunkTicketManager.shouldTickEntities(chunkPos: Long) = this.method_38630(chunkPos)
/**
 * method_61263
 */
fun ChunkTicketManager.getChunks() = this.method_61263()
/**
 * method_20800
 */
fun ChunkTicketManager.shouldTick(chunkPos: Long) = this.method_20800(chunkPos)
/**
 * method_14051
 */
fun ChunkTicketManager.handleChunkLeave(pos: ChunkSectionPos?, player: ServerPlayerEntity?) = this.method_14051(pos, player)
/**
 * method_38629
 */
fun ChunkTicketManager.setSimulationDistance(simulationDistance: Int) = this.method_38629(simulationDistance)
/**
 * method_39996
 */
fun ChunkTicketManager.shouldDelayShutdown() = this.method_39996()
/**
 * method_17292
 */
fun <T>ChunkTicketManager.removeTicket(type: ChunkTicketType<T>?, pos: ChunkPos?, radius: Int, argument: T) = this.method_17292<T>(type, pos, radius, argument)
/**
 * method_20444
 */
fun <T>ChunkTicketManager.removeTicketWithLevel(type: ChunkTicketType<T>?, pos: ChunkPos?, level: Int, argument: T) = this.method_20444<T>(type, pos, level, argument)
/**
 * method_38632
 */
fun ChunkTicketManager.shouldTickBlocks(chunkPos: Long) = this.method_38632(chunkPos)
/**
 * method_14052
 */
fun ChunkTicketManager.getTickedChunkCount() = this.method_14052()
/**
 * method_39995
 */
fun ChunkTicketManager.removePersistentTickets() = this.method_39995()
/**
 * method_17291
 */
fun <T>ChunkTicketManager.addTicket(type: ChunkTicketType<T>?, pos: ChunkPos?, radius: Int, argument: T) = this.method_17291<T>(type, pos, radius, argument)
