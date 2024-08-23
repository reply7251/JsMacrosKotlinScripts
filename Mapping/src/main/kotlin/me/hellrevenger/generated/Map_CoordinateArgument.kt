package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CoordinateArgument

val KClass<CoordinateArgument>.MISSING_BLOCK_POSITION by aliasStatic(CoordinateArgument::field_10761)
val KClass<CoordinateArgument>.MISSING_COORDINATE by aliasStatic(CoordinateArgument::field_10759)
fun CoordinateArgument.isRelative() = this.method_9741()
fun KClass<CoordinateArgument>.parse(arg0: StringReader) = CoordinateArgument.method_9739(arg0)
fun KClass<CoordinateArgument>.isRelative(arg0: StringReader) = CoordinateArgument.method_9742(arg0)
fun CoordinateArgument.toAbsoluteCoordinate(arg0: Double) = this.method_9740(arg0)
fun KClass<CoordinateArgument>.parse(arg0: StringReader, arg1: Boolean) = CoordinateArgument.method_9743(arg0, arg1)
