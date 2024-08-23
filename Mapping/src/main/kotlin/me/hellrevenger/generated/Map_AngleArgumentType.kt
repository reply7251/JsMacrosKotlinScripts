package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AngleArgumentType

val KClass<AngleArgumentType>.INVALID_ANGLE_EXCEPTION by aliasStatic(AngleArgumentType::field_27345)
val KClass<AngleArgumentType>.INCOMPLETE_ANGLE_EXCEPTION by aliasStatic(AngleArgumentType::field_26368)
fun AngleArgumentType.parse(arg0: StringReader) = this.method_30659(arg0)
fun KClass<AngleArgumentType>.angle() = AngleArgumentType.method_30658()
fun KClass<AngleArgumentType>.getAngle(arg0: CommandContext<ServerCommandSource>, arg1: String) = AngleArgumentType.method_30660(arg0, arg1)
