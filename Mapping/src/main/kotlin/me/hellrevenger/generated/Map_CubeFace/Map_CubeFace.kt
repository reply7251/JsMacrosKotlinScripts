package me.hellrevenger.generated.Map_CubeFace
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<CubeFace>.EAST by aliasEnum(CubeFace::class, "field_3961")
val KClass<CubeFace>.SOUTH by aliasEnum(CubeFace::class, "field_3963")
val KClass<CubeFace>.NORTH by aliasEnum(CubeFace::class, "field_3962")
val KClass<CubeFace>.UP by aliasEnum(CubeFace::class, "field_3960")
val KClass<CubeFace>.WEST by aliasEnum(CubeFace::class, "field_3966")
val KClass<CubeFace>.DOWN by aliasEnum(CubeFace::class, "field_3965")
fun CubeFace.getCorner(arg0: Int) = this.method_3162(arg0)
fun KClass<CubeFace>.getFace(arg0: Direction) = CubeFace.method_3163(arg0)
