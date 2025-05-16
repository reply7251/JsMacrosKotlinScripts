package me.hellrevenger.generated.Map_CollectionContainsPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CollectionContainsPredicateKt {
    /**
     * method_59608
     */
    fun <T, P>create(predicates: Array<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59608<T, P>(*predicates)
    /**
     * method_59606
     */
    fun <T, P>createCodec(predicateCodec: Codec<P>?) where P: Predicate<T> = CollectionContainsPredicate.method_59606<T, P>(predicateCodec)
    /**
     * method_59607
     */
    fun <T, P>create(predicates: MutableList<P>?) where P: Predicate<T> = CollectionContainsPredicate.method_59607<T, P>(predicates)
}