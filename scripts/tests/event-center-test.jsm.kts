

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.event.Event
import xyz.wagyourtail.jsmacros.client.api.helpers.world.BlockPosHelper
import xyz.wagyourtail.jsmacros.core.service.EventService


fun <T> registerEvent(event: Event<T>, callback: T) {
    val register = JsMacros.createCustomEvent("RegisterKtEvent")
    register.putObject("event", event)
    register.putObject("callback", callback)
    register.putObject("context", context.ctx)
    register.trigger()
}

fun <T> unregisterEvent(event: Event<T>) {
    val register = JsMacros.createCustomEvent("UnregisterKtEvent")
    register.putObject("event", event)
    register.putObject("context", context.ctx)
    register.trigger()
}

val faces = mapOf<String, Function1<BlockPosHelper, BlockPosHelper>>(
    "EAST" to fun(pos): BlockPosHelper {return pos.west()},
    "SOUTH" to fun(pos): BlockPosHelper { return pos.north()},
    "WEST" to fun(pos): BlockPosHelper { return pos.east()},
    "NORTH" to fun(pos): BlockPosHelper { return pos.south()},
    "UP" to fun(pos): BlockPosHelper { return pos.down()}
)

registerEvent(ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
    if(KeyBind.pressedKeys.contains("key.keyboard.keypad.1")) {
        val player = Player.player ?: return@StartTick
        val blockPos = player.pos.sub(0.0,0.5,0.0).toBlockPos()
        if(World.getBlock(blockPos)?.blockStateHelper?.isSolid != true) {
            for(face in faces) {
                val support = face.value(blockPos)
                if(World.getBlock(support)?.blockStateHelper?.isSolid == true) {
                    val yawPitch = player.yaw to player.pitch
                    if(player.tryLookAt(support)) {
                        Player.interactions()?.interactBlock(support.x, support.y, support.z, face.key, false, true)
                        player.lookAt(yawPitch.first.toDouble(), yawPitch.second.toDouble())
                    } else
                        Chat.actionbar("error")
                    return@StartTick
                }
            }
        }
    }
})
Chat.log("start testing")
(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
} as Function0<*>)