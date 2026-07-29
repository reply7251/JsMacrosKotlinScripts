package me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget

import me.hellrevenger.jsmacroskotlinscript.script.library.api.MiscExtensions.fixColor
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.input.InputWithModifiers
import net.minecraft.network.chat.Component

class ToggleButton(
    x: Int, y: Int, width: Int, height: Int,
    val options: List<Component>, colors: List<UInt>, defaultValue: Int,
) : SimpleButton(x, y, width, height, options[defaultValue]) {
    private var currentValue: Int = defaultValue
    private val colors = colors.map { it.fixColor().toInt() }

    var currentOption = options[defaultValue]
    private var currentColor = this.colors[currentValue]

    var updateRate = -1
    var updateCallback: (() -> Int?)? = null
    private var nextUpdate = if(updateRate > 0) hashCode() % updateRate else 0

    init {
        if (options.size != colors.size)
            throw IllegalArgumentException("colors array must have size ${options.size}, but got ${colors.size}")
    }

    override fun onPress(inputWithModifiers: InputWithModifiers) {
        currentValue++

        update()

        super.onPress(inputWithModifiers)
    }

    fun update() {
        currentValue %= options.size

        currentOption = options[currentValue]
        currentColor = colors[currentValue]
    }

    override fun drawBackground(guiGraphics: GuiGraphicsExtractor, mouseX: Int, mouseY: Int, tickDelta: Float) {
        super.drawBackground(guiGraphics, mouseX, mouseY, tickDelta)
        if (updateRate > 0) {
            if (nextUpdate-- < 0) {
                nextUpdate = updateRate
                updateCallback?.invoke()?.let {
                    currentValue = it
                    update()
                }
            }
        }
        guiGraphics.fill(x, y, x + width, y + height, currentColor)
    }

    override fun drawForeground(guiGraphics: GuiGraphicsExtractor, mouseX: Int, mouseY: Int, tickDelta: Float) {
        extractScrollingStringOverContents(guiGraphics.textRenderer(), currentOption, 2)
    }

    class Builder : SimpleButton.Builder() {
        var options = listOf<Component>()
        var colors = listOf<UInt>()
        var defaultValue = 0

        var updateRate = -1
        var updateCallback: (() -> Int?)? = null

        fun withOptions(vararg options: String) {
            this.options = options.map(Component::literal)
        }

        override fun build() = ToggleButton(
            x, this@Builder.y, this@Builder.width, this@Builder.height,
            options, colors.map { it.fixColor() },
            defaultValue
        ).apply {
            callback = this@Builder.callback
            hoveredBackgroundColor = this@Builder.hoveredBackgroundColor.toInt()
            normalBackgroundColor = this@Builder.normalBackgroundColor.toInt()
            borderColor = this@Builder.borderColor.toInt()
            updateRate = this@Builder.updateRate
            updateCallback = this@Builder.updateCallback
        }
    }
}

fun buildToggleButton(builder: ToggleButton.Builder.() -> Unit) =
    ToggleButton.Builder().apply(builder).build()