package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Equipment

fun Equipment.equipAndSwap(arg0: Item, arg1: world_World, arg2: PlayerEntity, arg3: Hand) = this.method_48576(arg0, arg1, arg2, arg3)
fun Equipment.getEquipSound() = this.method_31570()
fun KClass<Equipment>.fromStack(arg0: ItemStack) = Equipment.method_48957(arg0)
fun Equipment.getSlotType() = this.method_7685()
