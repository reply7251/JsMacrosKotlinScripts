package me.hellrevenger.generated.Map_Spline
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SplineKt {
    /**
     * method_39232
     */
    fun <C, I>createCodec(locationFunctionCodec: Codec<I>?) where I: ToFloatFunction<C> = Spline.method_39232<C, I>(locationFunctionCodec)
    /**
     * method_39502
     */
    fun <C, I>builder(locationFunction: I, amplifier: ToFloatFunction<Float>?) where I: ToFloatFunction<C> = Spline.method_39502<C, I>(locationFunction, amplifier)
    /**
     * method_37918
     */
    fun <C, I>builder(locationFunction: I) where I: ToFloatFunction<C> = Spline.method_37918<C, I>(locationFunction)
    /**
     * method_39427
     */
    fun <C, I>fixedFloatFunction(value: Float) where I: ToFloatFunction<C> = Spline.method_39427<C, I>(value)
}