package me.hellrevenger.generated.Map_PlayerInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PlayerInventoryKt {
    /**
     * field_30640
     */
    val NOT_FOUND by aliasStatic(PlayerInventory::field_30640)
    /**
     * field_30638
     */
    val MAIN_SIZE by aliasStatic(PlayerInventory::field_30638)
    /**
     * field_30641
     */
    val HOTBAR_SIZE by aliasStatic(PlayerInventory::field_30641)
    /**
     * field_30639
     */
    val OFF_HAND_SLOT by aliasStatic(PlayerInventory::field_30639)
    /**
     * field_30637
     */
    val ITEM_USAGE_COOLDOWN by aliasStatic(PlayerInventory::field_30637)
    /**
     * method_61495
     */
    fun usableWhenFillingSlot(stack: ItemStack) = PlayerInventory.method_61495(stack)
    /**
     * method_7368
     */
    fun getHotbarSize() = PlayerInventory.method_7368()
    /**
     * method_7380
     */
    fun isValidHotbarIndex(slot: Int) = PlayerInventory.method_7380(slot)
}