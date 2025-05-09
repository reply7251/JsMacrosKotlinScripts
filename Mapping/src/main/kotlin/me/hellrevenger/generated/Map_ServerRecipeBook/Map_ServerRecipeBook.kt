package me.hellrevenger.generated.Map_ServerRecipeBook
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_14901
 */
fun ServerRecipeBook.readNbt(nbt: NbtCompound, validPredicate: Predicate<RegistryKey<Recipe<*>>>) = this.method_14901(nbt, validPredicate)
/**
 * method_14904
 */
fun ServerRecipeBook.sendInitRecipesPacket(player: ServerPlayerEntity) = this.method_14904(player)
/**
 * method_14903
 */
fun ServerRecipeBook.unlockRecipes(recipes: Collection<RecipeEntry<*>>, player: ServerPlayerEntity) = this.method_14903(recipes, player)
/**
 * method_14900
 */
fun ServerRecipeBook.lockRecipes(recipes: Collection<RecipeEntry<*>>, player: ServerPlayerEntity) = this.method_14900(recipes, player)
/**
 * method_64588
 */
fun ServerRecipeBook.unlock(recipeKey: RegistryKey<Recipe<*>>) = this.method_64588(recipeKey)
/**
 * method_64594
 */
fun ServerRecipeBook.lock(recipeKey: RegistryKey<Recipe<*>>) = this.method_64594(recipeKey)
/**
 * method_14902
 */
fun ServerRecipeBook.toNbt() = this.method_14902()
/**
 * method_64595
 */
fun ServerRecipeBook.unmarkHighlighted(recipeKey: RegistryKey<Recipe<*>>) = this.method_64595(recipeKey)
/**
 * method_64589
 */
fun ServerRecipeBook.copyFrom(recipeBook: ServerRecipeBook) = this.method_64589(recipeBook)
/**
 * method_64593
 */
fun ServerRecipeBook.isUnlocked(recipeKey: RegistryKey<Recipe<*>>) = this.method_64593(recipeKey)
