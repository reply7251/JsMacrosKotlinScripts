package me.hellrevenger.generated.Map_StatusEffect
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_58619
 */
fun StatusEffect.requires(requiredFeatures: Array<FeatureFlag>) = this.method_58619(*requiredFeatures)
/**
 * method_5573
 */
fun StatusEffect.isBeneficial() = this.method_5573()
/**
 * method_5562
 */
fun StatusEffect.onRemoved(attributeContainer: AttributeContainer) = this.method_5562(attributeContainer)
/**
 * method_5552
 */
fun StatusEffect.canApplyUpdateEffect(duration: Int, amplifier: Int) = this.method_5552(duration, amplifier)
/**
 * method_5561
 */
fun StatusEffect.isInstant() = this.method_5561()
/**
 * method_5572
 */
fun StatusEffect.applyUpdateEffect(world: ServerWorld, entity: LivingEntity, amplifier: Int) = this.method_5572(world, entity, amplifier)
/**
 * method_58146
 */
fun StatusEffect.createParticle(effect: StatusEffectInstance) = this.method_58146(effect)
/**
 * method_5556
 */
fun StatusEffect.getColor() = this.method_5556()
/**
 * method_58616
 */
fun StatusEffect.applySound(sound: SoundEvent) = this.method_58616(sound)
/**
 * method_55649
 */
fun StatusEffect.fadeTicks(fadeTicks: Int) = this.method_55649(fadeTicks)
/**
 * method_5555
 */
fun StatusEffect.onApplied(attributeContainer: AttributeContainer, amplifier: Int) = this.method_5555(attributeContainer, amplifier)
/**
 * method_58620
 */
fun StatusEffect.playApplySound(entity: LivingEntity, amplifier: Int) = this.method_58620(entity, amplifier)
/**
 * method_55650
 */
fun StatusEffect.forEachAttributeModifier(amplifier: Int, consumer: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_55650(amplifier, consumer)
/**
 * method_5566
 */
fun StatusEffect.addAttributeModifier(attribute: RegistryEntry<EntityAttribute>, id: Identifier, amount: Double, arg3: net.minecraft.class_1322.class_1323) = this.method_5566(attribute, id, amount, arg3)
/**
 * method_58614
 */
fun StatusEffect.onEntityDamage(world: ServerWorld, entity: LivingEntity, amplifier: Int, source: DamageSource, amount: Float) = this.method_58614(world, entity, amplifier, source, amount)
/**
 * method_55652
 */
fun StatusEffect.getFadeTicks() = this.method_55652()
/**
 * method_52520
 */
fun StatusEffect.onApplied(entity: LivingEntity, amplifier: Int) = this.method_52520(entity, amplifier)
/**
 * method_5564
 */
fun StatusEffect.applyInstantEffect(world: ServerWorld, effectEntity: Entity, attacker: Entity, target: LivingEntity, amplifier: Int, proximity: Double) = this.method_5564(world, effectEntity, attacker, target, amplifier, proximity)
/**
 * method_5567
 */
fun StatusEffect.getTranslationKey() = this.method_5567()
/**
 * method_58617
 */
fun StatusEffect.onEntityRemoval(world: ServerWorld, entity: LivingEntity, amplifier: Int, reason: net.minecraft.class_1297.class_5529) = this.method_58617(world, entity, amplifier, reason)
/**
 * method_18792
 */
fun StatusEffect.getCategory() = this.method_18792()
/**
 * method_5560
 */
fun StatusEffect.getName() = this.method_5560()
