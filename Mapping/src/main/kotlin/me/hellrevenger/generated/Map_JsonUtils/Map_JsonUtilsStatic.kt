package me.hellrevenger.generated.Map_JsonUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*
object JsonUtilsKt {
    /**
     * method_54577
     */
    fun getStringOr(key: String, node: JsonObject, defaultValue: String) = JsonUtils.method_54577(key, node, defaultValue)
    /**
     * method_21544
     */
    fun getDateOr(key: String, node: JsonObject) = JsonUtils.method_21544(key, node)
    /**
     * method_49596
     */
    fun <T>get(key: String, node: JsonObject, deserializer: function_Function<JsonObject, T>) = JsonUtils.method_49596<T>(key, node, deserializer)
    /**
     * method_49595
     */
    fun getUuidOr(key: String, node: JsonObject, defaultValue: UUID) = JsonUtils.method_49595(key, node, defaultValue)
    /**
     * method_21547
     */
    fun getNullableStringOr(key: String, node: JsonObject, defaultValue: String) = JsonUtils.method_21547(key, node, defaultValue)
    /**
     * method_54115
     */
    fun <T>getNullable(key: String, node: JsonObject, deserializer: function_Function<JsonObject, T>) = JsonUtils.method_54115<T>(key, node, deserializer)
    /**
     * method_21546
     */
    fun getLongOr(key: String, node: JsonObject, defaultValue: Long) = JsonUtils.method_21546(key, node, defaultValue)
    /**
     * method_21545
     */
    fun getIntOr(key: String, node: JsonObject, defaultValue: Int) = JsonUtils.method_21545(key, node, defaultValue)
    /**
     * method_21548
     */
    fun getBooleanOr(key: String, node: JsonObject, defaultValue: Boolean) = JsonUtils.method_21548(key, node, defaultValue)
    /**
     * method_49594
     */
    fun getString(key: String, node: JsonObject) = JsonUtils.method_49594(key, node)
}