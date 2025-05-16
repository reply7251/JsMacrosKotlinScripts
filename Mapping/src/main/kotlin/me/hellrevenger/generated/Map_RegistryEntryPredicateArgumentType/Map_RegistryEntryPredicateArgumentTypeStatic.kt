package me.hellrevenger.generated.Map_RegistryEntryPredicateArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryEntryPredicateArgumentTypeKt {
    /**
     * method_45637
     */
    fun <T>registryEntryPredicate(registryRef: CommandRegistryAccess?, registryAccess: RegistryKey<out Registry<T>>?) = RegistryEntryPredicateArgumentType.method_45637<T>(registryRef, registryAccess)
    /**
     * method_45636
     */
    fun <T>getRegistryEntryPredicate(context: CommandContext<ServerCommandSource>?, name: String?, registryRef: RegistryKey<Registry<T>>?) = RegistryEntryPredicateArgumentType.method_45636<T>(context, name, registryRef)
}