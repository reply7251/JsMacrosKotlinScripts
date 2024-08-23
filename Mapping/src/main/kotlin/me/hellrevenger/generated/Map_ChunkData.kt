package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkData

fun ChunkData.getSectionsDataBuf() = this.method_38586()
fun ChunkData.getHeightmap() = this.method_38594()
fun ChunkData.getBlockEntities(arg0: Int, arg1: Int) = this.method_38587(arg0, arg1)
fun ChunkData.write(arg0: RegistryByteBuf) = this.method_38590(arg0)
fun KClass<ChunkData>.writeSections(arg0: PacketByteBuf, arg1: WorldChunk) = ChunkData.method_38591(arg0, arg1)
