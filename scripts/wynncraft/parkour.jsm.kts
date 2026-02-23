
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val height = 0.5001
val edgeDistance = 0.01

var running = true
var enabled = false

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

thread {
    while (running) {
        Player.player?.let { player ->
            if(!player.isOnGround || player.isSneaking || !enabled) {
                return@let
            }
            val box = player.raw.method_5829()
                .method_1012(0.0, -height, 0.0)
                .method_1009(-edgeDistance, 0.0, -edgeDistance)

            if (Client.minecraft.field_1687?.method_8587(player.raw, box) != true) {
                return@let
            }
            player.raw.method_6043()
        }
        Client.waitTick()
    }
}

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    running = false
}

Chat.commandManager.unregisterCommand("/parkour")
Chat.commandManager.createCommandBuilder("/parkour").executes(JavaWrapper.methodToJava { _ ->
    enabled = !enabled
}).register()

Chat.toast("Parkour", "enabled")