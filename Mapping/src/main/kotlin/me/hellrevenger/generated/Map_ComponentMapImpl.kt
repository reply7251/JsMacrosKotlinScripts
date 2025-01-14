package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComponentMapImpl

fun ComponentMapImpl.getChanges() = this.method_57940()
fun <T>ComponentMapImpl.set(arg0: ComponentType<in T>, arg1: T) = this.method_57938<T>(arg0, arg1)
fun ComponentMapImpl.copy() = this.method_57941()
fun ComponentMapImpl.setChanges(arg0: ComponentChanges) = this.method_59772(arg0)
fun ComponentMapImpl.setAll(arg0: ComponentMap) = this.method_57933(arg0)
fun ComponentMapImpl.applyChanges(arg0: ComponentChanges) = this.method_57936(arg0)
fun KClass<ComponentMapImpl>.create(arg0: ComponentMap, arg1: ComponentChanges) = ComponentMapImpl.method_57935(arg0, arg1)
fun <T>ComponentMapImpl.remove(arg0: ComponentType<out T>) = this.method_57939<T>(arg0)
