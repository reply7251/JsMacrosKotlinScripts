package me.hellrevenger.generated.Map_Formatting
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FormattingKt {
    /**
     * field_33292
     */
    val FORMATTING_CODE_PREFIX by aliasStatic(Formatting::field_33292)
    /**
     * field_1080
     */
    val GRAY by aliasEnum(Formatting::class, "field_1080")
    /**
     * field_1079
     */
    val DARK_RED by aliasEnum(Formatting::class, "field_1079")
    /**
     * field_1078
     */
    val BLUE by aliasEnum(Formatting::class, "field_1078")
    /**
     * field_1077
     */
    val DARK_GREEN by aliasEnum(Formatting::class, "field_1077")
    /**
     * field_1076
     */
    val LIGHT_PURPLE by aliasEnum(Formatting::class, "field_1076")
    /**
     * field_1075
     */
    val AQUA by aliasEnum(Formatting::class, "field_1075")
    /**
     * field_1074
     */
    val BLACK by aliasEnum(Formatting::class, "field_1074")
    /**
     * field_1073
     */
    val UNDERLINE by aliasEnum(Formatting::class, "field_1073")
    /**
     * field_1070
     */
    val RESET by aliasEnum(Formatting::class, "field_1070")
    /**
     * field_1067
     */
    val BOLD by aliasEnum(Formatting::class, "field_1067")
    /**
     * field_1065
     */
    val GOLD by aliasEnum(Formatting::class, "field_1065")
    /**
     * field_1064
     */
    val DARK_PURPLE by aliasEnum(Formatting::class, "field_1064")
    /**
     * field_1063
     */
    val DARK_GRAY by aliasEnum(Formatting::class, "field_1063")
    /**
     * field_1062
     */
    val DARK_AQUA by aliasEnum(Formatting::class, "field_1062")
    /**
     * field_1061
     */
    val RED by aliasEnum(Formatting::class, "field_1061")
    /**
     * field_1060
     */
    val GREEN by aliasEnum(Formatting::class, "field_1060")
    /**
     * field_1068
     */
    val WHITE by aliasEnum(Formatting::class, "field_1068")
    /**
     * field_1055
     */
    val STRIKETHROUGH by aliasEnum(Formatting::class, "field_1055")
    /**
     * field_1054
     */
    val YELLOW by aliasEnum(Formatting::class, "field_1054")
    /**
     * field_1051
     */
    val OBFUSCATED by aliasEnum(Formatting::class, "field_1051")
    /**
     * field_1058
     */
    val DARK_BLUE by aliasEnum(Formatting::class, "field_1058")
    /**
     * field_1056
     */
    val ITALIC by aliasEnum(Formatting::class, "field_1056")
    /**
     * method_539
     */
    fun strip(string: String) = Formatting.method_539(string)
    /**
     * method_540
     */
    fun getNames(colors: Boolean, modifiers: Boolean) = Formatting.method_540(colors, modifiers)
    /**
     * method_533
     */
    fun byName(name: String) = Formatting.method_533(name)
    /**
     * method_534
     */
    fun byColorIndex(colorIndex: Int) = Formatting.method_534(colorIndex)
    /**
     * method_544
     */
    fun byCode(code: Char) = Formatting.method_544(code)
}