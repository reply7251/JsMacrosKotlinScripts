package me.hellrevenger.generated.Map_Range
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RangeKt {
    /**
     * method_37953
     */
    fun <T>createCodec(elementCodec: Codec<T>?) where T: Comparable<T> = Range.method_37953<T>(elementCodec)
    /**
     * method_37954
     */
    fun <T>createRangedCodec(codec: Codec<T>?, minInclusive: T, maxInclusive: T) where T: Comparable<T> = Range.method_37954<T>(codec, minInclusive, maxInclusive)
    /**
     * method_37956
     */
    fun <T>validate(minInclusive: T, maxInclusive: T) where T: Comparable<T> = Range.method_37956<T>(minInclusive, maxInclusive)
}