package me.hellrevenger.generated.Map_ScreenHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7761
 */
val ScreenHandler.slots by alias(ScreenHandler::field_7761)
/**
 * field_30730
 */
val KClass<ScreenHandler>.EMPTY_SPACE_SLOT_INDEX by aliasStatic(ScreenHandler::field_30730)
/**
 * field_7763
 */
val ScreenHandler.syncId by alias(ScreenHandler::field_7763)
/**
 * method_34254
 */
fun ScreenHandler.setCursorStack(arg0: ItemStack) = this.method_34254(arg0)
/**
 * method_34255
 */
fun ScreenHandler.getCursorStack() = this.method_34255()
/**
 * method_34250
 */
fun ScreenHandler.setPreviousCursorStack(arg0: ItemStack) = this.method_34250(arg0)
/**
 * method_7611
 */
fun ScreenHandler.getSlot(arg0: Int) = this.method_7611(arg0)
/**
 * method_7608
 */
fun KClass<ScreenHandler>.calculateComparatorOutput(arg0: BlockEntity) = ScreenHandler.method_7608(arg0)
/**
 * method_37449
 */
fun ScreenHandler.setPreviousTrackedSlotMutable(arg0: Int, arg1: ItemStack) = this.method_37449(arg0, arg1)
/**
 * method_7618
 */
fun KClass<ScreenHandler>.calculateComparatorOutput(arg0: Inventory) = ScreenHandler.method_7618(arg0)
/**
 * method_7620
 */
fun KClass<ScreenHandler>.unpackQuickCraftButton(arg0: Int) = ScreenHandler.method_7620(arg0)
/**
 * method_7597
 */
fun ScreenHandler.canUse(arg0: PlayerEntity) = this.method_7597(arg0)
/**
 * method_34248
 */
fun ScreenHandler.updateSyncHandler(arg0: ScreenHandlerSyncHandler) = this.method_34248(arg0)
/**
 * method_7615
 */
fun ScreenHandler.canInsertIntoSlot(arg0: Slot) = this.method_7615(arg0)
/**
 * method_7591
 */
fun KClass<ScreenHandler>.packQuickCraftData(arg0: Int, arg1: Int) = ScreenHandler.method_7591(arg0, arg1)
/**
 * method_7592
 */
fun KClass<ScreenHandler>.canInsertItemIntoSlot(arg0: Slot, arg1: ItemStack, arg2: Boolean) = ScreenHandler.method_7592(arg0, arg1, arg2)
/**
 * method_7609
 */
fun ScreenHandler.onContentChanged(arg0: Inventory) = this.method_7609(arg0)
/**
 * method_7600
 */
fun KClass<ScreenHandler>.shouldQuickCraftContinue(arg0: Int, arg1: PlayerEntity) = ScreenHandler.method_7600(arg0, arg1)
/**
 * method_7610
 */
fun ScreenHandler.updateSlotStacks(arg0: Int, arg1: MutableList<ItemStack>, arg2: ItemStack) = this.method_7610(arg0, arg1, arg2)
/**
 * method_34245
 */
fun ScreenHandler.setPreviousTrackedSlot(arg0: Int, arg1: ItemStack) = this.method_34245(arg0, arg1)
/**
 * method_7603
 */
fun ScreenHandler.removeListener(arg0: ScreenHandlerListener) = this.method_7603(arg0)
/**
 * method_7613
 */
fun ScreenHandler.canInsertIntoSlot(arg0: ItemStack, arg1: Slot) = this.method_7613(arg0, arg1)
/**
 * method_34247
 */
fun ScreenHandler.copySharedSlots(arg0: ScreenHandler) = this.method_34247(arg0)
/**
 * method_7619
 */
fun ScreenHandler.setStackInSlot(arg0: Int, arg1: Int, arg2: ItemStack) = this.method_7619(arg0, arg1, arg2)
/**
 * method_34257
 */
fun ScreenHandler.enableSyncing() = this.method_34257()
/**
 * method_7595
 */
fun ScreenHandler.onClosed(arg0: PlayerEntity) = this.method_7595(arg0)
/**
 * method_7604
 */
fun ScreenHandler.onButtonClick(arg0: PlayerEntity, arg1: Int) = this.method_7604(arg0, arg1)
/**
 * method_7602
 */
fun ScreenHandler.getStacks() = this.method_7602()
/**
 * method_7593
 */
fun ScreenHandler.onSlotClick(arg0: Int, arg1: Int, arg2: SlotActionType, arg3: PlayerEntity) = this.method_7593(arg0, arg1, arg2, arg3)
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
fun ScreenHandler.setProperty(arg0: Int, arg1: Int) = this.method_7606(arg0, arg1)
/**
 * method_7596
 */
fun ScreenHandler.addListener(arg0: ScreenHandlerListener) = this.method_7596(arg0)
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
fun ScreenHandler.isValid(arg0: Int) = this.method_40442(arg0)
/**
 * method_7601
 */
fun ScreenHandler.quickMove(arg0: PlayerEntity, arg1: Int) = this.method_7601(arg0, arg1)
/**
 * method_7617
 */
fun KClass<ScreenHandler>.calculateStackSize(arg0: Set<Slot>, arg1: Int, arg2: ItemStack) = ScreenHandler.method_7617(arg0, arg1, arg2)
/**
 * method_34256
 */
fun ScreenHandler.disableSyncing() = this.method_34256()
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
fun ScreenHandler.getSlotIndex(arg0: Inventory, arg1: Int) = this.method_37418(arg0, arg1)
/**
 * method_7594
 */
fun KClass<ScreenHandler>.unpackQuickCraftStage(arg0: Int) = ScreenHandler.method_7594(arg0)
