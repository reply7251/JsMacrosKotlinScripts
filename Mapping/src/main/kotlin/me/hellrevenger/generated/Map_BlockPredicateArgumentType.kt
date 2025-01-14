package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockPredicateArgumentType

fun KClass<BlockPredicateArgumentType>.parse(arg0: RegistryWrapper<Block>, arg1: StringReader) = BlockPredicateArgumentType.method_41953(arg0, arg1)
fun BlockPredicateArgumentType.parse(arg0: StringReader) = this.method_9642(arg0)
fun KClass<BlockPredicateArgumentType>.getBlockPredicate(arg0: CommandContext<ServerCommandSource>, arg1: String) = BlockPredicateArgumentType.method_9644(arg0, arg1)
fun KClass<BlockPredicateArgumentType>.blockPredicate(arg0: CommandRegistryAccess) = BlockPredicateArgumentType.method_9645(arg0)
