package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Sensor

fun <E>KClass<Sensor<E>>.testAttackableTargetPredicate(arg0: LivingEntity, arg1: LivingEntity) where E: LivingEntity = Sensor.method_36982(arg0, arg1)
fun <E>Sensor<E>.tick(arg0: ServerWorld, arg1: E) where E: LivingEntity = this.method_19100(arg0, arg1)
fun <E>KClass<Sensor<E>>.testAttackableTargetPredicateIgnoreVisibility(arg0: LivingEntity, arg1: LivingEntity) where E: LivingEntity = Sensor.method_37456(arg0, arg1)
fun <E>Sensor<E>.getOutputMemoryModules() where E: LivingEntity = this.method_19099()
fun <E>KClass<Sensor<E>>.testTargetPredicate(arg0: LivingEntity, arg1: LivingEntity) where E: LivingEntity = Sensor.method_30954(arg0, arg1)
