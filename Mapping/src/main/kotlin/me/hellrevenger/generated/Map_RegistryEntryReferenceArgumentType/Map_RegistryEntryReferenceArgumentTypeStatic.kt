package me.hellrevenger.generated.Map_RegistryEntryReferenceArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryEntryReferenceArgumentTypeKt {
    /**
     * field_40402
     */
    val INVALID_TYPE_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40402})
    /**
     * field_40401
     */
    val NOT_FOUND_EXCEPTION by aliasStatic({RegistryEntryReferenceArgumentType.field_40401})
    /**
     * method_45610
     */
    fun <T>getSummonableEntityType(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45610(context, name)
    /**
     * method_45603
     */
    fun <T>registryEntry(registryAccess: CommandRegistryAccess?, registryRef: RegistryKey<out Registry<T>>?) = RegistryEntryReferenceArgumentType.method_45603<T>(registryAccess, registryRef)
    /**
     * method_45607
     */
    fun <T>getConfiguredFeature(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45607(context, name)
    /**
     * method_45611
     */
    fun <T>getStatusEffect(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45611(context, name)
    /**
     * method_45601
     */
    fun <T>getEntityAttribute(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45601(context, name)
    /**
     * method_45612
     */
    fun <T>getEnchantment(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45612(context, name)
    /**
     * method_45602
     */
    fun <T>getRegistryEntry(context: CommandContext<ServerCommandSource>?, name: String?, registryRef: RegistryKey<Registry<T>>?) = RegistryEntryReferenceArgumentType.method_45602<T>(context, name, registryRef)
    /**
     * method_45608
     */
    fun <T>getStructure(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45608(context, name)
    /**
     * method_45609
     */
    fun <T>getEntityType(context: CommandContext<ServerCommandSource>?, name: String?) = RegistryEntryReferenceArgumentType.method_45609(context, name)
}