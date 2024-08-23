package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AttributeModifierSlot

val KClass<AttributeModifierSlot>.ID_TO_VALUE by aliasStatic(AttributeModifierSlot::field_49225)
val KClass<AttributeModifierSlot>.HAND by aliasEnum(AttributeModifierSlot::class, "field_49219")
val KClass<AttributeModifierSlot>.OFFHAND by aliasEnum(AttributeModifierSlot::class, "field_49218")
val KClass<AttributeModifierSlot>.ANY by aliasEnum(AttributeModifierSlot::class, "field_49216")
val KClass<AttributeModifierSlot>.MAINHAND by aliasEnum(AttributeModifierSlot::class, "field_49217")
val KClass<AttributeModifierSlot>.ARMOR by aliasEnum(AttributeModifierSlot::class, "field_49224")
val KClass<AttributeModifierSlot>.CHEST by aliasEnum(AttributeModifierSlot::class, "field_49222")
val KClass<AttributeModifierSlot>.HEAD by aliasEnum(AttributeModifierSlot::class, "field_49223")
val KClass<AttributeModifierSlot>.FEET by aliasEnum(AttributeModifierSlot::class, "field_49220")
val KClass<AttributeModifierSlot>.LEGS by aliasEnum(AttributeModifierSlot::class, "field_49221")
val KClass<AttributeModifierSlot>.BODY by aliasEnum(AttributeModifierSlot::class, "field_50127")
fun KClass<AttributeModifierSlot>.forEquipmentSlot(arg0: EquipmentSlot) = AttributeModifierSlot.method_59524(arg0)
fun AttributeModifierSlot.matches(arg0: EquipmentSlot) = this.method_57286(arg0)
