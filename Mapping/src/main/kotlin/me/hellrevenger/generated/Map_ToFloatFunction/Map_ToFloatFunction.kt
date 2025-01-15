package me.hellrevenger.generated.Map_ToFloatFunction
import kotlin.reflect.*
import me.hellrevenger.generated.*
import java.util.function.Function

fun <C>ToFloatFunction<C>.min() = this.comp_532()
fun <C>ToFloatFunction<C>.max() = this.comp_533()
fun <C>ToFloatFunction<C>.apply(arg0: C) = this.method_41296(arg0)
fun <C, C2>ToFloatFunction<C>.compose(arg0: Function<C2, C>) = this.method_41309<C2>(arg0)
fun <C>KClass<ToFloatFunction<C>>.fromFloat(arg0: Float2FloatFunction) = ToFloatFunction.method_41308(arg0)
