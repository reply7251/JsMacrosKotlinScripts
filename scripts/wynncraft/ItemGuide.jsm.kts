@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Handlers
import com.wynntils.core.components.Models
import com.wynntils.mc.event.ItemTooltipRenderEvent
import com.wynntils.models.gear.type.GearInstance
import com.wynntils.models.items.items.game.GearBoxItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.utils.mc.McUtils
import com.wynntils.utils.mc.TooltipUtils
import com.wynntils.utils.render.FontRenderer
import me.hellrevenger.generated.Map_DrawContext.drawTooltip
import me.hellrevenger.generated.Map_DrawContext.getMatrices
import me.hellrevenger.generated.Map_MatrixStack.pop
import me.hellrevenger.generated.Map_MatrixStack.push
import me.hellrevenger.generated.Map_MatrixStack.translate
import me.hellrevenger.generated.Map_MinecraftClient.getWindow
import me.hellrevenger.generated.Map_Window.getScaledWidth
import me.hellrevenger.generated.Text
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.jvm.optionals.getOrNull
import kotlin.math.max

class WynnListener {
    @SubscribeEvent
    fun onItemToolTip(event: ItemTooltipRenderEvent.Pre) {
        val boxItem = Models.Item.asWynnItem(event.itemStack, GearBoxItem::class.java).getOrNull() ?: return
        val possibilities = Models.Gear.getPossibleGears(boxItem)
        if(possibilities.size > 10 || possibilities.isEmpty()) return
        if(KeyBind.pressedKeys.contains("key.keyboard.left.shift") == possibilities.size < 3) return

        event.isCanceled = true

        val pad = 12
        val font = FontRenderer.getInstance().font
        val right = McUtils.mc().getWindow().getScaledWidth()
        var x = 0
        var y = pad * 2
        var bottom = y

        if(possibilities.size < 3) {
            x = event.mouseX
            y = event.mouseY
        }

        val context = event.guiGraphics
        val stack = event.guiGraphics.getMatrices()
        stack.push()
        stack.translate(0f,0f,300f)

        possibilities.forEach {
            val builder = Handlers.Tooltip.buildNew(GearItem(it, null as GearInstance?), true, false)
            val tooltip = builder.getTooltipLines(Models.Character.classType) as MutableList<Text>
            val clientTooltip = TooltipUtils.getClientTooltipComponent(tooltip)
            val width = TooltipUtils.getTooltipWidth(clientTooltip, font)
            val height = TooltipUtils.getTooltipHeight(clientTooltip)

            if(x + width > right) {
                y = bottom + pad
                bottom = y
                x = 0
            }

            context.drawTooltip(font, tooltip, x, y)
            x += width + pad
            bottom = max(bottom, y + height)
        }
        stack.pop()
    }
}

val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    WynntilsMod.unregisterEventListener(wynnListener)
}

Chat.toast("ItemGuide", "enabled")