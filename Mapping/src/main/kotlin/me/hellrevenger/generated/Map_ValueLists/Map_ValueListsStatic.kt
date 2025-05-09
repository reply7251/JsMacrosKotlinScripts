package me.hellrevenger.generated.Map_ValueLists
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ValueListsKt {
    /**
     * method_47915
     */
    fun <T>createIdToValueFunction(valueToIdFunction: ToIntFunction<T>, values: Array<T>, fallback: T) = ValueLists.method_47915<T>(valueToIdFunction, values, fallback)
    /**
     * method_47914
     */
    fun <T>createIdToValueFunction(valueToIdFunction: ToIntFunction<T>, values: Array<T>, outOfBoundsHandling: net.minecraft.class_7995.class_7996) = ValueLists.method_47914<T>(valueToIdFunction, values, outOfBoundsHandling)
}