package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockStateVariant

fun <T>BlockStateVariant.put(arg0: VariantSetting<T>, arg1: T) = this.method_25828<T>(arg0, arg1)
fun KClass<BlockStateVariant>.union(arg0: BlockStateVariant, arg1: BlockStateVariant) = BlockStateVariant.method_25827(arg0, arg1)
fun KClass<BlockStateVariant>.create() = BlockStateVariant.method_25824()
fun BlockStateVariant.get() = this.method_25830()
fun KClass<BlockStateVariant>.toJson(arg0: List<BlockStateVariant>) = BlockStateVariant.method_25829(arg0)
