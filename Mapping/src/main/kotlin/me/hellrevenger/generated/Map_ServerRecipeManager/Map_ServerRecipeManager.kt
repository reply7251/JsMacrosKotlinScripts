package me.hellrevenger.generated.Map_ServerRecipeManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_59993
 */
fun <I, T>ServerRecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: RecipeEntry<T>) where I: RecipeInput, T: Recipe<I> = this.method_59993<I, T>(arg0, arg1, arg2, arg3)
/**
 * method_42302
 */
fun <I, T>KClass<ServerRecipeManager>.createCachedMatchGetter(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = ServerRecipeManager.method_42302<I, T>(arg0)
/**
 * method_64679
 */
fun ServerRecipeManager.forEachRecipeDisplay(arg0: RegistryKey<Recipe<*>>, arg1: Consumer<RecipeDisplayEntry>) = this.method_64679(arg0, arg1)
/**
 * method_8132
 */
fun <I, T>ServerRecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_8132<I, T>(arg0, arg1, arg2)
/**
 * method_64686
 */
fun ServerRecipeManager.get(arg0: NetworkRecipeId) = this.method_64686(arg0)
/**
 * method_42299
 */
fun <I, T>ServerRecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: RegistryKey<Recipe<*>>) where I: RecipeInput, T: Recipe<I> = this.method_42299<I, T>(arg0, arg1, arg2, arg3)
/**
 * method_64692
 */
fun ServerRecipeManager.getPropertySets() = this.method_64692()
/**
 * method_64694
 */
fun ServerRecipeManager.getStonecutterRecipeForSync() = this.method_64694()
/**
 * method_8130
 */
fun ServerRecipeManager.get(arg0: RegistryKey<Recipe<*>>) = this.method_8130(arg0)
/**
 * method_8126
 */
fun ServerRecipeManager.values() = this.method_8126()
/**
 * method_64681
 */
fun ServerRecipeManager.initialize(arg0: FeatureSet) = this.method_64681(arg0)
