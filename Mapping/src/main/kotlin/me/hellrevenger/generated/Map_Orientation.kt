package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Orientation

val Orientation.WEST_UP by aliasEnum(Orientation::class, "field_23389")
val Orientation.UP_WEST by aliasEnum(Orientation::class, "field_23388")
val Orientation.UP_SOUTH by aliasEnum(Orientation::class, "field_23387")
val Orientation.UP_NORTH by aliasEnum(Orientation::class, "field_23386")
val Orientation.UP_EAST by aliasEnum(Orientation::class, "field_23385")
val Orientation.DOWN_WEST by aliasEnum(Orientation::class, "field_23384")
val Orientation.DOWN_SOUTH by aliasEnum(Orientation::class, "field_23383")
val Orientation.DOWN_NORTH by aliasEnum(Orientation::class, "field_23382")
val Orientation.DOWN_EAST by aliasEnum(Orientation::class, "field_23381")
val Orientation.SOUTH_UP by aliasEnum(Orientation::class, "field_23392")
val Orientation.NORTH_UP by aliasEnum(Orientation::class, "field_23391")
val Orientation.EAST_UP by aliasEnum(Orientation::class, "field_23390")
fun KClass<Orientation>.byDirections(arg0: Direction, arg1: Direction) = Orientation.method_26425(arg0, arg1)
