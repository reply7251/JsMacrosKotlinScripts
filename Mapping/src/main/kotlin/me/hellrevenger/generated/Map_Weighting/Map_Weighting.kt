package me.hellrevenger.generated.Map_Weighting
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_34985
 */
fun <T>KClass<Weighting>.getAt(arg0: MutableList<T>, arg1: Int) where T: Weighted = Weighting.method_34985<T>(arg0, arg1)
/**
 * method_34986
 */
fun <T>KClass<Weighting>.getRandom(arg0: Random, arg1: MutableList<T>) where T: Weighted = Weighting.method_34986<T>(arg0, arg1)
/**
 * method_34987
 */
fun <T>KClass<Weighting>.getRandom(arg0: Random, arg1: MutableList<T>, arg2: Int) where T: Weighted = Weighting.method_34987<T>(arg0, arg1, arg2)
/**
 * method_34984
 */
fun KClass<Weighting>.getWeightSum(arg0: MutableList<out Weighted>) = Weighting.method_34984(arg0)
