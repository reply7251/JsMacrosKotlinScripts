package me.hellrevenger.generated.Map_WorldChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_49525
 */
fun WorldChunk.loadBiomeFromPacket(buf: PacketByteBuf?) = this.method_49525(buf)
/**
 * method_12221
 */
fun WorldChunk.runPostProcessing(world: ServerWorld?) = this.method_12221(world)
/**
 * method_12207
 */
fun WorldChunk.setLevelTypeProvider(levelTypeProvider: Supplier<ChunkLevelType>?) = this.method_12207(levelTypeProvider)
/**
 * method_65066
 */
fun WorldChunk.setUnsavedListener(unsavedListener: net.minecraft.class_2818.class_10368?) = this.method_65066(unsavedListener)
/**
 * method_38289
 */
fun WorldChunk.clear() = this.method_38289()
/**
 * method_12216
 */
fun WorldChunk.addBlockEntity(blockEntity: BlockEntity?) = this.method_12216(blockEntity)
/**
 * method_12224
 */
fun WorldChunk.loadFromPacket(buf: PacketByteBuf?, nbt: NbtCompound?, blockEntityVisitorConsumer: Consumer<net.minecraft.class_6603.class_6605>?) = this.method_12224(buf, nbt, blockEntityVisitorConsumer)
/**
 * method_12201
 */
fun WorldChunk.getBlockEntity(pos: BlockPos?, creationType: net.minecraft.class_2818.class_2819?) = this.method_12201(pos, creationType)
/**
 * method_31713
 */
fun WorldChunk.updateAllBlockEntities() = this.method_31713()
/**
 * method_20530
 */
fun WorldChunk.disableTickSchedulers(time: Long) = this.method_20530(time)
/**
 * method_39305
 */
fun WorldChunk.addChunkTickSchedulers(world: ServerWorld?) = this.method_39305(world)
/**
 * method_12223
 */
fun WorldChunk.isEmpty() = this.method_12223()
/**
 * method_12200
 */
fun WorldChunk.getWorld() = this.method_12200()
/**
 * method_12214
 */
fun WorldChunk.getBlockEntities() = this.method_12214()
/**
 * method_12206
 */
fun WorldChunk.loadEntities() = this.method_12206()
/**
 * method_12234
 */
fun WorldChunk.getFluidState(x: Int, y: Int, z: Int) = this.method_12234(x, y, z)
/**
 * method_39306
 */
fun WorldChunk.removeChunkTickSchedulers(world: ServerWorld?) = this.method_39306(world)
/**
 * method_12225
 */
fun WorldChunk.getLevelType() = this.method_12225()
/**
 * method_12226
 */
fun WorldChunk.setLoadedToWorld(loadedToWorld: Boolean) = this.method_12226(loadedToWorld)
