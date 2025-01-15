package me.hellrevenger.generated.Map_ChunkSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ChunkSerializer>.BLOCK_LIGHT_KEY by aliasStatic(ChunkSerializer::field_37664)
val KClass<ChunkSerializer>.IS_LIGHT_ON_KEY by aliasStatic(ChunkSerializer::field_37662)
val KClass<ChunkSerializer>.Z_POS_KEY by aliasStatic(ChunkSerializer::field_37660)
val KClass<ChunkSerializer>.SECTIONS_KEY by aliasStatic(ChunkSerializer::field_37663)
val KClass<ChunkSerializer>.HEIGHTMAPS_KEY by aliasStatic(ChunkSerializer::field_37661)
val KClass<ChunkSerializer>.SKY_LIGHT_KEY by aliasStatic(ChunkSerializer::field_37665)
val KClass<ChunkSerializer>.X_POS_KEY by aliasStatic(ChunkSerializer::field_37659)
fun KClass<ChunkSerializer>.toNbt(arg0: Array<ShortList>) = ChunkSerializer.method_12393(arg0)
fun KClass<ChunkSerializer>.serialize(arg0: ServerWorld, arg1: Chunk) = ChunkSerializer.method_12410(arg0, arg1)
fun KClass<ChunkSerializer>.getChunkType(arg0: NbtCompound) = ChunkSerializer.method_12377(arg0)
fun KClass<ChunkSerializer>.deserialize(arg0: ServerWorld, arg1: PointOfInterestStorage, arg2: StorageKey, arg3: ChunkPos, arg4: NbtCompound) = ChunkSerializer.method_12395(arg0, arg1, arg2, arg3, arg4)
