package me.hellrevenger.generated.Map_StatusEffectUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StatusEffectUtilKt {
    /**
     * method_5575
     */
    fun getHasteAmplifier(entity: LivingEntity) = StatusEffectUtil.method_5575(entity)
    /**
     * method_5576
     */
    fun hasHaste(entity: LivingEntity) = StatusEffectUtil.method_5576(entity)
    /**
     * method_42143
     */
    fun addEffectToPlayersWithinDistance(world: ServerWorld, entity: Entity, origin: Vec3d, range: Double, arg4: StatusEffectInstance, statusEffectInstance: Int) = StatusEffectUtil.method_42143(world, entity, origin, range, arg4, statusEffectInstance)
    /**
     * method_5574
     */
    fun hasWaterBreathing(entity: LivingEntity) = StatusEffectUtil.method_5574(entity)
    /**
     * method_5577
     */
    fun getDurationText(effect: StatusEffectInstance, multiplier: Float, tickRate: Float) = StatusEffectUtil.method_5577(effect, multiplier, tickRate)
}