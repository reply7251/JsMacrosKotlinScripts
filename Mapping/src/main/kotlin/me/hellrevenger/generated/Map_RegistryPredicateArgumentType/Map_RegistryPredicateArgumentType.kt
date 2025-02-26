package me.hellrevenger.generated.Map_RegistryPredicateArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41166
 */
fun <T>KClass<RegistryPredicateArgumentType<T>>.getPredicate(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: RegistryKey<Registry<T>>, arg3: DynamicCommandExceptionType) = RegistryPredicateArgumentType.method_41166<T>(arg0, arg1, arg2, arg3)
/**
 * method_41164
 */
fun <T>RegistryPredicateArgumentType<T>.parse(arg0: StringReader) = this.method_41164(arg0)
/**
 * method_41170
 */
fun <T>KClass<RegistryPredicateArgumentType<T>>.registryPredicate(arg0: RegistryKey<out Registry<T>>) = RegistryPredicateArgumentType.method_41170<T>(arg0)
