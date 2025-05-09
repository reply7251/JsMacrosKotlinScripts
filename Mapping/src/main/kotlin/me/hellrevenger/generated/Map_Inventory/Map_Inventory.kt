package me.hellrevenger.generated.Map_Inventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_5432
 */
fun Inventory.onClose(player: PlayerEntity) = this.method_5432(player)
/**
 * method_5435
 */
fun Inventory.onOpen(player: PlayerEntity) = this.method_5435(player)
/**
 * method_5431
 */
fun Inventory.markDirty() = this.method_5431()
/**
 * method_5438
 */
fun Inventory.getStack(slot: Int) = this.method_5438(slot)
/**
 * method_5442
 */
fun Inventory.isEmpty() = this.method_5442()
/**
 * method_18861
 */
fun Inventory.count(item: Item) = this.method_18861(item)
/**
 * method_18862
 */
fun Inventory.containsAny(items: Set<Item>) = this.method_18862(items)
/**
 * method_5439
 */
fun Inventory.size() = this.method_5439()
/**
 * method_58350
 */
fun Inventory.getMaxCount(stack: ItemStack) = this.method_58350(stack)
/**
 * method_49104
 */
fun Inventory.canTransferTo(hopperInventory: Inventory, slot: Int, stack: ItemStack) = this.method_49104(hopperInventory, slot, stack)
/**
 * method_5434
 */
fun Inventory.removeStack(slot: Int, amount: Int) = this.method_5434(slot, amount)
/**
 * method_5444
 */
fun Inventory.getMaxCountPerStack() = this.method_5444()
/**
 * method_5437
 */
fun Inventory.isValid(slot: Int, stack: ItemStack) = this.method_5437(slot, stack)
/**
 * method_5447
 */
fun Inventory.setStack(slot: Int, stack: ItemStack) = this.method_5447(slot, stack)
