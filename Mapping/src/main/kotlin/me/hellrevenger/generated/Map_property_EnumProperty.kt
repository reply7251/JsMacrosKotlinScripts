package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.property_EnumProperty

fun <T>KClass<property_EnumProperty<T>>.of(arg0: String, arg1: Class<T>, arg2: Collection<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11847<T>(arg0, arg1, arg2)
fun <T>property_EnumProperty<T>.name(arg0: T) where T: Enum<T>, T: StringIdentifiable = this.method_11846(arg0)
fun <T>KClass<property_EnumProperty<T>>.of(arg0: String, arg1: Class<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11850<T>(arg0, arg1)
fun <T>KClass<property_EnumProperty<T>>.of(arg0: String, arg1: Class<T>, arg2: Array<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11849<T>(arg0, arg1, *arg2)
fun <T>KClass<property_EnumProperty<T>>.of(arg0: String, arg1: Class<T>, arg2: Predicate<T>) where T: Enum<T>, T: StringIdentifiable = property_EnumProperty.method_11848<T>(arg0, arg1, arg2)
