package me.hellrevenger.generated.Map_CoordinateArgument
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CoordinateArgumentKt {
    /**
     * field_10761
     */
    val MISSING_BLOCK_POSITION by aliasStatic(CoordinateArgument::field_10761)
    /**
     * field_10759
     */
    val MISSING_COORDINATE by aliasStatic(CoordinateArgument::field_10759)
    /**
     * method_9739
     */
    fun parse(reader: StringReader) = CoordinateArgument.method_9739(reader)
    /**
     * method_9742
     */
    fun isRelative(reader: StringReader) = CoordinateArgument.method_9742(reader)
    /**
     * method_9743
     */
    fun parse(reader: StringReader, centerIntegers: Boolean) = CoordinateArgument.method_9743(reader, centerIntegers)
}