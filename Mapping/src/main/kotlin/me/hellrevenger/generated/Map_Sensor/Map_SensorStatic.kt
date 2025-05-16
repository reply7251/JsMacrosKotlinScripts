package me.hellrevenger.generated.Map_Sensor
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SensorKt {
    /**
     * method_37456
     */
    fun <E>testAttackableTargetPredicateIgnoreVisibility(world: ServerWorld?, entity: LivingEntity?, target: LivingEntity?) where E: LivingEntity = Sensor.method_37456(world, entity, target)
    /**
     * method_61445
     */
    fun <E>hasTargetBeenAttackableRecently(entity: LivingEntity?, ticks: Int) where E: LivingEntity = Sensor.method_61445(entity, ticks)
    /**
     * method_36982
     */
    fun <E>testAttackableTargetPredicate(world: ServerWorld?, entity: LivingEntity?, target: LivingEntity?) where E: LivingEntity = Sensor.method_36982(world, entity, target)
    /**
     * method_30954
     */
    fun <E>testTargetPredicate(world: ServerWorld?, entity: LivingEntity?, target: LivingEntity?) where E: LivingEntity = Sensor.method_30954(world, entity, target)
}