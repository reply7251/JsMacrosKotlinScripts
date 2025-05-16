package me.hellrevenger.generated.Map_EnchantmentHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EnchantmentHelperKt {
    /**
     * method_60117
     */
    fun getItemDamage(world: ServerWorld?, stack: ItemStack?, baseItemDamage: Int) = EnchantmentHelper.method_60117(world, stack, baseItemDamage)
    /**
     * method_60157
     */
    fun getBlockExperience(world: ServerWorld?, stack: ItemStack?, baseBlockExperience: Int) = EnchantmentHelper.method_60157(world, stack, baseBlockExperience)
    /**
     * method_61711
     */
    fun getEnchantedBookWith(entry: EnchantmentLevelEntry?) = EnchantmentHelper.method_61711(entry)
    /**
     * method_60142
     */
    fun hasAnyEnchantmentsWith(stack: ItemStack?, componentType: ComponentType<*>?) = EnchantmentHelper.method_60142(stack, componentType)
    /**
     * method_60118
     */
    fun getProjectileSpread(world: ServerWorld?, stack: ItemStack?, user: Entity?, baseProjectileSpread: Float) = EnchantmentHelper.method_60118(world, stack, user, baseProjectileSpread)
    /**
     * method_60112
     */
    fun isInvulnerableTo(world: ServerWorld?, user: LivingEntity?, damageSource: DamageSource?) = EnchantmentHelper.method_60112(world, user, damageSource)
    /**
     * method_8227
     */
    fun calculateRequiredExperienceLevel(random: Random?, slotIndex: Int, bookshelfCount: Int, stack: ItemStack?) = EnchantmentHelper.method_8227(random, slotIndex, bookshelfCount, stack)
    /**
     * method_60128
     */
    fun getProjectilePiercing(world: ServerWorld?, weaponStack: ItemStack?, projectileStack: ItemStack?) = EnchantmentHelper.method_60128(world, weaponStack, projectileStack)
    /**
     * method_60109
     */
    fun getMobExperience(world: ServerWorld?, attacker: Entity?, mob: Entity?, baseMobExperience: Int) = EnchantmentHelper.method_60109(world, attacker, mob, baseMobExperience)
    /**
     * method_57530
     */
    fun set(stack: ItemStack?, enchantments: ItemEnchantmentsComponent?) = EnchantmentHelper.method_57530(stack, enchantments)
    /**
     * method_8201
     */
    fun isCompatible(existing: Collection<RegistryEntry<Enchantment>>?, candidate: RegistryEntry<Enchantment>?) = EnchantmentHelper.method_8201(existing, candidate)
    /**
     * method_60135
     */
    fun removeLocationBasedEffects(user: LivingEntity?) = EnchantmentHelper.method_60135(user)
    /**
     * method_60160
     */
    fun getSmashDamagePerFallenBlock(world: ServerWorld?, stack: ItemStack?, target: Entity?, damageSource: DamageSource?, baseSmashDamagePerFallenBlock: Float) = EnchantmentHelper.method_60160(world, stack, target, damageSource, baseSmashDamagePerFallenBlock)
    /**
     * method_60120
     */
    fun getDamage(world: ServerWorld?, stack: ItemStack?, target: Entity?, damageSource: DamageSource?, baseDamage: Float) = EnchantmentHelper.method_60120(world, stack, target, damageSource, baseDamage)
    /**
     * method_8219
     */
    fun getProtectionAmount(world: ServerWorld?, user: LivingEntity?, damageSource: DamageSource?) = EnchantmentHelper.method_8219(world, user, damageSource)
    /**
     * method_60125
     */
    fun applyLocationBasedEffects(world: ServerWorld?, stack: ItemStack?, user: LivingEntity?, slot: EquipmentSlot?) = EnchantmentHelper.method_60125(world, stack, user, slot)
    /**
     * method_8230
     */
    fun generateEnchantments(random: Random?, stack: ItemStack?, level: Int, possibleEnchantments: Stream<RegistryEntry<Enchantment>>?) = EnchantmentHelper.method_8230(random, stack, level, possibleEnchantments)
    /**
     * method_8225
     */
    fun getLevel(enchantment: RegistryEntry<Enchantment>?, stack: ItemStack?) = EnchantmentHelper.method_8225(enchantment, stack)
    /**
     * method_60622
     */
    fun applyAttributeModifiers(stack: ItemStack?, slot: AttributeModifierSlot?, attributeModifierConsumer: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>?) = EnchantmentHelper.method_60622(stack, slot, attributeModifierConsumer)
    /**
     * method_60127
     */
    fun onProjectileSpawned(world: ServerWorld?, weaponStack: ItemStack?, projectile: ProjectileEntity?, onBreak: Consumer<Item>?) = EnchantmentHelper.method_60127(world, weaponStack, projectile, onBreak)
    /**
     * method_60124
     */
    fun onHitBlock(world: ServerWorld?, stack: ItemStack?, user: LivingEntity?, enchantedEntity: Entity?, slot: EquipmentSlot?, pos: Vec3d?, state: BlockState?, onBreak: Consumer<Item>?) = EnchantmentHelper.method_60124(world, stack, user, enchantedEntity, slot, pos, state, onBreak)
    /**
     * method_60158
     */
    fun getFishingTimeReduction(world: ServerWorld?, stack: ItemStack?, user: Entity?) = EnchantmentHelper.method_60158(world, stack, user)
    /**
     * method_60137
     */
    fun applyEnchantmentProvider(stack: ItemStack?, registryManager: DynamicRegistryManager?, providerKey: RegistryKey<EnchantmentProvider>?, localDifficulty: LocalDifficulty?, random: Random?) = EnchantmentHelper.method_60137(stack, registryManager, providerKey, localDifficulty, random)
    /**
     * method_60170
     */
    fun getArmorEffectiveness(world: ServerWorld?, stack: ItemStack?, user: Entity?, damageSource: DamageSource?, baseArmorEffectiveness: Float) = EnchantmentHelper.method_60170(world, stack, user, damageSource, baseArmorEffectiveness)
    /**
     * method_60165
     */
    fun <T>getEffect(stack: ItemStack?, componentType: ComponentType<MutableList<T>>?) = EnchantmentHelper.method_60165<T>(stack, componentType)
    /**
     * method_60113
     */
    fun getEquipmentDropChance(world: ServerWorld?, attacker: LivingEntity?, damageSource: DamageSource?, baseEquipmentDropChance: Float) = EnchantmentHelper.method_60113(world, attacker, damageSource, baseEquipmentDropChance)
    /**
     * method_60169
     */
    fun getTridentReturnAcceleration(world: ServerWorld?, stack: ItemStack?, user: Entity?) = EnchantmentHelper.method_60169(world, stack, user)
    /**
     * method_60119
     */
    fun getProjectileCount(world: ServerWorld?, stack: ItemStack?, user: Entity?, baseProjectileCount: Int) = EnchantmentHelper.method_60119(world, stack, user, baseProjectileCount)
    /**
     * method_60133
     */
    fun enchant(random: Random?, stack: ItemStack?, level: Int, dynamicRegistryManager: DynamicRegistryManager?, enchantments: Optional<out RegistryEntryList<Enchantment>>?) = EnchantmentHelper.method_60133(random, stack, level, dynamicRegistryManager, enchantments)
    /**
     * method_8231
     */
    fun removeConflicts(possibleEntries: MutableList<EnchantmentLevelEntry>?, pickedEntry: EnchantmentLevelEntry?) = EnchantmentHelper.method_8231(possibleEntries, pickedEntry)
    /**
     * method_63016
     */
    fun onTargetDamaged(world: ServerWorld?, target: Entity?, damageSource: DamageSource?, weapon: ItemStack?, breakCallback: Consumer<Item>?) = EnchantmentHelper.method_63016(world, target, damageSource, weapon, breakCallback)
    /**
     * method_57529
     */
    fun canHaveEnchantments(stack: ItemStack?) = EnchantmentHelper.method_57529(stack)
    /**
     * method_8229
     */
    fun getPossibleEntries(level: Int, stack: ItemStack?, possibleEnchantments: Stream<RegistryEntry<Enchantment>>?) = EnchantmentHelper.method_8229(level, stack, possibleEnchantments)
    /**
     * method_60111
     */
    fun applyLocationBasedEffects(world: ServerWorld?, user: LivingEntity?) = EnchantmentHelper.method_60111(world, user)
    /**
     * method_60138
     */
    fun hasAnyEnchantmentsIn(stack: ItemStack?, tag: TagKey<Enchantment>?) = EnchantmentHelper.method_60138(stack, tag)
    /**
     * method_58117
     */
    fun hasEnchantments(stack: ItemStack?) = EnchantmentHelper.method_58117(stack)
    /**
     * method_57531
     */
    fun apply(stack: ItemStack?, applier: Consumer<net.minecraft.class_9304.class_9305>?) = EnchantmentHelper.method_57531(stack, applier)
    /**
     * method_60141
     */
    fun removeLocationBasedEffects(stack: ItemStack?, user: LivingEntity?, slot: EquipmentSlot?) = EnchantmentHelper.method_60141(stack, user, slot)
    /**
     * method_60159
     */
    fun getCrossbowChargeTime(stack: ItemStack?, user: LivingEntity?, baseCrossbowChargeTime: Float) = EnchantmentHelper.method_60159(stack, user, baseCrossbowChargeTime)
    /**
     * method_60154
     */
    fun onTick(world: ServerWorld?, user: LivingEntity?) = EnchantmentHelper.method_60154(world, user)
    /**
     * method_8233
     */
    fun enchant(random: Random?, stack: ItemStack?, level: Int, possibleEnchantments: Stream<RegistryEntry<Enchantment>>?) = EnchantmentHelper.method_8233(random, stack, level, possibleEnchantments)
    /**
     * method_60107
     */
    fun onTargetDamaged(world: ServerWorld?, target: Entity?, damageSource: DamageSource?) = EnchantmentHelper.method_60107(world, target, damageSource)
    /**
     * method_8204
     */
    fun chooseEquipmentWith(componentType: ComponentType<*>?, entity: LivingEntity?, stackPredicate: Predicate<ItemStack>?) = EnchantmentHelper.method_8204(componentType, entity, stackPredicate)
    /**
     * method_60619
     */
    fun onTargetDamaged(world: ServerWorld?, target: Entity?, damageSource: DamageSource?, weapon: ItemStack?) = EnchantmentHelper.method_60619(world, target, damageSource, weapon)
    /**
     * method_60174
     */
    fun <T>getHighestLevelEffect(stack: ItemStack?, componentType: ComponentType<T>?) = EnchantmentHelper.method_60174<T>(stack, componentType)
    /**
     * method_60168
     */
    fun getRepairWithExperience(world: ServerWorld?, stack: ItemStack?, baseRepairWithExperience: Int) = EnchantmentHelper.method_60168(world, stack, baseRepairWithExperience)
    /**
     * method_60140
     */
    fun applyAttributeModifiers(stack: ItemStack?, slot: EquipmentSlot?, attributeModifierConsumer: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>?) = EnchantmentHelper.method_60140(stack, slot, attributeModifierConsumer)
    /**
     * method_60175
     */
    fun modifyKnockback(world: ServerWorld?, stack: ItemStack?, target: Entity?, damageSource: DamageSource?, baseKnockback: Float) = EnchantmentHelper.method_60175(world, stack, target, damageSource, baseKnockback)
    /**
     * method_60129
     */
    fun getAmmoUse(world: ServerWorld?, rangedWeaponStack: ItemStack?, projectileStack: ItemStack?, baseAmmoUse: Int) = EnchantmentHelper.method_60129(world, rangedWeaponStack, projectileStack, baseAmmoUse)
    /**
     * method_60123
     */
    fun getTridentSpinAttackStrength(stack: ItemStack?, user: LivingEntity?) = EnchantmentHelper.method_60123(stack, user)
    /**
     * method_8223
     */
    fun getFishingLuckBonus(world: ServerWorld?, stack: ItemStack?, user: Entity?) = EnchantmentHelper.method_8223(world, stack, user)
    /**
     * method_8203
     */
    fun getEquipmentLevel(enchantment: RegistryEntry<Enchantment>?, entity: LivingEntity?) = EnchantmentHelper.method_8203(enchantment, entity)
    /**
     * method_57532
     */
    fun getEnchantments(stack: ItemStack?) = EnchantmentHelper.method_57532(stack)
}