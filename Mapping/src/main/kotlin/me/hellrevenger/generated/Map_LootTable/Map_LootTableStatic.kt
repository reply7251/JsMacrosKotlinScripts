package me.hellrevenger.generated.Map_LootTable
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LootTableKt {
    /**
     * field_49428
     */
    val DEFAULT_SEED by aliasStatic(LootTable::field_49428)
    /**
     * field_947
     */
    val GENERIC by aliasStatic(LootTable::field_947)
    /**
     * field_948
     */
    val EMPTY by aliasStatic(LootTable::field_948)
    /**
     * method_324
     */
    fun builder() = LootTable.method_324()
    /**
     * method_332
     */
    fun processStacks(world: ServerWorld, consumer: Consumer<ItemStack>) = LootTable.method_332(world, consumer)
}