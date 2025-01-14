package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BrewingRecipeRegistry

val KClass<BrewingRecipeRegistry>.EMPTY by aliasStatic(BrewingRecipeRegistry::field_51402)
fun BrewingRecipeRegistry.isBrewable(arg0: RegistryEntry<Potion>) = this.method_20361(arg0)
fun BrewingRecipeRegistry.isPotionRecipeIngredient(arg0: ItemStack) = this.method_8069(arg0)
fun BrewingRecipeRegistry.isValidIngredient(arg0: ItemStack) = this.method_8077(arg0)
fun KClass<BrewingRecipeRegistry>.create(arg0: FeatureSet) = BrewingRecipeRegistry.method_8076(arg0)
fun BrewingRecipeRegistry.isItemRecipeIngredient(arg0: ItemStack) = this.method_8079(arg0)
fun KClass<BrewingRecipeRegistry>.registerDefaults(arg0: net.minecraft.class_1845.class_9665) = BrewingRecipeRegistry.method_59699(arg0)
fun BrewingRecipeRegistry.craft(arg0: ItemStack, arg1: ItemStack) = this.method_8078(arg0, arg1)
fun BrewingRecipeRegistry.hasItemRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8070(arg0, arg1)
fun BrewingRecipeRegistry.hasRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8072(arg0, arg1)
fun BrewingRecipeRegistry.hasPotionRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8075(arg0, arg1)
