package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CollectionPredicate

fun <T, P>CollectionPredicate<T, P>.test(arg0: Iterable<T>) where P: Predicate<T> = this.method_59625(arg0)
fun <T, P>KClass<CollectionPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionPredicate.method_59623<T, P>(arg0)
fun <T, P>CollectionPredicate<T, P>.contains() where P: Predicate<T> = this.comp_2617()
fun <T, P>CollectionPredicate<T, P>.size() where P: Predicate<T> = this.comp_2619()
fun <T, P>CollectionPredicate<T, P>.counts() where P: Predicate<T> = this.comp_2618()
