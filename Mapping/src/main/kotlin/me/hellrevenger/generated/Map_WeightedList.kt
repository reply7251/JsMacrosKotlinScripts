package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WeightedList

fun <U>KClass<WeightedList<U>>.createCodec(arg0: Codec<U>) = WeightedList.method_35091<U>(arg0)
fun <U>WeightedList<U>.add(arg0: U, arg1: Int) = this.method_35093(arg0, arg1)
fun <U>WeightedList<U>.shuffle() = this.method_35088()
fun <U>WeightedList<U>.stream() = this.method_35094()
