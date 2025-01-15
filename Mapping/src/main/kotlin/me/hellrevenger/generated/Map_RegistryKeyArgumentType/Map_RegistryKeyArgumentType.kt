package me.hellrevenger.generated.Map_RegistryKeyArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>KClass<RegistryKeyArgumentType<T>>.getStructurePoolEntry(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryKeyArgumentType.method_43780(arg0, arg1)
fun <T>RegistryKeyArgumentType<T>.parse(arg0: StringReader) = this.method_41218(arg0)
fun <T>KClass<RegistryKeyArgumentType<T>>.getConfiguredFeatureEntry(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryKeyArgumentType.method_41225(arg0, arg1)
fun <T>KClass<RegistryKeyArgumentType<T>>.getStructureEntry(arg0: CommandContext<ServerCommandSource>, arg1: String) = RegistryKeyArgumentType.method_43779(arg0, arg1)
fun <T>KClass<RegistryKeyArgumentType<T>>.registryKey(arg0: RegistryKey<out Registry<T>>) = RegistryKeyArgumentType.method_41224<T>(arg0)
