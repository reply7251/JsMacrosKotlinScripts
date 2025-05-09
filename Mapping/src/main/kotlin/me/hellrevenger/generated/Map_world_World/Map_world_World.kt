package me.hellrevenger.generated.Map_world_World
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_27082
 */
var world_World.blockEntityTickers by alias(world_World::field_27082)
/**
 * field_9229
 */
var world_World.random by alias(world_World::field_9229)
/**
 * field_9236
 */
val world_World.isClient by alias(world_World::field_9236)
/**
 * method_8520
 */
fun world_World.hasRain(pos: BlockPos) = this.method_8520(pos)
/**
 * method_48963
 */
fun world_World.getDamageSources() = this.method_48963()
/**
 * method_8544
 */
fun world_World.removeBlockEntity(pos: BlockPos) = this.method_8544(pos)
/**
 * method_43127
 */
fun world_World.getSpawnAngle() = this.method_43127()
/**
 * method_8508
 */
fun world_World.updateNeighborsExcept(pos: BlockPos, sourceBlock: Block, direction: Direction, orientation: WireOrientation) = this.method_8508(pos, sourceBlock, direction, orientation)
/**
 * method_8530
 */
fun world_World.isDay() = this.method_8530()
/**
 * method_40134
 */
fun world_World.getDimensionEntry() = this.method_40134()
/**
 * method_38989
 */
fun world_World.shouldUpdatePostDeath(entity: Entity) = this.method_38989(entity)
/**
 * method_41410
 */
fun world_World.updateNeighbor(state: BlockState, pos: BlockPos, sourceBlock: Block, orientation: WireOrientation, notify: Boolean) = this.method_41410(state, pos, sourceBlock, orientation, notify)
/**
 * method_8496
 */
fun world_World.setThunderGradient(thunderGradient: Float) = this.method_8496(thunderGradient)
/**
 * method_61271
 */
fun world_World.updateNeighborsAlways(pos: BlockPos, block: Block) = this.method_61271(pos, block)
/**
 * method_8413
 */
fun world_World.updateListeners(pos: BlockPos, oldState: BlockState, newState: BlockState, flags: Int) = this.method_8413(pos, oldState, newState, flags)
/**
 * method_8424
 */
fun world_World.setMobSpawnOptions(spawnMonsters: Boolean) = this.method_8424(spawnMonsters)
/**
 * method_8522
 */
fun world_World.sendPacket(packet: Packet<*>) = this.method_8522(packet)
/**
 * method_17890
 */
fun world_World.putMapState(id: MapIdComponent, state: MapState) = this.method_17890(id, state)
/**
 * method_43129
 */
fun world_World.playSoundFromEntity(source: PlayerEntity, entity: Entity, sound: SoundEvent, category: SoundCategory, volume: Float, pitch: Float) = this.method_43129(source, entity, sound, category, volume, pitch)
/**
 * method_8477
 */
fun world_World.isPosLoaded(pos: BlockPos) = this.method_8477(pos)
/**
 * method_8525
 */
fun world_World.disconnect() = this.method_8525()
/**
 * method_31592
 */
fun world_World.getEntityLookup() = this.method_31592()
/**
 * method_45446
 */
fun world_World.playSoundAtBlockCenter(pos: BlockPos, sound: SoundEvent, category: SoundCategory, volume: Float, pitch: Float, useDistance: Boolean) = this.method_45446(pos, sound, category, volume, pitch, useDistance)
/**
 * method_24368
 */
fun world_World.isDirectionSolid(pos: BlockPos, entity: Entity, direction: Direction) = this.method_24368(pos, entity, direction)
/**
 * method_55116
 */
fun world_World.playSoundFromEntity(entity: Entity, sound: SoundEvent, category: SoundCategory, volume: Float, pitch: Float) = this.method_55116(entity, sound, category, volume, pitch)
/**
 * method_59547
 */
