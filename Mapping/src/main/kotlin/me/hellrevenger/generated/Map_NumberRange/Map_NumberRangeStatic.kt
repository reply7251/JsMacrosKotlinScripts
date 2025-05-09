package me.hellrevenger.generated.Map_NumberRange
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NumberRangeKt {
    /**
     * method_9043
     */
    fun <T, R>parse(commandReader: StringReader, commandFactory: net.minecraft.class_2096.class_2098<T, R>, converter: function_Function<String, T>, exceptionTypeSupplier: Supplier<DynamicCommandExceptionType>, mapper: function_Function<T, T>) where T: Number, R: NumberRange<T> = NumberRange.method_9043<T, R>(commandReader, commandFactory, converter, exceptionTypeSupplier, mapper)
    /**
     * method_53191
     */
    fun <T, R>createCodec(valueCodec: Codec<T>, rangeFactory: net.minecraft.class_2096.class_2097<T, R>) where T: Number, R: NumberRange<T> = NumberRange.method_53191<T, R>(valueCodec, rangeFactory)
}