package me.hellrevenger.generated.Map_ServerChunkManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_17254
 */
val ServerChunkManager.chunkLoadingManager by alias(ServerChunkManager::field_17254)
/**
 * method_17297
 */
fun <T>ServerChunkManager.addTicket(ticketType: ChunkTicketType<T>, pos: ChunkPos, radius: Int, argument: T) = this.method_17297<T>(ticketType, pos, radius, argument)
/**
 * method_39997
 */
fun ServerChunkManager.removePersistentTickets() = this.method_39997()
/**
 * method_41248
 */
fun ServerChunkManager.getNoiseConfig() = this.method_41248()
/**
 * method_21694
 */
fun ServerChunkManager.getPendingTasks() = this.method_21694()
/**
 * method_38634
 */
fun ServerChunkManager.applySimulationDistance(simulationDistance: Int) = this.method_38634(simulationDistance)
/**
 * method_18751
 */
fun ServerChunkManager.sendToNearbyPlayers(entity: Entity, packet: Packet<*>) = this.method_18751(entity, packet)
/**
 * method_17301
 */
fun ServerChunkManager.getTotalChunksLoadedCount() = this.method_17301()
/**
 * method_17299
 */
fun ServerChunkManager.getChunkFutureSyncOnMainThread(chunkX: Int, chunkZ: Int, leastStatus: ChunkStatus, create: Boolean) = this.method_17299(chunkX, chunkZ, leastStatus, create)
/**
 * method_18755
 */
fun ServerChunkManager.loadEntity(entity: Entity) = this.method_18755(entity)
/**
 * method_14096
 */
fun ServerChunkManager.updatePosition(player: ServerPlayerEntity) = this.method_14096(player)
/**
 * method_18754
 */
fun ServerChunkManager.sendToOtherNearbyPlayers(entity: Entity, packet: Packet<*>) = this.method_18754(entity, packet)
/**
 * method_17981
 */
fun ServerChunkManager.getPersistentStateManager() = this.method_17981()
/**
 * method_46642
 */
fun ServerChunkManager.getStructurePlacementCalculator() = this.method_46642()
/**
 * method_14128
 */
fun ServerChunkManager.markForUpdate(pos: BlockPos) = this.method_14128(pos)
/**
 * method_19492
 */
fun ServerChunkManager.executeQueuedTasks() = this.method_19492()
/**
 * method_19493
 */
fun ServerChunkManager.getPointOfInterestStorage() = this.method_19493()
/**
 * method_39777
 */
fun ServerChunkManager.getChunkIoWorker() = this.method_39777()
/**
 * method_14144
 */
fun ServerChunkManager.applyViewDistance(watchDistance: Int) = this.method_14144(watchDistance)
/**
 * method_23273
 */
fun ServerChunkManager.getChunkLoadingDebugInfo(pos: ChunkPos) = this.method_23273(pos)
/**
 * method_27908
 */
fun ServerChunkManager.getSpawnInfo() = this.method_27908()
/**
 * method_37114
 */
fun ServerChunkManager.isTickingFutureReady(pos: Long) = this.method_37114(pos)
/**
 * method_16434
 */
fun ServerChunkManager.getWorld() = this.method_16434()
/**
 * method_12129
 */
fun ServerChunkManager.getChunkGenerator() = this.method_12129()
/**
 * method_17298
 */
fun ServerChunkManager.save(flush: Boolean) = this.method_17298(flush)
/**
 * method_17293
 */
fun ServerChunkManager.getLightingProvider() = this.method_17293()
/**
 * method_18753
 */
fun ServerChunkManager.unloadEntity(entity: Entity) = this.method_18753(entity)
/**
 * method_65078
 */
fun ServerChunkManager.markForUpdate(chunkHolder: ChunkHolder) = this.method_65078(chunkHolder)
/**
 * method_17300
 */
fun <T>ServerChunkManager.removeTicket(ticketType: ChunkTicketType<T>, pos: ChunkPos, radius: Int, argument: T) = this.method_17300<T>(ticketType, pos, radius, argument)
