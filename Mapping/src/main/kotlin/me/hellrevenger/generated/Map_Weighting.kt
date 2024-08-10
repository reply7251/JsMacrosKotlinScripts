package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Weighting

fun <T>KClass<Weighting>.getAt(arg0: List<T>, arg1: Int) where T: Weighted = Weighting.method_34985<T>(arg0, arg1)
fun <T>KClass<Weighting>.getRandom(arg0: Random, arg1: List<T>) where T: Weighted = Weighting.method_34986<T>(arg0, arg1)
fun <T>KClass<Weighting>.getRandom(arg0: Random, arg1: List<T>, arg2: Int) where T: Weighted = Weighting.method_34987<T>(arg0, arg1, arg2)
fun KClass<Weighting>.getWeightSum(arg0: List<out Weighted>) = Weighting.method_34984(arg0)
