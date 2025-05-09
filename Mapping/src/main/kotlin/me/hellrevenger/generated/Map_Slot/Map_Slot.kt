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
fun Slot.takeStackRange(min: Int, max: Int, player: PlayerEntity) = this.method_32753(min, max, player)
/**
 * method_7675
 */
fun Slot.getMaxItemCount() = this.method_7675()
/**
 * method_34264
 */
fun Slot.tryTakeStackRange(min: Int, max: Int, player: PlayerEntity) = this.method_34264(min, max, player)
/**
 * method_7670
 */
fun Slot.onQuickTransfer(newItem: ItemStack, original: ItemStack) = this.method_7670(newItem, original)
/**
 * method_51306
 */
fun Slot.canBeHighlighted() = this.method_51306()
/**
 * method_7673
 */
fun Slot.setStackNoCallbacks(stack: ItemStack) = this.method_7673(stack)
/**
 * method_7682
 */
fun Slot.isEnabled() = this.method_7682()
/**
 * method_48931
 */
fun Slot.setStack(stack: ItemStack, previousStack: ItemStack) = this.method_48931(stack, previousStack)
/**
 * method_7680
 */
fun Slot.canInsert(stack: ItemStack) = this.method_7680(stack)
/**
 * method_32756
 */
fun Slot.insertStack(stack: ItemStack) = this.method_32756(stack)
/**
 * method_32755
 */
fun Slot.insertStack(stack: ItemStack, count: Int) = this.method_32755(stack, count)
/**
 * method_32754
 */
fun Slot.canTakePartial(player: PlayerEntity) = this.method_32754(player)
/**
 * method_53512
 */
fun Slot.setStack(stack: ItemStack) = this.method_53512(stack)
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
fun Slot.onTakeItem(player: PlayerEntity, stack: ItemStack) = this.method_7667(player, stack)
/**
 * method_7677
 */
fun Slot.getStack() = this.method_7677()
/**
 * method_7671
 */
fun Slot.takeStack(amount: Int) = this.method_7671(amount)
/**
 * method_7681
 */
fun Slot.hasStack() = this.method_7681()
/**
 * method_7679
 */
fun Slot.getBackgroundSprite() = this.method_7679()
/**
 * method_7676
 */
fun Slot.getMaxItemCount(stack: ItemStack) = this.method_7676(stack)
/**
 * method_7674
 */
fun Slot.canTakeItems(playerEntity: PlayerEntity) = this.method_7674(playerEntity)
