package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComposterBlock

val ComposterBlock.MAX_LEVEL by aliasStatic(ComposterBlock::field_31073)
val ComposterBlock.MIN_LEVEL by aliasStatic(ComposterBlock::field_31072)
val ComposterBlock.NUM_LEVELS by aliasStatic(ComposterBlock::field_31071)
val ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE by aliasStatic(ComposterBlock::field_17566)
val ComposterBlock.LEVEL by aliasStatic(ComposterBlock::field_17565)
fun KClass<ComposterBlock>.playEffects(arg0: world_World, arg1: BlockPos, arg2: Boolean) = ComposterBlock.method_18027(arg0, arg1, arg2)
fun KClass<ComposterBlock>.compost(arg0: Entity, arg1: BlockState, arg2: ServerWorld, arg3: ItemStack, arg4: BlockPos) = ComposterBlock.method_26373(arg0, arg1, arg2, arg3, arg4)
fun KClass<ComposterBlock>.emptyFullComposter(arg0: Entity, arg1: BlockState, arg2: world_World, arg3: BlockPos) = ComposterBlock.method_26374(arg0, arg1, arg2, arg3)
fun KClass<ComposterBlock>.registerDefaultCompostableItems() = ComposterBlock.method_17758()
