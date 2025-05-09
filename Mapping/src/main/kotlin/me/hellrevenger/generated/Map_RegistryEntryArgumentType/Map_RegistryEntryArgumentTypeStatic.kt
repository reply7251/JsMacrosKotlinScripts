package me.hellrevenger.generated.Map_RegistryEntryArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryEntryArgumentTypeKt {
    /**
     * field_50037
     */
    val FAILED_TO_PARSE_EXCEPTION by aliasStatic({RegistryEntryArgumentType.field_50037})
    /**
     * method_58485
     */
    fun <T>getLootFunction(context: CommandContext<ServerCommandSource>, argument: String) = RegistryEntryArgumentType.method_58485(context, argument)
    /**
     * method_58488
     */
    fun <T>getLootCondition(context: CommandContext<ServerCommandSource>, argument: String) = RegistryEntryArgumentType.method_58488(context, argument)
    /**
     * method_58481
     */
    fun <T>getLootTable(context: CommandContext<ServerCommandSource>, argument: String) = RegistryEntryArgumentType.method_58481(context, argument)
    /**
     * method_58489
     */
    fun <T>lootCondition(registryAccess: CommandRegistryAccess) = RegistryEntryArgumentType.method_58489(registryAccess)
    /**
     * method_58486
     */
    fun <T>lootFunction(registryAccess: CommandRegistryAccess) = RegistryEntryArgumentType.method_58486(registryAccess)
    /**
     * method_58482
     */
    fun <T>lootTable(registryAccess: CommandRegistryAccess) = RegistryEntryArgumentType.method_58482(registryAccess)
}