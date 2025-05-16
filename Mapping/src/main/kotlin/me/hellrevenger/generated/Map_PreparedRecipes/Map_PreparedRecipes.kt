package me.hellrevenger.generated.Map_PreparedRecipes
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64699
 */
fun <I, T>PreparedRecipes.find(type: RecipeType<T>?, input: I, world: world_World?) where I: RecipeInput, T: Recipe<I> = this.method_64699<I, T>(type, input, world)
/**
 * method_64695
 */
fun PreparedRecipes.recipes() = this.method_64695()
/**
 * method_64696
 */
fun PreparedRecipes.get(key: RegistryKey<Recipe<*>>?) = this.method_64696(key)
/**
 * method_64698
 */
fun <I, T>PreparedRecipes.getAll(type: RecipeType<T>?) where I: RecipeInput, T: Recipe<I> = this.method_64698<I, T>(type)
