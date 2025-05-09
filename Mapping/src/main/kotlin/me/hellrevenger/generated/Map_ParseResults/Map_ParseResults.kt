package me.hellrevenger.generated.Map_ParseResults
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_58324
 */
fun ParseResults.putAll(results: ParseResults) = this.method_58324(results)
/**
 * method_58326
 */
fun <T>ParseResults.getOrThrow(symbol: Symbol<T>) = this.method_58326<T>(symbol)
/**
 * method_58322
 */
fun <T>ParseResults.get(symbol: Symbol<T>) = this.method_58322<T>(symbol)
/**
 * method_58325
 */
fun <T>ParseResults.getAny(symbols: Array<Symbol<T>>) = this.method_58325<T>(*symbols)
/**
 * method_58327
 */
fun <T>ParseResults.getOrDefault(symbol: Symbol<T>, fallback: T) = this.method_58327<T>(symbol, fallback)
/**
 * method_58328
 */
fun <T>ParseResults.getAnyOrThrow(symbols: Array<Symbol<T>>) = this.method_58328<T>(*symbols)
/**
 * method_58323
 */
fun <T>ParseResults.put(symbol: Symbol<T>, value: T) = this.method_58323<T>(symbol, value)
