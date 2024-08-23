package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.HopperBlockEntity

val KClass<HopperBlockEntity>.TRANSFER_COOLDOWN by aliasStatic(HopperBlockEntity::field_31341)
val KClass<HopperBlockEntity>.INVENTORY_SIZE by aliasStatic(HopperBlockEntity::field_31342)
fun KClass<HopperBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: HopperBlockEntity) = HopperBlockEntity.method_31692(arg0, arg1, arg2, arg3)
fun KClass<HopperBlockEntity>.extract(arg0: Inventory, arg1: ItemEntity) = HopperBlockEntity.method_11247(arg0, arg1)
fun KClass<HopperBlockEntity>.transfer(arg0: Inventory, arg1: Inventory, arg2: ItemStack, arg3: Direction) = HopperBlockEntity.method_11260(arg0, arg1, arg2, arg3)
fun KClass<HopperBlockEntity>.onEntityCollided(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: Entity, arg4: HopperBlockEntity) = HopperBlockEntity.method_11236(arg0, arg1, arg2, arg3, arg4)
fun KClass<HopperBlockEntity>.getInputItemEntities(arg0: world_World, arg1: Hopper) = HopperBlockEntity.method_11237(arg0, arg1)
fun KClass<HopperBlockEntity>.getInventoryAt(arg0: world_World, arg1: BlockPos) = HopperBlockEntity.method_11250(arg0, arg1)
fun KClass<HopperBlockEntity>.extract(arg0: world_World, arg1: Hopper) = HopperBlockEntity.method_11241(arg0, arg1)
