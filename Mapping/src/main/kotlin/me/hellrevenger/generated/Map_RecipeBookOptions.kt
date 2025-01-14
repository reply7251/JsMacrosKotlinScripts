package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeBookOptions

fun RecipeBookOptions.isGuiOpen(arg0: RecipeBookCategory) = this.method_30180(arg0)
fun KClass<RecipeBookOptions>.fromPacket(arg0: PacketByteBuf) = RecipeBookOptions.method_30186(arg0)
fun RecipeBookOptions.toPacket(arg0: PacketByteBuf) = this.method_30190(arg0)
fun RecipeBookOptions.copy() = this.method_30178()
fun RecipeBookOptions.writeNbt(arg0: NbtCompound) = this.method_30189(arg0)
fun RecipeBookOptions.setFilteringCraftable(arg0: RecipeBookCategory, arg1: Boolean) = this.method_30188(arg0, arg1)
fun RecipeBookOptions.copyFrom(arg0: RecipeBookOptions) = this.method_30179(arg0)
fun RecipeBookOptions.setGuiOpen(arg0: RecipeBookCategory, arg1: Boolean) = this.method_30181(arg0, arg1)
fun KClass<RecipeBookOptions>.fromNbt(arg0: NbtCompound) = RecipeBookOptions.method_30183(arg0)
fun RecipeBookOptions.isFilteringCraftable(arg0: RecipeBookCategory) = this.method_30187(arg0)
