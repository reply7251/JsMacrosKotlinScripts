
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventRecvMessage

val whitelist = arrayOf(
    "graid", "notg", "tna", "nol", "tcc",
    "shapes in the dark",
    "otherworldly",
    "downpour",
    "all eyes on me",
    "monument to loss",
    "click here to join",
    "click here to ready up",
).map { it.toRegex() }
val blacklists = arrayOf("notgrey", ": .+ defense is ", "changed \\d+ \\w+ on .+", "notg.+:").map { it.toRegex() }
var anni = false
val anniRegex = "annie?\\s*\\d/\\d".toRegex()
var cooldown = 0L

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
    } || (anni && msg.lowercase().contains(anniRegex))

EventListener(EventRecvMessage::class.java, {
    it.text?.stringStripFormatting?.lowercase()?.let {
		if(cooldown > World.time + 1000L) {
			cooldown = 0L
		}
        if(shouldNotify(it) && cooldown < World.time) {
			cooldown = World.time + 200
            for(i in 0..4) {
                World.playSound("entity.chicken.egg")
                Client.waitTick(3)
            }
        }
    }
})

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent(EventType.ChunkLoad.toString())
}

Chat.commandManager.unregisterCommand("/notify")
Chat.commandManager.createCommandBuilder("/notify")
//    .literalArg("anni")
    .executes(JavaWrapper.methodToJava { a ->
        anni = !anni
        Chat.log("anni ${if(anni) "enabled" else "disabled"}")
    }).register()