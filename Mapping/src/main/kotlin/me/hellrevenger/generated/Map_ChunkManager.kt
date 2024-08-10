package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkManager

fun ChunkManager.getWorldChunk(arg0: Int, arg1: Int, arg2: Boolean) = this.method_12126(arg0, arg1, arg2)
fun ChunkManager.getLoadedChunkCount() = this.method_14151()
fun ChunkManager.setMobSpawnOptions(arg0: Boolean, arg1: Boolean) = this.method_12128(arg0, arg1)
fun ChunkManager.getLightingProvider() = this.method_12130()
fun ChunkManager.getDebugString() = this.method_12122()
fun ChunkManager.setChunkForced(arg0: ChunkPos, arg1: Boolean) = this.method_12124(arg0, arg1)
fun ChunkManager.getWorldChunk(arg0: Int, arg1: Int) = this.method_21730(arg0, arg1)
fun ChunkManager.getChunk(arg0: Int, arg1: Int, arg2: ChunkStatus, arg3: Boolean) = this.method_12121(arg0, arg1, arg2, arg3)
fun ChunkManager.isChunkLoaded(arg0: Int, arg1: Int) = this.method_12123(arg0, arg1)
fun ChunkManager.tick(arg0: BooleanSupplier, arg1: Boolean) = this.method_12127(arg0, arg1)
