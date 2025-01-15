package me.hellrevenger.generated.Map_LootPool
import kotlin.reflect.*
import me.hellrevenger.generated.*

val LootPool.rolls by alias(LootPool::field_957)
val LootPool.bonusRolls by alias(LootPool::field_958)
val LootPool.functions by alias(LootPool::field_956)
val LootPool.conditions by alias(LootPool::field_954)
val LootPool.entries by alias(LootPool::field_953)
fun LootPool.validate(arg0: LootTableReporter) = this.method_349(arg0)
fun KClass<LootPool>.builder() = LootPool.method_347()
fun LootPool.addGeneratedLoot(arg0: Consumer<ItemStack>, arg1: LootContext) = this.method_341(arg0, arg1)
