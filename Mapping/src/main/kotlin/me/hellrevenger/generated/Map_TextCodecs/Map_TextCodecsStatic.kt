package me.hellrevenger.generated.Map_TextCodecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TextCodecsKt {
    /**
     * method_57973
     */
    fun codec(maxSerializedLength: Int) = TextCodecs.method_57973(maxSerializedLength)
    /**
     * method_54174
     */
    fun <T, E>dispatchingCodec(types: Array<T>?, typeToCodec: function_Function<T, MapCodec<out E>>?, valueToType: function_Function<E, T>?, dispatchingKey: String?) where T: StringIdentifiable = TextCodecs.method_54174<T, E>(types, typeToCodec, valueToType, dispatchingKey)
}