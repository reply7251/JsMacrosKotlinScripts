
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventTick

EventListener(EventTick::class.java, {
    val time = World.time
    Chat.actionbar("time: $time")
})