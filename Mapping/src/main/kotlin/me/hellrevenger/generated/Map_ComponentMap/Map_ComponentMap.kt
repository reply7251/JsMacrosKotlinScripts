package me.hellrevenger.generated.Map_ComponentMap
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun ComponentMap.getTypes() = this.method_57831()
fun ComponentMap.isEmpty() = this.method_57837()
fun KClass<ComponentMap>.createCodecFromValueMap(arg0: Codec<Map<ComponentType<*>, *>>) = ComponentMap.method_60388(arg0)
fun ComponentMap.stream() = this.method_57833()
fun KClass<ComponentMap>.createCodec(arg0: Codec<ComponentType<*>>) = ComponentMap.method_60386(arg0)
fun ComponentMap.contains(arg0: ComponentType<*>) = this.method_57832(arg0)
fun <T>ComponentMap.getOrDefault(arg0: ComponentType<out T>, arg1: T) = this.method_57830<T>(arg0, arg1)
fun KClass<ComponentMap>.builder() = ComponentMap.method_57827()
fun KClass<ComponentMap>.of(arg0: ComponentMap, arg1: ComponentMap) = ComponentMap.method_59771(arg0, arg1)
fun <T>ComponentMap.copy(arg0: ComponentType<T>) = this.method_57834<T>(arg0)
fun <T>ComponentMap.get(arg0: ComponentType<out T>) = this.method_57829<T>(arg0)
fun ComponentMap.filtered(arg0: Predicate<ComponentType<*>>) = this.method_57828(arg0)
fun ComponentMap.size() = this.method_57835()
