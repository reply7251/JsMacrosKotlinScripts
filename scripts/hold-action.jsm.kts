
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.reflect.full.memberProperties

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
Chat.log("test")

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
    }
} as Function2<*, *, *>))

(fun() {
    val event = JsMacros.createCustomEvent("HoldAction")
    event.putBoolean("loadFromGlobal", true)
    event.trigger()
})()
fun onTick() {
    val time = World.time
    if (time.toInt() % globalInterval == 0) {
        if (attackEnabled && attackKey.method_1434() && time > nextAttackTime) {
            Player.interactions()!!.attack()
            nextAttackTime = time + attackInterval + (Math.random() * attackIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", true)
        } else if (interactEnabled && interactKey.method_1434() && time > nextInteractTime) {
            Player.interactions()?.interact()
            nextInteractTime = time + interactInterval + (Math.random() * interactIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", false)
        }
    }
}

var tickEnabled = true
thread {
    try {
        while (tickEnabled) {
            onTick()
            Client.waitTick()
        }
    } catch (e: Exception) {
        Chat.logger.error(e.stackTraceToString())
    }
}
(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
    tickEnabled = false
} as Function0<*>)