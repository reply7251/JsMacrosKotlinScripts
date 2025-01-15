package me.hellrevenger.generated.Map_ArmorItem
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ArmorItem>.DISPENSER_BEHAVIOR by aliasStatic(ArmorItem::field_7879)
fun ArmorItem.getMaterial() = this.method_7686()
fun ArmorItem.getProtection() = this.method_7687()
fun ArmorItem.getToughness() = this.method_26353()
fun KClass<ArmorItem>.dispenseArmor(arg0: BlockPointer, arg1: ItemStack) = ArmorItem.method_7684(arg0, arg1)
fun ArmorItem.getType() = this.method_48398()
