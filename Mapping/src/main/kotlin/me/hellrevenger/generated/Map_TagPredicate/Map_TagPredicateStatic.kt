package me.hellrevenger.generated.Map_TagPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TagPredicateKt {
    /**
     * method_53245
     */
    fun <T>createCodec(registryRef: RegistryKey<out Registry<T>>) = TagPredicate.method_53245<T>(registryRef)
    /**
     * method_48968
     */
    fun <T>unexpected(tag: TagKey<T>) = TagPredicate.method_48968<T>(tag)
    /**
     * method_48965
     */
    fun <T>expected(tag: TagKey<T>) = TagPredicate.method_48965<T>(tag)
}