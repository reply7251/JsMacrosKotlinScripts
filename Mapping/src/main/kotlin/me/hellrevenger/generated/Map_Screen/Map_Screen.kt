package me.hellrevenger.generated.Map_Screen
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_41685
 */
var Screen.tooltip by alias(Screen::field_41685)
/**
 * field_22790
 */
var Screen.height by alias(Screen::field_22790)
/**
 * field_33815
 */
val Screen.selectables by alias(Screen::field_33815)
/**
 * field_22786
 */
val Screen.children by alias(Screen::field_22786)
/**
 * field_33816
 */
val Screen.drawables by alias(Screen::field_33816)
/**
 * field_22789
 */
var Screen.width by alias(Screen::field_22789)
/**
 * method_29638
 */
fun Screen.onFilesDropped(paths: MutableList<file_Path>) = this.method_29638(paths)
/**
 * method_25423
 */
fun Screen.init(client: MinecraftClient, width: Int, height: Int) = this.method_25423(client, width, height)
/**
 * method_47413
 */
fun Screen.renderWithTooltip(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) = this.method_47413(context, mouseX, mouseY, delta)
/**
 * method_49589
 */
fun Screen.onDisplayed() = this.method_49589()
/**
 * method_25430
 */
fun Screen.handleTextClick(style: Style) = this.method_25430(style)
/**
 * method_50024
 */
fun Screen.getMusic() = this.method_50024()
/**
 * method_37069
 */
fun Screen.applyMousePressScrollNarratorDelay() = this.method_37069()
/**
 * method_61040
 */
fun Screen.refreshNarrator(previouslyDisabled: Boolean) = this.method_61040(previouslyDisabled)
/**
 * method_25410
 */
fun Screen.resize(client: MinecraftClient, width: Int, height: Int) = this.method_25410(client, width, height)
/**
 * method_64506
 */
fun Screen.getTextRenderer() = this.method_64506()
/**
 * method_37063
 */
fun <T>Screen.addDrawableChild(drawableElement: T) where T: Element, T: Drawable, T: Selectable = this.method_37063<T>(drawableElement)
/**
 * method_37071
 */
fun Screen.updateNarrator() = this.method_37071()
/**
 * method_37066
 */
fun Screen.remove(child: Element) = this.method_37066(child)
/**
 * method_37067
 */
fun Screen.clearChildren() = this.method_37067()
/**
 * method_37064
 */
fun Screen.narrateScreenIfNarrationEnabled(onlyChangedNarrations: Boolean) = this.method_37064(onlyChangedNarrations)
/**
 * method_37068
 */
fun Screen.applyMouseMoveNarratorDelay() = this.method_37068()
/**
 * method_25440
 */
fun Screen.getTitle() = this.method_25440()
/**
 * method_25432
 */
fun Screen.removed() = this.method_25432()
/**
 * method_25421
 */
fun Screen.shouldPause() = this.method_25421()
/**
 * method_52752
 */
fun Screen.renderInGameBackground(context: DrawContext) = this.method_52752(context)
/**
 * method_37070
 */
fun Screen.applyKeyPressNarratorDelay() = this.method_37070()
/**
 * method_37060
 */
fun <T>Screen.addDrawable(drawable: T) where T: Drawable = this.method_37060<T>(drawable)
/**
 * method_25393
 */
fun Screen.tick() = this.method_25393()
/**
 * method_25422
 */
fun Screen.shouldCloseOnEsc() = this.method_25422()
/**
 * method_25435
 */
fun Screen.getNarratedTitle() = this.method_25435()
/**
 * method_25419
 */
fun Screen.close() = this.method_25419()
/**
 * method_64507
 */
fun Screen.shouldHideStatusEffectHud() = this.method_64507()
/**
 * method_25420
 */
fun Screen.renderBackground(context: DrawContext, mouseX: Int, mouseY: Int, delta: Float) = this.method_25420(context, mouseX, mouseY, delta)
/**
 * method_65027
 */
fun Screen.addCrashReportSection(report: CrashReport) = this.method_65027(report)
/**
 * method_48267
 */
fun Screen.blur() = this.method_48267()
