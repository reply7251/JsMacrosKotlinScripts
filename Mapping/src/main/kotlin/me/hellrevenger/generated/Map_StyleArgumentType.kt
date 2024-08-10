package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StyleArgumentType

val StyleArgumentType.INVALID_STYLE_EXCEPTION by aliasStatic(StyleArgumentType::field_47553)
fun KClass<StyleArgumentType>.style(arg0: CommandRegistryAccess) = StyleArgumentType.method_55446(arg0)
fun StyleArgumentType.parse(arg0: StringReader) = this.method_55447(arg0)
fun KClass<StyleArgumentType>.getStyle(arg0: CommandContext<ServerCommandSource>, arg1: String) = StyleArgumentType.method_55448(arg0, arg1)
