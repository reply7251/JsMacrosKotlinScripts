package me.hellrevenger.generated.Map_RangedWeaponItem
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_18281
 */
val KClass<RangedWeaponItem>.BOW_PROJECTILES by aliasStatic(RangedWeaponItem::field_18281)
/**
 * field_18282
 */
val KClass<RangedWeaponItem>.CROSSBOW_HELD_PROJECTILES by aliasStatic(RangedWeaponItem::field_18282)
/**
 * method_19268
 */
fun RangedWeaponItem.getProjectiles() = this.method_19268()
/**
 * method_20310
 */
fun RangedWeaponItem.getHeldProjectiles() = this.method_20310()
/**
 * method_24792
 */
fun RangedWeaponItem.getRange() = this.method_24792()
/**
 * method_18815
 */
fun KClass<RangedWeaponItem>.getHeldProjectile(arg0: LivingEntity, arg1: Predicate<ItemStack>) = RangedWeaponItem.method_18815(arg0, arg1)
