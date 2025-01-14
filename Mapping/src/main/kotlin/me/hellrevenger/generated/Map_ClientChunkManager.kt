package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientChunkManager

fun ClientChunkManager.loadChunkFromPacket(arg0: Int, arg1: Int, arg2: PacketByteBuf, arg3: NbtCompound, arg4: Consumer<net.minecraft.class_6603.class_6605>) = this.method_16020(arg0, arg1, arg2, arg3, arg4)
fun ClientChunkManager.getChunk(arg0: Int, arg1: Int, arg2: ChunkStatus, arg3: Boolean) = this.method_2857(arg0, arg1, arg2, arg3)
fun ClientChunkManager.setChunkMapCenter(arg0: Int, arg1: Int) = this.method_20317(arg0, arg1)
fun ClientChunkManager.onChunkBiomeData(arg0: Int, arg1: Int, arg2: PacketByteBuf) = this.method_49630(arg0, arg1, arg2)
fun ClientChunkManager.unload(arg0: ChunkPos) = this.method_2859(arg0)
fun ClientChunkManager.updateLoadDistance(arg0: Int) = this.method_20180(arg0)
