package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComponentHolder

fun ComponentHolder.contains(arg0: ComponentType<*>) = this.method_57826(arg0)
fun <T>ComponentHolder.get(arg0: ComponentType<out T>) = this.method_57824<T>(arg0)
fun <T>ComponentHolder.getOrDefault(arg0: ComponentType<out T>, arg1: T) = this.method_57825<T>(arg0, arg1)
fun ComponentHolder.getComponents() = this.method_57353()
