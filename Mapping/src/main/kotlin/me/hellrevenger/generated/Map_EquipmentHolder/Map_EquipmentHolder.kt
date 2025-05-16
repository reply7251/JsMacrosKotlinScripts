package me.hellrevenger.generated.Map_EquipmentHolder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_6118
 */
fun EquipmentHolder.getEquippedStack(slot: EquipmentSlot?) = this.method_6118(slot)
/**
 * method_58631
 */
fun EquipmentHolder.setEquipmentFromTable(equipmentTable: EquipmentTable?, parameters: LootWorldContext?) = this.method_58631(equipmentTable, parameters)
/**
 * method_58633
 */
fun EquipmentHolder.getSlotForStack(stack: ItemStack?, slotBlacklist: MutableList<EquipmentSlot>?) = this.method_58633(stack, slotBlacklist)
/**
 * method_5946
 */
fun EquipmentHolder.setEquipmentDropChance(slot: EquipmentSlot?, dropChance: Float) = this.method_5946(slot, dropChance)
/**
 * method_5673
 */
fun EquipmentHolder.equipStack(slot: EquipmentSlot?, stack: ItemStack?) = this.method_5673(slot, stack)
/**
 * method_58632
 */
fun EquipmentHolder.setEquipmentFromTable(lootTable: RegistryKey<LootTable>?, parameters: LootWorldContext?, seed: Long, arg3: Map<EquipmentSlot, Float>?) = this.method_58632(lootTable, parameters, seed, arg3)
/**
 * method_59663
 */
fun EquipmentHolder.setEquipmentFromTable(lootTable: RegistryKey<LootTable>?, parameters: LootWorldContext?, slotDropChances: Map<EquipmentSlot, Float>?) = this.method_59663(lootTable, parameters, slotDropChances)
