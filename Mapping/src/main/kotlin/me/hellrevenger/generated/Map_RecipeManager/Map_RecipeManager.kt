package me.hellrevenger.generated.Map_RecipeManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_48848
 */
val RecipeManager.registryLookup by alias(RecipeManager::field_48848)
/**
 * method_59993
 */
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: RecipeEntry<T>) where I: RecipeInput, T: Recipe<I> = this.method_59993<I, T>(arg0, arg1, arg2, arg3)
/**
 * method_42302
 */
fun <I, T>KClass<RecipeManager>.createCachedMatchGetter(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = RecipeManager.method_42302<I, T>(arg0)
/**
 * method_8132
 */
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_8132<I, T>(arg0, arg1, arg2)
/**
 * method_8128
 */
fun <I, T>RecipeManager.getRemainingStacks(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_8128<I, T>(arg0, arg1, arg2)
/**
 * method_8126
 */
fun RecipeManager.values() = this.method_8126()
/**
 * method_35227
 */
fun RecipeManager.isErrored() = this.method_35227()
/**
 * method_20702
 */
fun RecipeManager.setRecipes(arg0: Iterable<RecipeEntry<*>>) = this.method_20702(arg0)
/**
 * method_8127
 */
fun RecipeManager.keys() = this.method_8127()
/**
 * method_8130
 */
fun RecipeManager.get(arg0: Identifier) = this.method_8130(arg0)
/**
 * method_30027
 */
fun <I, T>RecipeManager.listAllOfType(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = this.method_30027<I, T>(arg0)
/**
 * method_59822
 */
fun RecipeManager.sortedValues() = this.method_59822()
/**
 * method_17877
 */
fun <I, T>RecipeManager.getAllMatches(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_17877<I, T>(arg0, arg1, arg2)
/**
 * method_42299
 */
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: Identifier) where I: RecipeInput, T: Recipe<I> = this.method_42299<I, T>(arg0, arg1, arg2, arg3)
