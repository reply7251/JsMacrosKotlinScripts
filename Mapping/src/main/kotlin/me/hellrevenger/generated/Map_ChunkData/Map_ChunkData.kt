package me.hellrevenger.generated.Map_ChunkData
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_38586
 */
fun ChunkData.getSectionsDataBuf() = this.method_38586()
/**
 * method_38594
 */
fun ChunkData.getHeightmap() = this.method_38594()
/**
 * method_38587
 */
fun ChunkData.getBlockEntities(arg0: Int, arg1: Int) = this.method_38587(arg0, arg1)
/**
 * method_38590
 */
fun ChunkData.write(arg0: RegistryByteBuf) = this.method_38590(arg0)
/**
 * method_38591
 */
fun KClass<ChunkData>.writeSections(arg0: PacketByteBuf, arg1: WorldChunk) = ChunkData.method_38591(arg0, arg1)
