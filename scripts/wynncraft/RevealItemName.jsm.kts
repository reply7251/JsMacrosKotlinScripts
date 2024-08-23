import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.api.WorldPosWrapper
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val d2d = Hud.createDraw2D()
d2d.register()
fun check(entity: EntityHelper<*>) {
    if(entity.type != "minecraft:item") return
    thread {
        Client.waitTick()
        val item = entity.asItem().containedItemStack
        if(item.itemId != "minecraft:stone_shovel") return@thread
        val name = item.name ?: entity.name
        val d2d2 = Hud.createDraw2D()
        d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
        d2d2.textBuilder().pos(9, -16).text(name).shadow(true).buildAndAdd()
        WorldPosWrapper(d2d2).move(0.0, 0.7, 0.0).bind(entity).addToDraw2d(d2d)
    }
}

EventListener(context, EventEntityLoad::class.java, {
    check(it.entity)
})

JsMacros.assertEvent(event, "Service")
val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    d2d.unregister()
}

Chat.toast("RevealItemName", "enabled")