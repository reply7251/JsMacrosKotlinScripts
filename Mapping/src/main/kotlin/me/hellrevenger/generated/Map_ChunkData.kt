package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkData

fun ChunkData.getSectionsDataBuf() = this.method_38586()
fun ChunkData.write(arg0: RegistryByteBuf) = this.method_38590(arg0)
fun KClass<ChunkData>.writeSections(arg0: PacketByteBuf, arg1: WorldChunk) = ChunkData.method_38591(arg0, arg1)
