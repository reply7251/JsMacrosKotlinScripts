package me.hellrevenger.generated.Map_ServerWorld
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_13957
 */
var ServerWorld.savingDisabled by alias(ServerWorld::field_13957)
/**
 * method_20588
 */
fun ServerWorld.isNearOccupiedPointOfInterest(sectionPos: ChunkSectionPos) = this.method_20588(sectionPos)
/**
 * method_19503
 */
fun ServerWorld.hasRaidAt(pos: BlockPos) = this.method_19503(pos)
/**
 * method_23658
 */
fun ServerWorld.clearUpdatesInArea(box: BlockBox) = this.method_23658(box)
/**
 * method_33144
 */
fun ServerWorld.isSleepingEnabled() = this.method_33144()
/**
 * method_28125
 */
fun ServerWorld.isFlat() = this.method_28125()
/**
 * method_14178
 */
fun ServerWorld.getChunkManager() = this.method_14178()
/**
 * method_18215
 */
fun ServerWorld.onPlayerRespawned(player: ServerPlayerEntity) = this.method_18215(player)
/**
 * method_31424
 */
fun ServerWorld.getDragonPart(id: Int) = this.method_31424(id)
/**
 * method_19502
 */
fun ServerWorld.getRaidAt(pos: BlockPos) = this.method_19502(pos)
/**
 * method_29202
 */
fun ServerWorld.tickSpawners(spawnMonsters: Boolean, spawnAnimals: Boolean) = this.method_29202(spawnMonsters, spawnAnimals)
/**
 * method_31423
 */
fun ServerWorld.loadEntities(entities: Stream<Entity>) = this.method_31423(entities)
/**
 * method_19494
 */
fun ServerWorld.getPointOfInterestStorage() = this.method_19494()
/**
 * method_31268
 */
fun ServerWorld.getDebugString() = this.method_31268()
/**
 * method_42108
 */
fun ServerWorld.locateBiome(predicate: Predicate<RegistryEntry<Biome>>, pos: BlockPos, radius: Int, horizontalBlockCheckInterval: Int, verticalBlockCheckInterval: Int) = this.method_42108(predicate, pos, radius, horizontalBlockCheckInterval, verticalBlockCheckInterval)
/**
 * method_39223
 */
fun ServerWorld.disableTickSchedulers(chunk: WorldChunk) = this.method_39223(chunk)
/**
 * method_51837
 */
fun ServerWorld.setEnderDragonFight(enderDragonFight: EnderDragonFight) = this.method_51837(enderDragonFight)
/**
 * method_14177
 */
fun ServerWorld.isInBlockTick() = this.method_14177()
/**
 * method_65096
 */
fun <T>ServerWorld.spawnParticles(parameters: T, x: Double, arg2: Double, y: Double, arg4: Int, z: Double, arg6: Double, count: Double, offsetX: Double) where T: ParticleEffect = this.method_65096<T>(parameters, x, arg2, y, arg4, z, arg6, count, offsetX)
/**
 * method_17984
 */
fun ServerWorld.getForcedChunks() = this.method_17984()
/**
 * method_18766
 */
fun ServerWorld.getPlayers(predicate: Predicate<in ServerPlayerEntity>) = this.method_18766(predicate)
/**
 * method_31426
 */
fun ServerWorld.addEntities(entities: Stream<Entity>) = this.method_31426(entities)
/**
 * method_39778
 */
fun ServerWorld.cacheStructures(chunk: Chunk) = this.method_39778(chunk)
/**
 * method_37118
 */
fun ServerWorld.shouldTickEntity(pos: BlockPos) = this.method_37118(pos)
/**
 * method_18762
 */
fun ServerWorld.tickEntity(entity: Entity) = this.method_18762(entity)
/**
 * method_39998
 */
fun ServerWorld.shouldTick(pos: ChunkPos) = this.method_39998(pos)
/**
 * method_19496
 */
fun ServerWorld.handleInteraction(interaction: EntityInteraction, entity: Entity, observer: InteractionObserver) = this.method_19496(interaction, entity, observer)
/**
 * method_14191
 */
fun ServerWorld.sendToPlayerIfNearby(player: ServerPlayerEntity, force: Boolean, x: Double, arg3: Double, y: Double, arg5: Packet<*>) = this.method_14191(player, force, x, arg3, y, arg5)
/**
 * method_64577
 */
fun ServerWorld.getRecipeManager() = this.method_64577()
/**
 * method_14179
 */
fun ServerWorld.getFluidTickScheduler() = this.method_14179()
/**
 * method_14195
 */
fun ServerWorld.resetWeather() = this.method_14195()
/**
 * method_27056
 */
fun ServerWorld.getStructureAccessor() = this.method_27056()
/**
 * method_8554
 */
fun ServerWorld.setSpawnPos(pos: BlockPos, angle: Float) = this.method_8554(pos, angle)
/**
 * method_18779
 */
