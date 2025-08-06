@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.components.Models
import com.wynntils.features.inventory.ContainerSearchFeature
import xyz.wagyourtail.jsmacros.client.access.IInventory
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Rect
import xyz.wagyourtail.jsmacros.client.api.event.impl.inventory.EventClickSlot
import xyz.wagyourtail.jsmacros.client.api.event.impl.inventory.EventOpenContainer
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventOpenScreen
import xyz.wagyourtail.jsmacros.client.api.helper.NBTElementHelper
import xyz.wagyourtail.jsmacros.client.api.helper.StyleHelper
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.inventory.ItemStackHelper
import java.util.regex.Pattern
import kotlin.math.max
import kotlin.math.min

val maxstacklist = mapOf(
    "Persnickety" to  1,
    "Picky Looter" to  15,
    "Heavensent" to  15,
    "Slowrunner" to  1,
    "Clockworker" to  15,
    "Looter" to  15,
    "Serendipity" to  15,
    "Bad Omen" to  10,
    "Midas Touch" to  8,
    "Killstreak" to  100,
    "Persistent Champion" to  15,
    "Patient Champion" to  1,
    "Parsimonious" to  10,
    "Madman" to  8,
    "Lightbringer" to  5,
    "Mob Slaughter" to  12,
    "Retrograde Champion" to  10
)

val descriptions = mapOf(
    "Persnickety" to "Offered Blue/Purple Beacon >6",
    "Picky Looter" to "Yellow Beacon offer.",
    "Heavensent" to "Any Beacon offer.",
    "Slowrunner" to "Timer <6m",
    "Clockworker" to "Timer min left.",
    "Looter" to "4 Chest items.",
    "Serendipity" to "Open Chest.",
    "Bad Omen" to "Get Curse.",
    "Midas Touch" to "Get Boon.",
    "Killstreak" to "Kill 3 Mobs, 60s.",
    "Persistent Champion" to "Complete Challenge.",
    "Patient Champion" to "5 Challenges.",
    "Parsimonious" to "4 Chest items.",
    "Madman" to "Current Curse.",
    "Lightbringer" to "Current Boon.",
    "Mob Slaughter" to "5 Mobs kill.",
    "Retrograde Champion" to "Challenge complete."
)

val list_colorcode = mapOf(
    '0' to 0x000000,
    '1' to 0x0000AA,
    '2' to 0x00AA00,
    '3' to 0x00AAAA,
    '4' to 0xAA0000,
    '5' to 0xAA00AA,
    '6' to 0xFFAA00,
    '7' to 0xAAAAAA,
    '8' to 0x555555,
    '9' to 0x5555FF,
    'a' to 0x55FF55,
    'b' to 0x55FFFF,
    'c' to 0xFF5555,
    'd' to 0xFF55FF,
    'e' to 0xFFFF55,
)


val boonsPattern = Pattern.compile("\uDAFF\uDFF5\uE008")
val missionPattern = Pattern.compile("\uDAFF\uDFF2\uE009")
val boonsEffectPattern = Pattern.compile(".*\\+(\\d+).*")
val lootrunRewardPattern = arrayOf(
    "\uDAFF\uDFF2\uE00A\uDAFF\uDF6F\uF007",
    "\uDAFF\uDFF2\uE00A\uDAFF\uDF6F\uF008",
    "\uDAFF\uDFF2\uE00A\uDAFF\uDF6F\uF009",
    "\uDAFF\uDFF2\uE00A\uDAFF\uDF6F\uF00A",
    "\uDAFF\uDFF2\uE00A"
).map { Pattern.compile(it) }

val shiny = "Shiny "
val priceStorage = mapOf(
    "Apocalypse" to "40LE",
    "Pure" to "2stx 30",
    "Hero" to "9stx 30LE",
    "Guardian" to "2stx",
    "Alkatraz" to "50LE",
    "Idol" to "5stx",
    "Thrundacrack" to "1stx",
    "Collapse" to "1stx",
    "Convergence" to "30LE",
    "Bloodbath" to "10stx",
    "Freedom" to "2stx",
    "Grandmother" to "3stx",
    "Ignis" to "2stx",
    "Divzer" to "3stx 45LE",
    "Spring" to "2stx 30LE",
    "Stratiformis" to "2stx 30LE",
    "Epoch" to "7stx",
    "Labyrinth" to "18stx",
    "Lament" to "4stx",
    "Gaia" to "1stx",
    "Monster" to "3stx 45LE",
    "Singularity" to "1stx", //3stx?
    "Fatal" to "3stx",
    "Warp" to "12stx",
    "Quetzalcoatl" to "1stx",
    "Trance" to "24stx",
    "Aftershock" to "1stx", //3stx?
    "Olympic" to "2stx 30LE",
    "Hadal" to "1stx 30LE",
    "Sunstar" to "1stx",
    "Toxoplasmosis" to "3stx",
    "Fantasia" to "1stx",
    "Absolution" to "5stx",
    "Immolation" to "1stx 30LE",
    "Resonance" to "27stx",
    "Archangel" to "2stx",
    "Nullification" to "1stx",
    "Cataclysm" to "4stx 30LE",
    "Grimtrap" to "1stx",
    "Weathered" to "3stx",
    "Inferno" to "1stx 30LE",
    "Nirvana" to "4stx",
    "Oblivion" to "30stx", // idk
    "Hanafubuki" to "18stx 30LE",
    "Discoverer" to "1stx 45LE",
    "Crusade Sabatons" to "9stx 45LE",
    "Resurgence" to "1stx 30LE",
    "Galleon" to "1stx 20LE",
    "Boreal" to "1stx",
    "Slayer" to "2stx",
    "Moontower" to "5stx",
    "Dawnbreak" to "1stx",
    "Stardew" to "3stx",
    "Warchief" to "2stx 20LE",
    "Revenant" to "2stx"
)


