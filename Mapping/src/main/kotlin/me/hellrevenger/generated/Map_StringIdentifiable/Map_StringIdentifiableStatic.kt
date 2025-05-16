package me.hellrevenger.generated.Map_StringIdentifiable
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StringIdentifiableKt {
    /**
     * method_49454
     */
    fun <E>createCodec(enumValues: Supplier<Array<E>>?, valueNameTransformer: function_Function<String, String>?) where E: Enum<E>, E: StringIdentifiable = StringIdentifiable.method_49454<E>(enumValues, valueNameTransformer)
    /**
     * method_53955
     */
    fun <T>createBasicCodec(values: Supplier<Array<T>>?) where T: StringIdentifiable = StringIdentifiable.method_53955<T>(values)
    /**
     * method_28140
     */
    fun <E>createCodec(enumValues: Supplier<Array<E>>?) where E: Enum<E>, E: StringIdentifiable = StringIdentifiable.method_28140<E>(enumValues)
    /**
     * method_53953
     */
    fun <T>createMapper(values: Array<T>?, valueNameTransformer: function_Function<String, String>?) where T: StringIdentifiable = StringIdentifiable.method_53953<T>(values, valueNameTransformer)
    /**
     * method_28142
     */
    fun toKeyable(values: Array<StringIdentifiable>?) = StringIdentifiable.method_28142(values)
}