package me.hellrevenger.generated.Map_Enchantment
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EnchantmentKt {
    /**
     * field_51949
     */
    val MAX_LEVEL by aliasStatic(Enchantment::field_51949)
    /**
     * method_60033
     */
    fun canBeCombined(first: RegistryEntry<Enchantment>?, second: RegistryEntry<Enchantment>?) = Enchantment.method_60033(first, second)
    /**
     * method_8179
     */
    fun getName(enchantment: RegistryEntry<Enchantment>?, level: Int) = Enchantment.method_8179(enchantment, level)
    /**
     * method_58443
     */
    fun definition(supportedItems: RegistryEntryList<Item>?, primaryItems: RegistryEntryList<Item>?, weight: Int, maxLevel: Int, minCost: net.minecraft.class_1887.class_9426?, maxCost: net.minecraft.class_1887.class_9426?, anvilCost: Int, slots: Array<AttributeModifierSlot>) = Enchantment.method_58443(supportedItems, primaryItems, weight, maxLevel, minCost, maxCost, anvilCost, *slots)
    /**
     * method_58440
     */
    fun constantCost(base: Int) = Enchantment.method_58440(base)
    /**
     * method_60031
     */
    fun applyTargetedEffect(effect: TargetedEnchantmentEffect<EnchantmentEntityEffect>?, world: ServerWorld?, level: Int, context: EnchantmentEffectContext?, user: Entity?, damageSource: DamageSource?) = Enchantment.method_60031(effect, world, level, context, user, damageSource)
    /**
     * method_58441
     */
    fun leveledCost(base: Int, perLevel: Int) = Enchantment.method_58441(base, perLevel)
    /**
     * method_60030
     */
    fun builder(definition: net.minecraft.class_1887.class_9427?) = Enchantment.method_60030(definition)
    /**
     * method_60040
     */
    fun createEnchantedDamageLootContext(world: ServerWorld?, level: Int, entity: Entity?, damageSource: DamageSource?) = Enchantment.method_60040(world, level, entity, damageSource)
    /**
     * method_58442
     */
    fun definition(supportedItems: RegistryEntryList<Item>?, weight: Int, maxLevel: Int, minCost: net.minecraft.class_1887.class_9426?, maxCost: net.minecraft.class_1887.class_9426?, anvilCost: Int, slots: Array<AttributeModifierSlot>) = Enchantment.method_58442(supportedItems, weight, maxLevel, minCost, maxCost, anvilCost, *slots)
}