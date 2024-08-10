package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AndLootFunction

val AndLootFunction.INLINE_CODEC by aliasStatic(AndLootFunction::field_45835)
fun AndLootFunction.apply(arg0: ItemStack, arg1: LootContext) = this.method_32405(arg0, arg1)
fun KClass<AndLootFunction>.create(arg0: List<LootFunction>) = AndLootFunction.method_53353(arg0)
