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
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.jvm.optionals.getOrNull
import kotlin.math.max
import net.minecraft.class_2561

class WynnListener {
    @SubscribeEvent
    fun onItemToolTip(event: ItemTooltipRenderEvent.Pre) {
        val boxItem = Models.Item.asWynnItem(event.itemStack, GearBoxItem::class.java).getOrNull() ?: return
        val possibilities = Models.Gear.getPossibleGears(boxItem)
        if(possibilities.size > 4 || possibilities.isEmpty()) return
        if(KeyBind.pressedKeys.contains("key.keyboard.left.shift") == possibilities.size < 3) return

        event.isCanceled = true

        val pad = 12
        val font = FontRenderer.getInstance().font
        val right = McUtils.mc().method_22683().method_4486()
        var x = 0
        var y = pad * 2
        var bottom = y

        if(possibilities.size < 3) {
            x = event.mouseX
            y = event.mouseY
        }

        val context = event.guiGraphics
        val stack = event.guiGraphics.method_51448()
        stack.method_22903()
        stack.method_46416(0f,0f,300f)

        possibilities.forEach {
            val builder = Handlers.Tooltip.buildNew(GearItem(it, null as GearInstance?), true, false)
            val tooltip = builder.getTooltipLines(Models.Character.classType) as MutableList<class_2561>
            val clientTooltip = TooltipUtils.getClientTooltipComponent(tooltip)
            val width = TooltipUtils.getTooltipWidth(clientTooltip, font)
            val height = TooltipUtils.getTooltipHeight(clientTooltip)

            if(x + width > right) {
                y = bottom + pad
                bottom = y
                x = 0
            }

            context.method_51434(font, tooltip, x, y)
            x += width + pad
            bottom = max(bottom, y + height)
        }
        stack.method_22909()
    }
}

val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    WynntilsMod.unregisterEventListener(wynnListener)
}
if (World.isWorldLoaded)
    Chat.toast("ItemGuide", "enabled")