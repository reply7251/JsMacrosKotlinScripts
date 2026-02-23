
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.core.service.EventService


val d3d = Hud.createDraw3D()
//d3d.register()
var running = true
val traceLine = d3d.addEntityTraceLine(null, 0xffffff)

EventListener(EventEntityLoad::class.java, { e ->
    if(e.entity.type.contains("stand")) {
        Client.waitTick()
        if(!e.entity.isGlowing) {
            e.entity.setGlowingColor(0xffffff)
            e.entity.setGlowing(true)
        }
    } else if(!e.entity.type.contains("slime")) {
        Client.waitTick()
        //traceLine.setEntity(it)
        if(!e.entity.isGlowing) {
            e.entity.setGlowingColor(0x0000ff)
            e.entity.setGlowing(true)
        }
    }
}, false)

World.entities?.forEach {
    if(it.type.contains("stand")) {
        if(!it.isGlowing) {
            it.setGlowingColor(0xffffff)
            it.setGlowing(true)
        }
    } else if(!it.type.contains("slime")) {
        if(!it.isGlowing) {
            it.setGlowingColor(0x0000ff)
            it.setGlowing(true)
        }
    }
}

//thread {
//    while (running) {
//        World.entities?.forEach {
//            if(it.type.contains("stand")) {
//                //traceLine.setEntity(it)
//                if(!it.isGlowing) {
//                    it.setGlowingColor(0x0000ff)
//                    it.setGlowing(true)
//                }
//            } else if(!it.type.contains("slime")) {
//                //traceLine.setEntity(it)
//                if(!it.isGlowing) {
//                    it.setGlowingColor(0x0000ff)
//                    it.setGlowing(true)
//                }
//            }
//        }
//        Client.waitTick()
//    }
//}

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    running = false
    World.entities?.forEach {
        it.resetGlowing()
    }
}

Chat.toast("Spirit", "enabled")