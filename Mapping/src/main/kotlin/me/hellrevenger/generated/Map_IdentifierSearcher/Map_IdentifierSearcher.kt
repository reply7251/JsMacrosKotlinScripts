package me.hellrevenger.generated.Map_IdentifierSearcher
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>KClass<IdentifierSearcher<T>>.of() = IdentifierSearcher.method_43799<T>()
fun <T>KClass<IdentifierSearcher<T>>.of(arg0: MutableList<T>, arg1: java.util.function.Function<T, Stream<Identifier>>) = IdentifierSearcher.method_43802<T>(arg0, arg1)
fun <T>IdentifierSearcher<T>.searchPath(arg0: String) = this.method_43803(arg0)
fun <T>IdentifierSearcher<T>.searchNamespace(arg0: String) = this.method_43801(arg0)
