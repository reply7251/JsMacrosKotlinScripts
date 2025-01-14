package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkStatus

val KClass<ChunkStatus>.NORMAL_HEIGHTMAP_TYPES by aliasStatic(ChunkStatus::field_51903)
val KClass<ChunkStatus>.SPAWN by aliasStatic(ChunkStatus::field_12786)
val KClass<ChunkStatus>.STRUCTURE_REFERENCES by aliasStatic(ChunkStatus::field_16422)
val KClass<ChunkStatus>.STRUCTURE_STARTS by aliasStatic(ChunkStatus::field_16423)
val KClass<ChunkStatus>.NOISE by aliasStatic(ChunkStatus::field_12804)
val KClass<ChunkStatus>.INITIALIZE_LIGHT by aliasStatic(ChunkStatus::field_44633)
val KClass<ChunkStatus>.LIGHT by aliasStatic(ChunkStatus::field_12805)
val KClass<ChunkStatus>.FULL by aliasStatic(ChunkStatus::field_12803)
val KClass<ChunkStatus>.CARVERS by aliasStatic(ChunkStatus::field_12801)
val KClass<ChunkStatus>.SURFACE by aliasStatic(ChunkStatus::field_12796)
val KClass<ChunkStatus>.EMPTY by aliasStatic(ChunkStatus::field_12798)
val KClass<ChunkStatus>.BIOMES by aliasStatic(ChunkStatus::field_12794)
val KClass<ChunkStatus>.FEATURES by aliasStatic(ChunkStatus::field_12795)
fun ChunkStatus.getId() = this.method_60550()
fun ChunkStatus.getPrevious() = this.method_16560()
fun ChunkStatus.getHeightmapTypes() = this.method_12160()
fun KClass<ChunkStatus>.createOrderedList() = ChunkStatus.method_16558()
fun ChunkStatus.getIndex() = this.method_16559()
fun KClass<ChunkStatus>.max(arg0: ChunkStatus, arg1: ChunkStatus) = ChunkStatus.method_60545(arg0, arg1)
fun ChunkStatus.getChunkType() = this.method_12164()
fun KClass<ChunkStatus>.byId(arg0: String) = ChunkStatus.method_12168(arg0)
fun ChunkStatus.isLaterThan(arg0: ChunkStatus) = this.method_60547(arg0)
fun ChunkStatus.isAtMost(arg0: ChunkStatus) = this.method_60548(arg0)
fun ChunkStatus.isEarlierThan(arg0: ChunkStatus) = this.method_60549(arg0)
fun ChunkStatus.isAtLeast(arg0: ChunkStatus) = this.method_12165(arg0)
