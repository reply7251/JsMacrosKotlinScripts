package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CraftingRecipeInput

val CraftingRecipeInput.EMPTY by aliasStatic(CraftingRecipeInput::field_51631)
fun CraftingRecipeInput.getRecipeMatcher() = this.method_59988()
fun KClass<CraftingRecipeInput>.createPositioned(arg0: Int, arg1: Int, arg2: List<ItemStack>) = CraftingRecipeInput.method_60505(arg0, arg1, arg2)
fun CraftingRecipeInput.getStackInSlot(arg0: Int, arg1: Int) = this.method_59985(arg0, arg1)
fun KClass<CraftingRecipeInput>.create(arg0: Int, arg1: Int, arg2: List<ItemStack>) = CraftingRecipeInput.method_59986(arg0, arg1, arg2)
