package me.hellrevenger.generated.Map_ItemUsage
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ItemUsageKt {
    /**
     * method_30270
     */
    fun exchangeStack(inputStack: ItemStack, player: PlayerEntity, outputStack: ItemStack, creativeOverride: Boolean) = ItemUsage.method_30270(inputStack, player, outputStack, creativeOverride)
    /**
     * method_29282
     */
    fun consumeHeldItem(world: world_World, player: PlayerEntity, hand: Hand) = ItemUsage.method_29282(world, player, hand)
    /**
     * method_33263
     */
    fun spawnItemContents(itemEntity: ItemEntity, contents: Iterable<ItemStack>) = ItemUsage.method_33263(itemEntity, contents)
}