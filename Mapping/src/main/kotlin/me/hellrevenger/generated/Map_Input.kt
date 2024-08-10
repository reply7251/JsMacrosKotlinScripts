package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Input

val Input.pressingForward by alias(Input::field_3910)
val Input.movementSideways by alias(Input::field_3907)
val Input.pressingLeft by alias(Input::field_3908)
val Input.movementForward by alias(Input::field_3905)
val Input.pressingBack by alias(Input::field_3909)
val Input.sneaking by alias(Input::field_3903)
val Input.jumping by alias(Input::field_3904)
val Input.pressingRight by alias(Input::field_3906)
fun Input.tick(arg0: Boolean, arg1: Float) = this.method_3129(arg0, arg1)
fun Input.getMovementInput() = this.method_3128()
fun Input.hasForwardMovement() = this.method_20622()
