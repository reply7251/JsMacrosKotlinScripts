package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScreenPos

fun KClass<ScreenPos>.of(arg0: NavigationAxis, arg1: Int, arg2: Int) = ScreenPos.method_48246(arg0, arg1, arg2)
fun ScreenPos.getComponent(arg0: NavigationAxis) = this.method_48245(arg0)
fun ScreenPos.add(arg0: NavigationDirection) = this.method_48247(arg0)
fun ScreenPos.x() = this.comp_1193()
fun ScreenPos.y() = this.comp_1194()
