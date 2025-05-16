package me.hellrevenger.generated.Map_ScreenHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7761
 */
val ScreenHandler.slots by alias(ScreenHandler::field_7761)
/**
 * field_7763
 */
val ScreenHandler.syncId by alias(ScreenHandler::field_7763)
/**
 * method_34254
 */
fun ScreenHandler.setCursorStack(stack: ItemStack?) = this.method_34254(stack)
/**
 * method_34255
 */
fun ScreenHandler.getCursorStack() = this.method_34255()
/**
 * method_34250
 */
fun ScreenHandler.setPreviousCursorStack(stack: ItemStack?) = this.method_34250(stack)
/**
 * method_7611
 */
fun ScreenHandler.getSlot(index: Int) = this.method_7611(index)
/**
 * method_37449
 */
fun ScreenHandler.setPreviousTrackedSlotMutable(slot: Int, stack: ItemStack?) = this.method_37449(slot, stack)
/**
 * method_7597
 */
fun ScreenHandler.canUse(player: PlayerEntity?) = this.method_7597(player)
/**
 * method_34248
 */
fun ScreenHandler.updateSyncHandler(handler: ScreenHandlerSyncHandler?) = this.method_34248(handler)
/**
 * method_7615
 */
fun ScreenHandler.canInsertIntoSlot(slot: Slot?) = this.method_7615(slot)
/**
 * method_7609
 */
fun ScreenHandler.onContentChanged(inventory: Inventory?) = this.method_7609(inventory)
/**
 * method_7610
 */
fun ScreenHandler.updateSlotStacks(revision: Int, stacks: MutableList<ItemStack>?, cursorStack: ItemStack?) = this.method_7610(revision, stacks, cursorStack)
/**
 * method_34245
 */
fun ScreenHandler.setPreviousTrackedSlot(slot: Int, stack: ItemStack?) = this.method_34245(slot, stack)
/**
 * method_7603
 */
fun ScreenHandler.removeListener(listener: ScreenHandlerListener?) = this.method_7603(listener)
/**
 * method_7613
 */
fun ScreenHandler.canInsertIntoSlot(stack: ItemStack?, slot: Slot?) = this.method_7613(stack, slot)
/**
 * method_34247
 */
fun ScreenHandler.copySharedSlots(handler: ScreenHandler?) = this.method_34247(handler)
/**
 * method_7619
 */
fun ScreenHandler.setStackInSlot(slot: Int, revision: Int, stack: ItemStack?) = this.method_7619(slot, revision, stack)
/**
 * method_34257
 */
fun ScreenHandler.enableSyncing() = this.method_34257()
/**
 * method_7595
 */
fun ScreenHandler.onClosed(player: PlayerEntity?) = this.method_7595(player)
/**
 * method_7604
 */
fun ScreenHandler.onButtonClick(player: PlayerEntity?, id: Int) = this.method_7604(player, id)
/**
 * method_7602
 */
fun ScreenHandler.getStacks() = this.method_7602()
/**
 * method_7593
 */
fun ScreenHandler.onSlotClick(slotIndex: Int, button: Int, actionType: SlotActionType?, player: PlayerEntity?) = this.method_7593(slotIndex, button, actionType, player)
/**
 * method_37422
 */
fun ScreenHandler.nextRevision() = this.method_37422()
/**
 * method_17358
 */
fun ScreenHandler.getType() = this.method_17358()
/**
 * method_7606
 */
fun ScreenHandler.setProperty(id: Int, value: Int) = this.method_7606(id, value)
/**
 * method_7596
 */
fun ScreenHandler.addListener(listener: ScreenHandlerListener?) = this.method_7596(listener)
/**
 * method_37420
 */
fun ScreenHandler.updateToClient() = this.method_37420()
/**
 * method_7623
 */
fun ScreenHandler.sendContentUpdates() = this.method_7623()
/**
 * method_40442
 */
fun ScreenHandler.isValid(slot: Int) = this.method_40442(slot)
/**
 * method_7601
 */
fun ScreenHandler.quickMove(player: PlayerEntity?, slot: Int) = this.method_7601(player, slot)
/**
 * method_34256
 */
fun ScreenHandler.disableSyncing() = this.method_34256()
/**
 * method_61621
 */
fun ScreenHandler.selectBundleStack(slot: Int, selectedStack: Int) = this.method_61621(slot, selectedStack)
/**
 * method_37421
 */
fun ScreenHandler.getRevision() = this.method_37421()
/**
 * method_34252
 */
fun ScreenHandler.syncState() = this.method_34252()
/**
 * method_37418
 */
fun ScreenHandler.getSlotIndex(inventory: Inventory?, index: Int) = this.method_37418(inventory, index)
