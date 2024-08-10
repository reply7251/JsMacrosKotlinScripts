package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EquipmentSlot

val EquipmentSlot.NO_MAX_COUNT by aliasStatic(EquipmentSlot::field_51935)
val EquipmentSlot.MAINHAND by aliasEnum(EquipmentSlot::class, "field_6173")
val EquipmentSlot.CHEST by aliasEnum(EquipmentSlot::class, "field_6174")
val EquipmentSlot.OFFHAND by aliasEnum(EquipmentSlot::class, "field_6171")
val EquipmentSlot.LEGS by aliasEnum(EquipmentSlot::class, "field_6172")
val EquipmentSlot.FEET by aliasEnum(EquipmentSlot::class, "field_6166")
val EquipmentSlot.HEAD by aliasEnum(EquipmentSlot::class, "field_6169")
val EquipmentSlot.BODY by aliasEnum(EquipmentSlot::class, "field_48824")
fun EquipmentSlot.isArmorSlot() = this.method_46643()
fun KClass<EquipmentSlot>.byName(arg0: String) = EquipmentSlot.method_5924(arg0)
fun EquipmentSlot.getOffsetEntitySlotId(arg0: Int) = this.method_32320(arg0)
fun EquipmentSlot.split(arg0: ItemStack) = this.method_60610(arg0)
fun EquipmentSlot.getEntitySlotId() = this.method_5927()
fun EquipmentSlot.getArmorStandSlotId() = this.method_5926()
