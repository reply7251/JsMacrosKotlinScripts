package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryEntryArgumentType

val <T>RegistryEntryArgumentType<T>.FAILED_TO_PARSE_EXCEPTION by aliasStatic({RegistryEntryArgumentType.field_50037})
fun <T>RegistryEntryArgumentType<T>.parse(arg0: StringReader) = this.method_58479(arg0)
fun <T>KClass<RegistryEntryArgumentType<T>>.getLootFunction(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryArgumentType.method_58485(arg0, arg1)
fun <T>KClass<RegistryEntryArgumentType<T>>.getLootCondition(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryArgumentType.method_58488(arg0, arg1)
fun <T>KClass<RegistryEntryArgumentType<T>>.getLootTable(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryArgumentType.method_58481(arg0, arg1)
fun <T>KClass<RegistryEntryArgumentType<T>>.lootCondition(arg0: CommandRegistryAccess) = RegistryEntryArgumentType.method_58489(arg0)
fun <T>KClass<RegistryEntryArgumentType<T>>.lootFunction(arg0: CommandRegistryAccess) = RegistryEntryArgumentType.method_58486(arg0)
fun <T>KClass<RegistryEntryArgumentType<T>>.lootTable(arg0: CommandRegistryAccess) = RegistryEntryArgumentType.method_58482(arg0)
