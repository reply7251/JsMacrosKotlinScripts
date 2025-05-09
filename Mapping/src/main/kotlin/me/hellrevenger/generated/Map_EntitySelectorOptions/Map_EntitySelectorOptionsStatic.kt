package me.hellrevenger.generated.Map_EntitySelectorOptions
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EntitySelectorOptionsKt {
    /**
     * field_10887
     */
    val INAPPLICABLE_OPTION_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10887)
    /**
     * field_10893
     */
    val NEGATIVE_LEVEL_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10893)
    /**
     * field_10886
     */
    val TOO_SMALL_LEVEL_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10886)
    /**
     * field_10890
     */
    val NEGATIVE_DISTANCE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10890)
    /**
     * field_10885
     */
    val UNKNOWN_OPTION_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10885)
    /**
     * field_10889
     */
    val INVALID_MODE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10889)
    /**
     * field_10892
     */
    val INVALID_TYPE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10892)
    /**
     * field_10888
     */
    val IRREVERSIBLE_SORT_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10888)
    /**
     * method_9960
     */
    fun register() = EntitySelectorOptions.method_9960()
    /**
     * method_9930
     */
    fun suggestOptions(reader: EntitySelectorReader, suggestionBuilder: SuggestionsBuilder) = EntitySelectorOptions.method_9930(reader, suggestionBuilder)
    /**
     * method_9976
     */
    fun getHandler(reader: EntitySelectorReader, option: String, restoreCursor: Int) = EntitySelectorOptions.method_9976(reader, option, restoreCursor)
}