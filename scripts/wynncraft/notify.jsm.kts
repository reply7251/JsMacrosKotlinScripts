
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventRecvMessage

val whitelist = arrayOf(
    "graid", "notg", "tna",
    "shapes in the dark",
    "otherworldly",
    "downpour",
    "all eyes on me",
    "monument to loss"
).map { it.toRegex() }
val blacklists = arrayOf("notgrey", ": .+ defense is ", "changed \\d+ \\w+ on .+").map { it.toRegex() }

fun shouldNotify(msg: String) =
    whitelist.any { toNotify ->
        val ranges = toNotify.findAll(msg).map { it.range }.toMutableList()
        blacklists.forEach { toBlock ->
            toBlock.findAll(msg).forEach { matcher ->
                ranges.removeIf {
                    matcher.range.contains(it.first) && matcher.range.contains(it.last)
                }
            }
        }
        ranges.isNotEmpty()
    }

EventListener(EventRecvMessage::class.java, {
    it.text?.stringStripFormatting?.lowercase()?.let {
        if(shouldNotify(it)) {
            for(i in 0..4) {
                World.playSound("entity.chicken.egg")
                Client.waitTick(3)
            }
        }
    }
})