package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DefaultAttributeContainer

fun DefaultAttributeContainer.hasModifier(arg0: RegistryEntry<EntityAttribute>, arg1: Identifier) = this.method_27309(arg0, arg1)
fun DefaultAttributeContainer.getValue(arg0: RegistryEntry<EntityAttribute>) = this.method_26862(arg0)
fun DefaultAttributeContainer.getModifierValue(arg0: RegistryEntry<EntityAttribute>, arg1: Identifier) = this.method_27308(arg0, arg1)
fun DefaultAttributeContainer.getBaseValue(arg0: RegistryEntry<EntityAttribute>) = this.method_26864(arg0)
fun KClass<DefaultAttributeContainer>.builder() = DefaultAttributeContainer.method_26861()
fun DefaultAttributeContainer.createOverride(arg0: Consumer<EntityAttributeInstance>, arg1: RegistryEntry<EntityAttribute>) = this.method_26863(arg0, arg1)
fun DefaultAttributeContainer.has(arg0: RegistryEntry<EntityAttribute>) = this.method_27310(arg0)
