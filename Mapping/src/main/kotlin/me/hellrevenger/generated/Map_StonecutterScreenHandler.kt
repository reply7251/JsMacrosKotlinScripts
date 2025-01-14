package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StonecutterScreenHandler

val KClass<StonecutterScreenHandler>.INPUT_ID by aliasStatic(StonecutterScreenHandler::field_30842)
val StonecutterScreenHandler.input by alias(StonecutterScreenHandler::field_17629)
val KClass<StonecutterScreenHandler>.OUTPUT_ID by aliasStatic(StonecutterScreenHandler::field_30843)
fun StonecutterScreenHandler.canCraft() = this.method_17865()
fun StonecutterScreenHandler.setContentsChangedListener(arg0: Runnable) = this.method_17859(arg0)
fun StonecutterScreenHandler.getAvailableRecipeCount() = this.method_17864()
fun StonecutterScreenHandler.getSelectedRecipe() = this.method_17862()
fun StonecutterScreenHandler.getAvailableRecipes() = this.method_17863()
