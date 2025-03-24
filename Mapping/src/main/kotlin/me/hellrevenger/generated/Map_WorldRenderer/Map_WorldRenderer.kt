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
fun WorldRenderer.setupFrustum(arg0: Vec3d, arg1: Matrix4f, arg2: Matrix4f) = this.method_32133(arg0, arg1, arg2)
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
fun WorldRenderer.render(arg0: ObjectAllocator, arg1: RenderTickCounter, arg2: Boolean, arg3: Camera, arg4: GameRenderer, arg5: Matrix4f, arg6: Matrix4f) = this.method_22710(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_29364
 */
fun WorldRenderer.getCloudsFramebuffer() = this.method_29364()
/**
 * method_21596
 */
fun WorldRenderer.scheduleBlockRerenderIfNeeded(arg0: BlockPos, arg1: BlockState, arg2: BlockState) = this.method_21596(arg0, arg1, arg2)
/**
 * method_3244
 */
fun WorldRenderer.setWorld(arg0: ClientWorld) = this.method_3244(arg0)
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
fun WorldRenderer.addWeatherParticlesAndSound(arg0: Camera) = this.method_62209(arg0)
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
fun WorldRenderer.addBuiltChunk(arg0: net.minecraft.class_846.class_851) = this.method_38550(arg0)
/**
 * method_23793
 */
fun KClass<WorldRenderer>.getLightmapCoordinates(arg0: BlockRenderView, arg1: BlockState, arg2: BlockPos) = WorldRenderer.method_23793(arg0, arg1, arg2)
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
fun WorldRenderer.setBlockBreakingInfo(arg0: Int, arg1: BlockPos, arg2: Int) = this.method_8569(arg0, arg1, arg2)
/**
 * method_8563
 */
fun WorldRenderer.addParticle(arg0: ParticleEffect, arg1: Boolean, arg2: Boolean, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Double, arg8: Double) = this.method_8563(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
/**
 * method_3254
 */
fun WorldRenderer.drawEntityOutlinesFramebuffer() = this.method_3254()
/**
 * method_62908
 */
fun WorldRenderer.onChunkUnload(arg0: Long) = this.method_62908(arg0)
/**
 * method_8570
 */
fun WorldRenderer.updateBlock(arg0: BlockView, arg1: BlockPos, arg2: BlockState, arg3: BlockState, arg4: Int) = this.method_8570(arg0, arg1, arg2, arg3, arg4)
/**
 * method_23794
 */
fun KClass<WorldRenderer>.getLightmapCoordinates(arg0: BlockRenderView, arg1: BlockPos) = WorldRenderer.method_23794(arg0, arg1)
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
fun WorldRenderer.scheduleChunkRenders(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int) = this.method_62219(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_3242
 */
fun WorldRenderer.onResized(arg0: Int, arg1: Int) = this.method_3242(arg0, arg1)
/**
 * method_3276
 */
fun <T>WorldRenderer.addParticle(arg0: T, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double) where T: ParticleEffect = this.method_3276<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_3272
 */
fun WorldRenderer.getEntitiesDebugString() = this.method_3272()
/**
 * method_62221
 */
fun WorldRenderer.getChunkRenderingDataPreparer() = this.method_62221()
/**
 * method_52816
 */
fun KClass<WorldRenderer>.offsetFrustum(arg0: Frustum) = WorldRenderer.method_52816(arg0)
/**
 * method_29361
 */
fun WorldRenderer.getEntityFramebuffer() = this.method_29361()
/**
 * method_8571
 */
fun WorldRenderer.scheduleChunkRender(arg0: Int, arg1: Int, arg2: Int) = this.method_8571(arg0, arg1, arg2)
/**
 * method_3245
 */
fun WorldRenderer.updateNoCullingBlockEntities(arg0: Collection<BlockEntity>, arg1: Collection<BlockEntity>) = this.method_3245(arg0, arg1)
/**
 * method_3296
 */
fun WorldRenderer.loadEntityOutlinePostProcessor() = this.method_3296()
/**
 * method_65201
 */
fun WorldRenderer.scheduleNeighborUpdates(arg0: ChunkPos) = this.method_65201(arg0)
/**
 * method_29362
 */
fun WorldRenderer.getParticlesFramebuffer() = this.method_29362()
/**
 * method_8568
 */
fun WorldRenderer.addParticle(arg0: ParticleEffect, arg1: Boolean, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Double) = this.method_8568(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
