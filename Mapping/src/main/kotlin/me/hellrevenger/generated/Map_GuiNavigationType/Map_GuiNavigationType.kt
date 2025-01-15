package me.hellrevenger.generated.Map_GuiNavigationType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<GuiNavigationType>.KEYBOARD_ARROW by aliasEnum(GuiNavigationType::class, "field_43097")
val KClass<GuiNavigationType>.KEYBOARD_TAB by aliasEnum(GuiNavigationType::class, "field_41780")
val KClass<GuiNavigationType>.NONE by aliasEnum(GuiNavigationType::class, "field_41777")
val KClass<GuiNavigationType>.MOUSE by aliasEnum(GuiNavigationType::class, "field_41778")
fun GuiNavigationType.isMouse() = this.method_48182()
fun GuiNavigationType.isKeyboard() = this.method_48183()
