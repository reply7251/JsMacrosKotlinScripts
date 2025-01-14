package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BoundedRegionArray

fun <T>BoundedRegionArray<T>.isWithinBounds(arg0: Int, arg1: Int) = this.method_60485(arg0, arg1)
fun <T>BoundedRegionArray<T>.get(arg0: Int, arg1: Int) = this.method_60482(arg0, arg1)
fun <T>BoundedRegionArray<T>.forEach(arg0: Consumer<T>) = this.method_60484(arg0)
fun <T>KClass<BoundedRegionArray<T>>.create(arg0: Int, arg1: Int, arg2: Int, arg3: net.minecraft.class_9762.class_9763<T>) = BoundedRegionArray.method_60483<T>(arg0, arg1, arg2, arg3)
