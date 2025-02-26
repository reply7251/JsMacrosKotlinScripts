package me.hellrevenger.generated.Map_RecipeMatcher
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7550
 */
val RecipeMatcher.inputs by alias(RecipeMatcher::field_7550)
/**
 * method_7400
 */
fun RecipeMatcher.addInput(arg0: ItemStack) = this.method_7400(arg0)
/**
 * method_7402
 */
fun RecipeMatcher.match(arg0: Recipe<*>, arg1: IntList) = this.method_7402(arg0, arg1)
/**
 * method_7409
 */
fun RecipeMatcher.clear() = this.method_7409()
/**
 * method_7407
 */
fun RecipeMatcher.countCrafts(arg0: RecipeEntry<*>, arg1: IntList) = this.method_7407(arg0, arg1)
/**
 * method_7404
 */
fun RecipeMatcher.addUnenchantedInput(arg0: ItemStack) = this.method_7404(arg0)
/**
 * method_7405
 */
fun KClass<RecipeMatcher>.getStackFromId(arg0: Int) = RecipeMatcher.method_7405(arg0)
/**
 * method_7406
 */
fun RecipeMatcher.match(arg0: Recipe<*>, arg1: IntList, arg2: Int) = this.method_7406(arg0, arg1, arg2)
/**
 * method_20478
 */
fun RecipeMatcher.addInput(arg0: ItemStack, arg1: Int) = this.method_20478(arg0, arg1)
/**
 * method_7403
 */
fun RecipeMatcher.countCrafts(arg0: RecipeEntry<*>, arg1: Int, arg2: IntList) = this.method_7403(arg0, arg1, arg2)
/**
 * method_7408
 */
fun KClass<RecipeMatcher>.getItemId(arg0: ItemStack) = RecipeMatcher.method_7408(arg0)
