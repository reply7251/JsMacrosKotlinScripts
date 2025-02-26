package me.hellrevenger.generated.Map_BrewingRecipeRegistry
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_51402
 */
val KClass<BrewingRecipeRegistry>.EMPTY by aliasStatic(BrewingRecipeRegistry::field_51402)
/**
 * method_20361
 */
fun BrewingRecipeRegistry.isBrewable(arg0: RegistryEntry<Potion>) = this.method_20361(arg0)
/**
 * method_8069
 */
fun BrewingRecipeRegistry.isPotionRecipeIngredient(arg0: ItemStack) = this.method_8069(arg0)
/**
 * method_8077
 */
fun BrewingRecipeRegistry.isValidIngredient(arg0: ItemStack) = this.method_8077(arg0)
/**
 * method_8076
 */
fun KClass<BrewingRecipeRegistry>.create(arg0: FeatureSet) = BrewingRecipeRegistry.method_8076(arg0)
/**
 * method_8079
 */
fun BrewingRecipeRegistry.isItemRecipeIngredient(arg0: ItemStack) = this.method_8079(arg0)
/**
 * method_59699
 */
fun KClass<BrewingRecipeRegistry>.registerDefaults(arg0: net.minecraft.class_1845.class_9665) = BrewingRecipeRegistry.method_59699(arg0)
/**
 * method_8078
 */
fun BrewingRecipeRegistry.craft(arg0: ItemStack, arg1: ItemStack) = this.method_8078(arg0, arg1)
/**
 * method_8070
 */
fun BrewingRecipeRegistry.hasItemRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8070(arg0, arg1)
/**
 * method_8072
 */
fun BrewingRecipeRegistry.hasRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8072(arg0, arg1)
/**
 * method_8075
 */
fun BrewingRecipeRegistry.hasPotionRecipe(arg0: ItemStack, arg1: ItemStack) = this.method_8075(arg0, arg1)
