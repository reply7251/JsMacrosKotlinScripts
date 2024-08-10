package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Formatting

val Formatting.FORMATTING_CODE_PREFIX by aliasStatic(Formatting::field_33292)
val Formatting.GRAY by aliasEnum(Formatting::class, "field_1080")
val Formatting.DARK_RED by aliasEnum(Formatting::class, "field_1079")
val Formatting.BLUE by aliasEnum(Formatting::class, "field_1078")
val Formatting.DARK_GREEN by aliasEnum(Formatting::class, "field_1077")
val Formatting.LIGHT_PURPLE by aliasEnum(Formatting::class, "field_1076")
val Formatting.AQUA by aliasEnum(Formatting::class, "field_1075")
val Formatting.BLACK by aliasEnum(Formatting::class, "field_1074")
val Formatting.UNDERLINE by aliasEnum(Formatting::class, "field_1073")
val Formatting.RESET by aliasEnum(Formatting::class, "field_1070")
val Formatting.BOLD by aliasEnum(Formatting::class, "field_1067")
val Formatting.GOLD by aliasEnum(Formatting::class, "field_1065")
val Formatting.DARK_PURPLE by aliasEnum(Formatting::class, "field_1064")
val Formatting.DARK_GRAY by aliasEnum(Formatting::class, "field_1063")
val Formatting.DARK_AQUA by aliasEnum(Formatting::class, "field_1062")
val Formatting.RED by aliasEnum(Formatting::class, "field_1061")
val Formatting.GREEN by aliasEnum(Formatting::class, "field_1060")
val Formatting.WHITE by aliasEnum(Formatting::class, "field_1068")
val Formatting.STRIKETHROUGH by aliasEnum(Formatting::class, "field_1055")
val Formatting.YELLOW by aliasEnum(Formatting::class, "field_1054")
val Formatting.OBFUSCATED by aliasEnum(Formatting::class, "field_1051")
val Formatting.DARK_BLUE by aliasEnum(Formatting::class, "field_1058")
val Formatting.ITALIC by aliasEnum(Formatting::class, "field_1056")
fun Formatting.isColor() = this.method_543()
fun KClass<Formatting>.strip(arg0: String) = Formatting.method_539(arg0)
fun KClass<Formatting>.getNames(arg0: Boolean, arg1: Boolean) = Formatting.method_540(arg0, arg1)
fun KClass<Formatting>.byName(arg0: String) = Formatting.method_533(arg0)
fun KClass<Formatting>.byColorIndex(arg0: Int) = Formatting.method_534(arg0)
fun Formatting.isModifier() = this.method_542()
fun KClass<Formatting>.byCode(arg0: Char) = Formatting.method_544(arg0)
