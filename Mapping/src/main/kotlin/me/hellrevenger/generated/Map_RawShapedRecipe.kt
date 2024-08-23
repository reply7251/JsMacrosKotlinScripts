package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RawShapedRecipe

fun RawShapedRecipe.getWidth() = this.method_59995()
fun KClass<RawShapedRecipe>.create(arg0: Map<Char, Ingredient>, arg1: MutableList<String>) = RawShapedRecipe.method_55085(arg0, arg1)
fun KClass<RawShapedRecipe>.create(arg0: Map<Char, Ingredient>, arg1: Array<String>) = RawShapedRecipe.method_55086(arg0, *arg1)
fun RawShapedRecipe.getHeight() = this.method_59996()
fun RawShapedRecipe.getIngredients() = this.method_59997()
fun RawShapedRecipe.matches(arg0: CraftingRecipeInput) = this.method_55078(arg0)
