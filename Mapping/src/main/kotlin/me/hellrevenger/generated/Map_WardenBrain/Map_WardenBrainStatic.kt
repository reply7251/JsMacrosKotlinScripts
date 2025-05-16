package me.hellrevenger.generated.Map_WardenBrain
import kotlin.reflect.*
import me.hellrevenger.generated.*
object WardenBrainKt {
    /**
     * field_38173
     */
    val DIG_COOLDOWN by aliasStatic(WardenBrain::field_38173)
    /**
     * field_38171
     */
    val EMERGE_DURATION by aliasStatic(WardenBrain::field_38171)
    /**
     * field_38172
     */
    val ROAR_DURATION by aliasStatic(WardenBrain::field_38172)
    /**
     * method_42231
     */
    fun lookAtDisturbance(warden: WardenEntity?, pos: BlockPos?) = WardenBrain.method_42231(warden, pos)
    /**
     * method_42225
     */
    fun resetDigCooldown(warden: LivingEntity?) = WardenBrain.method_42225(warden)
    /**
     * method_42228
     */
    fun updateActivities(warden: WardenEntity?) = WardenBrain.method_42228(warden)
}