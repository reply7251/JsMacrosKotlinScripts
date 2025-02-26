package me.hellrevenger.generated.Map_StatusEffectInstance
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_42106
 */
val KClass<StatusEffectInstance>.INFINITE by aliasStatic(StatusEffectInstance::field_42106)
/**
 * field_49014
 */
val KClass<StatusEffectInstance>.MIN_AMPLIFIER by aliasStatic(StatusEffectInstance::field_49014)
/**
 * field_49015
 */
val KClass<StatusEffectInstance>.MAX_AMPLIFIER by aliasStatic(StatusEffectInstance::field_49015)
/**
 * method_5581
 */
fun StatusEffectInstance.shouldShowParticles() = this.method_5581()
/**
 * method_5579
 */
fun StatusEffectInstance.getEffectType() = this.method_5579()
/**
 * method_5578
 */
fun StatusEffectInstance.getAmplifier() = this.method_5578()
/**
 * method_55653
 */
fun StatusEffectInstance.getFadeFactor(arg0: LivingEntity, arg1: Float) = this.method_55653(arg0, arg1)
/**
 * method_48557
 */
fun StatusEffectInstance.isDurationBelow(arg0: Int) = this.method_48557(arg0)
/**
 * method_5582
 */
fun StatusEffectInstance.writeNbt() = this.method_5582()
/**
 * method_55657
 */
fun StatusEffectInstance.skipFading() = this.method_55657()
/**
 * method_5592
 */
fun StatusEffectInstance.shouldShowIcon() = this.method_5592()
/**
 * method_5583
 */
fun KClass<StatusEffectInstance>.fromNbt(arg0: NbtCompound) = StatusEffectInstance.method_5583(arg0)
/**
 * method_5590
 */
fun StatusEffectInstance.upgrade(arg0: StatusEffectInstance) = this.method_5590(arg0)
/**
 * method_5584
 */
fun StatusEffectInstance.getDuration() = this.method_5584()
/**
 * method_5587
 */
fun StatusEffectInstance.compareTo(arg0: StatusEffectInstance) = this.method_5587(arg0)
/**
 * method_55654
 */
fun StatusEffectInstance.equals(arg0: RegistryEntry<StatusEffect>) = this.method_55654(arg0)
/**
 * method_5591
 */
fun StatusEffectInstance.isAmbient() = this.method_5591()
/**
 * method_55656
 */
fun StatusEffectInstance.copyFadingFrom(arg0: StatusEffectInstance) = this.method_55656(arg0)
/**
 * method_58623
 */
fun StatusEffectInstance.playApplySound(arg0: LivingEntity) = this.method_58623(arg0)
/**
 * method_58148
 */
fun StatusEffectInstance.createParticle() = this.method_58148()
/**
 * method_48559
 */
fun StatusEffectInstance.isInfinite() = this.method_48559()
/**
 * method_52523
 */
fun StatusEffectInstance.onApplied(arg0: LivingEntity) = this.method_52523(arg0)
/**
 * method_58622
 */
fun StatusEffectInstance.onEntityRemoval(arg0: LivingEntity, arg1: net.minecraft.class_1297.class_5529) = this.method_58622(arg0, arg1)
/**
 * method_58621
 */
fun StatusEffectInstance.onEntityDamage(arg0: LivingEntity, arg1: DamageSource, arg2: Float) = this.method_58621(arg0, arg1, arg2)
/**
 * method_5586
 */
fun StatusEffectInstance.getTranslationKey() = this.method_5586()
/**
 * method_48558
 */
fun StatusEffectInstance.mapDuration(arg0: Int2IntFunction) = this.method_48558(arg0)
/**
 * method_5585
 */
fun StatusEffectInstance.update(arg0: LivingEntity, arg1: Runnable) = this.method_5585(arg0, arg1)
