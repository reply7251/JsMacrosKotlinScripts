package me.hellrevenger.generated.Map_Enchantment
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_51949
 */
val KClass<Enchantment>.MAX_LEVEL by aliasStatic(Enchantment::field_51949)
/**
 * method_60025
 */
fun Enchantment.applyLocationBasedEffects(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: LivingEntity) = this.method_60025(arg0, arg1, arg2, arg3)
/**
 * method_60018
 */
fun Enchantment.modifyDamageProtection(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: DamageSource, arg5: MutableFloat) = this.method_60018(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_60042
 */
fun Enchantment.modifyTridentReturnAcceleration(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60042(arg0, arg1, arg2, arg3, arg4)
/**
 * method_60056
 */
fun Enchantment.modifyRepairWithXp(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: MutableFloat) = this.method_60056(arg0, arg1, arg2, arg3)
/**
 * method_60013
 */
fun Enchantment.removeLocationBasedEffects(arg0: Int, arg1: EnchantmentEffectContext, arg2: LivingEntity) = this.method_60013(arg0, arg1, arg2)
/**
 * method_8185
 */
fun Enchantment.getEquipment(arg0: LivingEntity) = this.method_8185(arg0)
/**
 * method_58444
 */
fun Enchantment.isPrimaryItem(arg0: ItemStack) = this.method_58444(arg0)
/**
 * method_60033
 */
fun KClass<Enchantment>.canBeCombined(arg0: RegistryEntry<Enchantment>, arg1: RegistryEntry<Enchantment>) = Enchantment.method_60033(arg0, arg1)
/**
 * method_60059
 */
fun Enchantment.modifyProjectileSpread(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60059(arg0, arg1, arg2, arg3, arg4)
/**
 * method_60020
 */
fun Enchantment.modifyItemDamage(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: MutableFloat) = this.method_60020(arg0, arg1, arg2, arg3)
/**
 * method_60054
 */
fun Enchantment.modifyArmorEffectiveness(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: DamageSource, arg5: MutableFloat) = this.method_60054(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_8179
 */
fun KClass<Enchantment>.getName(arg0: RegistryEntry<Enchantment>, arg1: Int) = Enchantment.method_8179(arg0, arg1)
/**
 * method_58446
 */
fun Enchantment.getAnvilCost() = this.method_58446()
/**
 * method_60019
 */
fun Enchantment.modifyMobExperience(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60019(arg0, arg1, arg2, arg3, arg4)
/**
 * method_58443
 */
fun KClass<Enchantment>.definition(arg0: RegistryEntryList<Item>, arg1: RegistryEntryList<Item>, arg2: Int, arg3: Int, arg4: net.minecraft.class_1887.class_9426, arg5: net.minecraft.class_1887.class_9426, arg6: Int, arg7: Array<AttributeModifierSlot>) = Enchantment.method_58443(arg0, arg1, arg2, arg3, arg4, arg5, arg6, *arg7)
/**
 * method_60021
 */
fun Enchantment.onTick(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: Entity) = this.method_60021(arg0, arg1, arg2, arg3)
/**
 * method_60055
 */
fun Enchantment.modifyFishingLuckBonus(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60055(arg0, arg1, arg2, arg3, arg4)
/**
 * method_60046
 */
fun Enchantment.isSupportedItem(arg0: ItemStack) = this.method_60046(arg0)
/**
 * method_56109
 */
fun Enchantment.getApplicableItems() = this.method_56109()
/**
 * method_58440
 */
fun KClass<Enchantment>.constantCost(arg0: Int) = Enchantment.method_58440(arg0)
/**
 * method_60506
 */
fun Enchantment.modifyValue(arg0: ComponentType<EnchantmentValueEffect>, arg1: Random, arg2: Int, arg3: MutableFloat) = this.method_60506(arg0, arg1, arg2, arg3)
/**
 * method_8189
 */
fun Enchantment.onTargetDamaged(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: EnchantmentEffectTarget, arg4: Entity, arg5: DamageSource) = this.method_8189(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_60041
 */
fun Enchantment.modifyDamage(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: DamageSource, arg5: MutableFloat) = this.method_60041(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_8183
 */
fun Enchantment.getMaxLevel() = this.method_8183()
/**
 * method_60043
 */
fun Enchantment.modifyAmmoUse(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: MutableFloat) = this.method_60043(arg0, arg1, arg2, arg3)
/**
 * method_60058
 */
fun Enchantment.modifyCrossbowChargeTime(arg0: Random, arg1: Int, arg2: MutableFloat) = this.method_60058(arg0, arg1, arg2)
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
fun <T>Enchantment.getEffect(arg0: ComponentType<MutableList<T>>) = this.method_60034<T>(arg0)
/**
 * method_60052
 */
fun Enchantment.modifyFishingTimeReduction(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60052(arg0, arg1, arg2, arg3, arg4)
/**
 * method_60026
 */
fun Enchantment.slotMatches(arg0: EquipmentSlot) = this.method_60026(arg0)
/**
 * method_60044
 */
fun Enchantment.onProjectileSpawned(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: Entity) = this.method_60044(arg0, arg1, arg2, arg3)
/**
 * method_60023
 */
fun Enchantment.onHitBlock(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: Entity, arg4: Vec3d, arg5: BlockState) = this.method_60023(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_8192
 */
fun Enchantment.isAcceptableItem(arg0: ItemStack) = this.method_8192(arg0)
/**
 * method_60057
 */
fun Enchantment.modifyProjectileCount(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: MutableFloat) = this.method_60057(arg0, arg1, arg2, arg3, arg4)
/**
 * method_60014
 */
fun Enchantment.hasDamageImmunityTo(arg0: ServerWorld, arg1: Int, arg2: Entity, arg3: DamageSource) = this.method_60014(arg0, arg1, arg2, arg3)
/**
 * method_60049
 */
fun Enchantment.modifyTridentSpinAttackStrength(arg0: Random, arg1: Int, arg2: MutableFloat) = this.method_60049(arg0, arg1, arg2)
/**
 * method_60050
 */
fun Enchantment.modifyProjectilePiercing(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: MutableFloat) = this.method_60050(arg0, arg1, arg2, arg3)
/**
 * method_8182
 */
fun Enchantment.getMinPower(arg0: Int) = this.method_8182(arg0)
/**
 * method_60048
 */
fun Enchantment.modifySmashDamagePerFallenBlock(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: DamageSource, arg5: MutableFloat) = this.method_60048(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_60031
 */
fun KClass<Enchantment>.applyTargetedEffect(arg0: TargetedEnchantmentEffect<EnchantmentEntityEffect>, arg1: ServerWorld, arg2: Int, arg3: EnchantmentEffectContext, arg4: Entity, arg5: DamageSource) = Enchantment.method_60031(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_58441
 */
fun KClass<Enchantment>.leveledCost(arg0: Int, arg1: Int) = Enchantment.method_58441(arg0, arg1)
/**
 * method_60030
 */
fun KClass<Enchantment>.builder(arg0: net.minecraft.class_1887.class_9427) = Enchantment.method_60030(arg0)
/**
 * method_20742
 */
fun Enchantment.getMaxPower(arg0: Int) = this.method_20742(arg0)
/**
 * method_60040
 */
fun KClass<Enchantment>.createEnchantedDamageLootContext(arg0: ServerWorld, arg1: Int, arg2: Entity, arg3: DamageSource) = Enchantment.method_60040(arg0, arg1, arg2, arg3)
/**
 * method_58442
 */
fun KClass<Enchantment>.definition(arg0: RegistryEntryList<Item>, arg1: Int, arg2: Int, arg3: net.minecraft.class_1887.class_9426, arg4: net.minecraft.class_1887.class_9426, arg5: Int, arg6: Array<AttributeModifierSlot>) = Enchantment.method_58442(arg0, arg1, arg2, arg3, arg4, arg5, *arg6)
/**
 * method_60051
 */
fun Enchantment.modifyKnockback(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: Entity, arg4: DamageSource, arg5: MutableFloat) = this.method_60051(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_60053
 */
fun Enchantment.modifyBlockExperience(arg0: ServerWorld, arg1: Int, arg2: ItemStack, arg3: MutableFloat) = this.method_60053(arg0, arg1, arg2, arg3)
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
