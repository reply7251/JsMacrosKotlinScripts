package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChatHud

fun ChatHud.clear(arg0: Boolean) = this.method_1808(arg0)
fun ChatHud.resetScroll() = this.method_1820()
fun ChatHud.restoreChatState(arg0: net.minecraft.class_338.class_9477) = this.method_58743(arg0)
fun ChatHud.tickRemovalQueueIfExists() = this.method_45584()
fun ChatHud.addToMessageHistory(arg0: String) = this.method_1803(arg0)
fun ChatHud.getTextStyleAt(arg0: Double, arg1: Double) = this.method_1816(arg0, arg1)
fun ChatHud.addMessage(arg0: Text) = this.method_1812(arg0)
fun ChatHud.getVisibleLineCount() = this.method_1813()
fun KClass<ChatHud>.getWidth(arg0: Double) = ChatHud.method_1806(arg0)
fun KClass<ChatHud>.getHeight(arg0: Double) = ChatHud.method_1818(arg0)
fun ChatHud.getIndicatorAt(arg0: Double, arg1: Double) = this.method_44723(arg0, arg1)
fun ChatHud.addMessage(arg0: Text, arg1: MessageSignatureData, arg2: MessageIndicator) = this.method_44811(arg0, arg1, arg2)
fun ChatHud.isChatFocused() = this.method_1819()
fun ChatHud.getWidth() = this.method_1811()
fun ChatHud.mouseClicked(arg0: Double, arg1: Double) = this.method_27146(arg0, arg1)
fun ChatHud.toChatState() = this.method_58745()
fun ChatHud.scroll(arg0: Int) = this.method_1802(arg0)
fun ChatHud.getHeight() = this.method_1810()
fun ChatHud.render(arg0: DrawContext, arg1: Int, arg2: Int, arg3: Int, arg4: Boolean) = this.method_1805(arg0, arg1, arg2, arg3, arg4)
fun ChatHud.reset() = this.method_1817()
fun KClass<ChatHud>.getDefaultUnfocusedHeight() = ChatHud.method_41831()
fun ChatHud.getChatScale() = this.method_1814()
fun ChatHud.removeMessage(arg0: MessageSignatureData) = this.method_44812(arg0)
