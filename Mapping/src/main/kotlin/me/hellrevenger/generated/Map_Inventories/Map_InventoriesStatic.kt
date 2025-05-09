package me.hellrevenger.generated.Map_Inventories
import kotlin.reflect.*
import me.hellrevenger.generated.*
object InventoriesKt {
    /**
     * field_49719
     */
    val ITEMS_NBT_KEY by aliasStatic(Inventories::field_49719)
    /**
     * method_29235
     */
    fun remove(stack: ItemStack, shouldRemove: Predicate<ItemStack>, maxCount: Int, dryRun: Boolean) = Inventories.method_29235(stack, shouldRemove, maxCount, dryRun)
    /**
     * method_5430
     */
    fun splitStack(stacks: MutableList<ItemStack>, slot: Int, amount: Int) = Inventories.method_5430(stacks, slot, amount)
    /**
     * method_5429
     */
    fun readNbt(nbt: NbtCompound, stacks: DefaultedList<ItemStack>, registries: net.minecraft.class_7225.class_7874) = Inventories.method_5429(nbt, stacks, registries)
    /**
     * method_5427
     */
    fun writeNbt(nbt: NbtCompound, stacks: DefaultedList<ItemStack>, setIfEmpty: Boolean, registries: net.minecraft.class_7225.class_7874) = Inventories.method_5427(nbt, stacks, setIfEmpty, registries)
    /**
     * method_5428
     */
    fun removeStack(stacks: MutableList<ItemStack>, slot: Int) = Inventories.method_5428(stacks, slot)
}