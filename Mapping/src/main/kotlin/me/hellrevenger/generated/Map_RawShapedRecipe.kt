package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RawShapedRecipe

val RawShapedRecipe.PACKET_CODEC by aliasStatic(RawShapedRecipe::field_48359)
fun KClass<RawShapedRecipe>.create(arg0: Map<Char, Ingredient>, arg1: List<String>) = RawShapedRecipe.method_55085(arg0, arg1)
fun KClass<RawShapedRecipe>.create(arg0: Map<Char, Ingredient>, arg1: Array<String>) = RawShapedRecipe.method_55086(arg0, *arg1)
fun RawShapedRecipe.matches(arg0: CraftingRecipeInput) = this.method_55078(arg0)
