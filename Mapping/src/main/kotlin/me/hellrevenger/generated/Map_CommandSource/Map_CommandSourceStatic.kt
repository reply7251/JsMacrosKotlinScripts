package me.hellrevenger.generated.Map_CommandSource
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CommandSourceKt {
    /**
     * method_27136
     */
    fun shouldSuggest(remaining: String, candidate: String) = CommandSource.method_27136(remaining, candidate)
    /**
     * method_9271
     */
    fun <T>suggestFromIdentifier(candidates: Stream<T>, builder: SuggestionsBuilder, identifier: function_Function<T, Identifier>, tooltip: function_Function<T, Message>) = CommandSource.method_9271<T>(candidates, builder, identifier, tooltip)
    /**
     * method_9250
     */
    fun <T>forEachMatching(candidates: Iterable<T>, remaining: String, prefix: String, identifier: function_Function<T, Identifier>, action: Consumer<T>) = CommandSource.method_9250<T>(candidates, remaining, prefix, identifier, action)
    /**
     * method_9253
     */
    fun suggestMatching(candidates: Array<String>, builder: SuggestionsBuilder) = CommandSource.method_9253(candidates, builder)
    /**
     * method_9252
     */
    fun suggestColumnPositions(remaining: String, candidates: Collection<net.minecraft.class_2172.class_2173>, builder: SuggestionsBuilder, predicate: Predicate<String>) = CommandSource.method_9252(remaining, candidates, builder, predicate)
    /**
     * method_9260
     */
    fun suggestPositions(remaining: String, candidates: Collection<net.minecraft.class_2172.class_2173>, builder: SuggestionsBuilder, predicate: Predicate<String>) = CommandSource.method_9260(remaining, candidates, builder, predicate)
}