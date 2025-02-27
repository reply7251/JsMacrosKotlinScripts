
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventRecvMessage

val messages = arrayOf(
    "graid", "notg", "tna", 
    "shapes in the dark",
    "otherworldly",
    "downpour",
    "all eyes on me",
    "monument to loss"
    )

EventListener(EventRecvMessage::class.java, {
    it.text?.stringStripFormatting?.let {
        if(messages.any { msg -> it.contains(msg, true) }) {
            for(i in 0..4) {
                World.playSound("entity.chicken.egg")
                Client.waitTick(3)
            }
        }
    }
})