package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LogWriter

fun <T>LogWriter<T>.getReader() = this.method_47566()
fun <T>LogWriter<T>.write(arg0: T) = this.method_47568(arg0)
fun <T>KClass<LogWriter<T>>.create(arg0: Codec<T>, arg1: file_Path) = LogWriter.method_47567<T>(arg0, arg1)
