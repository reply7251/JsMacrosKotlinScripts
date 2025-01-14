package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Tilt

val KClass<Tilt>.PARTIAL by aliasEnum(Tilt::class, "field_28720")
val KClass<Tilt>.FULL by aliasEnum(Tilt::class, "field_28721")
val KClass<Tilt>.UNSTABLE by aliasEnum(Tilt::class, "field_28719")
val KClass<Tilt>.NONE by aliasEnum(Tilt::class, "field_28718")
fun Tilt.isStable() = this.method_33636()
