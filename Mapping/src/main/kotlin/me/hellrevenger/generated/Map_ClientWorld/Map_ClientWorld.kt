package me.hellrevenger.generated.Map_ClientWorld
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_23785
 */
fun ClientWorld.getCloudsColor(tickDelta: Float) = this.method_23785(tickDelta)
/**
 * method_65192
 */
fun ClientWorld.getEnderDragonParts() = this.method_65192()
/**
 * method_8441
 */
fun ClientWorld.tick(shouldKeepTicking: BooleanSupplier) = this.method_8441(shouldKeepTicking)
/**
 * method_18110
 */
fun ClientWorld.unloadBlockEntities(chunk: WorldChunk) = this.method_18110(chunk)
/**
 * method_38534
 */
fun ClientWorld.runQueuedChunkUpdates() = this.method_38534()
/**
 * method_18646
 */
fun ClientWorld.tickEntity(entity: Entity) = this.method_18646(entity)
/**
 * method_23782
 */
fun ClientWorld.resetChunkColor(chunkPos: ChunkPos) = this.method_23782(chunkPos)
/**
 * method_18116
 */
fun ClientWorld.tickEntities() = this.method_18116()
/**
 * method_2941
 */
fun ClientWorld.doRandomBlockDisplayTicks(centerX: Int, centerY: Int, centerZ: Int) = this.method_2941(centerX, centerY, centerZ)
/**
 * method_27873
 */
fun ClientWorld.setSpawnPos(pos: BlockPos, angle: Float) = this.method_27873(pos, angle)
/**
 * method_62145
 */
fun ClientWorld.hasEntity(entity: Entity) = this.method_62145(entity)
/**
 * method_23777
 */
fun ClientWorld.getSkyColor(cameraPos: Vec3d, tickDelta: Float) = this.method_23777(cameraPos, tickDelta)
/**
 * method_18112
 */
fun ClientWorld.getEntities() = this.method_18112()
/**
 * method_41928
 */
fun ClientWorld.handleBlockUpdate(pos: BlockPos, state: BlockState, flags: Int) = this.method_41928(pos, state, flags)
/**
 * method_47437
 */
fun ClientWorld.putClientsideMapState(id: MapIdComponent, state: MapState) = this.method_47437(id, state)
/**
 * method_62146
 */
fun ClientWorld.scheduleChunkRenders(minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = this.method_62146(minX, minY, minZ, maxX, maxY, maxZ)
/**
 * method_2945
 */
fun ClientWorld.removeEntity(entityId: Int, removalReason: net.minecraft.class_1297.class_5529) = this.method_2945(entityId, removalReason)
/**
 * method_23783
 */
fun ClientWorld.getSkyBrightness(tickDelta: Float) = this.method_23783(tickDelta)
/**
 * method_23787
 */
fun ClientWorld.getStarBrightness(tickDelta: Float) = this.method_23787(tickDelta)
/**
 * method_53875
 */
fun ClientWorld.addEntity(entity: Entity) = this.method_53875(entity)
/**
 * method_18113
 */
fun ClientWorld.scheduleBlockRenders(x: Int, y: Int, z: Int) = this.method_18113(x, y, z)
/**
 * method_39024
 */
fun ClientWorld.getSimulationDistance() = this.method_39024()
/**
 * method_2935
 */
fun ClientWorld.getChunkManager() = this.method_2935()
/**
 * method_39023
 */
fun ClientWorld.setSimulationDistance(simulationDistance: Int) = this.method_39023(simulationDistance)
/**
 * method_41926
 */
fun ClientWorld.processPendingUpdate(pos: BlockPos, state: BlockState, playerPos: Vec3d) = this.method_41926(pos, state, playerPos)
/**
 * method_23789
 */
fun ClientWorld.getLightningTicksLeft() = this.method_23789()
/**
 * method_29089
 */
fun ClientWorld.setTime(time: Long, arg1: Long, timeOfDay: Boolean) = this.method_29089(time, arg1, timeOfDay)
/**
 * method_18120
 */
fun ClientWorld.getRegularEntityCount() = this.method_18120()
/**
 * method_62895
 */
fun ClientWorld.onChunkUnload(sectionPos: Long) = this.method_62895(sectionPos)
/**
 * method_2943
 */
fun ClientWorld.randomBlockDisplayTick(centerX: Int, centerY: Int, centerZ: Int, radius: Int, random: Random, block: Block, pos: net.minecraft.class_2338.class_2339) = this.method_2943(centerX, centerY, centerZ, radius, random, block, pos)
/**
 * method_23784
 */
fun ClientWorld.reloadColor() = this.method_23784()
/**
 * method_28104
 */
fun ClientWorld.getLevelProperties() = this.method_28104()
/**
 * method_41927
 */
fun ClientWorld.handlePlayerActionResponse(sequence: Int) = this.method_41927(sequence)
/**
 * method_28103
 */
fun ClientWorld.getDimensionEffects() = this.method_28103()
/**
 * method_38536
 */
fun ClientWorld.enqueueChunkUpdate(updater: Runnable) = this.method_38536(updater)
/**
 * method_23780
 */
fun ClientWorld.calculateColor(pos: BlockPos, colorResolver: ColorResolver) = this.method_23780(pos, colorResolver)
