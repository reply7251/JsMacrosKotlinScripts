
//import me.hellrevenger.generated.getX
//import me.hellrevenger.generated.getY
//import me.hellrevenger.generated.getZ

import me.hellrevenger.library.api.EventListener
import net.minecraft.class_2684
import xyz.wagyourtail.jsmacros.client.api.classes.math.Vec3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Line
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

EventListener(context, EventRecvPacket::class.java, { e ->
    //if(!e.type.equals("PlayerPositionLookS2CPacket")) return@EventListener
    (e.packet as? net.minecraft.class_2708)?.let {
        val p = Player.player!!

        val newX = it.method_11734()
        val newY = it.method_11735()
        val newZ = it.method_11738()

        d3d.addLine(p.x, p.y, p.z, newX, newY, newZ, 0xffffff)

        Chat.log("detect teleport, distance: %.1f".format(Vec3D(p.x, p.y, p.z, newX, newY, newZ).magnitude))
        Chat.log("%.1f  %.1f  %.1f to %.1f  %.1f  %.1f".format(p.x, p.y, p.z, newX, newY, newZ))
    }
}, true)

Chat.toast("Teleport Recorder", "enabled")

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    d3d.unregister()
}