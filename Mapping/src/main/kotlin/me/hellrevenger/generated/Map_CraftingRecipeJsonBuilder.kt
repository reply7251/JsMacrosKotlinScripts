package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CraftingRecipeJsonBuilder

fun KClass<CraftingRecipeJsonBuilder>.toCraftingCategory(arg0: RecipeCategory) = CraftingRecipeJsonBuilder.method_55308(arg0)
fun CraftingRecipeJsonBuilder.offerTo(arg0: RecipeExporter, arg1: Identifier) = this.method_17972(arg0, arg1)
fun KClass<CraftingRecipeJsonBuilder>.getItemId(arg0: ItemConvertible) = CraftingRecipeJsonBuilder.method_36442(arg0)
fun CraftingRecipeJsonBuilder.criterion(arg0: String, arg1: AdvancementCriterion<*>) = this.method_33530(arg0, arg1)
fun CraftingRecipeJsonBuilder.getOutputItem() = this.method_36441()
fun CraftingRecipeJsonBuilder.group(arg0: String) = this.method_33529(arg0)
fun CraftingRecipeJsonBuilder.offerTo(arg0: RecipeExporter) = this.method_10431(arg0)
fun CraftingRecipeJsonBuilder.offerTo(arg0: RecipeExporter, arg1: String) = this.method_36443(arg0, arg1)
