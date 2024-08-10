package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkLevelType

val ChunkLevelType.INACCESSIBLE by aliasEnum(ChunkLevelType::class, "field_19334")
val ChunkLevelType.ENTITY_TICKING by aliasEnum(ChunkLevelType::class, "field_13877")
val ChunkLevelType.BLOCK_TICKING by aliasEnum(ChunkLevelType::class, "field_44856")
val ChunkLevelType.FULL by aliasEnum(ChunkLevelType::class, "field_44855")
fun ChunkLevelType.isAfter(arg0: ChunkLevelType) = this.method_14014(arg0)
