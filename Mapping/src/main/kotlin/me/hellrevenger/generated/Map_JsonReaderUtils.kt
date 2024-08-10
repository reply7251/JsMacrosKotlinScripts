package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JsonReaderUtils

fun <T>KClass<JsonReaderUtils>.parse(arg0: net.minecraft.class_7225.class_7874, arg1: StringReader, arg2: Codec<T>) = JsonReaderUtils.method_55377<T>(arg0, arg1, arg2)
fun KClass<JsonReaderUtils>.readWhileMatching(arg0: StringReader, arg1: CharPredicate) = JsonReaderUtils.method_58128(arg0, arg1)
