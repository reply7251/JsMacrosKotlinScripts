package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LootTable

val KClass<LootTable>.DEFAULT_SEED by aliasStatic(LootTable::field_49428)
val KClass<LootTable>.GENERIC by aliasStatic(LootTable::field_947)
val KClass<LootTable>.EMPTY by aliasStatic(LootTable::field_948)
fun LootTable.generateLoot(arg0: LootContextParameterSet) = this.method_51878(arg0)
fun KClass<LootTable>.builder() = LootTable.method_324()
fun LootTable.validate(arg0: LootTableReporter) = this.method_330(arg0)
fun LootTable.supplyInventory(arg0: Inventory, arg1: LootContextParameterSet, arg2: Long) = this.method_329(arg0, arg1, arg2)
fun LootTable.generateLoot(arg0: LootContextParameterSet, arg1: Consumer<ItemStack>) = this.method_51882(arg0, arg1)
fun LootTable.generateLoot(arg0: LootContextParameterSet, arg1: Random) = this.method_60569(arg0, arg1)
fun LootTable.generateLoot(arg0: LootContext, arg1: Consumer<ItemStack>) = this.method_320(arg0, arg1)
fun KClass<LootTable>.processStacks(arg0: ServerWorld, arg1: Consumer<ItemStack>) = LootTable.method_332(arg0, arg1)
fun LootTable.generateLoot(arg0: LootContextParameterSet, arg1: Long, arg2: Consumer<ItemStack>) = this.method_51880(arg0, arg1, arg2)
fun LootTable.getType() = this.method_322()
fun LootTable.generateLoot(arg0: LootContextParameterSet, arg1: Long) = this.method_51879(arg0, arg1)
fun LootTable.generateUnprocessedLoot(arg0: LootContextParameterSet, arg1: Consumer<ItemStack>) = this.method_51881(arg0, arg1)
fun LootTable.generateUnprocessedLoot(arg0: LootContext, arg1: Consumer<ItemStack>) = this.method_328(arg0, arg1)
