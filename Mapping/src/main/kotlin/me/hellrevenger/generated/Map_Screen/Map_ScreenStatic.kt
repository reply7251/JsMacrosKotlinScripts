package me.hellrevenger.generated.Map_Screen
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ScreenKt {
    /**
     * field_49896
     */
    val FOOTER_SEPARATOR_TEXTURE by aliasStatic(Screen::field_49896)
    /**
     * field_49897
     */
    val INWORLD_HEADER_SEPARATOR_TEXTURE by aliasStatic(Screen::field_49897)
    /**
     * field_49895
     */
    val HEADER_SEPARATOR_TEXTURE by aliasStatic(Screen::field_49895)
    /**
     * field_49898
     */
    val INWORLD_FOOTER_SEPARATOR_TEXTURE by aliasStatic(Screen::field_49898)
    /**
     * field_49511
     */
    val MENU_BACKGROUND_TEXTURE by aliasStatic(Screen::field_49511)
    /**
     * method_25441
     */
    fun hasControlDown() = Screen.method_25441()
    /**
     * method_57737
     */
    fun renderBackgroundTexture(context: DrawContext, texture: Identifier, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int) = Screen.method_57737(context, texture, x, y, u, v, width, height)
    /**
     * method_25442
     */
    fun hasShiftDown() = Screen.method_25442()
    /**
     * method_25408
     */
    fun getTooltipFromItem(client: MinecraftClient, stack: ItemStack) = Screen.method_25408(client, stack)
    /**
     * method_25443
     */
    fun hasAltDown() = Screen.method_25443()
    /**
     * method_25436
     */
    fun isCut(code: Int) = Screen.method_25436(code)
    /**
     * method_25437
     */
    fun isPaste(code: Int) = Screen.method_25437(code)
    /**
     * method_37061
     */
    fun findSelectedElementData(selectables: MutableList<out Selectable>, selectable: Selectable) = Screen.method_37061(selectables, selectable)
    /**
     * method_25438
     */
    fun isCopy(code: Int) = Screen.method_25438(code)
    /**
     * method_25439
     */
    fun isSelectAll(code: Int) = Screen.method_25439(code)
}