package me.hellrevenger.generated.Map_LootTable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_49428
 */
val KClass<LootTable>.DEFAULT_SEED by aliasStatic(LootTable::field_49428)
/**
 * field_947
 */
val KClass<LootTable>.GENERIC by aliasStatic(LootTable::field_947)
/**
 * field_948
 */
val KClass<LootTable>.EMPTY by aliasStatic(LootTable::field_948)
/**
 * method_51878
 */
fun LootTable.generateLoot(arg0: LootWorldContext) = this.method_51878(arg0)
/**
 * method_324
 */
fun KClass<LootTable>.builder() = LootTable.method_324()
/**
 * method_330
 */
fun LootTable.validate(arg0: LootTableReporter) = this.method_330(arg0)
/**
 * method_329
 */
fun LootTable.supplyInventory(arg0: Inventory, arg1: LootWorldContext, arg2: Long) = this.method_329(arg0, arg1, arg2)
/**
 * method_51882
 */
fun LootTable.generateLoot(arg0: LootWorldContext, arg1: Consumer<ItemStack>) = this.method_51882(arg0, arg1)
/**
 * method_60569
 */
fun LootTable.generateLoot(arg0: LootWorldContext, arg1: Random) = this.method_60569(arg0, arg1)
/**
 * method_320
 */
fun LootTable.generateLoot(arg0: LootContext, arg1: Consumer<ItemStack>) = this.method_320(arg0, arg1)
/**
 * method_332
 */
fun KClass<LootTable>.processStacks(arg0: ServerWorld, arg1: Consumer<ItemStack>) = LootTable.method_332(arg0, arg1)
/**
 * method_51880
 */
fun LootTable.generateLoot(arg0: LootWorldContext, arg1: Long, arg2: Consumer<ItemStack>) = this.method_51880(arg0, arg1, arg2)
/**
 * method_322
 */
fun LootTable.getType() = this.method_322()
/**
 * method_51879
 */
fun LootTable.generateLoot(arg0: LootWorldContext, arg1: Long) = this.method_51879(arg0, arg1)
/**
 * method_51881
 */
fun LootTable.generateUnprocessedLoot(arg0: LootWorldContext, arg1: Consumer<ItemStack>) = this.method_51881(arg0, arg1)
/**
 * method_328
 */
fun LootTable.generateUnprocessedLoot(arg0: LootContext, arg1: Consumer<ItemStack>) = this.method_328(arg0, arg1)
