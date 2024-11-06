import com.wynntils.screens.guides.gear.WynntilsItemGuideScreen
import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.event.impl.inventory.EventClickSlot
import xyz.wagyourtail.jsmacros.client.api.helpers.inventory.ItemStackHelper

val regex = ": (\\d+)-(\\d+)".toRegex()

fun checkAndAdd(item: ItemStackHelper) {
    if (!item.name.string.contains("Unidentified")) {
        return search(item.name.stringStripFormatting);
    }
    var type = " "
    var lv = " "
    var tier = " "
    item.lore.forEach {
        it.stringStripFormatting.let {
            //Chat.log(it)
            if(it.startsWith("- Lv.")) {
                regex.find(it)?.groupValues?.let {
                    var min = it[1].toInt()
                    if(min != 1) min += 1
                    lv += "level:$min-${it[2]}"
                }
            } else if(it.startsWith("- Tier: ")) {
                tier += "rarity:" + it.substring("- Tier: ".length)
            } else if(it.startsWith("- Type: ")) {
                type += "gearType:" + it.substring("- Type: ".length)
            }
        }
    }
    search(type + lv + tier)
}

fun search(text: String) {
    val guide = WynntilsItemGuideScreen.create()
    Hud.openScreen(guide as IScreen)
    (guide as WynntilsItemGuideScreen).focusedTextInput.textBoxInput = text
}

EventListener(context, EventClickSlot::class.java, { e ->
    if(e.mode != 0 || e.button != 0 || !KeyBind.pressedKeys.contains("key.keyboard.left.alt")) return@EventListener
    e.inventory.getSlot(e.slot)?.let {
        if(!it.isEmpty) {
            e.cancel()
            checkAndAdd(it)
        }
    }
}, true)

Chat.toast("ItemGuide", "enabled")