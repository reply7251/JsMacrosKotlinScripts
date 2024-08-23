package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeManager

val RecipeManager.registryLookup by alias(RecipeManager::field_48848)
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: RecipeEntry<T>) where I: RecipeInput, T: Recipe<I> = this.method_59993<I, T>(arg0, arg1, arg2, arg3)
fun <I, T>KClass<RecipeManager>.createCachedMatchGetter(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = RecipeManager.method_42302<I, T>(arg0)
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_8132<I, T>(arg0, arg1, arg2)
fun <I, T>RecipeManager.getRemainingStacks(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_8128<I, T>(arg0, arg1, arg2)
fun RecipeManager.values() = this.method_8126()
fun RecipeManager.isErrored() = this.method_35227()
fun RecipeManager.setRecipes(arg0: Iterable<RecipeEntry<*>>) = this.method_20702(arg0)
fun RecipeManager.keys() = this.method_8127()
fun RecipeManager.get(arg0: Identifier) = this.method_8130(arg0)
fun <I, T>RecipeManager.listAllOfType(arg0: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = this.method_30027<I, T>(arg0)
fun RecipeManager.sortedValues() = this.method_59822()
fun <I, T>RecipeManager.getAllMatches(arg0: RecipeType<T>, arg1: I, arg2: world_World) where I: RecipeInput, T: Recipe<I> = this.method_17877<I, T>(arg0, arg1, arg2)
fun <I, T>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: Identifier) where I: RecipeInput, T: Recipe<I> = this.method_42299<I, T>(arg0, arg1, arg2, arg3)
