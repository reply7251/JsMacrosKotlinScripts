import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val d3d = Hud.createDraw3D()
//val d2d = d3d.addDraw2D(-1.0,  0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 1.0, 200, true)
val d2d = d3d.addDraw2D(0.0, 0.0, 0.0)
d2d.addText("West", -10, 0, 0xff0000, true)
//d2d.setRotateToPlayer(true)
d2d.renderBack = true
d3d.register()



//d2d.setRotations(0.0, 45.0, 0.0)
d2d.setRotateCenter(false)
var rotation = 0.0

fun onTick() {
    val player = Player.player ?: return

    //d2d.setPos(player.x-1, player.eyePos.y, player.z)
    rotation += 3
    rotation %= 360
    d2d.setRotations(0.0,rotation,0.0)
    Chat.actionbar("rotation: $rotation")

    //d2d.setRotations(0.0, -d2d.pos.toReverseVector(player.pos).yaw.toDouble(), 0.0)
    //d2d.setRotateToPlayer(true)

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