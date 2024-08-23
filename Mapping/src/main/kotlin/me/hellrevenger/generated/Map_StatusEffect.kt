package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StatusEffect

fun StatusEffect.requires(arg0: Array<FeatureFlag>) = this.method_58619(*arg0)
fun StatusEffect.applyInstantEffect(arg0: Entity, arg1: Entity, arg2: LivingEntity, arg3: Int, arg4: Double) = this.method_5564(arg0, arg1, arg2, arg3, arg4)
fun StatusEffect.isBeneficial() = this.method_5573()
fun StatusEffect.onRemoved(arg0: AttributeContainer) = this.method_5562(arg0)
fun StatusEffect.canApplyUpdateEffect(arg0: Int, arg1: Int) = this.method_5552(arg0, arg1)
fun StatusEffect.isInstant() = this.method_5561()
fun StatusEffect.createParticle(arg0: StatusEffectInstance) = this.method_58146(arg0)
fun StatusEffect.getColor() = this.method_5556()
fun StatusEffect.applyUpdateEffect(arg0: LivingEntity, arg1: Int) = this.method_5572(arg0, arg1)
fun StatusEffect.applySound(arg0: SoundEvent) = this.method_58616(arg0)
fun StatusEffect.fadeTicks(arg0: Int) = this.method_55649(arg0)
fun StatusEffect.onApplied(arg0: AttributeContainer, arg1: Int) = this.method_5555(arg0, arg1)
fun StatusEffect.playApplySound(arg0: LivingEntity, arg1: Int) = this.method_58620(arg0, arg1)
fun StatusEffect.forEachAttributeModifier(arg0: Int, arg1: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_55650(arg0, arg1)
fun StatusEffect.addAttributeModifier(arg0: RegistryEntry<EntityAttribute>, arg1: Identifier, arg2: Double, arg3: net.minecraft.class_1322.class_1323) = this.method_5566(arg0, arg1, arg2, arg3)
fun StatusEffect.getFadeTicks() = this.method_55652()
fun StatusEffect.onApplied(arg0: LivingEntity, arg1: Int) = this.method_52520(arg0, arg1)
fun StatusEffect.getTranslationKey() = this.method_5567()
fun StatusEffect.getCategory() = this.method_18792()
fun StatusEffect.onEntityDamage(arg0: LivingEntity, arg1: Int, arg2: DamageSource, arg3: Float) = this.method_58614(arg0, arg1, arg2, arg3)
fun StatusEffect.getName() = this.method_5560()
fun StatusEffect.onEntityRemoval(arg0: LivingEntity, arg1: Int, arg2: net.minecraft.class_1297.class_5529) = this.method_58617(arg0, arg1, arg2)
