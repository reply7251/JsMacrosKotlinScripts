package me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.gui.components.ComponentRenderUtils
import net.minecraft.util.FormattedCharSequence
import xyz.wagyourtail.jsmacros.client.api.classes.TextBuilder
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper

@Suppress("UNUSED")
class MultiLine(
    var x: Int = 0,
    var y: Int = 0,
    var maxWidth: Int = 1000,
    var maxLines: Int = 12,
    var z: Int = 0,
    var lineHeight: Int = 15,
    fontScale: Float = 1f,
) : RenderElement {
    companion object {
        private val mc = Minecraft.getInstance()
    }

    private var fontScale = if (fontScale == 0f) 1f else fontScale
        set(value) {
            if (value != 0f)
                field = value
        }

    private var lines: List<FormattedCharSequence> = listOf()
    private var scroll = 0

    fun doScroll(value: Double) {
        if(value < 0 && scroll < lines.size - maxLines) {
            scroll += 1
        } else if (value > 0 && scroll > 0){
            scroll -= 1
        }
    }

    fun setText(text: TextHelper?) {
        lines = ComponentRenderUtils.wrapComponents((text ?: TextBuilder().build()).raw, (maxWidth / fontScale).toInt(), mc.font)
    }

    override fun getZIndex() = z

    override fun extractRenderState(
        graphics: GuiGraphicsExtractor,
        mouseX: Int,
        mouseY: Int,
        a: Float
    ) {
        val context = graphics.pose();
        context.pushMatrix()
        context.translate(x.toFloat(), y.toFloat())
        context.scale(fontScale)
        context.translate(-x.toFloat(), -y.toFloat())

        val renderer = graphics.textRenderer()
        for (i in scroll..<(scroll+maxLines).coerceAtMost(lines.size)) {
            renderer.accept(x, y + (i - scroll) * lineHeight, lines[i])
        }

        context.popMatrix()
    }
}