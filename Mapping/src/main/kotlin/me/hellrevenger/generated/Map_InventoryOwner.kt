package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.InventoryOwner

fun InventoryOwner.readInventory(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_46400(arg0, arg1)
fun InventoryOwner.getInventory() = this.method_35199()
fun InventoryOwner.writeInventory(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_46399(arg0, arg1)
fun KClass<InventoryOwner>.pickUpItem(arg0: MobEntity, arg1: InventoryOwner, arg2: ItemEntity) = InventoryOwner.method_43544(arg0, arg1, arg2)