fun ServerWorld.getRandomAlivePlayer() = this.method_18779()
/**
 * method_17983
 */
fun ServerWorld.getPersistentStateManager() = this.method_17983()
/**
 * method_18764
 */
fun ServerWorld.unloadEntities(chunk: WorldChunk) = this.method_18764(chunk)
/**
 * method_18776
 */
fun ServerWorld.getAliveEnderDragons() = this.method_18776()
/**
 * method_19498
 */
fun ServerWorld.getOccupiedPointOfInterestDistance(pos: ChunkSectionPos) = this.method_19498(pos)
/**
 * method_32819
 */
fun ServerWorld.getLogicalHeight() = this.method_32819()
/**
 * method_18768
 */
fun ServerWorld.tryLoadEntity(entity: Entity) = this.method_18768(entity)
/**
 * method_17988
 */
fun ServerWorld.setChunkForced(x: Int, z: Int, forced: Boolean) = this.method_17988(x, z, forced)
/**
 * method_18769
 */
fun ServerWorld.onDimensionChanged(entity: Entity) = this.method_18769(entity)
/**
 * method_18765
 */
fun ServerWorld.tick(shouldKeepTicking: BooleanSupplier) = this.method_18765(shouldKeepTicking)
/**
 * method_27910
 */
fun ServerWorld.setWeather(clearDuration: Int, rainDuration: Int, raining: Boolean, thundering: Boolean) = this.method_27910(clearDuration, rainDuration, raining, thundering)
/**
 * method_27909
 */
fun ServerWorld.iterateEntities() = this.method_27909()
/**
 * method_14190
 */
fun ServerWorld.getEntity(uuid: UUID) = this.method_14190(uuid)
/**
 * method_19495
 */
fun ServerWorld.getRaidManager() = this.method_19495()
/**
 * method_18198
 */
fun <T>ServerWorld.getEntitiesByType(filter: TypeFilter<Entity, T>, predicate: Predicate<in T>) where T: Entity = this.method_18198<T>(filter, predicate)
/**
 * method_18203
 */
fun ServerWorld.tickChunk(chunk: WorldChunk, randomTickSpeed: Int) = this.method_18203(chunk, randomTickSpeed)
/**
 * method_52370
 */
fun ServerWorld.tickIceAndSnow(pos: BlockPos) = this.method_52370(pos)
/**
 * method_51836
 */
fun ServerWorld.getOrCreateRandom(id: Identifier) = this.method_51836(id)
/**
 * method_14197
 */
fun ServerWorld.resetIdleTimeout() = this.method_14197()
/**
 * method_14176
 */
fun ServerWorld.save(progressListener: ProgressListener, flush: Boolean, savingDisabled: Boolean) = this.method_14176(progressListener, flush, savingDisabled)
/**
 * method_30736
 */
fun ServerWorld.spawnNewEntityAndPassengers(entity: Entity) = this.method_30736(entity)
/**
 * method_29199
 */
fun ServerWorld.setTimeOfDay(timeOfDay: Long) = this.method_29199(timeOfDay)
/**
 * method_8487
 */
fun ServerWorld.locateStructure(structureTag: TagKey<Structure>, pos: BlockPos, radius: Int, skipReferencedStructures: Boolean) = this.method_8487(structureTag, pos, radius, skipReferencedStructures)
/**
 * method_18213
 */
fun ServerWorld.onPlayerConnected(player: ServerPlayerEntity) = this.method_18213(player)
/**
 * method_14196
 */
fun ServerWorld.getBlockTickScheduler() = this.method_14196()
/**
 * method_37116
 */
fun ServerWorld.isChunkLoaded(chunkPos: Long) = this.method_37116(chunkPos)
/**
 * method_14170
 */
fun ServerWorld.getScoreboard() = this.method_14170()
/**
 * method_57133
 */
fun ServerWorld.getPathNodeTypeCache() = this.method_57133()
/**
 * method_14173
 */
fun ServerWorld.getPortalForcer() = this.method_14173()
/**
 * method_29198
 */
fun ServerWorld.getEnderDragonFight() = this.method_29198()
/**
 * method_18770
 */
fun ServerWorld.removePlayer(player: ServerPlayerEntity, reason: net.minecraft.class_1297.class_5529) = this.method_18770(player, reason)
/**
 * method_64395
 */
fun ServerWorld.getGameRules() = this.method_64395()
/**
 * method_52168
 */
fun ServerWorld.getRandomSequences() = this.method_52168()
/**
 * method_21625
 */
fun ServerWorld.dump(path: file_Path) = this.method_21625(path)
/**
 * method_14183
 */
fun ServerWorld.getStructureTemplateManager() = this.method_14183()
/**
 * method_8448
 */
fun ServerWorld.updateSleepingPlayers() = this.method_8448()
