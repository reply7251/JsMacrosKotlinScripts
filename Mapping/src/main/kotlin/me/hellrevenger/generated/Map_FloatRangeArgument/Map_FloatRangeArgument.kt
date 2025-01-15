package me.hellrevenger.generated.Map_FloatRangeArgument
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<FloatRangeArgument>.ONLY_INTS_EXCEPTION by aliasStatic(FloatRangeArgument::field_9781)
val KClass<FloatRangeArgument>.ANY by aliasStatic(FloatRangeArgument::field_9780)
fun KClass<FloatRangeArgument>.between(arg0: Float, arg1: Float) = FloatRangeArgument.method_35402(arg0, arg1)
fun KClass<FloatRangeArgument>.exactly(arg0: Float) = FloatRangeArgument.method_35401(arg0)
fun FloatRangeArgument.isInRange(arg0: Float) = this.method_35409(arg0)
fun KClass<FloatRangeArgument>.atLeast(arg0: Float) = FloatRangeArgument.method_35406(arg0)
fun KClass<FloatRangeArgument>.atMost(arg0: Float) = FloatRangeArgument.method_35408(arg0)
fun FloatRangeArgument.toJson() = this.method_35407()
fun KClass<FloatRangeArgument>.parse(arg0: StringReader, arg1: Boolean) = FloatRangeArgument.method_35404(arg0, arg1)
fun KClass<FloatRangeArgument>.parse(arg0: StringReader, arg1: Boolean, arg2: java.util.function.Function<Float, Float>) = FloatRangeArgument.method_9172(arg0, arg1, arg2)
fun FloatRangeArgument.isInSquaredRange(arg0: Double) = this.method_35400(arg0)
fun KClass<FloatRangeArgument>.fromJson(arg0: JsonElement) = FloatRangeArgument.method_35403(arg0)
fun FloatRangeArgument.min() = this.comp_1840()
fun FloatRangeArgument.max() = this.comp_1841()
