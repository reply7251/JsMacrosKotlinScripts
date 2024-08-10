package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DirectionalLayoutWidget

fun KClass<DirectionalLayoutWidget>.vertical() = DirectionalLayoutWidget.method_52741()
fun KClass<DirectionalLayoutWidget>.horizontal() = DirectionalLayoutWidget.method_52742()
fun <T>DirectionalLayoutWidget.add(arg0: T, arg1: Positioner) where T: Widget = this.method_52737<T>(arg0, arg1)
fun DirectionalLayoutWidget.copyPositioner() = this.method_52739()
fun <T>DirectionalLayoutWidget.add(arg0: T, arg1: Consumer<Positioner>) where T: Widget = this.method_52738<T>(arg0, arg1)
fun <T>DirectionalLayoutWidget.add(arg0: T) where T: Widget = this.method_52736<T>(arg0)
fun DirectionalLayoutWidget.getMainPositioner() = this.method_52740()
fun DirectionalLayoutWidget.spacing(arg0: Int) = this.method_52735(arg0)
