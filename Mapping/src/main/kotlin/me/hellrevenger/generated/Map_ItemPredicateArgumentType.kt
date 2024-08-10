package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemPredicateArgumentType

fun KClass<ItemPredicateArgumentType>.getItemStackPredicate(arg0: CommandContext<ServerCommandSource>, arg1: String) = ItemPredicateArgumentType.method_9804(arg0, arg1)
fun ItemPredicateArgumentType.parse(arg0: StringReader) = this.method_9800(arg0)
fun KClass<ItemPredicateArgumentType>.itemPredicate(arg0: CommandRegistryAccess) = ItemPredicateArgumentType.method_9801(arg0)
