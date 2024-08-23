package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Inventories

val KClass<Inventories>.ITEMS_NBT_KEY by aliasStatic(Inventories::field_49719)
fun KClass<Inventories>.remove(arg0: ItemStack, arg1: Predicate<ItemStack>, arg2: Int, arg3: Boolean) = Inventories.method_29235(arg0, arg1, arg2, arg3)
fun KClass<Inventories>.remove(arg0: Inventory, arg1: Predicate<ItemStack>, arg2: Int, arg3: Boolean) = Inventories.method_29234(arg0, arg1, arg2, arg3)
fun KClass<Inventories>.splitStack(arg0: MutableList<ItemStack>, arg1: Int, arg2: Int) = Inventories.method_5430(arg0, arg1, arg2)
fun KClass<Inventories>.readNbt(arg0: NbtCompound, arg1: DefaultedList<ItemStack>, arg2: net.minecraft.class_7225.class_7874) = Inventories.method_5429(arg0, arg1, arg2)
fun KClass<Inventories>.writeNbt(arg0: NbtCompound, arg1: DefaultedList<ItemStack>, arg2: Boolean, arg3: net.minecraft.class_7225.class_7874) = Inventories.method_5427(arg0, arg1, arg2, arg3)
fun KClass<Inventories>.writeNbt(arg0: NbtCompound, arg1: DefaultedList<ItemStack>, arg2: net.minecraft.class_7225.class_7874) = Inventories.method_5426(arg0, arg1, arg2)
fun KClass<Inventories>.removeStack(arg0: MutableList<ItemStack>, arg1: Int) = Inventories.method_5428(arg0, arg1)