fun world_World.getBrewingRecipeRegistry() = this.method_59547()
/**
 * method_8469
 */
fun world_World.getEntityById(id: Int) = this.method_8469(id)
/**
 * method_31419
 */
fun world_World.asString() = this.method_31419()
/**
 * method_8421
 */
fun world_World.sendEntityStatus(entity: Entity, status: Byte) = this.method_8421(entity, status)
/**
 * method_17891
 */
fun world_World.getMapState(id: MapIdComponent) = this.method_17891(id)
/**
 * method_24794
 */
fun world_World.isInBuildLimit(pos: BlockPos) = this.method_24794(pos)
/**
 * method_61269
 */
fun world_World.getFuelRegistry() = this.method_61269()
/**
 * method_8486
 */
fun world_World.playSound(x: Double, arg1: Double, y: Double, arg3: SoundEvent, z: SoundCategory, arg5: Float, sound: Float, category: Boolean) = this.method_8486(x, arg1, y, arg3, z, arg5, sound, category)
/**
 * method_8519
 */
fun world_World.setRainGradient(rainGradient: Float) = this.method_8519(rainGradient)
/**
 * method_8442
 */
fun world_World.getSkyAngleRadians(tickDelta: Float) = this.method_8442(tickDelta)
/**
 * method_8430
 */
fun world_World.getRainGradient(delta: Float) = this.method_8430(delta)
/**
 * method_8478
 */
fun world_World.getThunderGradient(delta: Float) = this.method_8478(delta)
/**
 * method_43128
 */
fun world_World.playSound(source: PlayerEntity, x: Double, arg2: Double, y: Double, arg4: SoundEvent, z: SoundCategory, arg6: Float, sound: Float) = this.method_43128(source, x, arg2, y, arg4, z, arg6, sound)
/**
 * method_8428
 */
fun world_World.getScoreboard() = this.method_8428()
/**
 * method_8536
 */
fun world_World.getRandomPosInChunk(arg0: Int, x: Int, y: Int, z: Int) = this.method_8536(arg0, x, y, z)
/**
 * method_8454
 */
fun world_World.createExplosion(entity: Entity, damageSource: DamageSource, behavior: ExplosionBehavior, x: Double, arg4: Double, y: Double, arg6: Float, z: Boolean, arg8: net.minecraft.class_1937.class_7867, power: ParticleEffect, createFire: ParticleEffect, explosionSourceType: RegistryEntry<SoundEvent>) = this.method_8454(entity, damageSource, behavior, x, arg4, y, arg6, z, arg8, power, createFire, explosionSourceType)
/**
 * method_31595
 */
fun world_World.addBlockBreakParticles(pos: BlockPos, state: BlockState) = this.method_31595(pos, state)
/**
 * method_47967
 */
fun world_World.playSound(source: PlayerEntity, x: Double, arg2: Double, y: Double, arg4: SoundEvent, z: SoundCategory, arg6: Float, sound: Float, category: Long) = this.method_47967(source, x, arg2, y, arg4, z, arg6, sound, category)
/**
 * method_8437
 */
fun world_World.createExplosion(entity: Entity, x: Double, arg2: Double, y: Double, arg4: Float, z: net.minecraft.class_1937.class_7867) = this.method_8437(entity, x, arg2, y, arg4, z)
/**
 * method_8427
 */
fun world_World.addSyncedBlockEvent(pos: BlockPos, block: Block, type: Int, data: Int) = this.method_8427(pos, block, type, data)
/**
 * method_8466
 */
fun world_World.addParticle(parameters: ParticleEffect, force: Boolean, canSpawnOnMinimal: Boolean, x: Double, arg4: Double, y: Double, arg6: Double, z: Double, arg8: Double) = this.method_8466(parameters, force, canSpawnOnMinimal, x, arg4, y, arg6, z, arg8)
/**
 * method_8501
 */
