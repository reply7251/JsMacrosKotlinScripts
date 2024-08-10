package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkLevels

val ChunkLevels.INACCESSIBLE by aliasStatic(ChunkLevels::field_44849)
val ChunkLevels.FULL_GENERATION_REQUIRED_LEVEL by aliasStatic(ChunkLevels::field_51859)
fun KClass<ChunkLevels>.getLevelFromStatus(arg0: ChunkStatus) = ChunkLevels.method_51829(arg0)
fun KClass<ChunkLevels>.shouldTickEntities(arg0: Int) = ChunkLevels.method_51831(arg0)
fun KClass<ChunkLevels>.shouldTickBlocks(arg0: Int) = ChunkLevels.method_51832(arg0)
fun KClass<ChunkLevels>.isAccessible(arg0: Int) = ChunkLevels.method_51833(arg0)
fun KClass<ChunkLevels>.getLevelFromType(arg0: ChunkLevelType) = ChunkLevels.method_51828(arg0)
fun KClass<ChunkLevels>.getStatusForAdditionalLevel(arg0: Int, arg1: ChunkStatus) = ChunkLevels.method_60437(arg0, arg1)
fun KClass<ChunkLevels>.getStatusForAdditionalLevel(arg0: Int) = ChunkLevels.method_60438(arg0)
fun KClass<ChunkLevels>.getStatus(arg0: Int) = ChunkLevels.method_51827(arg0)
fun KClass<ChunkLevels>.getType(arg0: Int) = ChunkLevels.method_51830(arg0)
