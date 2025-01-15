package me.hellrevenger.generated.Map_TagPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>KClass<TagPredicate<T>>.createCodec(arg0: RegistryKey<out Registry<T>>) = TagPredicate.method_53245<T>(arg0)
fun <T>KClass<TagPredicate<T>>.unexpected(arg0: TagKey<T>) = TagPredicate.method_48968<T>(arg0)
fun <T>TagPredicate<T>.test(arg0: RegistryEntry<T>) = this.method_48967(arg0)
fun <T>KClass<TagPredicate<T>>.expected(arg0: TagKey<T>) = TagPredicate.method_48965<T>(arg0)
fun <T>TagPredicate<T>.expected() = this.comp_1837()
fun <T>TagPredicate<T>.tag() = this.comp_1836()
