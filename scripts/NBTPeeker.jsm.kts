import me.hellrevenger.generated.*
import me.hellrevenger.library.api.WorldPosWrapper
import me.hellrevenger.library.impl.FWrapper
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
import net.minecraft.class_332
import xyz.wagyourtail.jsmacros.client.api.classes.TextBuilder
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.helpers.CommandContextHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.NBTElementHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread


class MyText(val callback: (() -> List<TextHelper>), x: Int = 0, y: Int = 0, color: Int = 0xffffff,
             zIndex: Int = 0, shadow: Boolean = true, scale: Double = 1.0, rotation: Float = 0f)
    : Text("", x, y, color, zIndex, shadow, scale, rotation) {
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
                    .filter { it.startsWith(tag) }
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
    if(depth > 0) {
        if(nbt.isList) {
            return if(nbt.asListHelper().length() > 0)
                TextBuilder().withColor(sign).append("[").withColor(white).append("...").withColor(sign).append("]").build()
            else TextBuilder().withColor(sign).append("[]").build()
        } else if(nbt.isCompound) {
            return if(nbt.asCompoundHelper().keys.isNotEmpty())
                TextBuilder().withColor(sign).append("[").withColor(white).append("...").withColor(sign).append("}").build()
            else TextBuilder().withColor(sign).append("{}").build()
        } else if(nbt.isNull) {
            return TextBuilder().withColor(green).append("null").build()
        } else if(nbt.isString) {
            return TextBuilder().withColor(salmon).append(nbt.asString()).build()
        } else if(nbt.isNumber) {
            return TextBuilder().withColor(darkCyan).append(nbt.asNumberHelper().raw.toString()).build()
        }
        return TextBuilder().build()
    }
    if(nbt.isList) {
        val list = nbt.asListHelper()
        val len = list.length()
        var tb = TextBuilder().withColor(sign).append("[")
        /*
        arrayOfNulls<Int>(len).forEachIndexed { i, _ ->
            if(i > 0) tb.withColor(sign).append(", ")
            val text = getNBTString(nbt, out, depth+1)
            val tw = text.width
            currentWidth += tw
            if(currentWidth > width) {
                out.add(tb.build())
                tb = TextBuilder()
                currentWidth = tw
            }
            tb.append(text)
        }

         */
        tb.withColor(sign).append("]")
        return tb.build()
    } else if(nbt.isCompound) {
        val compound = nbt.asCompoundHelper()
        var tb = TextBuilder().withColor(sign).append("{")

        compound.keys.forEachIndexed { index, key ->
            val tb2 = TextBuilder()
            if(index > 0) tb2.withColor(sign).append(", ")
            tb2.withColor(salmon).append(key).withColor(sign).append(": ").append(getNBTString(compound[key]!!, out, depth+1))
            val text = tb2.build()
            val tw = text.width
            currentWidth += tw
            if(currentWidth > width) {
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

JsMacros.on("EntityLoad", JavaWrapper.methodToJava<BaseEvent, EventContainer<*>, Any>({ event: EventEntityLoad, ctx: EventContainer<*> ->
    onLoadEntity(event.entity)
}))

World.entities?.forEach {
    onLoadEntity(it)
}

val screen = Hud.createScreen("Peek Config", false)

(screen as IScreen).setOnInit(JavaWrapper.methodToJava { iscreen ->
    val hw = iscreen.width / 2
    val hh = iscreen.height / 2
    iscreen.addText("path: ", hw - 200, hh, 0xffffff, true)
    iscreen.addTextInput(hw - 160, hh, 360, 40, "", JavaWrapper.methodToJava { string, b ->
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
    })
})

Chat.commandManager.createCommandBuilder("/peek")
    .executes(JavaWrapper.methodToJava(fun(ctx: CommandContextHelper){
        thread {
            Client.waitTick(1)
            Hud.openScreen(screen as IScreen)
        }
    }))
    .register()

(event as EventService).stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    d2d.unregister()
    EventCenter.unregisterEvent(context.ctx, ClientEntityEvents.ENTITY_UNLOAD)
    Chat.commandManager.unregisterCommand("/peek")
} as Function0<*>)
Chat.toast("NBT Peeker", "enabled")