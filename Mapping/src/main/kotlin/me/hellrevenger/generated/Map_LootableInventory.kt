package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LootableInventory

fun LootableInventory.setLootTable(arg0: RegistryKey<LootTable>) = this.method_11285(arg0)
fun LootableInventory.getLootTableSeed() = this.method_54870()
fun LootableInventory.getLootTable() = this.method_54869()
fun LootableInventory.writeLootTable(arg0: NbtCompound) = this.method_54872(arg0)
fun LootableInventory.readLootTable(arg0: NbtCompound) = this.method_54871(arg0)
fun LootableInventory.getPos() = this.method_11016()
fun LootableInventory.generateLoot(arg0: PlayerEntity) = this.method_54873(arg0)
fun KClass<LootableInventory>.setLootTable(arg0: BlockView, arg1: Random, arg2: BlockPos, arg3: RegistryKey<LootTable>) = LootableInventory.method_54868(arg0, arg1, arg2, arg3)
fun LootableInventory.getWorld() = this.method_10997()
fun LootableInventory.setLootTable(arg0: RegistryKey<LootTable>, arg1: Long) = this.method_54867(arg0, arg1)
fun LootableInventory.setLootTableSeed(arg0: Long) = this.method_54866(arg0)
