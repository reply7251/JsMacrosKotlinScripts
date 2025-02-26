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
fun <T>ServerChunkManager.addTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17297<T>(arg0, arg1, arg2, arg3)
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
fun ServerChunkManager.applySimulationDistance(arg0: Int) = this.method_38634(arg0)
/**
 * method_18751
 */
fun ServerChunkManager.sendToNearbyPlayers(arg0: Entity, arg1: Packet<*>) = this.method_18751(arg0, arg1)
/**
 * method_17301
 */
fun ServerChunkManager.getTotalChunksLoadedCount() = this.method_17301()
/**
 * method_17299
 */
fun ServerChunkManager.getChunkFutureSyncOnMainThread(arg0: Int, arg1: Int, arg2: ChunkStatus, arg3: Boolean) = this.method_17299(arg0, arg1, arg2, arg3)
/**
 * method_18755
 */
fun ServerChunkManager.loadEntity(arg0: Entity) = this.method_18755(arg0)
/**
 * method_14096
 */
fun ServerChunkManager.updatePosition(arg0: ServerPlayerEntity) = this.method_14096(arg0)
/**
 * method_18754
 */
fun ServerChunkManager.sendToOtherNearbyPlayers(arg0: Entity, arg1: Packet<*>) = this.method_18754(arg0, arg1)
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
fun ServerChunkManager.markForUpdate(arg0: BlockPos) = this.method_14128(arg0)
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
fun ServerChunkManager.applyViewDistance(arg0: Int) = this.method_14144(arg0)
/**
 * method_23273
 */
fun ServerChunkManager.getChunkLoadingDebugInfo(arg0: ChunkPos) = this.method_23273(arg0)
/**
 * method_27908
 */
fun ServerChunkManager.getSpawnInfo() = this.method_27908()
/**
 * method_37114
 */
fun ServerChunkManager.isTickingFutureReady(arg0: Long) = this.method_37114(arg0)
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
fun ServerChunkManager.save(arg0: Boolean) = this.method_17298(arg0)
/**
 * method_17293
 */
fun ServerChunkManager.getLightingProvider() = this.method_17293()
/**
 * method_18753
 */
fun ServerChunkManager.unloadEntity(arg0: Entity) = this.method_18753(arg0)
/**
 * method_17300
 */
fun <T>ServerChunkManager.removeTicket(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_17300<T>(arg0, arg1, arg2, arg3)
