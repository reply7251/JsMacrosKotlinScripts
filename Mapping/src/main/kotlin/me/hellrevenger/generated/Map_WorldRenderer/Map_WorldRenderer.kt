package me.hellrevenger.generated.Map_WorldRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_3246
 */
fun WorldRenderer.getCompletedChunkCount() = this.method_3246()
/**
 * method_18145
 */
fun WorldRenderer.scheduleChunkRenders3x3x3(x: Int, y: Int, z: Int) = this.method_18145(x, y, z)
/**
 * method_29363
 */
fun WorldRenderer.getWeatherFramebuffer() = this.method_29363()
/**
 * method_22990
 */
fun WorldRenderer.getEntityOutlinesFramebuffer() = this.method_22990()
/**
 * method_32133
 */
fun WorldRenderer.setupFrustum(pos: Vec3d, positionMatrix: Matrix4f, projectionMatrix: Matrix4f) = this.method_32133(pos, positionMatrix, projectionMatrix)
/**
 * method_18146
 */
fun WorldRenderer.scheduleBlockRenders(minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = this.method_18146(minX, minY, minZ, maxX, maxY, maxZ)
/**
 * method_3289
 */
fun WorldRenderer.getChunksDebugString() = this.method_3289()
/**
 * method_22710
 */
fun WorldRenderer.render(allocator: ObjectAllocator, tickCounter: RenderTickCounter, renderBlockOutline: Boolean, camera: Camera, gameRenderer: GameRenderer, positionMatrix: Matrix4f, projectionMatrix: Matrix4f) = this.method_22710(allocator, tickCounter, renderBlockOutline, camera, gameRenderer, positionMatrix, projectionMatrix)
/**
 * method_29364
 */
fun WorldRenderer.getCloudsFramebuffer() = this.method_29364()
/**
 * method_21596
 */
fun WorldRenderer.scheduleBlockRerenderIfNeeded(pos: BlockPos, old: BlockState, updated: BlockState) = this.method_21596(pos, old, updated)
/**
 * method_3244
 */
fun WorldRenderer.setWorld(world: ClientWorld) = this.method_3244(world)
/**
 * method_62220
 */
fun WorldRenderer.getBuiltChunks() = this.method_62220()
/**
 * method_35776
 */
fun WorldRenderer.killFrustum() = this.method_35776()
/**
 * method_62222
 */
fun WorldRenderer.getCapturedFrustum() = this.method_62222()
/**
 * method_62209
 */
fun WorldRenderer.addWeatherParticlesAndSound(camera: Camera) = this.method_62209(camera)
/**
 * method_34812
 */
fun WorldRenderer.getViewDistance() = this.method_34812()
/**
 * method_3252
 */
fun WorldRenderer.tick() = this.method_3252()
/**
 * method_3292
 */
fun WorldRenderer.scheduleTerrainUpdate() = this.method_3292()
/**
 * method_35775
 */
fun WorldRenderer.captureFrustum() = this.method_35775()
/**
 * method_34811
 */
fun WorldRenderer.getChunkCount() = this.method_34811()
/**
 * method_34810
 */
fun WorldRenderer.getChunkBuilder() = this.method_34810()
/**
 * method_40050
 */
fun WorldRenderer.isRenderingReady(pos: BlockPos) = this.method_40050(pos)
/**
 * method_38550
 */
fun WorldRenderer.addBuiltChunk(chunk: net.minecraft.class_846.class_851) = this.method_38550(chunk)
/**
 * method_3281
 */
fun WorldRenderer.isTerrainRenderComplete() = this.method_3281()
/**
 * method_62196
 */
fun WorldRenderer.getCloudRenderer() = this.method_62196()
/**
 * method_8569
 */
fun WorldRenderer.setBlockBreakingInfo(entityId: Int, pos: BlockPos, stage: Int) = this.method_8569(entityId, pos, stage)
/**
 * method_8563
 */
fun WorldRenderer.addParticle(parameters: ParticleEffect, force: Boolean, canSpawnOnMinimal: Boolean, x: Double, arg4: Double, y: Double, arg6: Double, z: Double, arg8: Double) = this.method_8563(parameters, force, canSpawnOnMinimal, x, arg4, y, arg6, z, arg8)
/**
 * method_3254
 */
fun WorldRenderer.drawEntityOutlinesFramebuffer() = this.method_3254()
/**
 * method_62908
 */
fun WorldRenderer.onChunkUnload(sectionPos: Long) = this.method_62908(sectionPos)
/**
 * method_8570
 */
fun WorldRenderer.updateBlock(world: BlockView, pos: BlockPos, oldState: BlockState, newState: BlockState, flags: Int) = this.method_8570(world, pos, oldState, newState, flags)
/**
 * method_29360
 */
fun WorldRenderer.getTranslucentFramebuffer() = this.method_29360()
/**
 * method_3279
 */
fun WorldRenderer.reload() = this.method_3279()
/**
 * method_62219
 */
fun WorldRenderer.scheduleChunkRenders(minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = this.method_62219(minX, minY, minZ, maxX, maxY, maxZ)
/**
 * method_3242
 */
fun WorldRenderer.onResized(width: Int, height: Int) = this.method_3242(width, height)
/**
 * method_3276
 */
fun <T>WorldRenderer.addParticle(parameters: T, x: Double, arg2: Double, y: Double, arg4: Double, z: Double, arg6: Double) where T: ParticleEffect = this.method_3276<T>(parameters, x, arg2, y, arg4, z, arg6)
/**
 * method_3272
 */
fun WorldRenderer.getEntitiesDebugString() = this.method_3272()
/**
 * method_62221
 */
fun WorldRenderer.getChunkRenderingDataPreparer() = this.method_62221()
/**
 * method_29361
 */
fun WorldRenderer.getEntityFramebuffer() = this.method_29361()
/**
 * method_8571
 */
fun WorldRenderer.scheduleChunkRender(chunkX: Int, chunkY: Int, chunkZ: Int) = this.method_8571(chunkX, chunkY, chunkZ)
/**
 * method_3245
 */
fun WorldRenderer.updateNoCullingBlockEntities(removed: Collection<BlockEntity>, added: Collection<BlockEntity>) = this.method_3245(removed, added)
/**
 * method_3296
 */
fun WorldRenderer.loadEntityOutlinePostProcessor() = this.method_3296()
/**
 * method_65201
 */
fun WorldRenderer.scheduleNeighborUpdates(chunkPos: ChunkPos) = this.method_65201(chunkPos)
/**
 * method_29362
 */
fun WorldRenderer.getParticlesFramebuffer() = this.method_29362()
/**
 * method_8568
 */
fun WorldRenderer.addParticle(parameters: ParticleEffect, force: Boolean, x: Double, arg3: Double, y: Double, arg5: Double, z: Double, arg7: Double) = this.method_8568(parameters, force, x, arg3, y, arg5, z, arg7)
