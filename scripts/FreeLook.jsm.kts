import fi.dy.masa.tweakeroo.config.Configs
import fi.dy.masa.tweakeroo.config.FeatureToggle
import fi.dy.masa.tweakeroo.util.CameraEntity
import me.hellrevenger.generated.*
import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.api.mc
import net.minecraft.class_332
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

Configs.Generic.FREE_CAMERA_PLAYER_MOVEMENT.booleanValue = false

//var dYaw = 0.0
var dPitch = 0f
var enabled = false

fun getDelta() = mc.getRenderTickCounter().getTickDelta(true)
class RenderGetter(val callback: () -> Unit) : RenderElement {
    override fun method_25394(p0: class_332?, p1: Int, p2: Int, p3: Float) {
        callback()
    }

    override fun getZIndex(): Int = 0
}

val d2d = Hud.createDraw2D()

val cameraUpdater = RenderGetter {
    if(!enabled) return@RenderGetter
    CameraEntity.getCamera()?.let {
        val player = Player.player ?: return@let
        val lerpPos = player.raw.getLerpedPos(getDelta())

        it.updatePosition(lerpPos.x, lerpPos.y, lerpPos.z)
        it.setCameraRotations(player.yaw, player.pitch + dPitch)
    }
}

d2d.setOnInit(JavaWrapper.methodToJava { d2d ->
    d2d.reAddElement(cameraUpdater)
})

d2d.register()


fun onToggle() {
    Configs.Generic.FREE_CAMERA_PLAYER_MOVEMENT.booleanValue = enabled
}

EventListener(context, EventKey::class.java, {
    if(it.key == "key.keyboard.left.bracket") {
        if(it.action == 1) { // press

        } else if(it.action == 0) {

        }
    } else if(it.action != 0) {

    } else if(it.key == "key.keyboard.right.bracket") {
        enabled = !FeatureToggle.TWEAK_FREE_CAMERA.booleanValue
        FeatureToggle.TWEAK_FREE_CAMERA.booleanValue = enabled
        onToggle()
    } else if(it.key == "key.keyboard.u") {
        enabled = false
        onToggle()
    } else if (it.key == "key.keyboard.up") {
        dPitch -= 10
    } else if (it.key == "key.keyboard.down") {
        dPitch += 10
    }
})

var running = true
//thread {
//    while (running) {
//        Player.player?.let { CameraEntity.getCamera()?.updatePosition(it.x, it.y, it.z) }
//        Client.waitTick()
//    }
//}

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    running = false
    d2d.unregister()
}

Chat.toast("Free Look", "enabled")