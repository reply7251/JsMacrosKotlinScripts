package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Clipboard

val KClass<Clipboard>.GLFW_FORMAT_UNAVAILABLE by aliasStatic(Clipboard::field_31905)
fun Clipboard.getClipboard(arg0: Long, arg1: GLFWErrorCallbackI) = this.method_15977(arg0, arg1)
fun Clipboard.setClipboard(arg0: Long, arg1: String) = this.method_15979(arg0, arg1)
