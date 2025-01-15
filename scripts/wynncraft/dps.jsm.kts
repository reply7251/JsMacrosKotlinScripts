
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.specialized.display.TextDisplayEntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import java.util.regex.Pattern
import kotlin.concurrent.thread


if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

val d2d = Hud.createDraw2D()
d2d.register()

val text = d2d.addText("dps: ", d2d.width / 2, (d2d.height * 0.88).toInt(), 0xffffff, true)
text.x = d2d.width / 2 - text.width

d2d.setOnInit(JavaWrapper.methodToJava { ->
    d2d.reAddElement(text)
})

val added = mutableMapOf<String, Pair<Long, Int>>()

//val pattern = "❉✦✹✤❋❤"
val pattern = Pattern.compile("-(?<damage>\\d+) .")

var running = true

val remainingTime = 3.0

thread {
    while (running) {
        World.entities?.forEach {
            if(it is TextDisplayEntityHelper) {
                if(it.uuid !in added) {
                    val name = it.data?.text?.stringStripFormatting ?: return@forEach
                    val m = pattern.matcher(name)

                    var damage = 0
                    var msg = ""
                    m.results().forEach {
                        damage += it.group(1).toInt()
                        msg += it.group(0) + "->" + it.group(1) + " "
                    }
                    if(damage != 0) {
                        added[it.uuid] = World.time + (remainingTime*20).toInt() to damage
                    }
                }
            }
        }
        val remove = mutableSetOf<String>()
        var dps = 0
        added.forEach { (uuid, value) ->
            val (time, damage) = value
            if(World.time > time) {
                remove.add(uuid)
            } else {
                dps += damage
            }
        }
        remove.forEach { added.remove(it) }
        text.setText(String.format ("dps: %.1f", dps/remainingTime))

        Client.waitTick()
    }
}

val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    running = false
    d2d.unregister()
}

Chat.toast("DPS", "enabled")