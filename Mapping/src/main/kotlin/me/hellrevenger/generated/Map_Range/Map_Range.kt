package me.hellrevenger.generated.Map_Range
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>KClass<Range<T>>.createCodec(arg0: Codec<T>) where T: Comparable<T> = Range.method_37953<T>(arg0)
fun <T>Range<T>.contains(arg0: T) where T: Comparable<T> = this.method_37955(arg0)
fun <T>Range<T>.contains(arg0: Range<T>) where T: Comparable<T> = this.method_37952(arg0)
fun <T>KClass<Range<T>>.createRangedCodec(arg0: Codec<T>, arg1: T, arg2: T) where T: Comparable<T> = Range.method_37954<T>(arg0, arg1, arg2)
fun <T>KClass<Range<T>>.validate(arg0: T, arg1: T) where T: Comparable<T> = Range.method_37956<T>(arg0, arg1)
fun <T>Range<T>.minInclusive() where T: Comparable<T> = this.comp_1()
fun <T>Range<T>.maxInclusive() where T: Comparable<T> = this.comp_2()