fun getEffect(item: ItemStackHelper): String {
    var effect = ""
    var extending = false
    item.lore.forEach {
        if(extending) {
            extending = false
            if(it.string.startsWith("\u00a7f")) {
                effect += " " + if(it.string.contains("\u00a77"))
                    it.string.substring(0, it.string.indexOf("\u00a77"))
                else
                    it.string
            }
        }
        if(it.string.contains("+")) {
            val resetIndex = it.string.indexOf("\u00a77", it.string.indexOf("+"))
            effect += if(resetIndex != -1)
                it.string.substring(0, resetIndex)
            else
                it.string
            extending = true
        }
    }
    return effect
}

fun addCenteredText(screen: IScreen, text: Any, x: Int, y: Int, color: Int, scale: Double, rect: Rect, rect2: Rect): Int {
    val text = when(text) {
        is String -> screen.addText(text, x, y, color, true, scale, 0.0)
        is TextHelper -> screen.addText(text, x, y, color, true, scale, 0.0)
        else -> return 0
    }
    text.x -= text.scaledWidth / 2
    rect.x1 = min(rect.x1, text.x - 4)
    rect.x2 = max(rect.x2, text.x + text.scaledWidth + 4)
    rect2.x1 = min(rect.x1, text.x - 2)
    rect2.x2 = max(rect.x2, text.x + text.scaledWidth + 2)
    return text.scaledHeight
}

//EventListener(context, EventClickSlot::class.java, { e ->
//    Chat.log("click: " + e.slot)
//}, true)

EventListener(EventOpenContainer::class.java, { event ->
    val title = event.inventory.containerTitle
    //Chat.log(Chat.createTextBuilder().append("title: $title").withClickEvent("copy_to_clipboard", title).build())
    if(boonsPattern.matcher(title).matches()) {
        //Chat.log("slots: " + event.inventory.totalSlots)
        Client.waitTick(4)
        for(i in 0..26) {
            val item = event.inventory.getSlot(i)
            if(!item.isEmpty) {
                val name = item.name.stringStripFormatting
                val description = descriptions[name]
                val stack = maxstacklist[name] ?: 1

                val effect = getEffect(item)
                if(effect == "") {
                    continue
                }
                val matcher = boonsEffectPattern.matcher(effect)
                if(!matcher.matches()) {
                    continue
                }
                val match = matcher.toMatchResult().group(1)


                val effectName = effect.substring(matcher.toMatchResult().end(1))
                val effectValue = match.toInt()

                val formatted = item.name.string
                val color = if(formatted.startsWith("\u00a7")) list_colorcode[formatted[1]] ?: 0xFEFEFE else 0xFEFEFE

                val width = event.screen.width
                val height = event.screen.height
                val x = width / 2 - 320 + 80 * (i - 9)
                val y = height / 2 - 160
                val itemX = width / 2 - 72 + 18 * (i - 9)
                val itemY = height / 2 - 50

                val iscreen = event.screen as IScreen
                val rect = iscreen.addRect(x, y-4, 0, 0, color)
                val rect2 = iscreen.addRect(x, y-2, 0, 0, 0, 128)

                var Y = y
                Y += addCenteredText(iscreen, item.name, x, Y, 0xffffff, 1.4, rect, rect2)
                Y += addCenteredText(iscreen, "${effectValue * stack}$effectName", x, Y, 0xffffff, 1.4, rect, rect2)
                Y += addCenteredText(iscreen, "${effectValue}x$stack", x, Y, 0xffffff, 1.4, rect, rect2)
                Y += addCenteredText(iscreen, description ?: "", x, Y, 0xffffff, 1.0, rect, rect2)
                rect.y2 = Y + 4
                rect2.y2 = Y + 2

                val lineEnd = Y + 15
                iscreen.addLine(x, lineEnd, x, Y, 0, 100, 4.0)
                iscreen.addLine(x, lineEnd, itemX, itemY, 0, 100, 4.0)
                iscreen.addLine(x, lineEnd, x, Y, color, 101, 2.0)
                iscreen.addLine(x, lineEnd, itemX, itemY, color, 101, 2.0)
            }
        }
    } else if(lootrunRewardPattern.any { it.matcher(title).matches() }) {
        Client.waitTick(4)
        val x = event.screen.width / 2 - 72

        val y = event.screen.height / 2 - 100

        for(i in 18..26) {
            val item = event.inventory.getSlot(i)
            if(!item.isEmpty) {
                val name = item.name.stringStripFormatting
                if(name.contains("Unidentified")) {
                    val substringIndex = if(name.contains(shiny)) name.indexOf(shiny)+shiny.length else "Unidentified ".length

                    val mythicName = name.substring(substringIndex)
                    priceStorage[mythicName]?.let {
                        val pos = event.inventory.getSlotPos(i)
                        //Chat.log("$mythicName pos: $pos")
                        val x = x + 18 * (i - 19)
                        val y = y + pos.y.toInt()
                        event.screen.addLine(x, y, x, y + (i % 3) * 11, 0xffffff)
                        event.screen.addText(it, x, y + (i % 3) * 11, 0xffffff, true)
                    }
                }
            }
        }
    }
})

Chat.toast("lootrun helper", "enabled")