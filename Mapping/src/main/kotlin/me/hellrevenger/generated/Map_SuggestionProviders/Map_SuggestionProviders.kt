package me.hellrevenger.generated.Map_SuggestionProviders
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SuggestionProviders>.SUMMONABLE_ENTITIES by aliasStatic(SuggestionProviders::field_10935)
val KClass<SuggestionProviders>.ALL_RECIPES by aliasStatic(SuggestionProviders::field_10932)
val KClass<SuggestionProviders>.ASK_SERVER by aliasStatic(SuggestionProviders::field_10933)
val KClass<SuggestionProviders>.AVAILABLE_SOUNDS by aliasStatic(SuggestionProviders::field_10934)
fun KClass<SuggestionProviders>.byId(arg0: Identifier) = SuggestionProviders.method_10024(arg0)
fun KClass<SuggestionProviders>.getLocalProvider(arg0: SuggestionProvider<CommandSource>) = SuggestionProviders.method_10026(arg0)
fun KClass<SuggestionProviders>.computeId(arg0: SuggestionProvider<CommandSource>) = SuggestionProviders.method_10027(arg0)
fun <S>KClass<SuggestionProviders>.register(arg0: Identifier, arg1: SuggestionProvider<CommandSource>) where S: CommandSource = SuggestionProviders.method_10022<S>(arg0, arg1)
