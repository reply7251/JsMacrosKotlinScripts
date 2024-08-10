package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataFixTypes

val DataFixTypes.REQUIRED_TYPES by aliasStatic(DataFixTypes::field_42975)
val DataFixTypes.WORLD_GEN_SETTINGS by aliasEnum(DataFixTypes::class, "field_24640")
val DataFixTypes.ADVANCEMENTS by aliasEnum(DataFixTypes::class, "field_19220")
val DataFixTypes.OPTIONS by aliasEnum(DataFixTypes::class, "field_19216")
val DataFixTypes.HOTBAR by aliasEnum(DataFixTypes::class, "field_19215")
val DataFixTypes.CHUNK by aliasEnum(DataFixTypes::class, "field_19214")
val DataFixTypes.PLAYER by aliasEnum(DataFixTypes::class, "field_19213")
val DataFixTypes.LEVEL by aliasEnum(DataFixTypes::class, "field_19212")
val DataFixTypes.STATS by aliasEnum(DataFixTypes::class, "field_19218")
val DataFixTypes.STRUCTURE by aliasEnum(DataFixTypes::class, "field_19217")
val DataFixTypes.POI_CHUNK by aliasEnum(DataFixTypes::class, "field_19221")
val DataFixTypes.SAVED_DATA_FORCED_CHUNKS by aliasEnum(DataFixTypes::class, "field_45078")
val DataFixTypes.SAVED_DATA_MAP_DATA by aliasEnum(DataFixTypes::class, "field_45079")
val DataFixTypes.SAVED_DATA_COMMAND_STORAGE by aliasEnum(DataFixTypes::class, "field_45077")
val DataFixTypes.SAVED_DATA_STRUCTURE_FEATURE_INDICES by aliasEnum(DataFixTypes::class, "field_45084")
val DataFixTypes.SAVED_DATA_RANDOM_SEQUENCES by aliasEnum(DataFixTypes::class, "field_45082")
val DataFixTypes.SAVED_DATA_SCOREBOARD by aliasEnum(DataFixTypes::class, "field_45083")
val DataFixTypes.SAVED_DATA_MAP_INDEX by aliasEnum(DataFixTypes::class, "field_45080")
val DataFixTypes.SAVED_DATA_RAIDS by aliasEnum(DataFixTypes::class, "field_45081")
val DataFixTypes.ENTITY_CHUNK by aliasEnum(DataFixTypes::class, "field_26990")
fun DataFixTypes.update(arg0: DataFixer, arg1: NbtCompound, arg2: Int, arg3: Int) = this.method_48131(arg0, arg1, arg2, arg3)
fun <A>DataFixTypes.createDataFixingCodec(arg0: Codec<A>, arg1: DataFixer, arg2: Int) = this.method_53711<A>(arg0, arg1, arg2)
fun DataFixTypes.update(arg0: DataFixer, arg1: NbtCompound, arg2: Int) = this.method_48130(arg0, arg1, arg2)
fun <T>DataFixTypes.update(arg0: DataFixer, arg1: Dynamic<T>, arg2: Int, arg3: Int) = this.method_48129<T>(arg0, arg1, arg2, arg3)
fun <T>DataFixTypes.update(arg0: DataFixer, arg1: Dynamic<T>, arg2: Int) = this.method_48128<T>(arg0, arg1, arg2)
