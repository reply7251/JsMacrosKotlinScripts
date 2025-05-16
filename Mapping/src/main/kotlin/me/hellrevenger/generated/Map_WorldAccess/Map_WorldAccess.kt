package me.hellrevenger.generated.Map_WorldAccess
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_55764
 */
fun WorldAccess.emitGameEvent(event: RegistryKey<GameEvent>?, pos: BlockPos?, emitter: net.minecraft.class_5712.class_7397?) = this.method_55764(event, pos, emitter)
/**
 * method_8406
 */
fun WorldAccess.addParticle(parameters: ParticleEffect?, x: Double, arg2: Double, y: Double, arg4: Double, z: Double, arg6: Double) = this.method_8406(parameters, x, arg2, y, arg4, z, arg6)
/**
 * method_42308
 */
fun WorldAccess.replaceWithStateForNeighborUpdate(direction: Direction?, pos: BlockPos?, neighborPos: BlockPos?, neighborState: BlockState?, flags: Int, maxUpdateDepth: Int) = this.method_42308(direction, pos, neighborPos, neighborState, flags, maxUpdateDepth)
/**
 * method_43276
 */
fun WorldAccess.emitGameEvent(event: RegistryEntry<GameEvent>?, pos: BlockPos?, emitter: net.minecraft.class_5712.class_7397?) = this.method_43276(event, pos, emitter)
/**
 * method_32888
 */
fun WorldAccess.emitGameEvent(event: RegistryEntry<GameEvent>?, emitterPos: Vec3d?, emitter: net.minecraft.class_5712.class_7397?) = this.method_32888(event, emitterPos, emitter)
/**
 * method_39224
 */
fun WorldAccess.getTickOrder() = this.method_39224()
/**
 * method_8401
 */
fun WorldAccess.getLevelProperties() = this.method_8401()
/**
 * method_43275
 */
fun WorldAccess.emitGameEvent(entity: Entity?, event: RegistryEntry<GameEvent>?, pos: Vec3d?) = this.method_43275(entity, event, pos)
/**
 * method_45447
 */
fun WorldAccess.playSound(except: PlayerEntity?, pos: BlockPos?, sound: SoundEvent?, category: SoundCategory?) = this.method_45447(except, pos, sound, category)
/**
 * method_33596
 */
fun WorldAccess.emitGameEvent(entity: Entity?, event: RegistryEntry<GameEvent>?, pos: BlockPos?) = this.method_33596(entity, event, pos)
/**
 * method_8398
 */
fun WorldAccess.getChunkManager() = this.method_8398()
/**
 * method_8404
 */
fun WorldAccess.getLocalDifficulty(pos: BlockPos?) = this.method_8404(pos)
/**
 * method_8408
 */
fun WorldAccess.updateNeighbors(pos: BlockPos?, block: Block?) = this.method_8408(pos, block)
/**
 * method_8407
 */
fun WorldAccess.getDifficulty() = this.method_8407()
/**
 * method_20290
 */
fun WorldAccess.syncWorldEvent(eventId: Int, pos: BlockPos?, data: Int) = this.method_20290(eventId, pos, data)
/**
 * method_8409
 */
fun WorldAccess.getRandom() = this.method_8409()
/**
 * method_8396
 */
fun WorldAccess.playSound(source: PlayerEntity?, pos: BlockPos?, sound: SoundEvent?, category: SoundCategory?, volume: Float, pitch: Float) = this.method_8396(source, pos, sound, category, volume, pitch)
/**
 * method_8444
 */
fun WorldAccess.syncWorldEvent(player: PlayerEntity?, eventId: Int, pos: BlockPos?, data: Int) = this.method_8444(player, eventId, pos, data)
/**
 * method_8503
 */
fun WorldAccess.getServer() = this.method_8503()
