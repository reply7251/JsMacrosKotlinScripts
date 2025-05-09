package me.hellrevenger.generated.Map_ScreenHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ScreenHandlerKt {
    /**
     * field_30730
     */
    val EMPTY_SPACE_SLOT_INDEX by aliasStatic(ScreenHandler::field_30730)
    /**
     * method_7608
     */
    fun calculateComparatorOutput(entity: BlockEntity) = ScreenHandler.method_7608(entity)
    /**
     * method_7620
     */
    fun unpackQuickCraftButton(quickCraftData: Int) = ScreenHandler.method_7620(quickCraftData)
    /**
     * method_7591
     */
    fun packQuickCraftData(quickCraftStage: Int, buttonId: Int) = ScreenHandler.method_7591(quickCraftStage, buttonId)
    /**
     * method_7592
     */
    fun canInsertItemIntoSlot(slot: Slot, stack: ItemStack, allowOverflow: Boolean) = ScreenHandler.method_7592(slot, stack, allowOverflow)
    /**
     * method_7600
     */
    fun shouldQuickCraftContinue(stage: Int, player: PlayerEntity) = ScreenHandler.method_7600(stage, player)
    /**
     * method_7617
     */
    fun calculateStackSize(slots: Set<Slot>, mode: Int, stack: ItemStack) = ScreenHandler.method_7617(slots, mode, stack)
    /**
     * method_7594
     */
    fun unpackQuickCraftStage(quickCraftData: Int) = ScreenHandler.method_7594(quickCraftData)
}