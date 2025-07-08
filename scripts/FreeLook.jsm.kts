
import me.hellrevenger.generated.*
import me.hellrevenger.generated.Map_MinecraftClient.gameRenderer
import me.hellrevenger.library.api.KtGlobals
import me.hellrevenger.library.api._getField
import kotlin.Pair


if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

val offsetKey = "CameraOffset"

KtGlobals.addVariable(offsetKey, mutableMapOf<String, () -> Pair<Float, Float>>())

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

    fun getOffset(): Pair<Float, Float> {
        var offsetYaw = 0f
        var offsetPitch = 0f

        KtGlobals.getVariable<Map<String, () -> Pair<Float, Float>>>(offsetKey)?.values?.forEach {
            val p = it()
            offsetYaw += p.first
            offsetPitch += p.second
        }
        return offsetYaw to offsetPitch
    }

    override fun method_19325(yaw: Float, pitch: Float) {
        val offset = getOffset()
        super.method_19325(yaw + offsetYaw + offset.first, pitch + offsetPitch + offset.second)
    }
}

val camera = MyCamera()
val renderer = Client.minecraft.gameRenderer

var startPitch = 0f
var startDPitch = 10000f
var startYaw = 0f
var startDYaw = 10000f

EventListener(EventType.Key, {
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

var cameraOfRenderer by renderer._getField<Camera>("field_18765")
val oldCamera = cameraOfRenderer
cameraOfRenderer = camera

context.onContextClosed {
    cameraOfRenderer = oldCamera
}

Chat.toast("Free Look", "enabled")