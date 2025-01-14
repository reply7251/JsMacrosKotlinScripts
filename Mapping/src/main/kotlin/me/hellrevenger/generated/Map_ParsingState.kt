package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParsingState

fun <S>ParsingState<S>.setCursor(arg0: Int) = this.method_58311(arg0)
fun <S>ParsingState<S>.getErrors() = this.method_58310()
fun <S, T>ParsingState<S>.startParsing(arg0: Symbol<T>) = this.method_58312<T>(arg0)
fun <S>ParsingState<S>.getReader() = this.method_58315()
fun <S>ParsingState<S>.getCursor() = this.method_58317()
fun <S, T>ParsingState<S>.parse(arg0: Symbol<T>) = this.method_58316<T>(arg0)
