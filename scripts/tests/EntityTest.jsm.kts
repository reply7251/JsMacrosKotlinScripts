import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad


EventListener(context, EventEntityLoad::class.java, {
    Chat.log("entity load: " + it.entity)
})
