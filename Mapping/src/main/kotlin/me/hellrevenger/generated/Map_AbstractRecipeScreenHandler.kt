package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractRecipeScreenHandler

fun <I, R>AbstractRecipeScreenHandler<I, R>.getCraftingHeight() where I: RecipeInput, R: Recipe<I> = this.method_7656()
fun <I, R>AbstractRecipeScreenHandler<I, R>.getCraftingResultSlotIndex() where I: RecipeInput, R: Recipe<I> = this.method_7655()
fun <I, R>AbstractRecipeScreenHandler<I, R>.getCraftingSlotCount() where I: RecipeInput, R: Recipe<I> = this.method_7658()
fun <I, R>AbstractRecipeScreenHandler<I, R>.canInsertIntoSlot(arg0: Int) where I: RecipeInput, R: Recipe<I> = this.method_32339(arg0)
fun <I, R>AbstractRecipeScreenHandler<I, R>.getCategory() where I: RecipeInput, R: Recipe<I> = this.method_30264()
fun <I, R>AbstractRecipeScreenHandler<I, R>.getCraftingWidth() where I: RecipeInput, R: Recipe<I> = this.method_7653()
fun <I, R>AbstractRecipeScreenHandler<I, R>.populateRecipeFinder(arg0: RecipeMatcher) where I: RecipeInput, R: Recipe<I> = this.method_7654(arg0)
fun <I, R>AbstractRecipeScreenHandler<I, R>.fillInputSlots(arg0: Boolean, arg1: RecipeEntry<*>, arg2: ServerPlayerEntity) where I: RecipeInput, R: Recipe<I> = this.method_17697(arg0, arg1, arg2)
fun <I, R>AbstractRecipeScreenHandler<I, R>.matches(arg0: RecipeEntry<R>) where I: RecipeInput, R: Recipe<I> = this.method_7652(arg0)
fun <I, R>AbstractRecipeScreenHandler<I, R>.clearCraftingSlots() where I: RecipeInput, R: Recipe<I> = this.method_7657()
