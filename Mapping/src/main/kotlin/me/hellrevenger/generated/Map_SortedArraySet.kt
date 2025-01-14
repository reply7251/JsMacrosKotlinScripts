package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SortedArraySet

fun <T>SortedArraySet<T>.last() = this.method_34962()
fun <T>SortedArraySet<T>.getIfContains(arg0: T) = this.method_34961(arg0)
fun <T>KClass<SortedArraySet<T>>.create(arg0: Int) where T: Comparable<T> = SortedArraySet.method_23859<T>(arg0)
fun <T>KClass<SortedArraySet<T>>.create(arg0: Comparator<T>, arg1: Int) = SortedArraySet.method_34960<T>(arg0, arg1)
fun <T>SortedArraySet<T>.addAndGet(arg0: T) = this.method_23862(arg0)
fun <T>SortedArraySet<T>.first() = this.method_23865()
fun <T>KClass<SortedArraySet<T>>.create(arg0: Comparator<T>) = SortedArraySet.method_34959<T>(arg0)
fun <T>KClass<SortedArraySet<T>>.create() where T: Comparable<T> = SortedArraySet.method_34958<T>()
