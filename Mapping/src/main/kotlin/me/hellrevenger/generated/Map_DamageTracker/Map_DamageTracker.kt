package me.hellrevenger.generated.Map_DamageTracker
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_29967
 */
val KClass<DamageTracker>.DAMAGE_COOLDOWN by aliasStatic(DamageTracker::field_29967)
/**
 * field_29968
 */
val KClass<DamageTracker>.ATTACK_DAMAGE_COOLDOWN by aliasStatic(DamageTracker::field_29968)
/**
 * method_5548
 */
fun DamageTracker.getDeathMessage() = this.method_5548()
/**
 * method_5546
 */
fun DamageTracker.getTimeSinceLastAttack() = this.method_5546()
/**
 * method_5539
 */
fun DamageTracker.update() = this.method_5539()
/**
 * method_5547
 */
fun DamageTracker.onDamage(arg0: DamageSource, arg1: Float) = this.method_5547(arg0, arg1)
