package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ShulkerBoxBlock

val ShulkerBoxBlock.CONTENTS_DYNAMIC_DROP_ID by aliasStatic(ShulkerBoxBlock::field_11495)
val ShulkerBoxBlock.FACING by aliasStatic(ShulkerBoxBlock::field_11496)
fun KClass<ShulkerBoxBlock>.get(arg0: DyeColor) = ShulkerBoxBlock.method_10525(arg0)
fun KClass<ShulkerBoxBlock>.canOpen(arg0: BlockState, arg1: world_World, arg2: BlockPos, arg3: ShulkerBoxBlockEntity) = ShulkerBoxBlock.method_33383(arg0, arg1, arg2, arg3)
fun KClass<ShulkerBoxBlock>.getItemStack(arg0: DyeColor) = ShulkerBoxBlock.method_10529(arg0)
