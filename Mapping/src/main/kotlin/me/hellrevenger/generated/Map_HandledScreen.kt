package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.HandledScreen

val <T>HandledScreen<T>.BACKGROUND_TEXTURE where T: ScreenHandler by aliasStatic({HandledScreen.field_2801})
fun <T>HandledScreen<T>.endTouchDrag() where T: ScreenHandler = this.method_44339()
fun <T>KClass<HandledScreen<T>>.drawSlotHighlight(arg0: DrawContext, arg1: Int, arg2: Int, arg3: Int) where T: ScreenHandler = HandledScreen.method_33285(arg0, arg1, arg2, arg3)
