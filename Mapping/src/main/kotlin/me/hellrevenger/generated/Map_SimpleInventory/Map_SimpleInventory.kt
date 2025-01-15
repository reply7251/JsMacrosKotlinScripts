package me.hellrevenger.generated.Map_SimpleInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*

val SimpleInventory.heldStacks by alias(SimpleInventory::field_5828)
fun SimpleInventory.toNbtList(arg0: net.minecraft.class_7225.class_7874) = this.method_7660(arg0)
fun SimpleInventory.removeItem(arg0: Item, arg1: Int) = this.method_20631(arg0, arg1)
fun SimpleInventory.canInsert(arg0: ItemStack) = this.method_27070(arg0)
fun SimpleInventory.addStack(arg0: ItemStack) = this.method_5491(arg0)
fun SimpleInventory.readNbtList(arg0: NbtList, arg1: net.minecraft.class_7225.class_7874) = this.method_7659(arg0, arg1)
fun SimpleInventory.removeListener(arg0: InventoryChangedListener) = this.method_5488(arg0)
fun SimpleInventory.addListener(arg0: InventoryChangedListener) = this.method_5489(arg0)
fun SimpleInventory.clearToList() = this.method_24514()
