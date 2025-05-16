package me.hellrevenger.generated.Map_LootPool
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_957
 */
val LootPool.rolls by alias(LootPool::field_957)
/**
 * field_958
 */
val LootPool.bonusRolls by alias(LootPool::field_958)
/**
 * field_956
 */
val LootPool.functions by alias(LootPool::field_956)
/**
 * field_954
 */
val LootPool.conditions by alias(LootPool::field_954)
/**
 * field_953
 */
val LootPool.entries by alias(LootPool::field_953)
/**
 * method_349
 */
fun LootPool.validate(reporter: LootTableReporter?) = this.method_349(reporter)
/**
 * method_341
 */
fun LootPool.addGeneratedLoot(lootConsumer: Consumer<ItemStack>?, context: LootContext?) = this.method_341(lootConsumer, context)
