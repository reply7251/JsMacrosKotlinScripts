package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TextArgumentType

val KClass<TextArgumentType>.INVALID_COMPONENT_EXCEPTION by aliasStatic(TextArgumentType::field_9842)
fun TextArgumentType.parse(arg0: StringReader) = this.method_9283(arg0)
fun KClass<TextArgumentType>.getTextArgument(arg0: CommandContext<ServerCommandSource>, arg1: String) = TextArgumentType.method_9280(arg0, arg1)
fun KClass<TextArgumentType>.text(arg0: CommandRegistryAccess) = TextArgumentType.method_9281(arg0)
