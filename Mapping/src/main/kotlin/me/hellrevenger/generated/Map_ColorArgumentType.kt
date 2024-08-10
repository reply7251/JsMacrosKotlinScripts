package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ColorArgumentType

val ColorArgumentType.INVALID_COLOR_EXCEPTION by aliasStatic(ColorArgumentType::field_9840)
fun ColorArgumentType.parse(arg0: StringReader) = this.method_9279(arg0)
fun KClass<ColorArgumentType>.getColor(arg0: CommandContext<ServerCommandSource>, arg1: String) = ColorArgumentType.method_9277(arg0, arg1)
fun KClass<ColorArgumentType>.color() = ColorArgumentType.method_9276()
