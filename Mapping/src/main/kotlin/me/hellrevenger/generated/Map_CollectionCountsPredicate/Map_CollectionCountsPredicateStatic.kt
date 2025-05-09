package me.hellrevenger.generated.Map_CollectionCountsPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CollectionCountsPredicateKt {
    /**
     * method_59614
     */
    fun <T, P>createCodec(predicateCodec: Codec<P>) where P: Predicate<T> = CollectionCountsPredicate.method_59614<T, P>(predicateCodec)
    /**
     * method_59615
     */
    fun <T, P>create(entries: MutableList<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59615<T, P>(entries)
    /**
     * method_59616
     */
    fun <T, P>create(entries: Array<net.minecraft.class_9643.class_9644<T, P>>) where P: Predicate<T> = CollectionCountsPredicate.method_59616<T, P>(*entries)
}