fun world_World.setBlockState(pos: BlockPos, state: BlockState) = this.method_8501(pos, state)
/**
 * method_17889
 */
fun world_World.increaseAndGetMapId() = this.method_17889()
/**
 * method_8517
 */
fun world_World.setBlockBreakingInfo(entityId: Int, pos: BlockPos, progress: Int) = this.method_8517(entityId, pos, progress)
/**
 * method_8524
 */
fun world_World.markDirty(pos: BlockPos) = this.method_8524(pos)
/**
 * method_19282
 */
fun world_World.onBlockChanged(pos: BlockPos, oldBlock: BlockState, newBlock: BlockState) = this.method_19282(pos, oldBlock, newBlock)
/**
 * method_16109
 */
fun world_World.scheduleBlockRerenderIfNeeded(pos: BlockPos, old: BlockState, updated: BlockState) = this.method_16109(pos, old, updated)
/**
 * method_8465
 */
fun world_World.playSound(source: PlayerEntity, x: Double, arg2: Double, y: Double, arg4: RegistryEntry<SoundEvent>, z: SoundCategory, arg6: Float, sound: Float, category: Long) = this.method_8465(source, x, arg2, y, arg4, z, arg6, sound, category)
/**
 * method_60511
 */
fun world_World.playSound(source: PlayerEntity, x: Double, arg2: Double, y: Double, arg4: RegistryEntry<SoundEvent>, z: SoundCategory, arg6: Float, sound: Float) = this.method_60511(source, x, arg2, y, arg4, z, arg6, sound)
/**
 * method_8546
 */
fun world_World.isThundering() = this.method_8546()
/**
 * method_55117
 */
fun world_World.createExplosion(entity: Entity, damageSource: DamageSource, behavior: ExplosionBehavior, x: Double, arg4: Double, y: Double, arg6: Float, z: Boolean, arg8: net.minecraft.class_1937.class_7867) = this.method_55117(entity, damageSource, behavior, x, arg4, y, arg6, z, arg8)
/**
 * method_54762
 */
fun world_World.playSound(source: PlayerEntity, x: Double, arg2: Double, y: Double, arg4: SoundEvent, z: SoundCategory) = this.method_54762(source, x, arg2, y, arg4, z)
/**
 * method_8510
 */
fun world_World.getTime() = this.method_8510()
/**
 * method_8547
 */
fun world_World.addFireworkParticle(x: Double, arg1: Double, y: Double, arg3: Double, z: Double, arg5: Double, velocityX: MutableList<FireworkExplosionComponent>) = this.method_8547(x, arg1, y, arg3, z, arg5, velocityX)
/**
 * method_45445
 */
fun world_World.playSound(source: Entity, pos: BlockPos, sound: SoundEvent, category: SoundCategory, volume: Float, pitch: Float) = this.method_45445(source, pos, sound, category, volume, pitch)
/**
 * method_65097
 */
fun world_World.getEnderDragonParts() = this.method_65097()
/**
 * method_8474
 */
fun world_World.syncGlobalEvent(eventId: Int, pos: BlockPos, data: Int) = this.method_8474(eventId, pos, data)
/**
 * method_31594
 */
fun world_World.addBlockEntityTicker(ticker: BlockEntityTickInvoker) = this.method_31594(ticker)
/**
 * method_8533
 */
fun world_World.calculateAmbientDarkness() = this.method_8533()
/**
 * method_8433
 */
fun world_World.getRecipeManager() = this.method_8433()
/**
 * method_8497
 */
fun world_World.getChunk(arg0: Int, arg1: Int) = this.method_8497(arg0, arg1)
/**
 * method_8505
 */
fun world_World.canPlayerModifyAt(player: PlayerEntity, pos: BlockPos) = this.method_8505(player, pos)
/**
 * method_8492
 */
fun world_World.updateNeighbor(pos: BlockPos, sourceBlock: Block, orientation: WireOrientation) = this.method_8492(pos, sourceBlock, orientation)
/**
 * method_17452
 */
