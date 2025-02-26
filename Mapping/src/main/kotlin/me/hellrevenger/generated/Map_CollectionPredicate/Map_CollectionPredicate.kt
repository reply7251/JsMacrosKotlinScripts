package me.hellrevenger.generated.Map_CollectionPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_59625
 */
fun <T, P>CollectionPredicate<T, P>.test(arg0: Iterable<T>) where P: Predicate<T> = this.method_59625(arg0)
/**
 * method_59623
 */
fun <T, P>KClass<CollectionPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionPredicate.method_59623<T, P>(arg0)
/**
 * comp_2617
 */
fun <T, P>CollectionPredicate<T, P>.contains() where P: Predicate<T> = this.comp_2617()
/**
 * comp_2619
 */
fun <T, P>CollectionPredicate<T, P>.size() where P: Predicate<T> = this.comp_2619()
/**
 * comp_2618
 */
fun <T, P>CollectionPredicate<T, P>.counts() where P: Predicate<T> = this.comp_2618()
