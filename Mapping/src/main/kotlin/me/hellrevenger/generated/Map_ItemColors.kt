package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemColors

fun ItemColors.register(arg0: ItemColorProvider, arg1: Array<ItemConvertible>) = this.method_1708(arg0, *arg1)
fun KClass<ItemColors>.create(arg0: BlockColors) = ItemColors.method_1706(arg0)
fun ItemColors.getColor(arg0: ItemStack, arg1: Int) = this.method_1704(arg0, arg1)
