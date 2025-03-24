package me.hellrevenger.generated.Map_ClientChunkManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_3677
 */
var ClientChunkManager.lightingProvider by alias(ClientChunkManager::field_3677)
/**
 * field_16246
 */
val ClientChunkManager.chunks by alias(ClientChunkManager::field_16246)
/**
 * method_16020
 */
fun ClientChunkManager.loadChunkFromPacket(arg0: Int, arg1: Int, arg2: PacketByteBuf, arg3: NbtCompound, arg4: Consumer<net.minecraft.class_6603.class_6605>) = this.method_16020(arg0, arg1, arg2, arg3, arg4)
/**
 * method_2857
 */
fun ClientChunkManager.getChunk(arg0: Int, arg1: Int, arg2: ChunkStatus, arg3: Boolean) = this.method_2857(arg0, arg1, arg2, arg3)
/**
 * method_20317
 */
fun ClientChunkManager.setChunkMapCenter(arg0: Int, arg1: Int) = this.method_20317(arg0, arg1)
/**
 * method_49630
 */
fun ClientChunkManager.onChunkBiomeData(arg0: Int, arg1: Int, arg2: PacketByteBuf) = this.method_49630(arg0, arg1, arg2)
/**
 * method_2859
 */
fun ClientChunkManager.unload(arg0: ChunkPos) = this.method_2859(arg0)
/**
 * method_62890
 */
fun ClientChunkManager.getActiveSections() = this.method_62890()
/**
 * method_20180
 */
fun ClientChunkManager.updateLoadDistance(arg0: Int) = this.method_20180(arg0)
