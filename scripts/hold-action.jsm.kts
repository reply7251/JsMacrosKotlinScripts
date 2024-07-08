
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.event.Event
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val mc = Client.getMinecraft()
val interactKey =  mc.field_1690.field_1904;
val attackKey = mc.field_1690.field_1886;

var globalInterval = 2

var attackEnabled = false
var attackInterval = 20
var attackIntervalRandom = 20
var interactEnabled = false
var interactInterval = 2
var interactIntervalRandom = 0

var nextAttackTime = 0L
var nextInteractTime = 0L

JsMacros.createCustomEvent("HoldAction").registerEvent()
JsMacros.on("HoldAction", JavaWrapper.methodToJava(fun(event: EventCustom, _: EventContainer<*>){
    with(event) {
        if(getBoolean("loadFromGlobal") == true) {
            globalInterval = GlobalVars.getInt("globalInterval") ?: globalInterval
            attackEnabled = GlobalVars.getBoolean("attackEnabled") ?: attackEnabled
            attackInterval = GlobalVars.getInt("attackInterval") ?: attackInterval
            attackIntervalRandom = GlobalVars.getInt("attackIntervalRandom") ?: attackIntervalRandom
            interactEnabled = GlobalVars.getBoolean("interactEnabled") ?: interactEnabled
            interactInterval = GlobalVars.getInt("interactInterval") ?: interactInterval
            interactIntervalRandom = GlobalVars.getInt("interactIntervalRandom") ?: interactIntervalRandom
        } else {
            globalInterval = getInt("globalInterval") ?: globalInterval

            attackEnabled = getBoolean("attackEnabled") ?: attackEnabled
            attackInterval = getInt("attackInterval") ?: attackInterval
            attackIntervalRandom = getInt("attackIntervalRandom") ?: attackIntervalRandom
            interactEnabled = getBoolean("interactEnabled") ?: interactEnabled
            interactInterval = getInt("interactInterval") ?: interactInterval
            interactIntervalRandom = getInt("interactIntervalRandom") ?: interactIntervalRandom
        }
        if(globalInterval == 0) {
            globalInterval = 1
        }
    }
} as Function2<*, *, *>))

val _event = JsMacros.createCustomEvent("HoldAction")
_event.putBoolean("loadFromGlobal", true)
_event.trigger()

var tick = 0L

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
val closedField = Reflection.getDeclaredField(BaseScriptContext::class.java, "closed")
closedField.trySetAccessible()

registerEvent(ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
    if ((tick++).toInt() % globalInterval == 0) {
        if(nextAttackTime > tick + attackIntervalRandom + attackInterval) {
            nextAttackTime = 0
        }
        if(nextInteractTime > tick + interactIntervalRandom + interactInterval) {
            nextInteractTime = 0
        }
        if (attackEnabled && attackKey.method_1434() && tick > nextAttackTime) {
            Player.interactions()!!.attack()
            nextAttackTime = tick + attackInterval + (Math.random() * attackIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", true)
        } else if (interactEnabled && interactKey.method_1434() && tick > nextInteractTime) {
            Player.interactions()?.interact()
            nextInteractTime = tick + interactInterval + (Math.random() * interactIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", false)
        }
    }

})


(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){

} as Function0<*>)

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}
Chat.toast("hold action enabled", "")