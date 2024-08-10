package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LogReader

fun <T>KClass<LogReader<T>>.create(arg0: Codec<T>, arg1: Reader) = LogReader.method_47571<T>(arg0, arg1)
fun <T>LogReader<T>.read() = this.method_47570()
