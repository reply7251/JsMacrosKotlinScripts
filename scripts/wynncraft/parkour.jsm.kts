import me.hellrevenger.generated.Map_Box.expand
import me.hellrevenger.generated.Map_Box.stretch
import me.hellrevenger.generated.Map_CollisionView.isSpaceEmpty
import me.hellrevenger.generated.Map_EntityLike.getBoundingBox
import me.hellrevenger.generated.Map_LivingEntity.jump
import me.hellrevenger.generated.Map_MinecraftClient.world
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val height = 0.5001
val edgeDistance = 0.01

var running = true
var enabled = false

thread {
    while (running) {
        Player.player?.let { player ->
            if(!player.isOnGround || player.isSneaking || !enabled) {
                return@let
            }
            val box = player.raw.getBoundingBox()
                .stretch(0.0, -height, 0.0)
                .expand(-edgeDistance, 0.0, -edgeDistance)

            if (Client.minecraft.world?.isSpaceEmpty(player.raw, box) != true) {
                return@let
            }
            player.raw.jump()
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