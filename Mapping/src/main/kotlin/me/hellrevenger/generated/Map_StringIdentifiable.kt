package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StringIdentifiable

fun <E>KClass<StringIdentifiable>.createCodec(arg0: Supplier<Array<E>>, arg1: Function<String, String>) where E: Enum<E>, E: StringIdentifiable = StringIdentifiable.method_49454<E>(arg0, arg1)
fun <T>KClass<StringIdentifiable>.createBasicCodec(arg0: Supplier<Array<T>>) where T: StringIdentifiable = StringIdentifiable.method_53955<T>(arg0)
fun StringIdentifiable.asString() = this.method_15434()
fun <E>KClass<StringIdentifiable>.createCodec(arg0: Supplier<Array<E>>) where E: Enum<E>, E: StringIdentifiable = StringIdentifiable.method_28140<E>(arg0)
fun <T>KClass<StringIdentifiable>.createMapper(arg0: Array<T>, arg1: Function<String, String>) where T: StringIdentifiable = StringIdentifiable.method_53953<T>(arg0, arg1)
fun KClass<StringIdentifiable>.toKeyable(arg0: Array<StringIdentifiable>) = StringIdentifiable.method_28142(arg0)
