package me.hellrevenger.generated.Map_RegistryKeyArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryKeyArgumentTypeKt {
    /**
     * method_43779
     */
    fun <T>getStructureEntry(context: CommandContext<ServerCommandSource>, name: String) = RegistryKeyArgumentType.method_43779(context, name)
    /**
     * method_41224
     */
    fun <T>registryKey(registryRef: RegistryKey<out Registry<T>>) = RegistryKeyArgumentType.method_41224<T>(registryRef)
    /**
     * method_64866
     */
    fun <T>getRecipeEntry(context: CommandContext<ServerCommandSource>, name: String) = RegistryKeyArgumentType.method_64866(context, name)
    /**
     * method_43780
     */
    fun <T>getStructurePoolEntry(context: CommandContext<ServerCommandSource>, name: String) = RegistryKeyArgumentType.method_43780(context, name)
    /**
     * method_41225
     */
    fun <T>getConfiguredFeatureEntry(context: CommandContext<ServerCommandSource>, name: String) = RegistryKeyArgumentType.method_41225(context, name)
    /**
     * method_64867
     */
    fun <T>getAdvancementEntry(context: CommandContext<ServerCommandSource>, name: String) = RegistryKeyArgumentType.method_64867(context, name)
}