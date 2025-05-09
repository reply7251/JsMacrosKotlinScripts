package me.hellrevenger.generated.Map_FloatRangeArgument
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FloatRangeArgumentKt {
    /**
     * field_9781
     */
    val ONLY_INTS_EXCEPTION by aliasStatic(FloatRangeArgument::field_9781)
    /**
     * field_9780
     */
    val ANY by aliasStatic(FloatRangeArgument::field_9780)
    /**
     * method_35402
     */
    fun between(min: Float, max: Float) = FloatRangeArgument.method_35402(min, max)
    /**
     * method_35401
     */
    fun exactly(value: Float) = FloatRangeArgument.method_35401(value)
    /**
     * method_35406
     */
    fun atLeast(value: Float) = FloatRangeArgument.method_35406(value)
    /**
     * method_35408
     */
    fun atMost(value: Float) = FloatRangeArgument.method_35408(value)
    /**
     * method_35404
     */
    fun parse(reader: StringReader, allowFloats: Boolean) = FloatRangeArgument.method_35404(reader, allowFloats)
    /**
     * method_35403
     */
    fun fromJson(json: JsonElement) = FloatRangeArgument.method_35403(json)
}