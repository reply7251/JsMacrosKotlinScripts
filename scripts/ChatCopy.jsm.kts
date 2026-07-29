
import me.hellrevenger.jsmacroskotlinscript.script.library.api.CTargetType
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import org.lwjgl.glfw.GLFW
import kotlin.math.floor
import me.hellrevenger.jsmacroskotlinscript.script.library.api.MiscExtensions.waitUntilWorldLoaded
import me.hellrevenger.jsmacroskotlinscript.script.library.api._getPrivateValue
import me.hellrevenger.jsmacroskotlinscript.script.library.api._invokePrivate
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.ActiveTextCollector
import net.minecraft.client.gui.Font
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.gui.components.ChatComponent
import net.minecraft.client.gui.screens.ChatScreen
import net.minecraft.client.multiplayer.chat.GuiMessage
import net.minecraft.network.chat.Component
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper

if(!World.isWorldLoaded) {
    JsMacros.waitUntilWorldLoaded()
    Client.waitTick(10)
}

@CTransformer(ChatComponent::class)
class TransformChatHud {
    @CInject(method = [$$"extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onRender(context: GuiGraphicsExtractor, textRenderer: Font, currentTick: Int, mouseX: Int, mouseY: Int, displayMod: ChatComponent.DisplayMode, interactable: Boolean, cir: InjectionCallback) {
        try {
            clicked(mouseX.toDouble(), mouseY.toDouble())
            onRender(context, currentTick, mouseX, mouseY, interactable)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

@CTransformer(ActiveTextCollector.ClickableStyleFinder::class)
class TransformClickHandler {
    @CInject(method = ["result"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onGetStyle(cir: InjectionCallback) {
        if (isCtrlDown()) {
            cir.returnValue = null
        }
    }
}

fun getWindow() = Client.minecraft.window.handle()
fun isKeyDown(keyCode: Int) = GLFW.glfwGetKey(getWindow(), keyCode) == GLFW.GLFW_PRESS
fun isCtrlDown() = isKeyDown(GLFW.GLFW_KEY_LEFT_CONTROL)
fun isShiftDown() = isKeyDown(GLFW.GLFW_KEY_LEFT_SHIFT) || isKeyDown(GLFW.GLFW_KEY_RIGHT_SHIFT)
fun isMouseDown() = GLFW.glfwGetMouseButton(getWindow(), GLFW.GLFW_MOUSE_BUTTON_LEFT) == GLFW.GLFW_PRESS

fun getMessageAt(x: Double, y: Double): Component? {
    val mc = Client.minecraft

    val chatHud = mc.gui.hud.chat
    val windowHeight = mc.window.guiScaledHeight



    val scale = chatHud._invokePrivate<Double>("getScale", arrayOf())!!
//    val chatX = x / scale - 4
    val chatY = y / scale

    val chatBottomY = floor((windowHeight - 40) / scale).toInt()
    val chatTopY = chatBottomY - chatHud._invokePrivate<Int>("getHeight", arrayOf())!!

    if (chatY < chatTopY || chatY > chatBottomY) {
        return null
    }

    val lineHeight = chatHud._invokePrivate<Int>("getLineHeight", arrayOf())!!
    val visibleLineIndex = (chatBottomY - chatY.toInt()) / lineHeight

    val index = visibleLineIndex + chatHud._getPrivateValue<Int>("chatScrollbarPos")!!
    var messageIndex = -1
    val visibleMessages = chatHud._getPrivateValue<List<GuiMessage.Line>>("trimmedMessages")!!
    for (i in 0..index.coerceAtMost(visibleMessages.size-1)) {
        if(visibleMessages[i].endOfEntry) {
            ++messageIndex
        }
    }
    val messages = chatHud._getPrivateValue<List<GuiMessage>>("allMessages")!!
    if(messageIndex >= 0 && messageIndex < messages.size) {
        return messages[messageIndex].content
    }
    return null
}

var lastClicked = ""

fun clicked(mouseX: Double, mouseY: Double): Boolean {
    if(isMouseDown() && isCtrlDown()) {
        getMessageAt(mouseX, mouseY)?.let {
            val newClipboard = if (isShiftDown()) TextHelper.wrap(it).json else it.string
            if (newClipboard != lastClicked) {
                Client.minecraft.keyboardHandler.clipboard = newClipboard
                lastClicked = newClipboard
            }
            return true
        }
    }
    return false
}

fun onRender(context: GuiGraphicsExtractor, tick: Int, mouseX: Int, mouseY: Int, interactable: Boolean) {
    if(isCtrlDown()) {
        getMessageAt(mouseX.toDouble(), mouseY.toDouble())?.let {
            val text = if(Client.minecraft.keyboardHandler.clipboard == if (isShiftDown()) TextHelper.wrap(it).json else it.string)
                "Copied to clipboard!"
            else if (isShiftDown())
                "Click to copy json"
            else "Click to copy string"

            context.setTooltipForNextFrame(Client.minecraft.font, Component.literal(text), mouseX, mouseY)
        }
    }
}

RuntimeTransform.transformInOneStep()

Chat.log("Chat Copy enabled")