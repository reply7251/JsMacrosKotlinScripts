package me.hellrevenger.generated.Map_CommandSource
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CommandSourceKt {
    /**
     * method_27136
     */
    fun shouldSuggest(remaining: String, candidate: String) = CommandSource.method_27136(remaining, candidate)
    /**
     * method_9270
     */
    fun suggestIdentifiers(candidates: Iterable<Identifier>, builder: SuggestionsBuilder) = CommandSource.method_9270(candidates, builder)
    /**
     * method_9271
     */
    fun <T>suggestFromIdentifier(candidates: Stream<T>, builder: SuggestionsBuilder, identifier: function_Function<T, Identifier>, tooltip: function_Function<T, Message>) = CommandSource.method_9271<T>(candidates, builder, identifier, tooltip)
    /**
     * method_9250
     */
    fun <T>forEachMatching(candidates: Iterable<T>, remaining: String, prefix: String, identifier: function_Function<T, Identifier>, action: Consumer<T>) = CommandSource.method_9250<T>(candidates, remaining, prefix, identifier, action)
    /**
     * method_9257
     */
    fun suggestIdentifiers(candidates: Stream<Identifier>, builder: SuggestionsBuilder) = CommandSource.method_9257(candidates, builder)
    /**
     * method_9253
     */
    fun suggestMatching(candidates: Array<String>, builder: SuggestionsBuilder) = CommandSource.method_9253(candidates, builder)
    /**
     * method_9258
     */
    fun suggestIdentifiers(candidates: Iterable<Identifier>, builder: SuggestionsBuilder, prefix: String) = CommandSource.method_9258(candidates, builder, prefix)
    /**
     * method_9252
     */
    fun suggestColumnPositions(remaining: String, candidates: Collection<net.minecraft.class_2172.class_2173>, builder: SuggestionsBuilder, predicate: Predicate<String>) = CommandSource.method_9252(remaining, candidates, builder, predicate)
    /**
     * method_9268
     */
    fun <T>forEachMatching(candidates: Iterable<T>, remaining: String, identifier: function_Function<T, Identifier>, action: Consumer<T>) = CommandSource.method_9268<T>(candidates, remaining, identifier, action)
    /**
     * method_9255
     */
    fun <T>suggestFromIdentifier(candidates: Iterable<T>, builder: SuggestionsBuilder, identifier: function_Function<T, Identifier>, tooltip: function_Function<T, Message>) = CommandSource.method_9255<T>(candidates, builder, identifier, tooltip)
    /**
     * method_9260
     */
    fun suggestPositions(remaining: String, candidates: Collection<net.minecraft.class_2172.class_2173>, builder: SuggestionsBuilder, predicate: Predicate<String>) = CommandSource.method_9260(remaining, candidates, builder, predicate)
    /**
     * method_40182
     */
    fun suggestIdentifiers(candidates: Stream<Identifier>, builder: SuggestionsBuilder, prefix: String) = CommandSource.method_40182(candidates, builder, prefix)
    /**
     * method_9264
     */
    fun suggestMatching(candidates: Stream<String>, builder: SuggestionsBuilder) = CommandSource.method_9264(candidates, builder)
    /**
     * method_9265
     */
    fun suggestMatching(candidates: Iterable<String>, builder: SuggestionsBuilder) = CommandSource.method_9265(candidates, builder)
    /**
     * method_35510
     */
    fun <T>suggestMatching(candidates: Iterable<T>, builder: SuggestionsBuilder, suggestionText: function_Function<T, String>, tooltip: function_Function<T, Message>) = CommandSource.method_35510<T>(candidates, builder, suggestionText, tooltip)
}