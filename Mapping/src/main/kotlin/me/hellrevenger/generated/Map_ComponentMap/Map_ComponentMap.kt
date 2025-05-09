package me.hellrevenger.generated.Map_ComponentMap
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57831
 */
fun ComponentMap.getTypes() = this.method_57831()
/**
 * method_57837
 */
fun ComponentMap.isEmpty() = this.method_57837()
/**
 * method_57833
 */
fun ComponentMap.stream() = this.method_57833()
/**
 * method_57832
 */
fun ComponentMap.contains(type: ComponentType<*>) = this.method_57832(type)
/**
 * method_57830
 */
fun <T>ComponentMap.getOrDefault(type: ComponentType<out T>, fallback: T) = this.method_57830<T>(type, fallback)
/**
 * method_57834
 */
fun <T>ComponentMap.copy(type: ComponentType<T>) = this.method_57834<T>(type)
/**
 * method_57829
 */
fun <T>ComponentMap.get(type: ComponentType<out T>) = this.method_57829<T>(type)
/**
 * method_57828
 */
fun ComponentMap.filtered(predicate: Predicate<ComponentType<*>>) = this.method_57828(predicate)
/**
 * method_57835
 */
fun ComponentMap.size() = this.method_57835()
