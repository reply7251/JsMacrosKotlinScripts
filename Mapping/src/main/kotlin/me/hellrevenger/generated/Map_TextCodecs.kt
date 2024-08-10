package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TextCodecs

val TextCodecs.OPTIONAL_PACKET_CODEC by aliasStatic(TextCodecs::field_48985)
val TextCodecs.REGISTRY_PACKET_CODEC by aliasStatic(TextCodecs::field_48540)
val TextCodecs.OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC by aliasStatic(TextCodecs::field_49667)
val TextCodecs.STRINGIFIED_CODEC by aliasStatic(TextCodecs::field_46598)
val TextCodecs.PACKET_CODEC by aliasStatic(TextCodecs::field_49668)
val TextCodecs.UNLIMITED_REGISTRY_PACKET_CODEC by aliasStatic(TextCodecs::field_49666)
fun KClass<TextCodecs>.codec(arg0: Int) = TextCodecs.method_57973(arg0)
fun <T, E>KClass<TextCodecs>.dispatchingCodec(arg0: Array<T>, arg1: Function<T, MapCodec<out E>>, arg2: Function<E, T>, arg3: String) where T: StringIdentifiable = TextCodecs.method_54174<T, E>(arg0, arg1, arg2, arg3)
