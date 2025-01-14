package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParseResults

fun ParseResults.putAll(arg0: ParseResults) = this.method_58324(arg0)
fun <T>ParseResults.getOrThrow(arg0: Symbol<T>) = this.method_58326<T>(arg0)
fun <T>ParseResults.get(arg0: Symbol<T>) = this.method_58322<T>(arg0)
fun <T>ParseResults.getAny(arg0: Array<Symbol<T>>) = this.method_58325<T>(*arg0)
fun <T>ParseResults.getOrDefault(arg0: Symbol<T>, arg1: T) = this.method_58327<T>(arg0, arg1)
fun <T>ParseResults.getAnyOrThrow(arg0: Array<Symbol<T>>) = this.method_58328<T>(*arg0)
fun <T>ParseResults.put(arg0: Symbol<T>, arg1: T) = this.method_58323<T>(arg0, arg1)
