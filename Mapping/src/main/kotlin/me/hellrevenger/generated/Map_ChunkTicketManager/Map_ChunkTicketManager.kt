package me.hellrevenger.generated.Map_ChunkTicketManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_21683
 */
fun ChunkTicketManager.toDumpString() = this.method_21683()
/**
 * method_15892
 */
fun ChunkTicketManager.update(arg0: ServerChunkLoadingManager) = this.method_15892(arg0)
/**
 * method_14048
 */
fun ChunkTicketManager.handleChunkEnter(arg0: ChunkSectionPos, arg1: ServerPlayerEntity) = this.method_14048(arg0, arg1)
/**
 * method_17290
 */
fun <T>ChunkTicketManager.addTicketWithLevel(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17290<T>(arg0, arg1, arg2, arg3)
/**
 * method_38630
 */
fun ChunkTicketManager.shouldTickEntities(arg0: Long) = this.method_38630(arg0)
/**
 * method_20800
 */
fun ChunkTicketManager.shouldTick(arg0: Long) = this.method_20800(arg0)
/**
 * method_14051
 */
fun ChunkTicketManager.handleChunkLeave(arg0: ChunkSectionPos, arg1: ServerPlayerEntity) = this.method_14051(arg0, arg1)
/**
 * method_38629
 */
fun ChunkTicketManager.setSimulationDistance(arg0: Int) = this.method_38629(arg0)
/**
 * method_39996
 */
fun ChunkTicketManager.shouldDelayShutdown() = this.method_39996()
/**
 * method_17292
 */
fun <T>ChunkTicketManager.removeTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17292<T>(arg0, arg1, arg2, arg3)
/**
 * method_20444
 */
fun <T>ChunkTicketManager.removeTicketWithLevel(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_20444<T>(arg0, arg1, arg2, arg3)
/**
 * method_38632
 */
fun ChunkTicketManager.shouldTickBlocks(arg0: Long) = this.method_38632(arg0)
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
fun <T>ChunkTicketManager.addTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17291<T>(arg0, arg1, arg2, arg3)
