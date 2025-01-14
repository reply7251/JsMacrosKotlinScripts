import fi.dy.masa.tweakeroo.config.Configs
import fi.dy.masa.tweakeroo.config.FeatureToggle
import fi.dy.masa.tweakeroo.util.CameraEntity
import me.hellrevenger.generated.*
import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.api.KtGlobals
import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api.mc
import net.bytebuddy.asm.Advice
import net.bytebuddy.implementation.bytecode.constant.DefaultValue
import net.bytebuddy.matcher.ElementMatchers
import net.minecraft.class_332
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventSendPacket
import xyz.wagyourtail.jsmacros.core.library.impl.FGlobalVars
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

Configs.Generic.FREE_CAMERA_PLAYER_MOVEMENT.booleanValue = false

val varName = "FreeLookEnabled"

//var dYaw = 0.0
var dPitch = 0f
var startPitch = 0f
var startDPitch = 10000f
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
        if(startDPitch < 1e3)
            dPitch = startDPitch + player.pitch - startPitch

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
    GlobalVars.putBoolean(varName, enabled)
    dPitch = 0f
}

onToggle()

EventListener(context, EventKey::class.java, {
    if(it.key == "key.mouse.middle") {
        Player.player?.let { player ->
            if(it.action == 1) { // press
                startPitch = player.pitch
                startDPitch = dPitch
            } else if(it.action == 0) {
                //dPitch = startDPitch + player.pitch - startPitch
                startDPitch = 10000f
            }
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

//EventListener(context, EventSendPacket::class.java, {
//    (it.packet as? net.minecraft.class_2828)?.let {
//
//    }
//}, true)
//
//RuntimeMixin.makePublic(net.minecraft.class_2828::class.java, ElementMatchers.any())
//RuntimeMixin.doMixin(net.minecraft.class_2828::class.java)

object MixinCameraEntity {
    @JvmStatic
    @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue::class)
    fun updateLastTickPosition(): Boolean {
        return FGlobalVars().getBoolean("FreeLookEnabled") ?: false
    }
}

val mixin = Advice.to(MixinCameraEntity::class.java).on(ElementMatchers.named("updateLastTickPosition"))
RuntimeMixin.addMixin(CameraEntity::class.java, mixin)
RuntimeMixin.doMixin(CameraEntity::class.java)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    d2d.unregister()
    RuntimeMixin.removeMixin(CameraEntity::class.java, mixin)
    RuntimeMixin.doMixin(CameraEntity::class.java)
    FeatureToggle.TWEAK_FREE_CAMERA.booleanValue = false
    enabled = false
    onToggle()
}

Chat.toast("Free Look", "enabled")