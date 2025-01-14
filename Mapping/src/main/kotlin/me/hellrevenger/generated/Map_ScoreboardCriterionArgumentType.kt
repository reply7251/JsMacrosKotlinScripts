package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScoreboardCriterionArgumentType

val KClass<ScoreboardCriterionArgumentType>.INVALID_CRITERION_EXCEPTION by aliasStatic(ScoreboardCriterionArgumentType::field_9927)
fun KClass<ScoreboardCriterionArgumentType>.getCriterion(arg0: CommandContext<ServerCommandSource>, arg1: String) = ScoreboardCriterionArgumentType.method_9402(arg0, arg1)
fun KClass<ScoreboardCriterionArgumentType>.scoreboardCriterion() = ScoreboardCriterionArgumentType.method_9399()
fun <T>ScoreboardCriterionArgumentType.getStatName(arg0: StatType<T>, arg1: Object) = this.method_9400<T>(arg0, arg1)
fun ScoreboardCriterionArgumentType.parse(arg0: StringReader) = this.method_9403(arg0)
