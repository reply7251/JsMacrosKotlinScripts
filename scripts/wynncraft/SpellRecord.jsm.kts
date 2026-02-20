@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.models.spells.event.SpellEvent
import net.minecraft.class_332
import net.neoforged.bus.api.SubscribeEvent
import org.jetbrains.kotlin.konan.util.visibleName
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text

class MultiLineText(val d2d: Draw2D, val x: Int, val y: Int, val color: Int = 0xffffff) : RenderElement {
    val texts = arrayListOf<Text>()
    var currentText: String = ""
    var hidden = false
    var autoHide = -1L
    var lastUpdate = 0L

    fun setText(text: String) {
        val text = text.trim()
        if (text == currentText) return
        d2d.reAddElement(this)
        lastUpdate = Time.time()
        currentText = text

        val lines = currentText.lines()

        for (i in 0..<lines.size) {
            if (i >= texts.size) {
                texts.add(Text(lines[i], x, y + texts.size * 10, color, 0, true, 1.0, 0f))
            } else {
                texts[i].setText(lines[i])
            }
        }
        for (i in lines.size..<texts.size) {
            texts[i].setText("")
        }
    }

    fun appendInNewLine(text: String) {
        setText("$currentText\n$text")
    }

    override fun getZIndex() = 0

    override fun method_25394(context: class_332, mouseX: Int, mouseY: Int, delta: Float) {
        if(hidden) return
        if (autoHide != -1L && lastUpdate + autoHide < Time.time()) return
        synchronized(texts) {
            texts.forEach {
                it.method_25394(context, mouseX, mouseY, delta)
            }
        }
    }
}
val d2d = Hud.createDraw2D()
d2d.register()
val multiLineText = MultiLineText(d2d, 500, 50)
multiLineText.autoHide = 10_000

val spells = mutableListOf<String>()

class WynnListener {
    @SubscribeEvent
    fun onSpell(event: SpellEvent.Cast) {
        spells.add("${if (event.manaCost == 1 && event.spellType.spellNumber != 2) "§2" else ""}${if(event.manaCost < 10) "  " else ""}${event.manaCost} §r${event.spellType.name}")
        if (spells.size > 40) {
            spells.removeFirst()
        }
        multiLineText.setText(spells.joinToString("\n"))
    }
}

val listener = WynnListener()
WynntilsMod.registerEventListener(listener)

context.onContextClosed {
    d2d.unregister()
    WynntilsMod.unregisterEventListener(listener)
}