package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemStackArgumentType

fun ItemStackArgumentType.parse(arg0: StringReader) = this.method_9778(arg0)
fun <S>KClass<ItemStackArgumentType>.getItemStackArgument(arg0: CommandContext<S>, arg1: String) = ItemStackArgumentType.method_9777<S>(arg0, arg1)
fun KClass<ItemStackArgumentType>.itemStack(arg0: CommandRegistryAccess) = ItemStackArgumentType.method_9776(arg0)
