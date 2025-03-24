package me.hellrevenger.generated.Map_SuggestionProviders
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_10935
 */
val KClass<SuggestionProviders>.SUMMONABLE_ENTITIES by aliasStatic(SuggestionProviders::field_10935)
/**
 * field_10933
 */
val KClass<SuggestionProviders>.ASK_SERVER by aliasStatic(SuggestionProviders::field_10933)
/**
 * field_10934
 */
val KClass<SuggestionProviders>.AVAILABLE_SOUNDS by aliasStatic(SuggestionProviders::field_10934)
/**
 * method_10024
 */
fun KClass<SuggestionProviders>.byId(arg0: Identifier) = SuggestionProviders.method_10024(arg0)
/**
 * method_10026
 */
fun KClass<SuggestionProviders>.getLocalProvider(arg0: SuggestionProvider<CommandSource>) = SuggestionProviders.method_10026(arg0)
/**
 * method_10027
 */
fun KClass<SuggestionProviders>.computeId(arg0: SuggestionProvider<CommandSource>) = SuggestionProviders.method_10027(arg0)
/**
 * method_10022
 */
fun <S>KClass<SuggestionProviders>.register(arg0: Identifier, arg1: SuggestionProvider<CommandSource>) where S: CommandSource = SuggestionProviders.method_10022<S>(arg0, arg1)
