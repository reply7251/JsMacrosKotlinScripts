package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DamageTracker

val DamageTracker.DAMAGE_COOLDOWN by aliasStatic(DamageTracker::field_29967)
val DamageTracker.ATTACK_DAMAGE_COOLDOWN by aliasStatic(DamageTracker::field_29968)
fun DamageTracker.getDeathMessage() = this.method_5548()
fun DamageTracker.getTimeSinceLastAttack() = this.method_5546()
fun DamageTracker.update() = this.method_5539()
fun DamageTracker.onDamage(arg0: DamageSource, arg1: Float) = this.method_5547(arg0, arg1)
