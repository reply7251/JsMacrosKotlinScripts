
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.event.Event
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
Chat.toast("quick place", "Enabled")
registerEvent(ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
    if(KeyBind.pressedKeys.contains("key.keyboard.keypad.1")) {
        Player.interactions()?.interact();
    }
})

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
} as Function0<*>)