package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.property_Property

fun <T>property_Property<T>.computeHashCode() where T: Comparable<T> = this.method_11799()
fun <T>property_Property<T>.getValues() where T: Comparable<T> = this.method_11898()
fun <T>property_Property<T>.createValue(arg0: State<*, *>) where T: Comparable<T> = this.method_30041(arg0)
fun <T>property_Property<T>.createValue(arg0: T) where T: Comparable<T> = this.method_30042(arg0)
fun <T, U, S>property_Property<T>.parse(arg0: DynamicOps<U>, arg1: S, arg2: U) where T: Comparable<T>, S: State<*, S> = this.method_35307<U, S>(arg0, arg1, arg2)
fun <T>property_Property<T>.stream() where T: Comparable<T> = this.method_30043()
fun <T>property_Property<T>.parse(arg0: String) where T: Comparable<T> = this.method_11900(arg0)
fun <T>property_Property<T>.name(arg0: T) where T: Comparable<T> = this.method_11901(arg0)
