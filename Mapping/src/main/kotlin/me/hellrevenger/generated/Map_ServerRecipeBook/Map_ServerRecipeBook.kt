package me.hellrevenger.generated.Map_ServerRecipeBook
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_29820
 */
val KClass<ServerRecipeBook>.RECIPE_BOOK_KEY by aliasStatic(ServerRecipeBook::field_29820)
/**
 * method_14902
 */
fun ServerRecipeBook.toNbt() = this.method_14902()
/**
 * method_14904
 */
fun ServerRecipeBook.sendInitRecipesPacket(arg0: ServerPlayerEntity) = this.method_14904(arg0)
/**
 * method_14903
 */
fun ServerRecipeBook.unlockRecipes(arg0: Collection<RecipeEntry<*>>, arg1: ServerPlayerEntity) = this.method_14903(arg0, arg1)
/**
 * method_14900
 */
fun ServerRecipeBook.lockRecipes(arg0: Collection<RecipeEntry<*>>, arg1: ServerPlayerEntity) = this.method_14900(arg0, arg1)
/**
 * method_14901
 */
fun ServerRecipeBook.readNbt(arg0: NbtCompound, arg1: RecipeManager) = this.method_14901(arg0, arg1)
