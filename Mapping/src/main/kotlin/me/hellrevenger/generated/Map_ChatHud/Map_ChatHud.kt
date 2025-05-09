package me.hellrevenger.generated.Map_ChatHud
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_2061
 */
val ChatHud.messages by alias(ChatHud::field_2061)
/**
 * method_1808
 */
fun ChatHud.clear(clearHistory: Boolean) = this.method_1808(clearHistory)
/**
 * method_1820
 */
fun ChatHud.resetScroll() = this.method_1820()
/**
 * method_58743
 */
fun ChatHud.restoreChatState(state: net.minecraft.class_338.class_9477) = this.method_58743(state)
/**
 * method_45584
 */
fun ChatHud.tickRemovalQueueIfExists() = this.method_45584()
/**
 * method_1803
 */
fun ChatHud.addToMessageHistory(message: String) = this.method_1803(message)
/**
 * method_1816
 */
fun ChatHud.getTextStyleAt(x: Double, arg1: Double) = this.method_1816(x, arg1)
/**
 * method_1812
 */
fun ChatHud.addMessage(message: Text) = this.method_1812(message)
/**
 * method_1813
 */
fun ChatHud.getVisibleLineCount() = this.method_1813()
/**
 * method_1809
 */
fun ChatHud.getMessageHistory() = this.method_1809()
/**
 * method_44723
 */
fun ChatHud.getIndicatorAt(mouseX: Double, arg1: Double) = this.method_44723(mouseX, arg1)
/**
 * method_44811
 */
fun ChatHud.addMessage(message: Text, signatureData: MessageSignatureData, indicator: MessageIndicator) = this.method_44811(message, signatureData, indicator)
/**
 * method_1819
 */
fun ChatHud.isChatFocused() = this.method_1819()
/**
 * method_1811
 */
fun ChatHud.getWidth() = this.method_1811()
/**
 * method_27146
 */
fun ChatHud.mouseClicked(mouseX: Double, arg1: Double) = this.method_27146(mouseX, arg1)
/**
 * method_58745
 */
fun ChatHud.toChatState() = this.method_58745()
/**
 * method_1802
 */
fun ChatHud.scroll(scroll: Int) = this.method_1802(scroll)
/**
 * method_1810
 */
fun ChatHud.getHeight() = this.method_1810()
/**
 * method_1805
 */
fun ChatHud.render(context: DrawContext, currentTick: Int, mouseX: Int, mouseY: Int, focused: Boolean) = this.method_1805(context, currentTick, mouseX, mouseY, focused)
/**
 * method_1817
 */
fun ChatHud.reset() = this.method_1817()
/**
 * method_1814
 */
fun ChatHud.getChatScale() = this.method_1814()
/**
 * method_44812
 */
fun ChatHud.removeMessage(signature: MessageSignatureData) = this.method_44812(signature)
