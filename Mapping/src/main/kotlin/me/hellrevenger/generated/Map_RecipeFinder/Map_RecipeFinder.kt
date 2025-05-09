package me.hellrevenger.generated.Map_RecipeFinder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_52506
 */
val RecipeFinder.recipeMatcher by alias(RecipeFinder::field_52506)
/**
 * method_61541
 */
fun RecipeFinder.addInput(item: ItemStack) = this.method_61541(item)
/**
 * method_61534
 */
fun RecipeFinder.clear() = this.method_61534()
/**
 * method_61543
 */
fun RecipeFinder.countCrafts(recipe: Recipe<*>, itemCallback: net.minecraft.class_1662.class_9874<RegistryEntry<Item>>) = this.method_61543(recipe, itemCallback)
/**
 * method_61537
 */
fun RecipeFinder.isCraftable(recipe: Recipe<*>, quantity: Int, itemCallback: net.minecraft.class_1662.class_9874<RegistryEntry<Item>>) = this.method_61537(recipe, quantity, itemCallback)
/**
 * method_61535
 */
fun RecipeFinder.addInputIfUsable(item: ItemStack) = this.method_61535(item)
