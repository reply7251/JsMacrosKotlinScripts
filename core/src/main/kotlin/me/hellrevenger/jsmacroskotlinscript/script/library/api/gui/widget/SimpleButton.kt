package me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget

import com.mojang.blaze3d.systems.RenderPass
import me.hellrevenger.jsmacroskotlinscript.script.library.api.MiscExtensions.fixColor
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.gui.components.AbstractButton
import net.minecraft.client.gui.narration.NarrationElementOutput
import net.minecraft.client.input.InputWithModifiers
import net.minecraft.network.chat.Component

open class SimpleButton(x: Int, y: Int, width: Int, height: Int, component: Component) : AbstractButton(x, y, width, height, component) {
    var callback: SimpleButton.(inputWithModifiers: InputWithModifiers?) -> Unit = {}
    open var hoveredBackgroundColor = 0xff777777.toInt()
    open var normalBackgroundColor = 0xffaaaaaa.toInt()
    var borderColor = 0xff000000.toInt()
    val relatedX = x
    val relatedY = y

    fun updatePos(parentX: Int, parentY: Int) {
        x = parentX + relatedX
        y = parentY + relatedY
    }

    override fun onPress(inputWithModifiers: InputWithModifiers) {
        callback(inputWithModifiers)
    }

    override fun extractContents(
        guiGraphics: GuiGraphicsExtractor,
        mouseX: Int,
        mouseY: Int,
        tickDelta: Float
    ) {
        drawBackground(guiGraphics, mouseX, mouseY, tickDelta)
        drawForeground(guiGraphics, mouseX, mouseY, tickDelta)
    }

    protected open fun drawForeground(
        guiGraphics: GuiGraphicsExtractor,
        mouseX: Int,
        mouseY: Int,
        tickDelta: Float
    ) {
        extractDefaultLabel(guiGraphics.textRenderer())
    }

    protected open fun drawBackground(
        guiGraphics: GuiGraphicsExtractor,
        mouseX: Int,
        mouseY: Int,
        tickDelta: Float
    ) {
        if (isHovered(mouseX, mouseY)) {
            guiGraphics.fill(x, y, x + width,y + height, hoveredBackgroundColor)
        } else {
            guiGraphics.fill(x, y, x + width, y + height, normalBackgroundColor)
        }
        guiGraphics.outline(x, y, width, height, borderColor)
    }

    override fun isHovered(): Boolean {
        return isActive && super.isHovered()
    }

    override fun isMouseOver(d: Double, e: Double): Boolean {
        return isActive && super.isMouseOver(d, e)
    }

    fun isHovered(mouseX: Int, mouseY: Int) = isActive && mouseX > x && mouseX < x + width && mouseY > y && mouseY < y + height

    override fun updateWidgetNarration(narrationElementOutput: NarrationElementOutput) { }

    fun setText(text: String) {
        setMessage(Component.literal(text))
    }

    open class Builder {
        var x: Int = 0
        var y: Int = 0
        var width: Int = 100
        var height: Int = 20
        var component: Component = Component.literal("")
        var callback: SimpleButton.(inputWithModifiers: InputWithModifiers?) -> Unit = {}
        var hoveredBackgroundColor = 0xff999999u
            set(value) {
                field = value.fixColor()
            }
        var normalBackgroundColor = 0xff777777u
            set(value) {
                field = value.fixColor()
            }
        var borderColor = 0xff000000u
            set(value) {
                field = value.fixColor()
            }

        fun setText(text: String): Builder {
            component = Component.literal(text)
            return this
        }

        fun bounds(x: Int, y: Int, width: Int, height: Int): Builder {
            this.x = x
            this.y = y
            this.width = width
            this.height = height
            return this
        }

        fun bounds(area: RenderPass.RenderArea): Builder {
            this.x = area.x
            this.y = area.y
            this.width = area.width
            this.height = area.height
            return this
        }

        open fun build() = SimpleButton(x, this@Builder.y, this@Builder.width, this@Builder.height, component).apply {
            callback = this@Builder.callback
            hoveredBackgroundColor = this@Builder.hoveredBackgroundColor.toInt()
            normalBackgroundColor = this@Builder.normalBackgroundColor.toInt()
            borderColor = this@Builder.borderColor.toInt()
        }
    }
}

fun buildSimpleButton(builder: SimpleButton.Builder.() -> Unit) =
    SimpleButton.Builder().apply(builder).build()
fun buildSimpleTransparentButton(borderColor: UInt = 0xff000000u, builder: SimpleButton.Builder.() -> Unit) =
    buildSimpleButton {
        this@buildSimpleButton.borderColor = borderColor
        normalBackgroundColor = 0u
        hoveredBackgroundColor = 0xaaaaaaaau
        builder()
    }