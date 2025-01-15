package me.hellrevenger.generated.Map_ForcedChunkState
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ForcedChunkState>.CHUNKS_KEY by aliasStatic(ForcedChunkState::field_30961)
fun KClass<ForcedChunkState>.getPersistentStateType() = ForcedChunkState.method_52570()
fun ForcedChunkState.getChunks() = this.method_8375()
fun KClass<ForcedChunkState>.fromNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = ForcedChunkState.method_32350(arg0, arg1)
