package me.hellrevenger.generated.Map_RegistryPredicateArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryPredicateArgumentTypeKt {
    /**
     * method_41166
     */
    fun <T>getPredicate(context: CommandContext<ServerCommandSource>?, name: String?, registryRef: RegistryKey<Registry<T>>?, invalidException: DynamicCommandExceptionType?) = RegistryPredicateArgumentType.method_41166<T>(context, name, registryRef, invalidException)
    /**
     * method_41170
     */
    fun <T>registryPredicate(registryRef: RegistryKey<out Registry<T>>?) = RegistryPredicateArgumentType.method_41170<T>(registryRef)
}