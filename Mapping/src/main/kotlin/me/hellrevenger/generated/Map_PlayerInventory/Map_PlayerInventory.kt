package me.hellrevenger.generated.Map_PlayerInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7548
 */
val PlayerInventory.armor by alias(PlayerInventory::field_7548)
/**
 * field_30640
 */
val KClass<PlayerInventory>.NOT_FOUND by aliasStatic(PlayerInventory::field_30640)
/**
 * field_7545
 */
var PlayerInventory.selectedSlot by alias(PlayerInventory::field_7545)
/**
 * field_7544
 */
val PlayerInventory.offHand by alias(PlayerInventory::field_7544)
/**
 * field_30638
 */
val KClass<PlayerInventory>.MAIN_SIZE by aliasStatic(PlayerInventory::field_30638)
/**
 * field_7546
 */
val PlayerInventory.player by alias(PlayerInventory::field_7546)
/**
 * field_7547
 */
val PlayerInventory.main by alias(PlayerInventory::field_7547)
/**
 * field_30641
 */
val KClass<PlayerInventory>.HOTBAR_SIZE by aliasStatic(PlayerInventory::field_30641)
/**
 * field_30639
 */
val KClass<PlayerInventory>.OFF_HAND_SLOT by aliasStatic(PlayerInventory::field_30639)
/**
 * field_30637
 */
val KClass<PlayerInventory>.ITEM_USAGE_COOLDOWN by aliasStatic(PlayerInventory::field_30637)
/**
 * method_7372
 */
fun PlayerInventory.getArmorStack(arg0: Int) = this.method_7372(arg0)
/**
 * method_7379
 */
fun PlayerInventory.contains(arg0: ItemStack) = this.method_7379(arg0)
/**
 * method_7395
 */
fun PlayerInventory.getSlotWithStack(arg0: ItemStack) = this.method_7395(arg0)
/**
 * method_32338
 */
fun PlayerInventory.offer(arg0: ItemStack, arg1: Boolean) = this.method_32338(arg0, arg1)
/**
 * method_7365
 */
fun PlayerInventory.swapSlotWithHotbar(arg0: Int) = this.method_7365(arg0)
/**
 * method_61495
 */
fun KClass<PlayerInventory>.usableWhenFillingSlot(arg0: ItemStack) = PlayerInventory.method_61495(arg0)
/**
 * method_7381
 */
fun PlayerInventory.updateItems() = this.method_7381()
/**
 * method_7377
 */
fun PlayerInventory.clone(arg0: PlayerInventory) = this.method_7377(arg0)
/**
 * method_7398
 */
fun PlayerInventory.offerOrDrop(arg0: ItemStack) = this.method_7398(arg0)
/**
 * method_7368
 */
fun KClass<PlayerInventory>.getHotbarSize() = PlayerInventory.method_7368()
/**
 * method_7378
 */
fun PlayerInventory.removeOne(arg0: ItemStack) = this.method_7378(arg0)
/**
 * method_37417
 */
fun PlayerInventory.dropSelectedItem(arg0: Boolean) = this.method_37417(arg0)
/**
 * method_7370
 */
fun PlayerInventory.getBlockBreakingSpeed(arg0: BlockState) = this.method_7370(arg0)
/**
 * method_61494
 */
fun PlayerInventory.getMatchingSlot(arg0: RegistryEntry<Item>, arg1: ItemStack) = this.method_61494(arg0, arg1)
/**
 * method_7384
 */
fun PlayerInventory.writeNbt(arg0: NbtList) = this.method_7384(arg0)
/**
 * method_7390
 */
fun PlayerInventory.getOccupiedSlotWithRoomForStack(arg0: ItemStack) = this.method_7390(arg0)
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
fun PlayerInventory.contains(arg0: TagKey<Item>) = this.method_7382(arg0)
/**
 * method_29280
 */
fun PlayerInventory.remove(arg0: Predicate<ItemStack>, arg1: Int, arg2: Inventory) = this.method_29280(arg0, arg1, arg2)
/**
 * method_61497
 */
fun PlayerInventory.createSlotSetPacket(arg0: Int) = this.method_61497(arg0)
/**
 * method_65126
 */
fun PlayerInventory.swapStackWithHotbar(arg0: ItemStack) = this.method_65126(arg0)
/**
 * method_7391
 */
fun PlayerInventory.getMainHandStack() = this.method_7391()
/**
 * method_7394
 */
fun PlayerInventory.insertStack(arg0: ItemStack) = this.method_7394(arg0)
/**
 * method_55753
 */
fun PlayerInventory.contains(arg0: Predicate<ItemStack>) = this.method_55753(arg0)
/**
 * method_7387
 */
fun PlayerInventory.populateRecipeFinder(arg0: RecipeFinder) = this.method_7387(arg0)
/**
 * method_7397
 */
fun PlayerInventory.readNbt(arg0: NbtList) = this.method_7397(arg0)
/**
 * method_7367
 */
fun PlayerInventory.insertStack(arg0: Int, arg1: ItemStack) = this.method_7367(arg0, arg1)
/**
 * method_7380
 */
fun KClass<PlayerInventory>.isValidHotbarIndex(arg0: Int) = PlayerInventory.method_7380(arg0)
