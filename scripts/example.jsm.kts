import me.hellrevenger.generated.Map_FishingBobberEntity.getHookedEntity
import me.hellrevenger.generated.Map_MinecraftClient.player
import me.hellrevenger.generated.Map_PlayerEntity.fishHook
import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventTick
import xyz.wagyourtail.jsmacros.core.service.EventService
EventListener(context, EventTick::class.java, {
    val time = World.time
    Chat.actionbar("time: $time")
})

fun getFishHook() = Client.minecraft.player?.fishHook

getFishHook()?.getHookedEntity()

(event as EventService).stopListener = JavaWrapper.methodToJava { ->

}