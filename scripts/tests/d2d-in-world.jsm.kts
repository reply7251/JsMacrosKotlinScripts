
import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.api.WorldPosWrapper
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents

import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService

val mc = Client.minecraft

val d2d = Hud.createDraw2D()
d2d.register()

fun addItem(entity: EntityHelper<*>) {
    if(entity.type != "minecraft:item") return

    val d2d2 = Hud.createDraw2D()
    d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
    d2d2.textBuilder().pos(9, -16).text(entity.name).shadow(true).buildAndAdd()

    WorldPosWrapper(d2d2).bind(entity).move(Pos3D(0.0, 0.5, 0.0)).addToDraw2d(d2d)
}

EventListener(context, EventEntityLoad::class.java, { event ->
    addItem(event.entity)
})


(event as EventService).stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    d2d.unregister()
    EventCenter.unregisterEvent(context.ctx, ClientEntityEvents.ENTITY_UNLOAD)
} as Function0<*>)
Chat.toast("d2d", "enabled")
/*
JsMacros.waitForEvent("InteractBlock")
d2d.unregister()
Chat.toast("d2d", "disabled")
* */
