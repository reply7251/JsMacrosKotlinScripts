package me.hellrevenger.generated.Map_ServerRecipeManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_59993
 */
fun <I, T>ServerRecipeManager.getFirstMatch(type: RecipeType<T>, input: I, world: world_World, recipe: RecipeEntry<T>) where I: RecipeInput, T: Recipe<I> = this.method_59993<I, T>(type, input, world, recipe)
/**
 * method_64679
 */
fun ServerRecipeManager.forEachRecipeDisplay(key: RegistryKey<Recipe<*>>, action: Consumer<RecipeDisplayEntry>) = this.method_64679(key, action)
/**
 * method_64686
 */
fun ServerRecipeManager.get(id: NetworkRecipeId) = this.method_64686(id)
/**
 * method_64692
 */
fun ServerRecipeManager.getPropertySets() = this.method_64692()
/**
 * method_64694
 */
fun ServerRecipeManager.getStonecutterRecipeForSync() = this.method_64694()
/**
 * method_8126
 */
fun ServerRecipeManager.values() = this.method_8126()
/**
 * method_64681
 */
fun ServerRecipeManager.initialize(features: FeatureSet) = this.method_64681(features)
