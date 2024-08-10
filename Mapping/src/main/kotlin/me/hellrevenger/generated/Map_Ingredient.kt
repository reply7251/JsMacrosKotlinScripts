package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Ingredient

val Ingredient.EMPTY by aliasStatic(Ingredient::field_9017)
val Ingredient.ALLOW_EMPTY_CODEC by aliasStatic(Ingredient::field_46095)
val Ingredient.matchingStacks by alias(Ingredient::field_9018)
val Ingredient.PACKET_CODEC by aliasStatic(Ingredient::field_48355)
val Ingredient.DISALLOW_EMPTY_CODEC by aliasStatic(Ingredient::field_46096)
fun KClass<Ingredient>.ofStacks(arg0: Array<ItemStack>) = Ingredient.method_8101(*arg0)
fun KClass<Ingredient>.fromTag(arg0: TagKey<Item>) = Ingredient.method_8106(arg0)
fun Ingredient.test(arg0: ItemStack) = this.method_8093(arg0)
fun KClass<Ingredient>.ofItems(arg0: Array<ItemConvertible>) = Ingredient.method_8091(*arg0)
fun KClass<Ingredient>.empty() = Ingredient.method_35226()
fun Ingredient.isEmpty() = this.method_8103()
fun Ingredient.getMatchingItemIds() = this.method_8100()
fun KClass<Ingredient>.ofStacks(arg0: Stream<ItemStack>) = Ingredient.method_26964(arg0)
