package me.hellrevenger.generated.Map_SimpleInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_5828
 */
val SimpleInventory.heldStacks by alias(SimpleInventory::field_5828)
/**
 * method_7660
 */
fun SimpleInventory.toNbtList(registries: net.minecraft.class_7225.class_7874) = this.method_7660(registries)
/**
 * method_20631
 */
fun SimpleInventory.removeItem(item: Item, count: Int) = this.method_20631(item, count)
/**
 * method_27070
 */
fun SimpleInventory.canInsert(stack: ItemStack) = this.method_27070(stack)
/**
 * method_5491
 */
fun SimpleInventory.addStack(stack: ItemStack) = this.method_5491(stack)
/**
 * method_7659
 */
fun SimpleInventory.readNbtList(list: NbtList, registries: net.minecraft.class_7225.class_7874) = this.method_7659(list, registries)
/**
 * method_5488
 */
fun SimpleInventory.removeListener(listener: InventoryChangedListener) = this.method_5488(listener)
/**
 * method_5489
 */
fun SimpleInventory.addListener(listener: InventoryChangedListener) = this.method_5489(listener)
/**
 * method_24514
 */
fun SimpleInventory.clearToList() = this.method_24514()
