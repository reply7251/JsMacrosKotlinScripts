import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val d3d = Hud.createDraw3D()
val d2d = d3d.addDraw2D(0.0, 0.0, 0.0)
val box = d3d.addBox(1.0,1.0,1.0,2.0,2.0,2.0,0x00ff00,0xff,true)
box.setFillAlpha(127)
d2d.addText("West", 0, 0, 0xff0000, true)
d2d.renderBack = true
d3d.register()

d2d.setRotateCenter(false)
var rotation = 0.0

fun onTick() {
    rotation += 3
    rotation %= 360
    d2d.setRotations(0.0,rotation,0.0)
    Chat.actionbar("rotation: $rotation")
}

var tickEnabled = true

thread {
    while (tickEnabled) {
        onTick()
        Client.waitTick()
    }
}

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
    tickEnabled = false
    d3d.unregister()
} as Function0<*>)