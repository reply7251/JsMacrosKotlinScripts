package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CollectionContainsPredicate

fun <T, P>KClass<CollectionContainsPredicate<T, P>>.create(arg0: Array<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59608<T, P>(*arg0)
fun <T, P>CollectionContainsPredicate<T, P>.getPredicates() where P: Predicate<T> = this.method_59605()
fun <T, P>KClass<CollectionContainsPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59606<T, P>(arg0)
fun <T, P>KClass<CollectionContainsPredicate<T, P>>.create(arg0: MutableList<P>) where P: Predicate<T> = CollectionContainsPredicate.method_59607<T, P>(arg0)
