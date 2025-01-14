package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ToastManager

fun <T>ToastManager.getToast(arg0: Class<out T>, arg1: Object) where T: Toast = this.method_1997<T>(arg0, arg1)
fun ToastManager.draw(arg0: DrawContext) = this.method_1996(arg0)
fun ToastManager.add(arg0: Toast) = this.method_1999(arg0)
fun ToastManager.clear() = this.method_2000()
fun ToastManager.getClient() = this.method_1995()
fun ToastManager.getNotificationDisplayTimeMultiplier() = this.method_48221()
