package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ScreenRect

fun ScreenRect.add(arg0: NavigationDirection) = this.method_48251(arg0)
fun ScreenRect.intersection(arg0: ScreenRect) = this.method_49701(arg0)
fun KClass<ScreenRect>.of(arg0: NavigationAxis, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = ScreenRect.method_48250(arg0, arg1, arg2, arg3, arg4)
fun ScreenRect.getRight() = this.method_49621()
fun ScreenRect.getLeft() = this.method_49620()
fun KClass<ScreenRect>.empty() = ScreenRect.method_48248()
fun ScreenRect.getBorder(arg0: NavigationDirection) = this.method_48256(arg0)
fun ScreenRect.getLength(arg0: NavigationAxis) = this.method_48249(arg0)
fun ScreenRect.getCenter(arg0: NavigationAxis) = this.method_48254(arg0)
fun ScreenRect.getBoundingCoordinate(arg0: NavigationDirection) = this.method_48255(arg0)
fun ScreenRect.overlaps(arg0: ScreenRect, arg1: NavigationAxis) = this.method_48253(arg0, arg1)
fun ScreenRect.overlaps(arg0: ScreenRect) = this.method_48252(arg0)
fun ScreenRect.getTop() = this.method_49618()
fun ScreenRect.contains(arg0: Int, arg1: Int) = this.method_58137(arg0, arg1)
fun ScreenRect.getBottom() = this.method_49619()
fun ScreenRect.width() = this.comp_1196()
fun ScreenRect.height() = this.comp_1197()
fun ScreenRect.position() = this.comp_1195()
