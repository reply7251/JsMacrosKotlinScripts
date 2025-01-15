package me.hellrevenger.generated.Map_TextCodecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
import java.util.function.Function

fun KClass<TextCodecs>.codec(arg0: Int) = TextCodecs.method_57973(arg0)
fun <T, E>KClass<TextCodecs>.dispatchingCodec(arg0: Array<T>, arg1: Function<T, MapCodec<out E>>, arg2: Function<E, T>, arg3: String) where T: StringIdentifiable = TextCodecs.method_54174<T, E>(arg0, arg1, arg2, arg3)
