package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CubeFace

val CubeFace.EAST by aliasEnum(CubeFace::class, "field_3961")
val CubeFace.SOUTH by aliasEnum(CubeFace::class, "field_3963")
val CubeFace.NORTH by aliasEnum(CubeFace::class, "field_3962")
val CubeFace.UP by aliasEnum(CubeFace::class, "field_3960")
val CubeFace.WEST by aliasEnum(CubeFace::class, "field_3966")
val CubeFace.DOWN by aliasEnum(CubeFace::class, "field_3965")
fun CubeFace.getCorner(arg0: Int) = this.method_3162(arg0)
fun KClass<CubeFace>.getFace(arg0: Direction) = CubeFace.method_3163(arg0)
