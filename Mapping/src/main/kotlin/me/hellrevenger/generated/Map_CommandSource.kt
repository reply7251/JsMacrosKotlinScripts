package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CommandSource

fun CommandSource.suggestIdentifiers(arg0: Registry<*>, arg1: net.minecraft.class_2172.class_7078, arg2: SuggestionsBuilder) = this.method_41214(arg0, arg1, arg2)
fun KClass<CommandSource>.shouldSuggest(arg0: String, arg1: String) = CommandSource.method_27136(arg0, arg1)
fun CommandSource.getCompletions(arg0: CommandContext<*>) = this.method_9261(arg0)
fun KClass<CommandSource>.suggestIdentifiers(arg0: Iterable<Identifier>, arg1: SuggestionsBuilder) = CommandSource.method_9270(arg0, arg1)
fun <T>KClass<CommandSource>.suggestFromIdentifier(arg0: Stream<T>, arg1: SuggestionsBuilder, arg2: Function<T, Identifier>, arg3: Function<T, Message>) = CommandSource.method_9271<T>(arg0, arg1, arg2, arg3)
fun CommandSource.getBlockPositionSuggestions() = this.method_17771()
fun CommandSource.getTeamNames() = this.method_9267()
fun <T>KClass<CommandSource>.forEachMatching(arg0: Iterable<T>, arg1: String, arg2: String, arg3: Function<T, Identifier>, arg4: Consumer<T>) = CommandSource.method_9250<T>(arg0, arg1, arg2, arg3, arg4)
fun KClass<CommandSource>.suggestIdentifiers(arg0: Stream<Identifier>, arg1: SuggestionsBuilder) = CommandSource.method_9257(arg0, arg1)
fun CommandSource.getEntitySuggestions() = this.method_9269()
fun KClass<CommandSource>.suggestMatching(arg0: Array<String>, arg1: SuggestionsBuilder) = CommandSource.method_9253(arg0, arg1)
fun CommandSource.getChatSuggestions() = this.method_44750()
fun CommandSource.getSoundIds() = this.method_9254()
fun CommandSource.listIdSuggestions(arg0: RegistryKey<out Registry<*>>, arg1: net.minecraft.class_2172.class_7078, arg2: SuggestionsBuilder, arg3: CommandContext<*>) = this.method_41213(arg0, arg1, arg2, arg3)
fun KClass<CommandSource>.suggestIdentifiers(arg0: Iterable<Identifier>, arg1: SuggestionsBuilder, arg2: String) = CommandSource.method_9258(arg0, arg1, arg2)
fun KClass<CommandSource>.suggestColumnPositions(arg0: String, arg1: Collection<net.minecraft.class_2172.class_2173>, arg2: SuggestionsBuilder, arg3: Predicate<String>) = CommandSource.method_9252(arg0, arg1, arg2, arg3)
fun <T>KClass<CommandSource>.forEachMatching(arg0: Iterable<T>, arg1: String, arg2: Function<T, Identifier>, arg3: Consumer<T>) = CommandSource.method_9268<T>(arg0, arg1, arg2, arg3)
fun <T>KClass<CommandSource>.suggestFromIdentifier(arg0: Iterable<T>, arg1: SuggestionsBuilder, arg2: Function<T, Identifier>, arg3: Function<T, Message>) = CommandSource.method_9255<T>(arg0, arg1, arg2, arg3)
fun CommandSource.hasPermissionLevel(arg0: Int) = this.method_9259(arg0)
fun CommandSource.getPositionSuggestions() = this.method_17772()
fun KClass<CommandSource>.suggestPositions(arg0: String, arg1: Collection<net.minecraft.class_2172.class_2173>, arg2: SuggestionsBuilder, arg3: Predicate<String>) = CommandSource.method_9260(arg0, arg1, arg2, arg3)
fun KClass<CommandSource>.suggestIdentifiers(arg0: Stream<Identifier>, arg1: SuggestionsBuilder, arg2: String) = CommandSource.method_40182(arg0, arg1, arg2)
fun KClass<CommandSource>.suggestMatching(arg0: Stream<String>, arg1: SuggestionsBuilder) = CommandSource.method_9264(arg0, arg1)
fun KClass<CommandSource>.suggestMatching(arg0: Iterable<String>, arg1: SuggestionsBuilder) = CommandSource.method_9265(arg0, arg1)
fun CommandSource.getRegistryManager() = this.method_30497()
fun CommandSource.getPlayerNames() = this.method_9262()
fun CommandSource.getEnabledFeatures() = this.method_45549()
fun CommandSource.getRecipeIds() = this.method_9273()
fun CommandSource.getWorldKeys() = this.method_29310()
fun <T>KClass<CommandSource>.suggestMatching(arg0: Iterable<T>, arg1: SuggestionsBuilder, arg2: Function<T, String>, arg3: Function<T, Message>) = CommandSource.method_35510<T>(arg0, arg1, arg2, arg3)
