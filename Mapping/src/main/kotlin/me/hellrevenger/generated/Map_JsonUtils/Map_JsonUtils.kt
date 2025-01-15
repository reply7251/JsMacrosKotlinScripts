package me.hellrevenger.generated.Map_JsonUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<JsonUtils>.getStringOr(arg0: String, arg1: JsonObject, arg2: String) = JsonUtils.method_54577(arg0, arg1, arg2)
fun KClass<JsonUtils>.getDateOr(arg0: String, arg1: JsonObject) = JsonUtils.method_21544(arg0, arg1)
fun <T>KClass<JsonUtils>.get(arg0: String, arg1: JsonObject, arg2: java.util.function.Function<JsonObject, T>) = JsonUtils.method_49596<T>(arg0, arg1, arg2)
fun KClass<JsonUtils>.getUuidOr(arg0: String, arg1: JsonObject, arg2: UUID) = JsonUtils.method_49595(arg0, arg1, arg2)
fun KClass<JsonUtils>.getNullableStringOr(arg0: String, arg1: JsonObject, arg2: String) = JsonUtils.method_21547(arg0, arg1, arg2)
fun <T>KClass<JsonUtils>.getNullable(arg0: String, arg1: JsonObject, arg2: java.util.function.Function<JsonObject, T>) = JsonUtils.method_54115<T>(arg0, arg1, arg2)
fun KClass<JsonUtils>.getLongOr(arg0: String, arg1: JsonObject, arg2: Long) = JsonUtils.method_21546(arg0, arg1, arg2)
fun KClass<JsonUtils>.getIntOr(arg0: String, arg1: JsonObject, arg2: Int) = JsonUtils.method_21545(arg0, arg1, arg2)
fun KClass<JsonUtils>.getBooleanOr(arg0: String, arg1: JsonObject, arg2: Boolean) = JsonUtils.method_21548(arg0, arg1, arg2)
fun KClass<JsonUtils>.getString(arg0: String, arg1: JsonObject) = JsonUtils.method_49594(arg0, arg1)
