package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TextFieldWidget

val TextFieldWidget.DEFAULT_EDITABLE_COLOR by aliasStatic(TextFieldWidget::field_32196)
val TextFieldWidget.maxLength by alias(TextFieldWidget::field_2108)
val TextFieldWidget.textRenderer by alias(TextFieldWidget::field_2105)
val TextFieldWidget.firstCharacterIndex by alias(TextFieldWidget::field_2103)
fun TextFieldWidget.isVisible() = this.method_1885()
fun TextFieldWidget.setText(arg0: String) = this.method_1852(arg0)
fun TextFieldWidget.getCursor() = this.method_1881()
fun TextFieldWidget.eraseCharacters(arg0: Int) = this.method_1878(arg0)
fun TextFieldWidget.getSelectedText() = this.method_1866()
fun TextFieldWidget.eraseCharactersTo(arg0: Int) = this.method_55506(arg0)
fun TextFieldWidget.setEditable(arg0: Boolean) = this.method_1888(arg0)
fun TextFieldWidget.setFocusUnlocked(arg0: Boolean) = this.method_1856(arg0)
fun TextFieldWidget.setChangedListener(arg0: Consumer<String>) = this.method_1863(arg0)
fun TextFieldWidget.setMaxLength(arg0: Int) = this.method_1880(arg0)
fun TextFieldWidget.setUneditableColor(arg0: Int) = this.method_1860(arg0)
fun TextFieldWidget.isActive() = this.method_20315()
fun TextFieldWidget.setSelectionEnd(arg0: Int) = this.method_1884(arg0)
fun TextFieldWidget.eraseWords(arg0: Int) = this.method_1877(arg0)
fun TextFieldWidget.setCursor(arg0: Int, arg1: Boolean) = this.method_1883(arg0, arg1)
fun TextFieldWidget.getWordSkipPosition(arg0: Int) = this.method_1853(arg0)
fun TextFieldWidget.moveCursor(arg0: Int, arg1: Boolean) = this.method_1855(arg0, arg1)
fun TextFieldWidget.setCursorToEnd(arg0: Boolean) = this.method_1872(arg0)
fun TextFieldWidget.getCharacterX(arg0: Int) = this.method_1889(arg0)
fun TextFieldWidget.drawsBackground() = this.method_1851()
fun TextFieldWidget.setSelectionStart(arg0: Int) = this.method_1875(arg0)
fun TextFieldWidget.setSuggestion(arg0: String) = this.method_1887(arg0)
fun TextFieldWidget.write(arg0: String) = this.method_1867(arg0)
fun TextFieldWidget.setEditableColor(arg0: Int) = this.method_1868(arg0)
fun TextFieldWidget.setTextPredicate(arg0: Predicate<String>) = this.method_1890(arg0)
fun TextFieldWidget.setPlaceholder(arg0: Text) = this.method_47404(arg0)
fun TextFieldWidget.setDrawsBackground(arg0: Boolean) = this.method_1858(arg0)
fun TextFieldWidget.setRenderTextProvider(arg0: BiFunction<String, Int, OrderedText>) = this.method_1854(arg0)
fun TextFieldWidget.getInnerWidth() = this.method_1859()
fun TextFieldWidget.setCursorToStart(arg0: Boolean) = this.method_1870(arg0)
fun TextFieldWidget.setVisible(arg0: Boolean) = this.method_1862(arg0)
