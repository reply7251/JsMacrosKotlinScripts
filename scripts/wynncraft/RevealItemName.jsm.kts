
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

val d2d = Hud.createDraw2D()
d2d.register()

var running = true
val queue = mutableListOf<EntityHelper<*>>()

fun check(entity: EntityHelper<*>) {
    val item = entity.asItem().containedItemStack
    if(item.itemId != "minecraft:stone_shovel") return
    var name = item.name ?: entity.name
    Chat.log("test: " + entity.getNBT())
    /*
    val apiName = Models.Gear.getGearInfoFromApiName(name.stringStripFormatting).name
    if(apiName != null && apiName != name.stringStripFormatting)
        name = Chat.createTextBuilder().append(apiName).build()
    val d2d2 = Hud.createDraw2D()
    d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
    d2d2.textBuilder().pos(9, -16).text(name).shadow(true).buildAndAdd()
    WorldPosWrapper(d2d2).move(0.0, 0.7, 0.0).bind(entity).addToDraw2d(d2d)
    */
}

thread {
    while(running) {
        while(queue.isNotEmpty())
            check(queue.removeFirst())
        Client.waitTick()
    }
}

EventListener(EventEntityLoad::class.java, {
    if(it.entity.type != "minecraft:item") return@EventListener
    queue.add(it.entity)
}, true)

JsMacros.assertEvent(event, "Service")
val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    d2d.unregister()
    running = false
}

Chat.toast("RevealItemName", "enabled")