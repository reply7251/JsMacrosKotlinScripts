package me.hellrevenger.generated.Map_ParsingState
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_58311
 */
fun <S>ParsingState<S>.setCursor(cursor: Int) = this.method_58311(cursor)
/**
 * method_58310
 */
fun <S>ParsingState<S>.getErrors() = this.method_58310()
/**
 * method_58312
 */
fun <S, T>ParsingState<S>.startParsing(startSymbol: Symbol<T>?) = this.method_58312<T>(startSymbol)
/**
 * method_58315
 */
fun <S>ParsingState<S>.getReader() = this.method_58315()
/**
 * method_58317
 */
fun <S>ParsingState<S>.getCursor() = this.method_58317()
/**
 * method_58316
 */
fun <S, T>ParsingState<S>.parse(symbol: Symbol<T>?) = this.method_58316<T>(symbol)
