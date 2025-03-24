package me.hellrevenger.generated.Map_Sensor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_37456
 */
fun <E>KClass<Sensor<E>>.testAttackableTargetPredicateIgnoreVisibility(arg0: ServerWorld, arg1: LivingEntity, arg2: LivingEntity) where E: LivingEntity = Sensor.method_37456(arg0, arg1, arg2)
/**
 * method_61445
 */
fun <E>KClass<Sensor<E>>.hasTargetBeenAttackableRecently(arg0: LivingEntity, arg1: Int) where E: LivingEntity = Sensor.method_61445(arg0, arg1)
/**
 * method_19100
 */
fun <E>Sensor<E>.tick(arg0: ServerWorld, arg1: E) where E: LivingEntity = this.method_19100(arg0, arg1)
/**
 * method_19099
 */
fun <E>Sensor<E>.getOutputMemoryModules() where E: LivingEntity = this.method_19099()
/**
 * method_36982
 */
fun <E>KClass<Sensor<E>>.testAttackableTargetPredicate(arg0: ServerWorld, arg1: LivingEntity, arg2: LivingEntity) where E: LivingEntity = Sensor.method_36982(arg0, arg1, arg2)
/**
 * method_30954
 */
fun <E>KClass<Sensor<E>>.testTargetPredicate(arg0: ServerWorld, arg1: LivingEntity, arg2: LivingEntity) where E: LivingEntity = Sensor.method_30954(arg0, arg1, arg2)
