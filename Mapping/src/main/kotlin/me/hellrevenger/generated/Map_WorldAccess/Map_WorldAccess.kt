package me.hellrevenger.generated.Map_WorldAccess
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_55764
 */
fun WorldAccess.emitGameEvent(event: RegistryKey<GameEvent>, pos: BlockPos, emitter: net.minecraft.class_5712.class_7397) = this.method_55764(event, pos, emitter)
/**
 * method_8406
 */
fun WorldAccess.addParticle(parameters: ParticleEffect, x: Double, arg2: Double, y: Double, arg4: Double, z: Double, arg6: Double) = this.method_8406(parameters, x, arg2, y, arg4, z, arg6)
/**
 * method_42308
 */
fun WorldAccess.replaceWithStateForNeighborUpdate(direction: Direction, pos: BlockPos, neighborPos: BlockPos, neighborState: BlockState, flags: Int, maxUpdateDepth: Int) = this.method_42308(direction, pos, neighborPos, neighborState, flags, maxUpdateDepth)
/**
 * method_39224
 */
fun WorldAccess.getTickOrder() = this.method_39224()
/**
 * method_8401
 */
fun WorldAccess.getLevelProperties() = this.method_8401()
/**
 * method_45447
 */
fun WorldAccess.playSound(except: PlayerEntity, pos: BlockPos, sound: SoundEvent, category: SoundCategory) = this.method_45447(except, pos, sound, category)
/**
 * method_8398
 */
fun WorldAccess.getChunkManager() = this.method_8398()
/**
 * method_8404
 */
fun WorldAccess.getLocalDifficulty(pos: BlockPos) = this.method_8404(pos)
/**
 * method_8408
 */
fun WorldAccess.updateNeighbors(pos: BlockPos, block: Block) = this.method_8408(pos, block)
/**
 * method_8407
 */
fun WorldAccess.getDifficulty() = this.method_8407()
/**
 * method_20290
 */
fun WorldAccess.syncWorldEvent(eventId: Int, pos: BlockPos, data: Int) = this.method_20290(eventId, pos, data)
/**
 * method_8409
 */
fun WorldAccess.getRandom() = this.method_8409()
/**
 * method_8503
 */
fun WorldAccess.getServer() = this.method_8503()
