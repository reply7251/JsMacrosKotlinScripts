package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RotationArgumentType

val KClass<RotationArgumentType>.INCOMPLETE_ROTATION_EXCEPTION by aliasStatic(RotationArgumentType::field_10736)
fun KClass<RotationArgumentType>.getRotation(arg0: CommandContext<ServerCommandSource>, arg1: String) = RotationArgumentType.method_9716(arg0, arg1)
fun KClass<RotationArgumentType>.rotation() = RotationArgumentType.method_9717()
fun RotationArgumentType.parse(arg0: StringReader) = this.method_9718(arg0)
