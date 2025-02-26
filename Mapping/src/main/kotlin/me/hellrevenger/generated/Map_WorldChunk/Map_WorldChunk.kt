package me.hellrevenger.generated.Map_WorldChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_49525
 */
fun WorldChunk.loadBiomeFromPacket(arg0: PacketByteBuf) = this.method_49525(arg0)
/**
 * method_12207
 */
fun WorldChunk.setLevelTypeProvider(arg0: Supplier<ChunkLevelType>) = this.method_12207(arg0)
/**
 * method_12221
 */
fun WorldChunk.runPostProcessing() = this.method_12221()
/**
 * method_38289
 */
fun WorldChunk.clear() = this.method_38289()
/**
 * method_12216
 */
fun WorldChunk.addBlockEntity(arg0: BlockEntity) = this.method_12216(arg0)
/**
 * method_12224
 */
fun WorldChunk.loadFromPacket(arg0: PacketByteBuf, arg1: NbtCompound, arg2: Consumer<net.minecraft.class_6603.class_6605>) = this.method_12224(arg0, arg1, arg2)
/**
 * method_12201
 */
fun WorldChunk.getBlockEntity(arg0: BlockPos, arg1: net.minecraft.class_2818.class_2819) = this.method_12201(arg0, arg1)
/**
 * method_31713
 */
fun WorldChunk.updateAllBlockEntities() = this.method_31713()
/**
 * method_20530
 */
fun WorldChunk.disableTickSchedulers(arg0: Long) = this.method_20530(arg0)
/**
 * method_39305
 */
fun WorldChunk.addChunkTickSchedulers(arg0: ServerWorld) = this.method_39305(arg0)
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
fun WorldChunk.getFluidState(arg0: Int, arg1: Int, arg2: Int) = this.method_12234(arg0, arg1, arg2)
/**
 * method_39306
 */
fun WorldChunk.removeChunkTickSchedulers(arg0: ServerWorld) = this.method_39306(arg0)
/**
 * method_12225
 */
fun WorldChunk.getLevelType() = this.method_12225()
/**
 * method_12226
 */
fun WorldChunk.setLoadedToWorld(arg0: Boolean) = this.method_12226(arg0)
