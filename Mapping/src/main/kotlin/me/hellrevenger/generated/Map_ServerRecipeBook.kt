package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerRecipeBook

val KClass<ServerRecipeBook>.RECIPE_BOOK_KEY by aliasStatic(ServerRecipeBook::field_29820)
fun ServerRecipeBook.toNbt() = this.method_14902()
fun ServerRecipeBook.sendInitRecipesPacket(arg0: ServerPlayerEntity) = this.method_14904(arg0)
fun ServerRecipeBook.unlockRecipes(arg0: Collection<RecipeEntry<*>>, arg1: ServerPlayerEntity) = this.method_14903(arg0, arg1)
fun ServerRecipeBook.lockRecipes(arg0: Collection<RecipeEntry<*>>, arg1: ServerPlayerEntity) = this.method_14900(arg0, arg1)
fun ServerRecipeBook.readNbt(arg0: NbtCompound, arg1: RecipeManager) = this.method_14901(arg0, arg1)
