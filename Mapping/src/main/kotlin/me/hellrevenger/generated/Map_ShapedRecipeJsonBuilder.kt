package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ShapedRecipeJsonBuilder

fun ShapedRecipeJsonBuilder.input(arg0: Char, arg1: ItemConvertible) = this.method_10434(arg0, arg1)
fun ShapedRecipeJsonBuilder.input(arg0: Char, arg1: TagKey<Item>) = this.method_10433(arg0, arg1)
fun KClass<ShapedRecipeJsonBuilder>.create(arg0: RecipeCategory, arg1: ItemConvertible) = ShapedRecipeJsonBuilder.method_10437(arg0, arg1)
fun ShapedRecipeJsonBuilder.criterion(arg0: String, arg1: AdvancementCriterion<*>) = this.method_10429(arg0, arg1)
fun ShapedRecipeJsonBuilder.pattern(arg0: String) = this.method_10439(arg0)
fun ShapedRecipeJsonBuilder.group(arg0: String) = this.method_10435(arg0)
fun ShapedRecipeJsonBuilder.input(arg0: Char, arg1: Ingredient) = this.method_10428(arg0, arg1)
fun KClass<ShapedRecipeJsonBuilder>.create(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Int) = ShapedRecipeJsonBuilder.method_10436(arg0, arg1, arg2)
fun ShapedRecipeJsonBuilder.showNotification(arg0: Boolean) = this.method_49380(arg0)
