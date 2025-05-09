package me.hellrevenger.generated.Map_Weighting
import kotlin.reflect.*
import me.hellrevenger.generated.*
object WeightingKt {
    /**
     * method_34985
     */
    fun <T>getAt(pool: MutableList<T>, totalWeight: Int) where T: Weighted = Weighting.method_34985<T>(pool, totalWeight)
    /**
     * method_34986
     */
    fun <T>getRandom(random: Random, pool: MutableList<T>) where T: Weighted = Weighting.method_34986<T>(random, pool)
    /**
     * method_34987
     */
    fun <T>getRandom(random: Random, pool: MutableList<T>, totalWeight: Int) where T: Weighted = Weighting.method_34987<T>(random, pool, totalWeight)
    /**
     * method_34984
     */
    fun getWeightSum(pool: MutableList<out Weighted>) = Weighting.method_34984(pool)
}