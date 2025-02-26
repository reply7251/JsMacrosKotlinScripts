package me.hellrevenger.generated.Map_Ingredient
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_9017
 */
val KClass<Ingredient>.EMPTY by aliasStatic(Ingredient::field_9017)
/**
 * field_9018
 */
var Ingredient.matchingStacks by alias(Ingredient::field_9018)
/**
 * method_8101
 */
fun KClass<Ingredient>.ofStacks(arg0: Array<ItemStack>) = Ingredient.method_8101(*arg0)
/**
 * method_8106
 */
fun KClass<Ingredient>.fromTag(arg0: TagKey<Item>) = Ingredient.method_8106(arg0)
/**
 * method_8093
 */
fun Ingredient.test(arg0: ItemStack) = this.method_8093(arg0)
/**
 * method_8091
 */
fun KClass<Ingredient>.ofItems(arg0: Array<ItemConvertible>) = Ingredient.method_8091(*arg0)
/**
 * method_35226
 */
fun KClass<Ingredient>.empty() = Ingredient.method_35226()
/**
 * method_8103
 */
fun Ingredient.isEmpty() = this.method_8103()
/**
 * method_8100
 */
fun Ingredient.getMatchingItemIds() = this.method_8100()
/**
 * method_26964
 */
fun KClass<Ingredient>.ofStacks(arg0: Stream<ItemStack>) = Ingredient.method_26964(arg0)
