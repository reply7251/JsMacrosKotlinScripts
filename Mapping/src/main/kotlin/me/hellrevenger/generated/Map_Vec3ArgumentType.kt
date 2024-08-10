package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Vec3ArgumentType

val Vec3ArgumentType.INCOMPLETE_EXCEPTION by aliasStatic(Vec3ArgumentType::field_10755)
val Vec3ArgumentType.MIXED_COORDINATE_EXCEPTION by aliasStatic(Vec3ArgumentType::field_10757)
fun Vec3ArgumentType.parse(arg0: StringReader) = this.method_9738(arg0)
fun KClass<Vec3ArgumentType>.getPosArgument(arg0: CommandContext<ServerCommandSource>, arg1: String) = Vec3ArgumentType.method_9734(arg0, arg1)
fun KClass<Vec3ArgumentType>.getVec3(arg0: CommandContext<ServerCommandSource>, arg1: String) = Vec3ArgumentType.method_9736(arg0, arg1)
fun KClass<Vec3ArgumentType>.vec3() = Vec3ArgumentType.method_9737()
fun KClass<Vec3ArgumentType>.vec3(arg0: Boolean) = Vec3ArgumentType.method_9735(arg0)
