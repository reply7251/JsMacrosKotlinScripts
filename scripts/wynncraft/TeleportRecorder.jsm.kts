

import me.hellrevenger.generated.Map_PlayerPositionLookS2CPacket.getX
import me.hellrevenger.generated.Map_PlayerPositionLookS2CPacket.getY
import me.hellrevenger.generated.Map_PlayerPositionLookS2CPacket.getZ
import me.hellrevenger.generated.PlayerPositionLookS2CPacket
import xyz.wagyourtail.jsmacros.client.api.classes.math.Vec3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventRecvPacket
import xyz.wagyourtail.jsmacros.core.service.EventService

//EventListener(context, EventSendPacket::class.java, { e ->
//    if(!e.type.equals("TeleportConfirmC2SPacket")) return@EventListener
//    (e as? net.minecraft.class_2793)?.let {
//        it.getTeleportId()
//    }
//}, true)

val d3d = Hud.createDraw3D()
d3d.register()

EventListener(EventRecvPacket::class.java, { e ->
    //if(!e.type.equals("PlayerPositionLookS2CPacket")) return@EventListener
    (e.packet as? PlayerPositionLookS2CPacket)?.let {
        val p = Player.player!!

        val newX = it.getX()
        val newY = it.getY()
        val newZ = it.getZ()

        d3d.addLine(p.x, p.y, p.z, newX, newY, newZ, 0xffffff)

        Chat.log("detect teleport, distance: %.1f".format(Vec3D(p.x, p.y, p.z, newX, newY, newZ).magnitude))
        Chat.log("%.1f  %.1f  %.1f to %.1f  %.1f  %.1f".format(p.x, p.y, p.z, newX, newY, newZ))
    }
}, true)

Chat.toast("Teleport Recorder", "enabled")

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    d3d.unregister()
}