import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.MiscExtensions.waitUntilWorldLoaded
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.api._invokePrivate
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.minecraft.class_2561
import net.minecraft.class_338
import net.minecraft.class_332
import org.lwjgl.glfw.GLFW
import kotlin.math.floor
import net.minecraft.class_303.class_7590
import net.minecraft.class_303
import com.jsmacrosce.jsmacros.client.api.helper.TextHelper
import net.minecraft.class_12225
import net.minecraft.class_327

if(!World.isWorldLoaded) {
    JsMacros.waitUntilWorldLoaded()
    Client.waitTick(10)
}

object TransformCallback {
    var clicked = { _: Double, _: Double -> false }
    var onRender = { _: class_332, _: Int, _: Int, _: Int, _: Boolean -> }
    var getStyle = { false }
}

@CTransformer(class_338::class)
class TransformChatHud {
    @CInject(method = ["method_75804"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onRender(context: class_332, textRenderer: class_327, currentTick: Int, mouseX: Int, mouseY: Int, interactable: Boolean, idk: Boolean, cir: InjectionCallback) {
        try {
            if(interactable) {
                TransformCallback.clicked(mouseX.toDouble(), mouseY.toDouble())
            }
            TransformCallback.onRender(context, currentTick, mouseX, mouseY, interactable)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

@CTransformer(class_12225.class_12226::class)
class TransformClickHandler {
    @CInject(method = ["method_75777"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onGetStyle(cir: InjectionCallback) {
        if (TransformCallback.getStyle()) {
            cir.returnValue = null
        }
    }
}

fun getWindow() = Client.minecraft.method_22683().method_4490()
fun isKeyDown(keyCode: Int) = GLFW.glfwGetKey(getWindow(), keyCode) == GLFW.GLFW_PRESS
fun isCtrlDown() = isKeyDown(GLFW.GLFW_KEY_LEFT_CONTROL)
fun isShiftDown() = isKeyDown(GLFW.GLFW_KEY_LEFT_SHIFT) || isKeyDown(GLFW.GLFW_KEY_RIGHT_SHIFT)
fun isMouseDown() = GLFW.glfwGetMouseButton(getWindow(), GLFW.GLFW_MOUSE_BUTTON_LEFT) == GLFW.GLFW_PRESS

fun getMessageAt(x: Double, y: Double): class_2561? {
    val mc = Client.minecraft
    val chatHud = mc.field_1705.method_1743()
    val windowHeight = mc.method_22683().method_4502()



    val scale = chatHud._invokePrivate<Double>("method_1814", arrayOf())!!
//    val chatX = x / scale - 4
    val chatY = y / scale

    val chatBottomY = floor((windowHeight - 40) / scale).toInt()
    val chatTopY = chatBottomY - chatHud._invokePrivate<Int>("method_1810", arrayOf())!!

    if (chatY < chatTopY || chatY > chatBottomY) {
        return null
    }

    val lineHeight = chatHud._invokePrivate<Int>("method_44752", arrayOf())!!
    val visibleLineIndex = (chatBottomY - chatY.toInt()) / lineHeight

    val index = visibleLineIndex + chatHud._getPrivateValue<Int>("field_2066")!!
    var messageIndex = -1
    val visibleMessages = chatHud._getPrivateValue<List<class_7590>>("field_2064")!!
    for (i in 0..index.coerceAtMost(visibleMessages.size-1)) {
        if(visibleMessages[i].comp_898()) {
            ++messageIndex
        }
    }
    val messages = chatHud._getPrivateValue<List<class_303>>("field_2061")!!
    if(messageIndex >= 0 && messageIndex < messages.size) {
        return messages[messageIndex].comp_893()
    }
    return null
}

fun getMessageAtV2(x: Double, y: Double): class_2561? {
    val mc = Client.minecraft
    val chatHud = mc.field_1705.method_1743()
    val lineX = chatHud._invokePrivate<Int>("method_44722", arrayOf(x))!!
    val lineY = chatHud._invokePrivate<Int>("method_44724", arrayOf(y))!!
    val index = chatHud._invokePrivate<Int>("method_44725", arrayOf(lineX, lineY))!!
//    val index2 = chatHud._invokePrivate<Int>("method_45588", arrayOf(lineX, lineY))!!
    var messageIndex = -1
    val visibleMessages = chatHud._getPrivateValue<List<class_7590>>("field_2064")!!
    for (i in 0..index) {
        if(visibleMessages[i].comp_898()) {
            ++messageIndex
        }
    }
    val messages = chatHud._getPrivateValue<List<class_303>>("field_2061")!!
    if(messageIndex >= 0 && messageIndex < messages.size) {
        return messages[messageIndex].comp_893()
    }
    return null
}
var lastClicked = ""
TransformCallback.clicked = callback@ { mouseX, mouseY ->
    if(isMouseDown() && isCtrlDown()) {
        getMessageAt(mouseX, mouseY)?.let {
            val newClipboard = if (isShiftDown()) TextHelper.wrap(it).json else it.string
            if (newClipboard != lastClicked) {
                Client.minecraft.field_1774.method_1455(newClipboard)
                lastClicked = newClipboard
            }
            return@callback true
        }
    }
    false
}

TransformCallback.onRender = { context: class_332, tick: Int, mouseX: Int, mouseY: Int, interactable: Boolean ->
    if(isCtrlDown()) {
        getMessageAt(mouseX.toDouble(), mouseY.toDouble())?.let {
            val text = if(Client.minecraft.field_1774.method_1460() == if (isShiftDown()) TextHelper.wrap(it).json else it.string)
                "Copied to clipboard!"
            else if (isShiftDown())
                "Click to copy json"
            else "Click to copy string"

            context.method_51438(Client.minecraft.field_1772, class_2561.method_43470(text), mouseX, mouseY)
        }
    }
}

TransformCallback.getStyle = ::isCtrlDown

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformChatHud::class)
RuntimeTransform.addTransformer(TransformClickHandler::class)
RuntimeTransform.transform()