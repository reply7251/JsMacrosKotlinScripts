package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CollectionCountsPredicate

fun <T, P>CollectionCountsPredicate<T, P>.getEntries() where P: Predicate<T> = this.method_59613()
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionCountsPredicate.method_59614<T, P>(arg0)
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.create(arg0: List<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59615<T, P>(arg0)
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.create(arg0: Array<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59616<T, P>(*arg0)
