package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RealmsWorldOptions

val RealmsWorldOptions.spawnNpcs by alias(RealmsWorldOptions::field_22635)
val RealmsWorldOptions.empty by alias(RealmsWorldOptions::field_22645)
val RealmsWorldOptions.spawnAnimals by alias(RealmsWorldOptions::field_22633)
val RealmsWorldOptions.compatibility by alias(RealmsWorldOptions::field_46844)
val RealmsWorldOptions.spawnProtection by alias(RealmsWorldOptions::field_22636)
val RealmsWorldOptions.templateImage by alias(RealmsWorldOptions::field_22643)
val RealmsWorldOptions.templateId by alias(RealmsWorldOptions::field_22642)
val RealmsWorldOptions.gameMode by alias(RealmsWorldOptions::field_22640)
val RealmsWorldOptions.forceGameMode by alias(RealmsWorldOptions::field_22638)
val RealmsWorldOptions.spawnMonsters by alias(RealmsWorldOptions::field_22634)
val RealmsWorldOptions.pvp by alias(RealmsWorldOptions::field_22632)
val RealmsWorldOptions.difficulty by alias(RealmsWorldOptions::field_22639)
val RealmsWorldOptions.version by alias(RealmsWorldOptions::field_46843)
val RealmsWorldOptions.commandBlocks by alias(RealmsWorldOptions::field_22637)
fun RealmsWorldOptions.toJson() = this.method_25082()
fun RealmsWorldOptions.clone() = this.method_25083()
fun KClass<RealmsWorldOptions>.parse(arg0: JsonObject) = RealmsWorldOptions.method_25078(arg0)
fun RealmsWorldOptions.setEmpty(arg0: Boolean) = this.method_25079(arg0)
fun RealmsWorldOptions.getDefaultSlotName(arg0: Int) = this.method_25081(arg0)
fun KClass<RealmsWorldOptions>.getDefaults() = RealmsWorldOptions.method_25076()
fun KClass<RealmsWorldOptions>.getEmptyDefaults() = RealmsWorldOptions.method_25080()
