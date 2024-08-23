package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DamageEffects

val KClass<DamageEffects>.HURT by aliasEnum(DamageEffects::class, "field_42275")
val KClass<DamageEffects>.FREEZING by aliasEnum(DamageEffects::class, "field_42280")
val KClass<DamageEffects>.THORNS by aliasEnum(DamageEffects::class, "field_42276")
val KClass<DamageEffects>.BURNING by aliasEnum(DamageEffects::class, "field_42278")
val KClass<DamageEffects>.DROWNING by aliasEnum(DamageEffects::class, "field_42277")
val KClass<DamageEffects>.POKING by aliasEnum(DamageEffects::class, "field_42279")
fun DamageEffects.getSound() = this.method_48786()
