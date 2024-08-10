package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SquidEntity

val SquidEntity.prevTiltAngle by alias(SquidEntity::field_6905)
val SquidEntity.tentacleAngle by alias(SquidEntity::field_6904)
val SquidEntity.tiltAngle by alias(SquidEntity::field_6907)
val SquidEntity.prevRollAngle by alias(SquidEntity::field_6906)
val SquidEntity.thrustTimer by alias(SquidEntity::field_6908)
val SquidEntity.prevTentacleAngle by alias(SquidEntity::field_6900)
val SquidEntity.rollAngle by alias(SquidEntity::field_6903)
val SquidEntity.prevThrustTimer by alias(SquidEntity::field_6902)
fun SquidEntity.hasSwimmingVector() = this.method_6672()
fun SquidEntity.setSwimmingVector(arg0: Float, arg1: Float, arg2: Float) = this.method_6670(arg0, arg1, arg2)
fun KClass<SquidEntity>.createSquidAttributes() = SquidEntity.method_26895()
