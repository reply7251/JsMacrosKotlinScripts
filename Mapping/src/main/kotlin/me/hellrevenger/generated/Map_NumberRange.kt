package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NumberRange

fun <T, R>KClass<NumberRange<T>>.parse(arg0: StringReader, arg1: net.minecraft.class_2096.class_2098<T, R>, arg2: Function<String, T>, arg3: Supplier<DynamicCommandExceptionType>, arg4: Function<T, T>) where T: Number, R: NumberRange<T> = NumberRange.method_9043<T, R>(arg0, arg1, arg2, arg3, arg4)
fun <T, R>KClass<NumberRange<T>>.createCodec(arg0: Codec<T>, arg1: net.minecraft.class_2096.class_2097<T, R>) where T: Number, R: NumberRange<T> = NumberRange.method_53191<T, R>(arg0, arg1)
fun <T>NumberRange<T>.getConstantValue() where T: Number = this.method_53194()
fun <T>NumberRange<T>.isDummy() where T: Number = this.method_9041()
fun <T>NumberRange<T>.min() where T: Number = this.comp_1805()
fun <T>NumberRange<T>.max() where T: Number = this.comp_1806()
