package me.hellrevenger.generated.Map_Spline
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <C, I>KClass<Spline<C, I>>.createCodec(arg0: Codec<I>) where I: ToFloatFunction<C> = Spline.method_39232<C, I>(arg0)
fun <C, I>KClass<Spline<C, I>>.builder(arg0: I, arg1: ToFloatFunction<Float>) where I: ToFloatFunction<C> = Spline.method_39502<C, I>(arg0, arg1)
fun <C, I>KClass<Spline<C, I>>.builder(arg0: I) where I: ToFloatFunction<C> = Spline.method_37918<C, I>(arg0)
fun <C, I>Spline<C, I>.getDebugString() where I: ToFloatFunction<C> = this.method_39225()
fun <C, I>KClass<Spline<C, I>>.fixedFloatFunction(arg0: Float) where I: ToFloatFunction<C> = Spline.method_39427<C, I>(arg0)
fun <C, I>Spline<C, I>.apply(arg0: net.minecraft.class_6492.class_7073<I>) where I: ToFloatFunction<C> = this.method_41187(arg0)
