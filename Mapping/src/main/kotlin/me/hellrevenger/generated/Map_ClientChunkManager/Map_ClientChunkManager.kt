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
fun ClientChunkManager.loadChunkFromPacket(arg0: Int, x: Int, z: PacketByteBuf, buf: NbtCompound, nbt: Consumer<net.minecraft.class_6603.class_6605>) = this.method_16020(arg0, x, z, buf, nbt)
/**
 * method_2857
 */
fun ClientChunkManager.getChunk(arg0: Int, arg1: Int, arg2: ChunkStatus, arg3: Boolean) = this.method_2857(arg0, arg1, arg2, arg3)
/**
 * method_20317
 */
fun ClientChunkManager.setChunkMapCenter(x: Int, z: Int) = this.method_20317(x, z)
/**
 * method_49630
 */
fun ClientChunkManager.onChunkBiomeData(x: Int, z: Int, buf: PacketByteBuf) = this.method_49630(x, z, buf)
/**
 * method_2859
 */
fun ClientChunkManager.unload(pos: ChunkPos) = this.method_2859(pos)
/**
 * method_62890
 */
fun ClientChunkManager.getActiveSections() = this.method_62890()
/**
 * method_20180
 */
fun ClientChunkManager.updateLoadDistance(loadDistance: Int) = this.method_20180(loadDistance)
