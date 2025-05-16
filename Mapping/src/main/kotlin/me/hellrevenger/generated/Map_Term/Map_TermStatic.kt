package me.hellrevenger.generated.Map_Term
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TermKt {
    /**
     * method_58332
     */
    fun <S>symbol(symbol: Symbol<*>?) = Term.method_58332<S>(symbol)
    /**
     * method_58333
     */
    fun <S, T>always(symbol: Symbol<T>?, value: T) = Term.method_58333<S, T>(symbol, value)
    /**
     * method_58335
     */
    fun <S>optional(term: Term<S>?) = Term.method_58335<S>(term)
    /**
     * method_58336
     */
    fun <S>sequence(terms: Array<Term<S>>) = Term.method_58336<S>(*terms)
    /**
     * method_58331
     */
    fun <S>cutting() = Term.method_58331<S>()
    /**
     * method_58337
     */
    fun <S>epsilon() = Term.method_58337<S>()
    /**
     * method_58338
     */
    fun <S>anyOf(terms: Array<Term<S>>) = Term.method_58338<S>(*terms)
}