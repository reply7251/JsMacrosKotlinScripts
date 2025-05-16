package me.hellrevenger.generated.Map_Task
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_46910
 */
fun <E>Task<E>.getName() where E: LivingEntity = this.method_46910()
/**
 * method_18921
 */
fun <E>Task<E>.getStatus() where E: LivingEntity = this.method_18921()
/**
 * method_18925
 */
fun <E>Task<E>.stop(world: ServerWorld?, entity: E, time: Long) where E: LivingEntity = this.method_18925(world, entity, time)
/**
 * method_18923
 */
fun <E>Task<E>.tick(world: ServerWorld?, entity: E, time: Long) where E: LivingEntity = this.method_18923(world, entity, time)
/**
 * method_18922
 */
fun <E>Task<E>.tryStarting(world: ServerWorld?, entity: E, time: Long) where E: LivingEntity = this.method_18922(world, entity, time)
