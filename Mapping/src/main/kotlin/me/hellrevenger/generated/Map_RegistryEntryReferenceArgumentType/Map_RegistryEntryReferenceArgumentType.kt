package me.hellrevenger.generated.Map_RegistryEntryReferenceArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40402
 */
val <T>KClass<RegistryEntryReferenceArgumentType<T>>.INVALID_TYPE_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40402})
/**
 * field_40401
 */
val <T>KClass<RegistryEntryReferenceArgumentType<T>>.NOT_FOUND_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40401})
/**
 * method_45610
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getSummonableEntityType(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45610(arg0, arg1)
/**
 * method_45603
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.registryEntry(arg0: CommandRegistryAccess, arg1: RegistryKey<out Registry<T>>) = RegistryEntryReferenceArgumentType.method_45603<T>(arg0, arg1)
/**
 * method_45607
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getConfiguredFeature(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45607(arg0, arg1)
/**
 * method_45611
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getStatusEffect(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45611(arg0, arg1)
/**
 * method_45601
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEntityAttribute(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45601(arg0, arg1)
/**
 * method_45612
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEnchantment(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45612(arg0, arg1)
/**
 * method_45602
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getRegistryEntry(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: RegistryKey<Registry<T>>) = RegistryEntryReferenceArgumentType.method_45602<T>(arg0, arg1, arg2)
/**
 * method_45608
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getStructure(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45608(arg0, arg1)
/**
 * method_45609
 */
fun <T>KClass<RegistryEntryReferenceArgumentType<T>>.getEntityType(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryEntryReferenceArgumentType.method_45609(arg0, arg1)
/**
 * method_45600
 */
fun <T>RegistryEntryReferenceArgumentType<T>.parse(arg0: StringReader) = this.method_45600(arg0)
