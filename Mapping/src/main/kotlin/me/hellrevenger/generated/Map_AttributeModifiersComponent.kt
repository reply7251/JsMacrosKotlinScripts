package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AttributeModifiersComponent

val AttributeModifiersComponent.PACKET_CODEC by aliasStatic(AttributeModifiersComponent::field_49328)
val AttributeModifiersComponent.DECIMAL_FORMAT by aliasStatic(AttributeModifiersComponent::field_49329)
val AttributeModifiersComponent.DEFAULT by aliasStatic(AttributeModifiersComponent::field_49326)
fun AttributeModifiersComponent.applyModifiers(arg0: AttributeModifierSlot, arg1: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_60618(arg0, arg1)
fun AttributeModifiersComponent.applyOperations(arg0: Double, arg1: EquipmentSlot) = this.method_57481(arg0, arg1)
fun AttributeModifiersComponent.applyModifiers(arg0: EquipmentSlot, arg1: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_57482(arg0, arg1)
fun AttributeModifiersComponent.with(arg0: RegistryEntry<EntityAttribute>, arg1: EntityAttributeModifier, arg2: AttributeModifierSlot) = this.method_57484(arg0, arg1, arg2)
fun KClass<AttributeModifiersComponent>.builder() = AttributeModifiersComponent.method_57480()
fun AttributeModifiersComponent.withShowInTooltip(arg0: Boolean) = this.method_58423(arg0)
fun AttributeModifiersComponent.modifiers() = this.comp_2393()
fun AttributeModifiersComponent.showInTooltip() = this.comp_2394()
