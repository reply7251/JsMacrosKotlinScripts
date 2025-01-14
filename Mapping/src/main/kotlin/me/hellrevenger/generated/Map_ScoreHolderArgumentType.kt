package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScoreHolderArgumentType

val KClass<ScoreHolderArgumentType>.SUGGESTION_PROVIDER by aliasStatic(ScoreHolderArgumentType::field_9951)
fun KClass<ScoreHolderArgumentType>.scoreHolder() = ScoreHolderArgumentType.method_9447()
fun KClass<ScoreHolderArgumentType>.getScoreHolders(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: Supplier<Collection<ScoreHolder>>) = ScoreHolderArgumentType.method_9450(arg0, arg1, arg2)
fun KClass<ScoreHolderArgumentType>.scoreHolders() = ScoreHolderArgumentType.method_9451()
fun KClass<ScoreHolderArgumentType>.getScoreHolders(arg0: CommandContext<ServerCommandSource>, arg1: String) = ScoreHolderArgumentType.method_9458(arg0, arg1)
fun KClass<ScoreHolderArgumentType>.getScoreboardScoreHolders(arg0: CommandContext<ServerCommandSource>, arg1: String) = ScoreHolderArgumentType.method_9449(arg0, arg1)
fun ScoreHolderArgumentType.parse(arg0: StringReader) = this.method_9453(arg0)
fun KClass<ScoreHolderArgumentType>.getScoreHolder(arg0: CommandContext<ServerCommandSource>, arg1: String) = ScoreHolderArgumentType.method_9452(arg0, arg1)
