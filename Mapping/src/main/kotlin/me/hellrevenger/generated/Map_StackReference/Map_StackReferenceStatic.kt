package me.hellrevenger.generated.Map_StackReference
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StackReferenceKt {
    /**
     * method_59666
     */
    fun of(getter: Supplier<ItemStack>, setter: Consumer<ItemStack>) = StackReference.method_59666(getter, setter)
    /**
     * method_32331
     */
    fun of(entity: LivingEntity, slot: EquipmentSlot, filter: Predicate<ItemStack>) = StackReference.method_32331(entity, slot, filter)
    /**
     * method_32330
     */
    fun of(entity: LivingEntity, slot: EquipmentSlot) = StackReference.method_32330(entity, slot)
    /**
     * method_32328
     */
    fun of(inventory: Inventory, index: Int) = StackReference.method_32328(inventory, index)
    /**
     * method_32329
     */
    fun of(inventory: Inventory, index: Int, stackFilter: Predicate<ItemStack>) = StackReference.method_32329(inventory, index, stackFilter)
}