package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScoreboardSlotArgumentType

val KClass<ScoreboardSlotArgumentType>.INVALID_SLOT_EXCEPTION by aliasStatic(ScoreboardSlotArgumentType::field_9954)
fun KClass<ScoreboardSlotArgumentType>.scoreboardSlot() = ScoreboardSlotArgumentType.method_9468()
fun KClass<ScoreboardSlotArgumentType>.getScoreboardSlot(arg0: CommandContext<ServerCommandSource>, arg1: String) = ScoreboardSlotArgumentType.method_9465(arg0, arg1)
fun ScoreboardSlotArgumentType.parse(arg0: StringReader) = this.method_9466(arg0)
