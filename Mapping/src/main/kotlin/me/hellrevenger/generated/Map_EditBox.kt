package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EditBox

val EditBox.UNLIMITED_LENGTH by aliasStatic(EditBox::field_39511)
fun EditBox.replaceSelection(arg0: String) = this.method_44420(arg0)
fun EditBox.setMaxLength(arg0: Int) = this.method_44411(arg0)
fun EditBox.setText(arg0: String) = this.method_44414(arg0)
fun EditBox.moveCursorLine(arg0: Int) = this.method_44425(arg0)
fun EditBox.getNextWordAtCursor() = this.method_44438()
fun EditBox.delete(arg0: Int) = this.method_44419(arg0)
fun EditBox.setCursorChangeListener(arg0: Runnable) = this.method_44413(arg0)
fun EditBox.getLine(arg0: Int) = this.method_44422(arg0)
fun EditBox.setSelecting(arg0: Boolean) = this.method_44417(arg0)
fun EditBox.hasSelection() = this.method_44435()
fun EditBox.moveCursor(arg0: CursorMovement, arg1: Int) = this.method_44412(arg0, arg1)
fun EditBox.handleSpecialKey(arg0: Int) = this.method_44428(arg0)
fun EditBox.setChangeListener(arg0: Consumer<String>) = this.method_44415(arg0)
fun EditBox.getCurrentLineIndex() = this.method_44432()
fun EditBox.getPreviousWordAtCursor() = this.method_44437()
fun EditBox.getSelection() = this.method_44427()
fun EditBox.getLineCount() = this.method_44430()
fun EditBox.getSelectedText() = this.method_44436()
fun EditBox.moveCursor(arg0: Double, arg1: Double) = this.method_44410(arg0, arg1)
fun EditBox.hasMaxLength() = this.method_44418()
