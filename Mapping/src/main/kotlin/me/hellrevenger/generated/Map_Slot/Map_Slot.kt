package me.hellrevenger.generated.Map_Slot
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7874
 */
var Slot.id by alias(Slot::field_7874)
/**
 * field_7872
 */
val Slot.y by alias(Slot::field_7872)
/**
 * field_7871
 */
val Slot.inventory by alias(Slot::field_7871)
/**
 * field_7873
 */
val Slot.x by alias(Slot::field_7873)
/**
 * method_32753
 */
fun Slot.takeStackRange(arg0: Int, arg1: Int, arg2: PlayerEntity) = this.method_32753(arg0, arg1, arg2)
/**
 * method_7675
 */
fun Slot.getMaxItemCount() = this.method_7675()
/**
 * method_34264
 */
fun Slot.tryTakeStackRange(arg0: Int, arg1: Int, arg2: PlayerEntity) = this.method_34264(arg0, arg1, arg2)
/**
 * method_7670
 */
fun Slot.onQuickTransfer(arg0: ItemStack, arg1: ItemStack) = this.method_7670(arg0, arg1)
/**
 * method_51306
 */
fun Slot.canBeHighlighted() = this.method_51306()
/**
 * method_7673
 */
fun Slot.setStackNoCallbacks(arg0: ItemStack) = this.method_7673(arg0)
/**
 * method_7682
 */
fun Slot.isEnabled() = this.method_7682()
/**
 * method_48931
 */
fun Slot.setStack(arg0: ItemStack, arg1: ItemStack) = this.method_48931(arg0, arg1)
/**
 * method_7679
 */
fun Slot.getBackgroundSprite() = this.method_7679()
/**
 * method_7680
 */
fun Slot.canInsert(arg0: ItemStack) = this.method_7680(arg0)
/**
 * method_32756
 */
fun Slot.insertStack(arg0: ItemStack) = this.method_32756(arg0)
/**
 * method_32755
 */
fun Slot.insertStack(arg0: ItemStack, arg1: Int) = this.method_32755(arg0, arg1)
/**
 * method_32754
 */
fun Slot.canTakePartial(arg0: PlayerEntity) = this.method_32754(arg0)
/**
 * method_53512
 */
fun Slot.setStack(arg0: ItemStack) = this.method_53512(arg0)
/**
 * method_55059
 */
fun Slot.disablesDynamicDisplay() = this.method_55059()
/**
 * method_7668
 */
fun Slot.markDirty() = this.method_7668()
/**
 * method_34266
 */
fun Slot.getIndex() = this.method_34266()
/**
 * method_7667
 */
fun Slot.onTakeItem(arg0: PlayerEntity, arg1: ItemStack) = this.method_7667(arg0, arg1)
/**
 * method_7677
 */
fun Slot.getStack() = this.method_7677()
/**
 * method_7671
 */
fun Slot.takeStack(arg0: Int) = this.method_7671(arg0)
/**
 * method_7681
 */
fun Slot.hasStack() = this.method_7681()
/**
 * method_7676
 */
fun Slot.getMaxItemCount(arg0: ItemStack) = this.method_7676(arg0)
/**
 * method_7674
 */
fun Slot.canTakeItems(arg0: PlayerEntity) = this.method_7674(arg0)
