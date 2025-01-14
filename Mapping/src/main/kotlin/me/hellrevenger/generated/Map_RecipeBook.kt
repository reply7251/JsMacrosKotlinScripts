package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeBook

fun RecipeBook.setFilteringCraftable(arg0: RecipeBookCategory, arg1: Boolean) = this.method_30177(arg0, arg1)
fun RecipeBook.copyFrom(arg0: RecipeBook) = this.method_14875(arg0)
fun RecipeBook.onRecipeDisplayed(arg0: RecipeEntry<*>) = this.method_14886(arg0)
fun RecipeBook.add(arg0: RecipeEntry<*>) = this.method_14876(arg0)
fun RecipeBook.contains(arg0: RecipeEntry<*>) = this.method_14878(arg0)
fun RecipeBook.display(arg0: RecipeEntry<*>) = this.method_14885(arg0)
fun RecipeBook.isGuiOpen(arg0: RecipeBookCategory) = this.method_14887(arg0)
fun RecipeBook.setCategoryOptions(arg0: RecipeBookCategory, arg1: Boolean, arg2: Boolean) = this.method_30175(arg0, arg1, arg2)
fun RecipeBook.setGuiOpen(arg0: RecipeBookCategory, arg1: Boolean) = this.method_14884(arg0, arg1)
fun RecipeBook.shouldDisplay(arg0: RecipeEntry<*>) = this.method_14883(arg0)
fun RecipeBook.contains(arg0: Identifier) = this.method_22845(arg0)
fun RecipeBook.remove(arg0: RecipeEntry<*>) = this.method_14893(arg0)
fun RecipeBook.isFilteringCraftable(arg0: AbstractRecipeScreenHandler<*, *>) = this.method_14880(arg0)
fun RecipeBook.setOptions(arg0: RecipeBookOptions) = this.method_30174(arg0)
fun RecipeBook.getOptions() = this.method_30173()
fun RecipeBook.isFilteringCraftable(arg0: RecipeBookCategory) = this.method_30176(arg0)
