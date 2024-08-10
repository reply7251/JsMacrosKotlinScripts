package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChickenEntity

val ChickenEntity.prevFlapProgress by alias(ChickenEntity::field_6736)
val ChickenEntity.eggLayTime by alias(ChickenEntity::field_6739)
val ChickenEntity.flapProgress by alias(ChickenEntity::field_6741)
val ChickenEntity.maxWingDeviation by alias(ChickenEntity::field_6743)
val ChickenEntity.hasJockey by alias(ChickenEntity::field_6740)
val ChickenEntity.flapSpeed by alias(ChickenEntity::field_6737)
val ChickenEntity.prevMaxWingDeviation by alias(ChickenEntity::field_6738)
fun ChickenEntity.setHasJockey(arg0: Boolean) = this.method_6473(arg0)
fun ChickenEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6471(arg0, arg1)
fun KClass<ChickenEntity>.createChickenAttributes() = ChickenEntity.method_26882()
fun ChickenEntity.hasJockey() = this.method_6472()
