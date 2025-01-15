package me.hellrevenger.generated.Map_Inventory
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<Inventory>.canPlayerUse(arg0: BlockEntity, arg1: PlayerEntity, arg2: Float) = Inventory.method_49106(arg0, arg1, arg2)
fun Inventory.onClose(arg0: PlayerEntity) = this.method_5432(arg0)
fun Inventory.onOpen(arg0: PlayerEntity) = this.method_5435(arg0)
fun Inventory.markDirty() = this.method_5431()
fun Inventory.getStack(arg0: Int) = this.method_5438(arg0)
fun Inventory.isEmpty() = this.method_5442()
fun Inventory.count(arg0: Item) = this.method_18861(arg0)
fun Inventory.containsAny(arg0: Set<Item>) = this.method_18862(arg0)
fun Inventory.canPlayerUse(arg0: PlayerEntity) = this.method_5443(arg0)
fun Inventory.containsAny(arg0: Predicate<ItemStack>) = this.method_43256(arg0)
fun Inventory.size() = this.method_5439()
fun Inventory.getMaxCount(arg0: ItemStack) = this.method_58350(arg0)
fun Inventory.canTransferTo(arg0: Inventory, arg1: Int, arg2: ItemStack) = this.method_49104(arg0, arg1, arg2)
fun Inventory.removeStack(arg0: Int, arg1: Int) = this.method_5434(arg0, arg1)
fun Inventory.getMaxCountPerStack() = this.method_5444()
fun Inventory.isValid(arg0: Int, arg1: ItemStack) = this.method_5437(arg0, arg1)
fun KClass<Inventory>.canPlayerUse(arg0: BlockEntity, arg1: PlayerEntity) = Inventory.method_49105(arg0, arg1)
fun Inventory.removeStack(arg0: Int) = this.method_5441(arg0)
fun Inventory.setStack(arg0: Int, arg1: ItemStack) = this.method_5447(arg0, arg1)
