package me.hellrevenger.generated.Map_ComponentHolder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_62984
 */
fun <T>ComponentHolder.streamAll(valueClass: Class<out T>?) = this.method_62984<T>(valueClass)
/**
 * method_57826
 */
fun ComponentHolder.contains(type: ComponentType<*>?) = this.method_57826(type)
/**
 * method_57824
 */
fun <T>ComponentHolder.get(type: ComponentType<out T>?) = this.method_57824<T>(type)
/**
 * method_57825
 */
fun <T>ComponentHolder.getOrDefault(type: ComponentType<out T>?, fallback: T) = this.method_57825<T>(type, fallback)
/**
 * method_57353
 */
fun ComponentHolder.getComponents() = this.method_57353()
