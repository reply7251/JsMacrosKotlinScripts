package me.hellrevenger.generated.Map_Enchantment
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60025
 */
fun Enchantment.applyLocationBasedEffects(world: ServerWorld, level: Int, context: EnchantmentEffectContext, user: LivingEntity) = this.method_60025(world, level, context, user)
/**
 * method_60018
 */
fun Enchantment.modifyDamageProtection(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, damageSource: DamageSource, damageProtection: MutableFloat) = this.method_60018(world, level, stack, user, damageSource, damageProtection)
/**
 * method_60042
 */
fun Enchantment.modifyTridentReturnAcceleration(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, tridentReturnAcceleration: MutableFloat) = this.method_60042(world, level, stack, user, tridentReturnAcceleration)
/**
 * method_60056
 */
fun Enchantment.modifyRepairWithExperience(world: ServerWorld, level: Int, stack: ItemStack, repairWithExperience: MutableFloat) = this.method_60056(world, level, stack, repairWithExperience)
/**
 * method_60013
 */
fun Enchantment.removeLocationBasedEffects(level: Int, context: EnchantmentEffectContext, user: LivingEntity) = this.method_60013(level, context, user)
/**
 * method_8185
 */
fun Enchantment.getEquipment(entity: LivingEntity) = this.method_8185(entity)
/**
 * method_58444
 */
fun Enchantment.isPrimaryItem(stack: ItemStack) = this.method_58444(stack)
/**
 * method_60059
 */
fun Enchantment.modifyProjectileSpread(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, projectileSpread: MutableFloat) = this.method_60059(world, level, stack, user, projectileSpread)
/**
 * method_60020
 */
fun Enchantment.modifyItemDamage(world: ServerWorld, level: Int, stack: ItemStack, itemDamage: MutableFloat) = this.method_60020(world, level, stack, itemDamage)
/**
 * method_60054
 */
fun Enchantment.modifyArmorEffectiveness(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, damageSource: DamageSource, armorEffectiveness: MutableFloat) = this.method_60054(world, level, stack, user, damageSource, armorEffectiveness)
/**
 * method_58446
 */
fun Enchantment.getAnvilCost() = this.method_58446()
/**
 * method_60019
 */
fun Enchantment.modifyMobExperience(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, mobExperience: MutableFloat) = this.method_60019(world, level, stack, user, mobExperience)
/**
 * method_60021
 */
fun Enchantment.onTick(world: ServerWorld, level: Int, context: EnchantmentEffectContext, user: Entity) = this.method_60021(world, level, context, user)
/**
 * method_60055
 */
fun Enchantment.modifyFishingLuckBonus(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, fishingLuckBonus: MutableFloat) = this.method_60055(world, level, stack, user, fishingLuckBonus)
/**
 * method_60046
 */
fun Enchantment.isSupportedItem(stack: ItemStack) = this.method_60046(stack)
/**
 * method_56109
 */
fun Enchantment.getApplicableItems() = this.method_56109()
/**
 * method_60506
 */
fun Enchantment.modifyValue(type: ComponentType<EnchantmentValueEffect>, random: Random, level: Int, value: MutableFloat) = this.method_60506(type, random, level, value)
/**
 * method_8189
 */
fun Enchantment.onTargetDamaged(world: ServerWorld, level: Int, context: EnchantmentEffectContext, target: EnchantmentEffectTarget, user: Entity, damageSource: DamageSource) = this.method_8189(world, level, context, target, user, damageSource)
/**
 * method_60041
 */
fun Enchantment.modifyDamage(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, damageSource: DamageSource, damage: MutableFloat) = this.method_60041(world, level, stack, user, damageSource, damage)
/**
 * method_8183
 */
fun Enchantment.getMaxLevel() = this.method_8183()
/**
 * method_60043
 */
fun Enchantment.modifyAmmoUse(world: ServerWorld, level: Int, projectileStack: ItemStack, ammoUse: MutableFloat) = this.method_60043(world, level, projectileStack, ammoUse)
/**
 * method_60058
 */
fun Enchantment.modifyCrossbowChargeTime(random: Random, level: Int, crossbowChargeTime: MutableFloat) = this.method_60058(random, level, crossbowChargeTime)
/**
 * method_58445
 */
fun Enchantment.getWeight() = this.method_58445()
/**
 * method_8187
 */
fun Enchantment.getMinLevel() = this.method_8187()
/**
 * method_60034
 */
fun <T>Enchantment.getEffect(type: ComponentType<MutableList<T>>) = this.method_60034<T>(type)
/**
 * method_60052
 */
fun Enchantment.modifyFishingTimeReduction(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, fishingTimeReduction: MutableFloat) = this.method_60052(world, level, stack, user, fishingTimeReduction)
/**
 * method_60026
 */
fun Enchantment.slotMatches(slot: EquipmentSlot) = this.method_60026(slot)
/**
 * method_60044
 */
fun Enchantment.onProjectileSpawned(world: ServerWorld, level: Int, context: EnchantmentEffectContext, user: Entity) = this.method_60044(world, level, context, user)
/**
 * method_60023
 */
fun Enchantment.onHitBlock(world: ServerWorld, level: Int, context: EnchantmentEffectContext, enchantedEntity: Entity, pos: Vec3d, state: BlockState) = this.method_60023(world, level, context, enchantedEntity, pos, state)
/**
 * method_8192
 */
fun Enchantment.isAcceptableItem(stack: ItemStack) = this.method_8192(stack)
/**
 * method_60057
 */
fun Enchantment.modifyProjectileCount(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, projectileCount: MutableFloat) = this.method_60057(world, level, stack, user, projectileCount)
/**
 * method_60014
 */
fun Enchantment.hasDamageImmunityTo(world: ServerWorld, level: Int, user: Entity, damageSource: DamageSource) = this.method_60014(world, level, user, damageSource)
/**
 * method_60049
 */
fun Enchantment.modifyTridentSpinAttackStrength(random: Random, level: Int, tridentSpinAttackStrength: MutableFloat) = this.method_60049(random, level, tridentSpinAttackStrength)
/**
 * method_60050
 */
fun Enchantment.modifyProjectilePiercing(world: ServerWorld, level: Int, stack: ItemStack, projectilePiercing: MutableFloat) = this.method_60050(world, level, stack, projectilePiercing)
/**
 * method_8182
 */
fun Enchantment.getMinPower(level: Int) = this.method_8182(level)
/**
 * method_60048
 */
fun Enchantment.modifySmashDamagePerFallenBlock(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, damageSource: DamageSource, smashDamagePerFallenBlock: MutableFloat) = this.method_60048(world, level, stack, user, damageSource, smashDamagePerFallenBlock)
/**
 * method_20742
 */
fun Enchantment.getMaxPower(level: Int) = this.method_20742(level)
/**
 * method_60051
 */
fun Enchantment.modifyKnockback(world: ServerWorld, level: Int, stack: ItemStack, user: Entity, damageSource: DamageSource, knockback: MutableFloat) = this.method_60051(world, level, stack, user, damageSource, knockback)
/**
 * method_60053
 */
fun Enchantment.modifyBlockExperience(world: ServerWorld, level: Int, stack: ItemStack, blockExperience: MutableFloat) = this.method_60053(world, level, stack, blockExperience)
/**
 * comp_2687
 */
fun Enchantment.definition() = this.comp_2687()
/**
 * comp_2688
 */
fun Enchantment.exclusiveSet() = this.comp_2688()
/**
 * comp_2686
 */
fun Enchantment.description() = this.comp_2686()
/**
 * comp_2689
 */
fun Enchantment.effects() = this.comp_2689()
