
import me.hellrevenger.generated.*
import me.hellrevenger.generated.Map_MinecraftClient.gameRenderer
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.core.service.EventService



if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

class MyCamera : Camera() {
    var offsetPitch = 0f
        set(value) {
            Chat.title("", "pitch: $value, yaw: $offsetYaw", 1, 10, 1)
            field = value
        }

    var offsetYaw = 0f
        set(value) {
            Chat.title("", "pitch: $offsetPitch, yaw: $value", 1, 10, 1)
            field = value
        }

    override fun method_19325(yaw: Float, pitch: Float) {
        super.method_19325(yaw + offsetYaw, pitch + offsetPitch)
    }
}

val camera = MyCamera()
val renderer = Client.minecraft.gameRenderer

var startPitch = 0f
var startDPitch = 10000f
var startYaw = 0f
var startDYaw = 10000f

EventListener(EventKey::class.java, {
    if(it.key == "key.mouse.middle") {
        /*
        Player.player?.let { player ->
            if(it.action == 1) { // press
                startPitch = player.pitch
                startDPitch = camera.offsetPitch
                startYaw = player.yaw
                startDYaw = camera.offsetYaw
            } else if(it.action == 0) {
                camera.offsetPitch = startDPitch + player.pitch - startPitch
                camera.offsetYaw = startDYaw + player.yaw - startYaw
                player.lookAt(startYaw.toDouble(), startPitch.toDouble())
            }
        }
        */
    } else if(it.action != 0) {

    } else if(it.key == "key.keyboard.right.bracket") {
        camera.offsetPitch = 0f
        camera.offsetYaw = 0f
    } else if (it.key == "key.keyboard.up") {
        camera.offsetPitch -= 10
    } else if (it.key == "key.keyboard.down") {
        camera.offsetPitch += 10
    } else if (it.key == "key.keyboard.right") {
        camera.offsetYaw += 10
    } else if (it.key == "key.keyboard.left") {
        camera.offsetYaw -= 10
    }

})

val cameraField = Reflection.getDeclaredField(net.minecraft.class_757::class.java, "field_18765")
cameraField.trySetAccessible()
val oldCamera = cameraField.get(renderer)
cameraField.set(renderer, camera)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    cameraField.set(renderer, oldCamera)
}

Chat.toast("Free Look", "enabled")