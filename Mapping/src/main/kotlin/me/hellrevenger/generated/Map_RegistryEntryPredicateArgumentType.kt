package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryEntryPredicateArgumentType

fun <T>RegistryEntryPredicateArgumentType<T>.parse(arg0: StringReader) = this.method_45635(arg0)
fun <T>KClass<RegistryEntryPredicateArgumentType<T>>.registryEntryPredicate(arg0: CommandRegistryAccess, arg1: RegistryKey<out Registry<T>>) = RegistryEntryPredicateArgumentType.method_45637<T>(arg0, arg1)
fun <T>KClass<RegistryEntryPredicateArgumentType<T>>.getRegistryEntryPredicate(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: RegistryKey<Registry<T>>) = RegistryEntryPredicateArgumentType.method_45636<T>(arg0, arg1, arg2)
