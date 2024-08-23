package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SelectionManager

fun SelectionManager.moveCursorPastWord(arg0: Int, arg1: Boolean) = this.method_27555(arg0, arg1)
fun SelectionManager.deleteWord(arg0: Int) = this.method_42576(arg0)
fun SelectionManager.moveCursor(arg0: Int, arg1: Boolean) = this.method_27549(arg0, arg1)
fun KClass<SelectionManager>.makeClipboardGetter(arg0: MinecraftClient) = SelectionManager.method_27550(arg0)
fun SelectionManager.getSelectionEnd() = this.method_16203()
fun SelectionManager.getSelectionStart() = this.method_16201()
fun SelectionManager.setSelectionEnd(arg0: Int) = this.method_35731(arg0)
fun KClass<SelectionManager>.makeClipboardSetter(arg0: MinecraftClient) = SelectionManager.method_27561(arg0)
fun SelectionManager.moveCursorToStart() = this.method_35729()
fun SelectionManager.handleSpecialKey(arg0: Int) = this.method_16202(arg0)
fun SelectionManager.putCursorAtEnd() = this.method_16204()
fun SelectionManager.delete(arg0: Int) = this.method_27564(arg0)
fun SelectionManager.moveCursor(arg0: Int) = this.method_35727(arg0)
fun SelectionManager.moveCursorToEnd(arg0: Boolean) = this.method_27558(arg0)
fun KClass<SelectionManager>.setClipboard(arg0: MinecraftClient, arg1: String) = SelectionManager.method_27551(arg0, arg1)
fun SelectionManager.isSelecting() = this.method_27568()
fun SelectionManager.insert(arg0: Char) = this.method_16199(arg0)
fun SelectionManager.paste() = this.method_27554()
fun SelectionManager.moveCursorToStart(arg0: Boolean) = this.method_27553(arg0)
fun SelectionManager.delete(arg0: Int, arg1: net.minecraft.class_3728.class_7279) = this.method_42574(arg0, arg1)
fun SelectionManager.moveCursorTo(arg0: Int, arg1: Boolean) = this.method_27560(arg0, arg1)
fun SelectionManager.moveCursor(arg0: Int, arg1: Boolean, arg2: net.minecraft.class_3728.class_7279) = this.method_42575(arg0, arg1, arg2)
fun SelectionManager.moveCursorTo(arg0: Int) = this.method_35730(arg0)
fun SelectionManager.copy() = this.method_27559()
fun SelectionManager.cut() = this.method_27547()
fun SelectionManager.setSelection(arg0: Int, arg1: Int) = this.method_27548(arg0, arg1)
fun SelectionManager.insert(arg0: String) = this.method_16197(arg0)
fun SelectionManager.moveCursorPastWord(arg0: Int) = this.method_35728(arg0)
fun KClass<SelectionManager>.getClipboard(arg0: MinecraftClient) = SelectionManager.method_27556(arg0)
fun SelectionManager.selectAll() = this.method_27563()
