package me.hellrevenger.generated.Map_JsonHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object JsonHelperKt {
    /**
     * method_34932
     */
    fun getBigInteger(arg0: JsonObject, element: String) = JsonHelper.method_34932(arg0, element)
    /**
     * method_34916
     */
    fun getItem(arg0: JsonObject, key: String, defaultValue: RegistryEntry<Item>) = JsonHelper.method_34916(arg0, key, defaultValue)
    /**
     * method_15252
     */
    fun asArray(element: JsonElement, name: String) = JsonHelper.method_15252(element, name)
    /**
     * method_15287
     */
    fun asString(element: JsonElement, name: String) = JsonHelper.method_15287(element, name)
    /**
     * method_15281
     */
    fun getObject(arg0: JsonObject, element: String, defaultObject: JsonObject) = JsonHelper.method_15281(arg0, element, defaultObject)
    /**
     * method_15297
     */
    fun <T>deserialize(gson: Gson, reader: Reader, typeToken: TypeToken<T>) = JsonHelper.method_15297<T>(gson, reader, typeToken)
    /**
     * method_34924
     */
    fun asChar(element: JsonElement, name: String) = JsonHelper.method_34924(element, name)
    /**
     * method_47994
     */
    fun <T>deserializeNullable(gson: Gson, content: String, type: Class<T>, lenient: Boolean) = JsonHelper.method_47994<T>(gson, content, type, lenient)
    /**
     * method_15258
     */
    fun getBoolean(arg0: JsonObject, element: String, defaultBoolean: Boolean) = JsonHelper.method_15258(arg0, element, defaultBoolean)
    /**
     * method_34921
     */
    fun isBoolean(arg0: JsonElement) = JsonHelper.method_34921(arg0)
    /**
     * method_34931
     */
    fun getBigDecimal(arg0: JsonObject, element: String) = JsonHelper.method_34931(arg0, element)
    /**
     * method_15256
     */
    fun asItem(element: JsonElement, name: String) = JsonHelper.method_15256(element, name)
    /**
     * method_15263
     */
    fun asLong(element: JsonElement, name: String) = JsonHelper.method_15263(element, name)
    /**
     * method_34928
     */
    fun asShort(element: JsonElement, name: String) = JsonHelper.method_34928(element, name)
    /**
     * method_52226
     */
    fun getElement(arg0: JsonObject, name: String) = JsonHelper.method_52226(arg0, name)
    /**
     * method_34923
     */
    fun hasJsonObject(arg0: JsonObject, element: String) = JsonHelper.method_34923(arg0, element)
    /**
     * method_34933
     */
    fun getShort(arg0: JsonObject, element: String) = JsonHelper.method_34933(arg0, element)
    /**
     * method_15271
     */
    fun getByte(arg0: JsonObject, element: String, defaultByte: Byte) = JsonHelper.method_15271(arg0, element, defaultByte)
    /**
     * method_15259
     */
    fun getFloat(arg0: JsonObject, element: String) = JsonHelper.method_15259(arg0, element)
    /**
     * method_15266
     */
    fun getType(element: JsonElement) = JsonHelper.method_15266(element)
    /**
     * method_15294
     */
    fun hasElement(arg0: JsonObject, element: String) = JsonHelper.method_15294(arg0, element)
    /**
     * method_34926
     */
    fun asBigInteger(element: JsonElement, name: String) = JsonHelper.method_34926(element, name)
    /**
     * method_15254
     */
    fun hasBoolean(arg0: JsonObject, element: String) = JsonHelper.method_15254(arg0, element)
    /**
     * method_15278
     */
    fun hasPrimitive(arg0: JsonObject, element: String) = JsonHelper.method_15278(arg0, element)
    /**
     * method_15292
     */
    fun getArray(arg0: JsonObject, name: String, defaultArray: JsonArray) = JsonHelper.method_15292(arg0, name, defaultArray)
    /**
     * method_34920
     */
    fun hasNumber(arg0: JsonObject, element: String) = JsonHelper.method_34920(arg0, element)
    /**
     * method_43679
     */
    fun deserializeArray(content: String) = JsonHelper.method_43679(content)
    /**
     * method_34915
     */
    fun getDouble(arg0: JsonObject, element: String, defaultDouble: Double) = JsonHelper.method_34915(arg0, element, defaultDouble)
    /**
     * method_15280
     */
    fun getLong(arg0: JsonObject, element: String, defaultLong: Long) = JsonHelper.method_15280(arg0, element, defaultLong)
    /**
     * method_34925
     */
    fun asBigDecimal(element: JsonElement, name: String) = JsonHelper.method_34925(element, name)
    /**
     * method_15293
     */
    fun asByte(element: JsonElement, name: String) = JsonHelper.method_15293(element, name)
    /**
     * method_34930
     */
    fun getChar(arg0: JsonObject, element: String) = JsonHelper.method_34930(arg0, element)
    /**
     * method_43680
     */
    fun toSortedString(json: JsonElement) = JsonHelper.method_43680(json)
    /**
     * method_15289
     */
    fun hasString(arg0: JsonObject, element: String) = JsonHelper.method_15289(arg0, element)
    /**
     * method_15295
     */
    fun asObject(element: JsonElement, name: String) = JsonHelper.method_15295(element, name)
    /**
     * method_15265
     */
    fun getString(arg0: JsonObject, element: String) = JsonHelper.method_15265(arg0, element)
    /**
     * method_34922
     */
    fun asDouble(arg0: JsonElement, name: String) = JsonHelper.method_34922(arg0, name)
    /**
     * method_15286
     */
    fun isString(element: JsonElement) = JsonHelper.method_15286(element)
    /**
     * method_15282
     */
    fun getInt(arg0: JsonObject, element: String, defaultInt: Int) = JsonHelper.method_15282(arg0, element, defaultInt)
    /**
     * method_15264
     */
    fun hasArray(arg0: JsonObject, element: String) = JsonHelper.method_15264(arg0, element)
    /**
     * method_15269
     */
    fun asFloat(element: JsonElement, name: String) = JsonHelper.method_15269(element, name)
    /**
     * method_43677
     */
    fun writeSorted(writer: JsonWriter, json: JsonElement, comparator: Comparator<String>) = JsonHelper.method_43677(writer, json, comparator)
    /**
     * method_15257
     */
    fun asInt(element: JsonElement, name: String) = JsonHelper.method_15257(element, name)
    /**
     * method_15268
     */
    fun asBoolean(element: JsonElement, name: String) = JsonHelper.method_15268(element, name)
    /**
     * method_15275
     */
    fun isNumber(element: JsonElement) = JsonHelper.method_15275(element)
}