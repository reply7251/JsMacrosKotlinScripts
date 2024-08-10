package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PositionFlag

val PositionFlag.VALUES by aliasStatic(PositionFlag::field_40710)
val PositionFlag.ROT by aliasStatic(PositionFlag::field_40711)
val PositionFlag.X_ROT by aliasEnum(PositionFlag::class, "field_12397")
val PositionFlag.Y by aliasEnum(PositionFlag::class, "field_12398")
val PositionFlag.Y_ROT by aliasEnum(PositionFlag::class, "field_12401")
val PositionFlag.Z by aliasEnum(PositionFlag::class, "field_12403")
val PositionFlag.X by aliasEnum(PositionFlag::class, "field_12400")
fun KClass<PositionFlag>.getBitfield(arg0: Set<PositionFlag>) = PositionFlag.method_11741(arg0)
fun KClass<PositionFlag>.getFlags(arg0: Int) = PositionFlag.method_11744(arg0)
