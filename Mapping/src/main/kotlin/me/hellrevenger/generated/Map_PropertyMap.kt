package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PropertyMap

fun PropertyMap.keySet() = this.method_47762()
fun KClass<PropertyMap>.createCodec(arg0: List<TelemetryEventProperty<*>>) = PropertyMap.method_47761(arg0)
fun KClass<PropertyMap>.builder() = PropertyMap.method_47759()
fun <T>PropertyMap.get(arg0: TelemetryEventProperty<T>) = this.method_47760<T>(arg0)
