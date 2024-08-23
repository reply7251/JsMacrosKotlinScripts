package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EquipmentHolder

fun EquipmentHolder.getEquippedStack(arg0: EquipmentSlot) = this.method_6118(arg0)
fun EquipmentHolder.setEquipmentFromTable(arg0: EquipmentTable, arg1: LootContextParameterSet) = this.method_58631(arg0, arg1)
fun EquipmentHolder.getSlotForStack(arg0: ItemStack, arg1: MutableList<EquipmentSlot>) = this.method_58633(arg0, arg1)
fun EquipmentHolder.setEquipmentDropChance(arg0: EquipmentSlot, arg1: Float) = this.method_5946(arg0, arg1)
fun EquipmentHolder.equipStack(arg0: EquipmentSlot, arg1: ItemStack) = this.method_5673(arg0, arg1)
fun EquipmentHolder.setEquipmentFromTable(arg0: RegistryKey<LootTable>, arg1: LootContextParameterSet, arg2: Long, arg3: Map<EquipmentSlot, Float>) = this.method_58632(arg0, arg1, arg2, arg3)
fun EquipmentHolder.setEquipmentFromTable(arg0: RegistryKey<LootTable>, arg1: LootContextParameterSet, arg2: Map<EquipmentSlot, Float>) = this.method_59663(arg0, arg1, arg2)
