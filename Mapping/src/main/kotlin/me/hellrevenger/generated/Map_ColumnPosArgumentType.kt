package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ColumnPosArgumentType

val ColumnPosArgumentType.INCOMPLETE_EXCEPTION by aliasStatic(ColumnPosArgumentType::field_10706)
fun ColumnPosArgumentType.parse(arg0: StringReader) = this.method_9703(arg0)
fun KClass<ColumnPosArgumentType>.columnPos() = ColumnPosArgumentType.method_9701()
fun KClass<ColumnPosArgumentType>.getColumnPos(arg0: CommandContext<ServerCommandSource>, arg1: String) = ColumnPosArgumentType.method_9702(arg0, arg1)
