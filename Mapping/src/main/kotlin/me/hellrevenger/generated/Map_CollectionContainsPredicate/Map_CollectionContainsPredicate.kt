package me.hellrevenger.generated.Map_CollectionContainsPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_59608
 */
fun <T, P>KClass<CollectionContainsPredicate<T, P>>.create(arg0: Array<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59608<T, P>(*arg0)
/**
 * method_59605
 */
fun <T, P>CollectionContainsPredicate<T, P>.getPredicates() where P: Predicate<T> = this.method_59605()
/**
 * method_59606
 */
fun <T, P>KClass<CollectionContainsPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59606<T, P>(arg0)
/**
 * method_59607
 */
fun <T, P>KClass<CollectionContainsPredicate<T, P>>.create(arg0: MutableList<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59607<T, P>(arg0)
