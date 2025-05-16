package me.hellrevenger.generated.Map_SuggestionProviders
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SuggestionProvidersKt {
    /**
     * field_10935
     */
    val SUMMONABLE_ENTITIES by aliasStatic(SuggestionProviders::field_10935)
    /**
     * field_10933
     */
    val ASK_SERVER by aliasStatic(SuggestionProviders::field_10933)
    /**
     * field_10934
     */
    val AVAILABLE_SOUNDS by aliasStatic(SuggestionProviders::field_10934)
    /**
     * method_10024
     */
    fun byId(id: Identifier?) = SuggestionProviders.method_10024(id)
    /**
     * method_10026
     */
    fun getLocalProvider(provider: SuggestionProvider<CommandSource>?) = SuggestionProviders.method_10026(provider)
    /**
     * method_10027
     */
    fun computeId(provider: SuggestionProvider<CommandSource>?) = SuggestionProviders.method_10027(provider)
    /**
     * method_10022
     */
    fun <S>register(id: Identifier?, provider: SuggestionProvider<CommandSource>?) where S: CommandSource = SuggestionProviders.method_10022<S>(id, provider)
}