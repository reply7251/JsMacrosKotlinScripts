package me.hellrevenger.generated.Map_ItemEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val ItemEntity.uniqueOffset by alias(ItemEntity::field_7203)
fun ItemEntity.setNeverDespawn() = this.method_35190()
fun ItemEntity.setOwner(arg0: UUID) = this.method_48349(arg0)
fun KClass<ItemEntity>.canMerge(arg0: ItemStack, arg1: ItemStack) = ItemEntity.method_24017(arg0, arg1)
fun ItemEntity.setCovetedItem() = this.method_6976()
fun ItemEntity.setPickupDelay(arg0: Int) = this.method_6982(arg0)
fun ItemEntity.getStack() = this.method_6983()
fun ItemEntity.getRotation(arg0: Float) = this.method_27314(arg0)
fun ItemEntity.setToDefaultPickupDelay() = this.method_6988()
fun KClass<ItemEntity>.merge(arg0: ItemStack, arg1: ItemStack, arg2: Int) = ItemEntity.method_24018(arg0, arg1, arg2)
fun ItemEntity.setThrower(arg0: Entity) = this.method_6981(arg0)
fun ItemEntity.getItemAge() = this.method_6985()
fun ItemEntity.copy() = this.method_29271()
fun ItemEntity.setStack(arg0: ItemStack) = this.method_6979(arg0)
fun ItemEntity.setDespawnImmediately() = this.method_6987()
fun ItemEntity.resetPickupDelay() = this.method_6975()
fun ItemEntity.setPickupDelayInfinite() = this.method_6989()
fun ItemEntity.cannotPickup() = this.method_6977()
