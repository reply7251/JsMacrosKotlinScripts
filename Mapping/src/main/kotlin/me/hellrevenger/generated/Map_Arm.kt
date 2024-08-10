package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Arm

val Arm.BY_ID by aliasStatic(Arm::field_46166)
val Arm.RIGHT by aliasEnum(Arm::class, "field_6183")
val Arm.LEFT by aliasEnum(Arm::class, "field_6182")
fun Arm.getOpposite() = this.method_5928()
