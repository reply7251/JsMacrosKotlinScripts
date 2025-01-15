package me.hellrevenger.generated.Map_Term
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <S>KClass<Term<S>>.symbol(arg0: Symbol<*>) = Term.method_58332<S>(arg0)
fun <S, T>KClass<Term<S>>.always(arg0: Symbol<T>, arg1: T) = Term.method_58333<S, T>(arg0, arg1)
fun <S>Term<S>.matches(arg0: ParsingState<S>, arg1: ParseResults, arg2: Cut) = this.method_58334(arg0, arg1, arg2)
fun <S>KClass<Term<S>>.optional(arg0: Term<S>) = Term.method_58335<S>(arg0)
fun <S>KClass<Term<S>>.sequence(arg0: Array<Term<S>>) = Term.method_58336<S>(*arg0)
fun <S>KClass<Term<S>>.cutting() = Term.method_58331<S>()
fun <S>KClass<Term<S>>.epsilon() = Term.method_58337<S>()
fun <S>KClass<Term<S>>.anyOf(arg0: Array<Term<S>>) = Term.method_58338<S>(*arg0)
