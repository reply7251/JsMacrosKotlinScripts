
import me.hellrevenger.jsmacroskotlinscript.script.library.api.KtGlobals
import me.hellrevenger.jsmacroskotlinscript.script.library.api.MiscExtensions.waitUntilGameLoaded
import me.hellrevenger.jsmacroskotlinscript.script.library.api._getField
import net.minecraft.client.Camera
import net.minecraft.client.Minecraft
import net.minecraft.world.entity.Entity

import kotlin.Pair


//while(Client.minecraft.field_1773 == null) {
//    Time.sleep(1000)
//}
JsMacros.waitUntilGameLoaded()

val offsetKey = "CameraOffset"
val pitchFixersKey = "PitchOffsetFixer"

val offsets = mutableMapOf<String, (Float) -> Pair<Float, Float>>()
val pitchFixers = mutableMapOf<String, Pair<Int, (Float) -> Float>>()
KtGlobals.addVariable(offsetKey, offsets)
KtGlobals.addVariable(pitchFixersKey, pitchFixers)

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
        val delta = Minecraft.getInstance().deltaTracker.getGameTimeDeltaPartialTick(true)

        offsets.values.forEach {
            val p = it(delta)
            offsetYaw += p.first
            offsetPitch += p.second
        }
        return offsetYaw to offsetPitch
    }

    override fun setRotation(yaw: Float, pitch: Float) {
        val offset = getOffset()
        var fixedPitchOffset = offsetPitch

        pitchFixers.values.sortedBy { it.first }.forEach { fixedPitchOffset = it.second(fixedPitchOffset) }

        super.setRotation(yaw + offsetYaw + offset.first, pitch + fixedPitchOffset + offset.second)
    }
}

val camera = MyCamera()
val mc = Minecraft.getInstance()

var startPitch = 0f
var startDPitch = 10000f
var startYaw = 0f
var startDYaw = 10000f

EventListener(EventType.Key) {
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
        return@EventListener
    }
    if(it.action != 0 || it.isCanceled)
        return@EventListener
    when (it.key) {
        "key.keyboard.right.bracket" -> {
            camera.offsetPitch = 0f
            camera.offsetYaw = 0f
        }
        "key.keyboard.up" -> {
            camera.offsetPitch -= 10
        }
        "key.keyboard.down" -> {
            camera.offsetPitch += 10
        }
        "key.keyboard.right" -> {
            camera.offsetYaw += 10
        }
        "key.keyboard.left" -> {
            camera.offsetYaw -= 10
        }
    }
}

var cameraOfRenderer by mc.gameRenderer._getField<Camera>("mainCamera")
val oldCamera = cameraOfRenderer
oldCamera!!.entity()?.let { camera.setEntity(it) }
camera.setLevel(mc.level)


cameraOfRenderer = camera

context.onContextClosed {
    camera.entity()?.let { oldCamera!!.setEntity(it) }
    oldCamera!!.setLevel(mc.level)

    cameraOfRenderer = oldCamera
}

Chat.toast("Free Look", "enabled")