import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventTick
import xyz.wagyourtail.jsmacros.core.service.EventService
JsMacros.on("Tick", JavaWrapper.methodToJava(fun(e: EventTick, _: Any) {
    val time = World.time
    Chat.actionbar("time: $time")
} as Function2<*,*,*>))

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){

} as Function0<*>)