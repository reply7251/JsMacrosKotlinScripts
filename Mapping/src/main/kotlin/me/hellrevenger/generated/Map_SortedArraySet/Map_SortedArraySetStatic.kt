package me.hellrevenger.generated.Map_SortedArraySet
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SortedArraySetKt {
    /**
     * method_23859
     */
    fun <T>create(initialCapacity: Int) where T: Comparable<T> = SortedArraySet.method_23859<T>(initialCapacity)
    /**
     * method_34960
     */
    fun <T>create(comparator: Comparator<T>?, initialCapacity: Int) = SortedArraySet.method_34960<T>(comparator, initialCapacity)
    /**
     * method_34959
     */
    fun <T>create(comparator: Comparator<T>?) = SortedArraySet.method_34959<T>(comparator)
    /**
     * method_34958
     */
    fun <T>create() where T: Comparable<T> = SortedArraySet.method_34958<T>()
}