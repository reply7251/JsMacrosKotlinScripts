package me.hellrevenger.generated.Map_Keyboard
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<Keyboard>.DEBUG_CRASH_TIME by aliasStatic(Keyboard::field_32143)
fun Keyboard.onKey(arg0: Long, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = this.method_1466(arg0, arg1, arg2, arg3, arg4)
fun Keyboard.setup(arg0: Long) = this.method_1472(arg0)
fun Keyboard.setClipboard(arg0: String) = this.method_1455(arg0)
fun Keyboard.getClipboard() = this.method_1460()
fun Keyboard.pollDebugCrash() = this.method_1474()
