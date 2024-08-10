package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemUsage

fun KClass<ItemUsage>.exchangeStack(arg0: ItemStack, arg1: PlayerEntity, arg2: ItemStack, arg3: Boolean) = ItemUsage.method_30270(arg0, arg1, arg2, arg3)
fun KClass<ItemUsage>.exchangeStack(arg0: ItemStack, arg1: PlayerEntity, arg2: ItemStack) = ItemUsage.method_30012(arg0, arg1, arg2)
fun KClass<ItemUsage>.consumeHeldItem(arg0: world_World, arg1: PlayerEntity, arg2: Hand) = ItemUsage.method_29282(arg0, arg1, arg2)
fun KClass<ItemUsage>.spawnItemContents(arg0: ItemEntity, arg1: Iterable<ItemStack>) = ItemUsage.method_33263(arg0, arg1)
