package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryEntryReferenceArgumentType

val <T>RegistryEntryReferenceArgumentType<T>.INVALID_TYPE_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40402})
val <T>RegistryEntryReferenceArgumentType<T>.NOT_FOUND_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40401})
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getSummonableEntityType(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45610(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.registryEntry(arg0: CommandRegistryAccess, arg1: RegistryKey<out Registry<T>>) = RegistryEntryReferenceArgumentType.method_45603<T>(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getConfiguredFeature(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45607(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getStatusEffect(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45611(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEntityAttribute(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45601(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEnchantment(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45612(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getRegistryEntry(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: RegistryKey<Registry<T>>) = RegistryEntryReferenceArgumentType.method_45602<T>(arg0, arg1, arg2)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getStructure(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45608(arg0, arg1)
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEntityType(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45609(arg0, arg1)
fun <T>RegistryEntryReferenceArgumentType<T>.parse(arg0: StringReader) = this.method_45600(arg0)
