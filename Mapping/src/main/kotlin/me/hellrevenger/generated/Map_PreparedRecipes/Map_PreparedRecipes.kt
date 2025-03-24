package me.hellrevenger.generated.Map_PreparedRecipes
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54643
 */
val KClass<PreparedRecipes>.EMPTY by aliasStatic(PreparedRecipes::field_54643)
/**
 * method_64700
 */
fun KClass<PreparedRecipes>.of(arg0: Iterable<RecipeEntry<*>>) = PreparedRecipes.method_64700(arg0)
/**
 * method_64699
 */
fun <I, T>PreparedRecipes.find(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_64699<I, T>(arg0, arg1, arg2)
/**
 * method_64695
 */
fun PreparedRecipes.recipes() = this.method_64695()
/**
 * method_64696
 */
fun PreparedRecipes.get(arg0: RegistryKey<Recipe<*>>) = this.method_64696(arg0)
/**
 * method_64698
 */
fun <I, T>PreparedRecipes.getAll(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = this.method_64698<I, T>(arg0)
