
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

registerEvent(ClientTickEvents.END_CLIENT_TICK, ClientTickEvents.EndTick {
    Chat.actionbar("tick: " + World.time)
})

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
    unregisterEvent(ClientTickEvents.END_CLIENT_TICK)
    //Core.getInstance().libraryRegistry.perExec.remove(FEventCenter::class.java.getAnnotation(Library::class.java))
} as Function0<*>)