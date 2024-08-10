package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GuiNavigationType

val GuiNavigationType.KEYBOARD_ARROW by aliasEnum(GuiNavigationType::class, "field_43097")
val GuiNavigationType.KEYBOARD_TAB by aliasEnum(GuiNavigationType::class, "field_41780")
val GuiNavigationType.NONE by aliasEnum(GuiNavigationType::class, "field_41777")
val GuiNavigationType.MOUSE by aliasEnum(GuiNavigationType::class, "field_41778")
fun GuiNavigationType.isMouse() = this.method_48182()
fun GuiNavigationType.isKeyboard() = this.method_48183()
