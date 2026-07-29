
import me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget.MultiLine
import net.minecraft.ChatFormatting
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.gui.components.ComponentRenderUtils
import net.minecraft.nbt.CompoundTag
import net.minecraft.util.FormattedCharSequence
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.TextBuilder
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.helper.CommandContextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.NBTElementHelper
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper
import kotlin.concurrent.thread
import kotlin.jvm.optionals.getOrNull
import kotlin.math.ceil

val mc = Minecraft.getInstance()
var targetEntity: EntityHelper<*>? = null

class MyText(
    val callback: (() -> List<TextHelper>),
    x: Int = 0, y: Int = 0,
    color: Int = 0xffffff,
    zIndex: Int = 0,
    shadow: Boolean = true,
    scale: Double = 1.0,
    rotation: Float = 0f
) : Text("", x, y, color, zIndex, shadow, scale, rotation) {
    override fun extractRenderState(drawContext: GuiGraphicsExtractor, mouseX: Int, mouseY: Int, delta: Float) {
        val originalY = y
        callback.invoke().forEachIndexed { index, textHelper ->
            setText(textHelper)
            y = originalY + (index * height * 1.4).toInt()
            super.extractRenderState(drawContext, mouseX, mouseY, delta)
        }
        y = originalY

    }
}

class Cursor(val string: String, var index: Int = 0) {
    fun canRead() = string.length > index

    fun peek() = string[index]

    fun peek(sub: String): Boolean {
        if(string.startsWith(sub, index)) {
            consume(sub.length)
            return true
        } else {
            return false
        }
    }

    fun consume(len: Int) {
        index += len
    }

    fun read(): String {
        val start = index
        while (canRead()) {
            when(peek()) {
                in 'a'..'z', in 'A'..'Z', in '0'..'9',  '_'-> {
                    index++
                }
                else -> break
            }
        }
        return string.substring(start, index)
    }
}

open class NBTAccessor(var next: NBTAccessor? = null) {
    open fun access(nbt: NBTElementHelper<*>): NBTElementHelper<*>? {
        val next2 = next ?: return nbt
        return next2.access(nbt)
    }
}

class CompoundAccessor(val tag: String, next: NBTAccessor? = null) : NBTAccessor(next) {
    override fun access(nbt: NBTElementHelper<*>): NBTElementHelper<*>? {
        if(nbt.isCompound) {
            val compound = nbt.asCompoundHelper()
            val nbt2 = compound[tag]
            if(nbt2 == null) {
                if (next == null) {
                    return NBTElementHelper.wrap(
                        CompoundTag::class.java.declaredConstructors
                            .find { it.parameters.size == 1 }!!
                            .apply {
                                isAccessible = true
                            }.newInstance(mapOf(
                                *compound.keys
                                    .filter { it.startsWith(tag, true) }
                                    .map { it to compound[it]!!.raw }
                                    .toTypedArray()
                            )) as CompoundTag
                    )
                }
                compound.keys.find { tag.equals(it, true) }?.let {
                    return super.access(compound[it]!!)
                }
            }
            return nbt2?.let { super.access(it) }
        }
        return null
    }
}

class ListAccessor(val index: Int, next: NBTAccessor? = null) : NBTAccessor(next) {
    override fun access(nbt: NBTElementHelper<*>): NBTElementHelper<*>? {
        if(nbt.isList) {
            val nbt2 = nbt.asListHelper()[index] ?: return null
            return super.access(nbt2)
        }
        return null
    }
}

var path = ""
var accessor = NBTAccessor()
var currentWidth = 0

