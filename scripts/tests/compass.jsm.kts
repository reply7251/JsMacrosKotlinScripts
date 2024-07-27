import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val d3d = Hud.createDraw3D()
val d2d = d3d.addDraw2D(0.0, 0.0, 0.0)
val Scale5 = d2d.addText("Player.yaw", 0, 50, 0xff0000, true, 5.0, 0.0)
Scale5.x = -Scale5.width / 2
d2d.setPos(Player.player?.eyePos)

val d2d2 = d3d.addDraw2D(0.0, 0.0, 0.0)
val Scale52 = d2d2.addText("reverseVector", 0, 0, 0xff0000, true, 5.0, 0.0)
Scale52.x = -Scale52.width / 2
d2d2.setPos(Player.player?.eyePos)
d2d.rotateCenter = true
d2d2.rotateCenter = true

d3d.register()

d2d.renderBack = true

fun onTick() {
    val player = Player.player ?: return
    d2d.rotations.y = 180-player.yaw.toDouble()//-d2d.pos.toReverseVector(player.eyePos).yaw.toDouble()
    d2d2.rotations.y = -d2d.pos.toReverseVector(player.eyePos).yaw.toDouble()
}

var tickEnabled = true

thread {
    while (tickEnabled) {
        onTick()
        Client.waitTick()
    }
}

(event as EventService).stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    tickEnabled = false
    d3d.unregister()
} as Function0<*>)

Chat.toast("label", "enabled")