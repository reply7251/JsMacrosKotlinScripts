import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents

EventListener.registerForScript(ClientTickEvents.END_CLIENT_TICK,ClientTickEvents.EndTick {
    Chat.actionbar("test ${World.time}")
})