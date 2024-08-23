package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RangedWeaponItem

val KClass<RangedWeaponItem>.BOW_PROJECTILES by aliasStatic(RangedWeaponItem::field_18281)
val KClass<RangedWeaponItem>.CROSSBOW_HELD_PROJECTILES by aliasStatic(RangedWeaponItem::field_18282)
fun RangedWeaponItem.getProjectiles() = this.method_19268()
fun RangedWeaponItem.getHeldProjectiles() = this.method_20310()
fun RangedWeaponItem.getRange() = this.method_24792()
fun KClass<RangedWeaponItem>.getHeldProjectile(arg0: LivingEntity, arg1: Predicate<ItemStack>) = RangedWeaponItem.method_18815(arg0, arg1)
