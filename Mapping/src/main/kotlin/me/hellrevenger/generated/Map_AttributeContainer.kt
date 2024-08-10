package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AttributeContainer

fun AttributeContainer.removeModifiers(arg0: Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_59935(arg0)
fun AttributeContainer.getCustomInstance(arg0: RegistryEntry<EntityAttribute>) = this.method_45329(arg0)
fun AttributeContainer.setBaseFrom(arg0: AttributeContainer) = this.method_60614(arg0)
fun AttributeContainer.getModifierValue(arg0: RegistryEntry<EntityAttribute>, arg1: Identifier) = this.method_45332(arg0, arg1)
fun AttributeContainer.getAttributesToSend() = this.method_26851()
fun AttributeContainer.readNbt(arg0: NbtList) = this.method_26850(arg0)
fun AttributeContainer.toNbt() = this.method_26855()
fun AttributeContainer.addTemporaryModifiers(arg0: Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_59932(arg0)
fun AttributeContainer.getBaseValue(arg0: RegistryEntry<EntityAttribute>) = this.method_26856(arg0)
fun AttributeContainer.getValue(arg0: RegistryEntry<EntityAttribute>) = this.method_26852(arg0)
fun AttributeContainer.hasAttribute(arg0: RegistryEntry<EntityAttribute>) = this.method_45331(arg0)
fun AttributeContainer.hasModifierForAttribute(arg0: RegistryEntry<EntityAttribute>, arg1: Identifier) = this.method_45330(arg0, arg1)
fun AttributeContainer.setFrom(arg0: AttributeContainer) = this.method_26846(arg0)
