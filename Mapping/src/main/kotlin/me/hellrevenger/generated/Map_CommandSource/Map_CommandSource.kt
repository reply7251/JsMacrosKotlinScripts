package me.hellrevenger.generated.Map_CommandSource
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41214
 */
fun CommandSource.suggestIdentifiers(arg0: Registry<*>, arg1: net.minecraft.class_2172.class_7078, arg2: SuggestionsBuilder) = this.method_41214(arg0, arg1, arg2)
/**
 * method_27136
 */
fun KClass<CommandSource>.shouldSuggest(arg0: String, arg1: String) = CommandSource.method_27136(arg0, arg1)
/**
 * method_9261
 */
fun CommandSource.getCompletions(arg0: CommandContext<*>) = this.method_9261(arg0)
/**
 * method_9270
 */
fun KClass<CommandSource>.suggestIdentifiers(arg0: Iterable<Identifier>, arg1: SuggestionsBuilder) = CommandSource.method_9270(arg0, arg1)
/**
 * method_9271
 */
fun <T>KClass<CommandSource>.suggestFromIdentifier(arg0: Stream<T>, arg1: SuggestionsBuilder, arg2: function_Function<T, Identifier>, arg3: function_Function<T, Message>) = CommandSource.method_9271<T>(arg0, arg1, arg2, arg3)
/**
 * method_17771
 */
fun CommandSource.getBlockPositionSuggestions() = this.method_17771()
/**
 * method_9267
 */
fun CommandSource.getTeamNames() = this.method_9267()
/**
 * method_9250
 */
fun <T>KClass<CommandSource>.forEachMatching(arg0: Iterable<T>, arg1: String, arg2: String, arg3: function_Function<T, Identifier>, arg4: Consumer<T>) = CommandSource.method_9250<T>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_9257
 */
fun KClass<CommandSource>.suggestIdentifiers(arg0: Stream<Identifier>, arg1: SuggestionsBuilder) = CommandSource.method_9257(arg0, arg1)
/**
 * method_9269
 */
fun CommandSource.getEntitySuggestions() = this.method_9269()
/**
 * method_9253
 */
fun KClass<CommandSource>.suggestMatching(arg0: Array<String>, arg1: SuggestionsBuilder) = CommandSource.method_9253(arg0, arg1)
/**
 * method_44750
 */
fun CommandSource.getChatSuggestions() = this.method_44750()
/**
 * method_9254
 */
fun CommandSource.getSoundIds() = this.method_9254()
/**
 * method_41213
 */
fun CommandSource.listIdSuggestions(arg0: RegistryKey<out Registry<*>>, arg1: net.minecraft.class_2172.class_7078, arg2: SuggestionsBuilder, arg3: CommandContext<*>) = this.method_41213(arg0, arg1, arg2, arg3)
/**
 * method_9258
 */
fun KClass<CommandSource>.suggestIdentifiers(arg0: Iterable<Identifier>, arg1: SuggestionsBuilder, arg2: String) = CommandSource.method_9258(arg0, arg1, arg2)
/**
 * method_9252
 */
fun KClass<CommandSource>.suggestColumnPositions(arg0: String, arg1: Collection<net.minecraft.class_2172.class_2173>, arg2: SuggestionsBuilder, arg3: Predicate<String>) = CommandSource.method_9252(arg0, arg1, arg2, arg3)
/**
 * method_9268
 */
fun <T>KClass<CommandSource>.forEachMatching(arg0: Iterable<T>, arg1: String, arg2: function_Function<T, Identifier>, arg3: Consumer<T>) = CommandSource.method_9268<T>(arg0, arg1, arg2, arg3)
/**
 * method_9255
 */
fun <T>KClass<CommandSource>.suggestFromIdentifier(arg0: Iterable<T>, arg1: SuggestionsBuilder, arg2: function_Function<T, Identifier>, arg3: function_Function<T, Message>) = CommandSource.method_9255<T>(arg0, arg1, arg2, arg3)
/**
 * method_9259
 */
fun CommandSource.hasPermissionLevel(arg0: Int) = this.method_9259(arg0)
/**
 * method_17772
 */
fun CommandSource.getPositionSuggestions() = this.method_17772()
/**
 * method_9260
 */
fun KClass<CommandSource>.suggestPositions(arg0: String, arg1: Collection<net.minecraft.class_2172.class_2173>, arg2: SuggestionsBuilder, arg3: Predicate<String>) = CommandSource.method_9260(arg0, arg1, arg2, arg3)
/**
 * method_40182
 */
fun KClass<CommandSource>.suggestIdentifiers(arg0: Stream<Identifier>, arg1: SuggestionsBuilder, arg2: String) = CommandSource.method_40182(arg0, arg1, arg2)
/**
 * method_9264
 */
fun KClass<CommandSource>.suggestMatching(arg0: Stream<String>, arg1: SuggestionsBuilder) = CommandSource.method_9264(arg0, arg1)
/**
 * method_9265
 */
fun KClass<CommandSource>.suggestMatching(arg0: Iterable<String>, arg1: SuggestionsBuilder) = CommandSource.method_9265(arg0, arg1)
/**
 * method_30497
 */
fun CommandSource.getRegistryManager() = this.method_30497()
/**
 * method_9262
 */
fun CommandSource.getPlayerNames() = this.method_9262()
/**
 * method_45549
 */
fun CommandSource.getEnabledFeatures() = this.method_45549()
/**
 * method_29310
 */
fun CommandSource.getWorldKeys() = this.method_29310()
/**
 * method_35510
 */
fun <T>KClass<CommandSource>.suggestMatching(arg0: Iterable<T>, arg1: SuggestionsBuilder, arg2: function_Function<T, String>, arg3: function_Function<T, Message>) = CommandSource.method_35510<T>(arg0, arg1, arg2, arg3)
