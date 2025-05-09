package me.hellrevenger.generated.Map_RecipeMatcher
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_52504
 */
val <T>RecipeMatcher<T>.available by alias(RecipeMatcher<*>::field_52504)
/**
 * method_65796
 */
fun <T>RecipeMatcher<T>.getMaximumCrafts(ingredients: MutableList<out net.minecraft.class_1662.class_10528<T>>) = this.method_65796(ingredients)
/**
 * method_61504
 */
fun <T>RecipeMatcher<T>.countCrafts(ingredients: MutableList<out net.minecraft.class_1662.class_10528<T>>, max: Int, itemCallback: net.minecraft.class_1662.class_9874<T>) = this.method_61504(ingredients, max, itemCallback)
/**
 * method_7409
 */
fun <T>RecipeMatcher<T>.clear() = this.method_7409()
/**
 * method_61501
 */
fun <T>RecipeMatcher<T>.add(input: T, count: Int) = this.method_61501(input, count)
/**
 * method_61502
 */
fun <T>RecipeMatcher<T>.match(ingredients: MutableList<out net.minecraft.class_1662.class_10528<T>>, quantity: Int, itemCallback: net.minecraft.class_1662.class_9874<T>) = this.method_61502(ingredients, quantity, itemCallback)