fun world_World.addImportantParticle(parameters: ParticleEffect, force: Boolean, x: Double, arg3: Double, y: Double, arg5: Double, z: Double, arg7: Double) = this.method_17452(parameters, force, x, arg3, y, arg5, z, arg7)
/**
 * method_8449
 */
fun world_World.playSoundFromEntity(source: PlayerEntity, entity: Entity, sound: RegistryEntry<SoundEvent>, category: SoundCategory, volume: Float, pitch: Float, seed: Long) = this.method_8449(source, entity, sound, category, volume, pitch, seed)
/**
 * method_18472
 */
fun <T>world_World.tickEntity(tickConsumer: Consumer<T>, entity: T) where T: Entity = this.method_18472<T>(tickConsumer, entity)
/**
 * method_8452
 */
fun world_World.updateNeighborsAlways(pos: BlockPos, sourceBlock: Block, orientation: WireOrientation) = this.method_8452(pos, sourceBlock, orientation)
/**
 * method_48760
 */
fun world_World.sendEntityDamage(entity: Entity, damageSource: DamageSource) = this.method_48760(entity, damageSource)
/**
 * method_8509
 */
fun world_World.setLightningTicksLeft(lightningTicksLeft: Int) = this.method_8509(lightningTicksLeft)
/**
 * method_46407
 */
fun world_World.createExplosion(entity: Entity, damageSource: DamageSource, behavior: ExplosionBehavior, pos: Vec3d, power: Float, createFire: Boolean, explosionSourceType: net.minecraft.class_1937.class_7867) = this.method_46407(entity, damageSource, behavior, pos, power, createFire, explosionSourceType)
/**
 * method_8500
 */
fun world_World.getWorldChunk(pos: BlockPos) = this.method_8500(pos)
/**
 * method_43126
 */
fun world_World.getSpawnPos() = this.method_43126()
/**
 * method_54719
 */
fun world_World.getTickManager() = this.method_54719()
/**
 * method_8455
 */
fun world_World.updateComparators(pos: BlockPos, block: Block) = this.method_8455(pos, block)
/**
 * method_23886
 */
fun world_World.isNight() = this.method_23886()
/**
 * method_27983
 */
fun world_World.getRegistryKey() = this.method_27983()
/**
 * method_8419
 */
fun world_World.isRaining() = this.method_8419()
/**
 * method_41411
 */
fun world_World.shouldTickBlockPos(pos: BlockPos) = this.method_41411(pos)
/**
 * method_8538
 */
fun world_World.addDetailsToCrashReport(report: CrashReport) = this.method_8538(report)
/**
 * method_8532
 */
fun world_World.getTimeOfDay() = this.method_8532()
/**
 * method_8494
 */
fun world_World.addImportantParticle(parameters: ParticleEffect, x: Double, arg2: Double, y: Double, arg4: Double, z: Double, arg6: Double) = this.method_8494(parameters, x, arg2, y, arg4, z, arg6)
/**
 * method_8537
 */
fun world_World.createExplosion(entity: Entity, x: Double, arg2: Double, y: Double, arg4: Float, z: Boolean, arg6: net.minecraft.class_1937.class_7867) = this.method_8537(entity, x, arg2, y, arg4, z, arg6)
/**
 * method_8438
 */
fun world_World.addBlockEntity(blockEntity: BlockEntity) = this.method_8438(blockEntity)
/**
 * method_27982
 */
fun world_World.isDebugWorld() = this.method_27982()
/**
 * method_39425
 */
fun world_World.shouldTickBlocksInChunk(chunkPos: Long) = this.method_39425(chunkPos)
/**
 * method_8515
 */
fun world_World.isTopSolid(pos: BlockPos, entity: Entity) = this.method_8515(pos, entity)
/**
 * method_8458
 */
fun world_World.isSavingDisabled() = this.method_8458()
