package me.hellrevenger.generated.Map_CollectionCountsPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_59613
 */
fun <T, P>CollectionCountsPredicate<T, P>.getEntries() where P: Predicate<T> = this.method_59613()
/**
 * method_59614
 */
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.createCodec(arg0: Codec<P>) where P: Predicate<T> = CollectionCountsPredicate.method_59614<T, P>(arg0)
/**
 * method_59615
 */
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.create(arg0: MutableList<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59615<T, P>(arg0)
/**
 * method_59616
 */
fun <T, P>KClass<CollectionCountsPredicate<T, P>>.create(arg0: Array<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59616<T, P>(*arg0)
