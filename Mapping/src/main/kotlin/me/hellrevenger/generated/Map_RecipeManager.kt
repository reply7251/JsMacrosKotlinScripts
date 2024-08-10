package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeManager

fun <T, I>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: RecipeEntry<T>) where T: Recipe<I>, I: RecipeInput = this.method_59993<I, T>(arg0, arg1, arg2, arg3)
fun <T, I>KClass<RecipeManager>.createCachedMatchGetter(arg0: RecipeType<T>) where T: Recipe<I>, I: RecipeInput = RecipeManager.method_42302<I, T>(arg0)
fun <T, I>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World) where T: Recipe<I>, I: RecipeInput = this.method_8132<I, T>(arg0, arg1, arg2)
fun <T, I>RecipeManager.getRemainingStacks(arg0: RecipeType<T>, arg1: I, arg2: world_World) where T: Recipe<I>, I: RecipeInput = this.method_8128<I, T>(arg0, arg1, arg2)
fun RecipeManager.values() = this.method_8126()
fun RecipeManager.isErrored() = this.method_35227()
fun RecipeManager.setRecipes(arg0: Iterable<RecipeEntry<*>>) = this.method_20702(arg0)
fun RecipeManager.keys() = this.method_8127()
fun RecipeManager.get(arg0: Identifier) = this.method_8130(arg0)
fun <T, I>RecipeManager.listAllOfType(arg0: RecipeType<T>) where T: Recipe<I>, I: RecipeInput = this.method_30027<I, T>(arg0)
fun RecipeManager.sortedValues() = this.method_59822()
fun <T, I>RecipeManager.getAllMatches(arg0: RecipeType<T>, arg1: I, arg2: world_World) where T: Recipe<I>, I: RecipeInput = this.method_17877<I, T>(arg0, arg1, arg2)
fun <T, I>RecipeManager.getFirstMatch(arg0: RecipeType<T>, arg1: I, arg2: world_World, arg3: Identifier) where T: Recipe<I>, I: RecipeInput = this.method_42299<I, T>(arg0, arg1, arg2, arg3)
