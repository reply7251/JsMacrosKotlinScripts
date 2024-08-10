package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkTicketManager

fun ChunkTicketManager.toDumpString() = this.method_21683()
fun ChunkTicketManager.update(arg0: ServerChunkLoadingManager) = this.method_15892(arg0)
fun ChunkTicketManager.handleChunkEnter(arg0: ChunkSectionPos, arg1: ServerPlayerEntity) = this.method_14048(arg0, arg1)
fun <T>ChunkTicketManager.addTicketWithLevel(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17290<T>(arg0, arg1, arg2, arg3)
fun ChunkTicketManager.shouldTickEntities(arg0: Long) = this.method_38630(arg0)
fun ChunkTicketManager.purge() = this.method_14045()
fun ChunkTicketManager.shouldTick(arg0: Long) = this.method_20800(arg0)
fun ChunkTicketManager.handleChunkLeave(arg0: ChunkSectionPos, arg1: ServerPlayerEntity) = this.method_14051(arg0, arg1)
fun ChunkTicketManager.setSimulationDistance(arg0: Int) = this.method_38629(arg0)
fun ChunkTicketManager.shouldDelayShutdown() = this.method_39996()
fun <T>ChunkTicketManager.removeTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17292<T>(arg0, arg1, arg2, arg3)
fun <T>ChunkTicketManager.removeTicketWithLevel(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_20444<T>(arg0, arg1, arg2, arg3)
fun ChunkTicketManager.shouldTickBlocks(arg0: Long) = this.method_38632(arg0)
fun ChunkTicketManager.getTickedChunkCount() = this.method_14052()
fun ChunkTicketManager.removePersistentTickets() = this.method_39995()
fun <T>ChunkTicketManager.addTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17291<T>(arg0, arg1, arg2, arg3)