//val sign = 0xbebebe
//val white = 0xffffff
//val green = 0x008B00
//val salmon = 0xFA8072
//val darkCyan = 0x008B8B
val sign = ChatFormatting.GRAY.ordinal
val white = ChatFormatting.WHITE.ordinal
val green = ChatFormatting.GREEN.ordinal
val salmon = ChatFormatting.RED.ordinal
val darkCyan = ChatFormatting.AQUA.ordinal
fun getNBTString(nbt: NBTElementHelper<*>, out: ArrayList<TextHelper>, width: Int = 300, depth: Int = 0): TextHelper {
    if(nbt.isNull) {
        return TextBuilder().append("null").withColor(salmon).build()
    } else if(nbt.isString) {
        return TextBuilder().append("\"${nbt.asString()}\"").withColor(green).build()
    } else if(nbt.isNumber) {
        return TextBuilder().append(nbt.asNumberHelper().raw.asNumber().getOrNull()).withColor(darkCyan).build()
    }
    if(nbt.isList) {
        val list = nbt.asListHelper()
        val len = list.length()
        var tb = TextBuilder().append("[").withColor(sign)
        val end = len-1
        for(i in 0..end) {
            if(i > 0) tb.append(", ").withColor(sign)
            val text = getNBTString(list[i]!!, out, width, depth+1)
            val tw = text.width
            currentWidth += tw
            if(width != -1 && currentWidth > width) {
                out.add(tb.build())
                tb = TextBuilder()
                currentWidth = tw
            }
            tb.append(text)
        }

        return tb.append("]").withColor(sign).build()
    } else if(nbt.isCompound) {
        val compound = nbt.asCompoundHelper()
        var tb = TextBuilder().append("{").withColor(sign)

        compound.keys.forEachIndexed { index, key ->
            val tb2 = TextBuilder()
            if(index > 0) tb2.append(", ").withColor(sign)
            tb2.append(key).withColor(white).append(": ").withColor(sign).append(getNBTString(compound[key]!!, out, width, depth+1))
            val text = tb2.build()
            val tw = text.width
            currentWidth += tw
            if(width != -1 && currentWidth > width) {
                out.add(tb.build())
                tb = TextBuilder()
                currentWidth = tw
            }
            tb.append(text)
        }
        return tb.append("}").withColor(sign).build()
    }

    return TextBuilder().build()
}

val d2d = Hud.createDraw2D()
d2d.register()

val multiLine = MultiLine()

fun parseAccessor(string: String) {
    val cursor = Cursor(string)
    var compound = true
    accessor = NBTAccessor()
    var tmp = accessor

    while (cursor.canRead()) {
        if(compound) {
            val a0 = CompoundAccessor(cursor.read())
            tmp.next = a0
            tmp = a0
        } else {
            val a0 = ListAccessor(cursor.read().toInt())
            tmp.next = a0
            tmp = a0
            cursor.peek("]")
        }
        if(cursor.canRead()) {
            compound = if(cursor.peek(".")) {
                true
            } else if(cursor.peek("[")) {
                false
            } else {
                break
            }
        }
    }
}

val screen = Hud.createScreen("Peek Config", false)

(screen as IScreen).setOnInit(JavaWrapper.methodToJava { iscreen ->
    val w = iscreen.width
    val h = iscreen.height
    iscreen.addText("path: ", w / 4 - 40, h / 4, 0xffffff, true)
    iscreen.addTextInput(w / 4, h / 4, w / 2, 40, "", JavaWrapper.methodToJava { string, _ ->
        parseAccessor(string)
        targetEntity?.let {
            multiLine.setText(accessor.access(it.nbt)?.let { getNBTString(it, arrayListOf(), -1) })
        }

    })
    iscreen.setOnScroll(JavaWrapper.methodToJava { pos1, pos2 ->
        multiLine.doScroll(pos2.y)
    })
    multiLine.x = w / 4
    multiLine.y = h / 4 + 50
    multiLine.maxWidth = w / 2
    multiLine.maxLines = (iscreen.height * 4 / 5 - multiLine.y) / 15

    iscreen.reAddElement(multiLine)

    parseAccessor("")
    targetEntity?.let {
        multiLine.setText(it.nbt?.let { getNBTString(it, arrayListOf(), -1) })
    }

})

Chat.commandManager.createCommandBuilder("/peek")
    .executes(JavaWrapper.methodToJava(fun(ctx: CommandContextHelper){
        Player.interactions()?.targetedEntity?.let {
            targetEntity = it
        }
        thread {
            Client.waitTick(1)
            Hud.openScreen(screen as IScreen)
        }
    }))
    .register()

context.onContextClosed {
    d2d.unregister()
    Chat.commandManager.unregisterCommand("/peek")
}

Chat.toast("NBT Peeker", "enabled")