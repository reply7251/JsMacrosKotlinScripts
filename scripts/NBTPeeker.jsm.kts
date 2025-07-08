import me.hellrevenger.generated.*
import me.hellrevenger.library.api.WorldPosWrapper
import net.minecraft.class_332
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.TextBuilder
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.helper.CommandContextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.NBTElementHelper
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper
import kotlin.concurrent.thread
import kotlin.math.ceil


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
    override fun method_25394(drawContext: class_332, mouseX: Int, mouseY: Int, delta: Float) {
        val originalY = y
        callback.invoke().forEachIndexed { index, textHelper ->
            setText(textHelper)
            y = originalY + (index * height * 1.4).toInt()
            super.method_25394(drawContext, mouseX, mouseY, delta)
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
            if(nbt2 == null && next == null) {
                return NBTElementHelper.wrap(NbtCompound(mapOf(*compound.keys
                    .filter { it.startsWith(tag, true) }
                    .map { it to compound[it]!!.raw }
                    .toTypedArray())))
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

fun getNBT(entity: EntityHelper<*>): List<TextHelper> {
    val nbt = accessor.access(entity.nbt) ?: return listOf()
    val list = arrayListOf<TextHelper>()
    list.add(getNBTString(nbt, list))
    return list
}

val sign = 0xbebebe
val white = 0xffffff
val green = 0x008B00
val salmon = 0xFA8072
val darkCyan = 0x008B8B
fun getNBTString(nbt: NBTElementHelper<*>, out: ArrayList<TextHelper>, width: Int = 300, depth: Int = 0): TextHelper {
    if(nbt.isNull) {
        return TextBuilder().withColor(green).append("null").build()
    } else if(nbt.isString) {
        return TextBuilder().withColor(salmon).append(nbt.asString()).build()
    } else if(nbt.isNumber) {
        return TextBuilder().withColor(darkCyan).append(nbt.asNumberHelper().raw.method_10702()).build()
    }
//    if(depth > 0) {
//        if(nbt.isList) {
//            return if(nbt.asListHelper().length() > 0)
//                TextBuilder().withColor(sign).append("[").withColor(white).append("...").withColor(sign).append("]").build()
//            else TextBuilder().withColor(sign).append("[]").build()
//        } else if(nbt.isCompound) {
//            return if(nbt.asCompoundHelper().keys.isNotEmpty())
//                TextBuilder().withColor(sign).append("[").withColor(white).append("...").withColor(sign).append("}").build()
//            else TextBuilder().withColor(sign).append("{}").build()
//        }
//        return TextBuilder().build()
//    }
    if(nbt.isList) {
        val list = nbt.asListHelper()
        val len = list.length()
        var tb = TextBuilder().withColor(sign).append("[")
        val end = len-1
        for(i in 0..end) {
            if(i > 0) tb.withColor(sign).append(", ")
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

        return tb.withColor(sign).append("]").build()
    } else if(nbt.isCompound) {
        val compound = nbt.asCompoundHelper()
        var tb = TextBuilder().withColor(sign).append("{")

        compound.keys.forEachIndexed { index, key ->
            val tb2 = TextBuilder()
            if(index > 0) tb2.withColor(sign).append(", ")
            tb2.withColor(salmon).append(key).withColor(sign).append(": ").append(getNBTString(compound[key]!!, out, width, depth+1))
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
        return tb.withColor(sign).append("}").build()
    }

    return TextBuilder().build()
}

fun onLoadEntity(entity: EntityHelper<*>) {
    val d2d2 = Hud.createDraw2D()
    d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
    d2d2.reAddElement(MyText({ getNBT(entity) }, 9, -16))

    WorldPosWrapper(d2d2).bind(entity).move(Pos3D(0.0, 0.5, 0.0)).addToDraw2d(d2d)
}
val d2d = Hud.createDraw2D()
d2d.register()

//JsMacros.on("EntityLoad", JavaWrapper.methodToJava<BaseEvent, EventContainer<*>, Any>({ event: EventEntityLoad, ctx: EventContainer<*> ->
//    onLoadEntity(event.entity)
//}))
//
//World.entities?.forEach {
//    onLoadEntity(it)
//}

class MultiLine {
    var x = 0
    var y = 0
    var maxLines = 12
    var maxWidth = 1000
    var scroll = 0
    var textCache = Chat.createTextBuilder().build()
    var rawTextCache = ""
    var predictLinesCache = 1

    fun doScroll(value: Double) {
        if(value < 0 && scroll < predictLinesCache - maxLines) {
            scroll += 1
        } else if (value > 0 && scroll > 0){
            scroll -= 1
        }
        updateText()
    }

    fun predictLines(): Int {
        predictLinesCache = ceil(getWidth(rawTextCache) / maxWidth.toDouble()).toInt() + 1
        if(predictLinesCache < 0) predictLinesCache = 1
        return predictLinesCache
    }

    fun updateText() {
        val lines = Math.min(predictLinesCache, maxLines)
        val iscreen = (screen as IScreen)
        val texts = iscreen.elements.filterIsInstance<Text>()
        val offset = rawTextCache.length / predictLinesCache
        texts.forEachIndexed { index, renderElement ->
            val line = index - 1
            if(line < 0) return@forEachIndexed
            val start = Math.min((line + scroll) * offset, rawTextCache.length)
            val end = Math.min((line+scroll+1) * offset, rawTextCache.length)

            renderElement.setText(if(line <= lines) rawTextCache.substring(start, end) else "")
        }
    }

    fun setText(text: TextHelper?) {
        textCache = text ?: Chat.createTextBuilder().build()
        rawTextCache = textCache.stringStripFormatting
        val predictLines = predictLines()
        val lines = Math.min(predictLines, maxLines)
        val iscreen = (screen as IScreen)
        val texts = iscreen.elements.filterIsInstance<Text>()
        val from = (texts.size - 1)
        val to = lines
        for(line in from .. to) {
            iscreen.addText("", x, y + line * 15, 0xffffff, true)
        }
        updateText()
    }

    fun getWidth(text: String) = Client.minecraft.field_1772.method_1727(text)
}
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
    val hw = iscreen.width / 2
    val hh = iscreen.height / 2
    iscreen.addText("path: ", hw - 200, hh, 0xffffff, true)
    iscreen.addTextInput(hw - 160, hh, 360, 40, "", JavaWrapper.methodToJava { string, _ ->
        parseAccessor(string)
        targetEntity?.let {
            multiLine.setText(accessor.access(it.nbt)?.let { getNBTString(it, arrayListOf(), -1) })
        }

    })
    iscreen.setOnScroll(JavaWrapper.methodToJava { pos1, pos2 ->
        multiLine.doScroll(pos2.y)
    })
    multiLine.x = hw - 200
    multiLine.y = hh + 50
    multiLine.maxWidth = hw * 2 / 3
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