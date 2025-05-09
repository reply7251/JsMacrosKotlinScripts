package me.hellrevenger.generated.Map_property_EnumProperty
import kotlin.reflect.*
import me.hellrevenger.generated.*
object property_EnumPropertyKt {
    /**
     * method_11847
     */
    fun <T>of(name: String, type: Class<T>, values: MutableList<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11847<T>(name, type, values)
    /**
     * method_11850
     */
    fun <T>of(name: String, type: Class<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11850<T>(name, type)
    /**
     * method_11849
     */
    fun <T>of(name: String, type: Class<T>, values: Array<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11849<T>(name, type, *values)
    /**
     * method_11848
     */
    fun <T>of(name: String, type: Class<T>, filter: Predicate<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11848<T>(name, type, filter)
}