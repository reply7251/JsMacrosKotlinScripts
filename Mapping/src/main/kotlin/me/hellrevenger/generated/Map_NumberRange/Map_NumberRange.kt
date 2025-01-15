package me.hellrevenger.generated.Map_NumberRange
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T, R>KClass<NumberRange<T>>.parse(arg0: StringReader, arg1: net.minecraft.class_2096.class_2098<T, R>, arg2: java.util.function.Function<String, T>, arg3: Supplier<DynamicCommandExceptionType>, arg4: java.util.function.Function<T, T>) where T: Number, R: NumberRange<T> = NumberRange.method_9043<T, R>(arg0, arg1, arg2, arg3, arg4)
fun <T, R>KClass<NumberRange<T>>.createCodec(arg0: Codec<T>, arg1: net.minecraft.class_2096.class_2097<T, R>) where T: Number, R: NumberRange<T> = NumberRange.method_53191<T, R>(arg0, arg1)
fun <T>NumberRange<T>.getConstantValue() where T: Number = this.method_53194()
fun <T>NumberRange<T>.isDummy() where T: Number = this.method_9041()
fun <T>NumberRange<T>.min() where T: Number = this.comp_1805()
fun <T>NumberRange<T>.max() where T: Number = this.comp_1806()
