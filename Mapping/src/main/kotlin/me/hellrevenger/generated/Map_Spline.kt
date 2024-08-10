package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Spline

fun <I, C>KClass<Spline<C, I>>.createCodec(arg0: Codec<I>) where I: ToFloatFunction<C> = Spline.method_39232<C, I>(arg0)
fun <I, C>KClass<Spline<C, I>>.builder(arg0: I, arg1: ToFloatFunction<Float>) where I: ToFloatFunction<C> = Spline.method_39502<C, I>(arg0, arg1)
fun <I, C>KClass<Spline<C, I>>.builder(arg0: I) where I: ToFloatFunction<C> = Spline.method_37918<C, I>(arg0)
fun <I, C>Spline<C, I>.getDebugString() where I: ToFloatFunction<C> = this.method_39225()
fun <I, C>KClass<Spline<C, I>>.fixedFloatFunction(arg0: Float) where I: ToFloatFunction<C> = Spline.method_39427<C, I>(arg0)
fun <I, C>Spline<C, I>.apply(arg0: net.minecraft.class_6492.class_7073<I>) where I: ToFloatFunction<C> = this.method_41187(arg0)
