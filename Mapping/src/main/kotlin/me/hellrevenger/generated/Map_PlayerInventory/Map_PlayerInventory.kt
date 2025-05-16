package me.hellrevenger.generated.Map_PlayerInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7548
 */
val PlayerInventory.armor by alias(PlayerInventory::field_7548)
/**
 * field_7545
 */
var PlayerInventory.selectedSlot by alias(PlayerInventory::field_7545)
/**
 * field_7544
 */
val PlayerInventory.offHand by alias(PlayerInventory::field_7544)
/**
 * field_7546
 */
val PlayerInventory.player by alias(PlayerInventory::field_7546)
/**
 * field_7547
 */
val PlayerInventory.main by alias(PlayerInventory::field_7547)
/**
 * method_7372
 */
fun PlayerInventory.getArmorStack(slot: Int) = this.method_7372(slot)
/**
 * method_7379
 */
fun PlayerInventory.contains(stack: ItemStack?) = this.method_7379(stack)
/**
 * method_7395
 */
fun PlayerInventory.getSlotWithStack(stack: ItemStack?) = this.method_7395(stack)
/**
 * method_32338
 */
fun PlayerInventory.offer(stack: ItemStack?, notifiesClient: Boolean) = this.method_32338(stack, notifiesClient)
/**
 * method_7365
 */
fun PlayerInventory.swapSlotWithHotbar(slot: Int) = this.method_7365(slot)
/**
 * method_7381
 */
fun PlayerInventory.updateItems() = this.method_7381()
/**
 * method_7377
 */
fun PlayerInventory.clone(other: PlayerInventory?) = this.method_7377(other)
/**
 * method_7398
 */
fun PlayerInventory.offerOrDrop(stack: ItemStack?) = this.method_7398(stack)
/**
 * method_7378
 */
fun PlayerInventory.removeOne(stack: ItemStack?) = this.method_7378(stack)
/**
 * method_37417
 */
fun PlayerInventory.dropSelectedItem(entireStack: Boolean) = this.method_37417(entireStack)
/**
 * method_7370
 */
fun PlayerInventory.getBlockBreakingSpeed(block: BlockState?) = this.method_7370(block)
/**
 * method_61494
 */
fun PlayerInventory.getMatchingSlot(item: RegistryEntry<Item>?, stack: ItemStack?) = this.method_61494(item, stack)
/**
 * method_7384
 */
fun PlayerInventory.writeNbt(nbtList: NbtList?) = this.method_7384(nbtList)
/**
 * method_7390
 */
fun PlayerInventory.getOccupiedSlotWithRoomForStack(stack: ItemStack?) = this.method_7390(stack)
/**
 * method_7376
 */
fun PlayerInventory.getEmptySlot() = this.method_7376()
/**
 * method_7364
 */
fun PlayerInventory.getChangeCount() = this.method_7364()
/**
 * method_7386
 */
fun PlayerInventory.getSwappableHotbarSlot() = this.method_7386()
/**
 * method_7388
 */
fun PlayerInventory.dropAll() = this.method_7388()
/**
 * method_7382
 */
fun PlayerInventory.contains(tag: TagKey<Item>?) = this.method_7382(tag)
/**
 * method_29280
 */
fun PlayerInventory.remove(shouldRemove: Predicate<ItemStack>?, maxCount: Int, craftingInventory: Inventory?) = this.method_29280(shouldRemove, maxCount, craftingInventory)
/**
 * method_61497
 */
fun PlayerInventory.createSlotSetPacket(slot: Int) = this.method_61497(slot)
/**
 * method_65126
 */
fun PlayerInventory.swapStackWithHotbar(stack: ItemStack?) = this.method_65126(stack)
/**
 * method_7391
 */
fun PlayerInventory.getMainHandStack() = this.method_7391()
/**
 * method_7394
 */
fun PlayerInventory.insertStack(stack: ItemStack?) = this.method_7394(stack)
/**
 * method_55753
 */
fun PlayerInventory.contains(predicate: Predicate<ItemStack>?) = this.method_55753(predicate)
/**
 * method_7387
 */
fun PlayerInventory.populateRecipeFinder(finder: RecipeFinder?) = this.method_7387(finder)
/**
 * method_7397
 */
fun PlayerInventory.readNbt(nbtList: NbtList?) = this.method_7397(nbtList)
/**
 * method_7367
 */
fun PlayerInventory.insertStack(slot: Int, stack: ItemStack?) = this.method_7367(slot, stack)
