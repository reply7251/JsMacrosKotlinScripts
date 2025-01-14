package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkUpdateState

fun KClass<ChunkUpdateState>.fromNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = ChunkUpdateState.method_32358(arg0, arg1)
fun KClass<ChunkUpdateState>.getPersistentStateType() = ChunkUpdateState.method_52601()
fun ChunkUpdateState.isRemaining(arg0: Long) = this.method_14894(arg0)
fun ChunkUpdateState.getAll() = this.method_14898()
fun ChunkUpdateState.contains(arg0: Long) = this.method_14897(arg0)
fun ChunkUpdateState.markResolved(arg0: Long) = this.method_14895(arg0)
fun ChunkUpdateState.add(arg0: Long) = this.method_14896(arg0)
