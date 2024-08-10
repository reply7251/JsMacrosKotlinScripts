package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TickScheduler

fun <T>TickScheduler<T>.getTickCount() = this.method_20825()
fun <T>TickScheduler<T>.isQueued(arg0: BlockPos, arg1: T) = this.method_8674(arg0, arg1)
fun <T>TickScheduler<T>.scheduleTick(arg0: OrderedTick<T>) = this.method_39363(arg0)
