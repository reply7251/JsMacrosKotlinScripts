package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.IdentifierSearcher

fun <T>KClass<IdentifierSearcher<T>>.of() = IdentifierSearcher.method_43799<T>()
fun <T>KClass<IdentifierSearcher<T>>.of(arg0: MutableList<T>, arg1: Function<T, Stream<Identifier>>) = IdentifierSearcher.method_43802<T>(arg0, arg1)
fun <T>IdentifierSearcher<T>.searchPath(arg0: String) = this.method_43803(arg0)
fun <T>IdentifierSearcher<T>.searchNamespace(arg0: String) = this.method_43801(arg0)
