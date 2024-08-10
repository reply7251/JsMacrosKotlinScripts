package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MoveControl

val MoveControl.REACHED_DESTINATION_DISTANCE_SQUARED by aliasStatic(MoveControl::field_30198)
fun MoveControl.moveTo(arg0: Double, arg1: Double, arg2: Double, arg3: Double) = this.method_6239(arg0, arg1, arg2, arg3)
fun MoveControl.isMoving() = this.method_6241()
fun MoveControl.tick() = this.method_6240()
fun MoveControl.strafeTo(arg0: Float, arg1: Float) = this.method_6243(arg0, arg1)
