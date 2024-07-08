import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.staticProperties

val d2d = Hud.createDraw2D()
d2d.register()
val texts = List(7, fun(i): Text {
    return d2d.addText(".",100,300 + i * 20,0xffffff,true)
})
class Globals {
    fun putBoolean(key: String, value: Boolean) {
        with (JsMacros.createCustomEvent("HoldAction")){
            GlobalVars.putBoolean(key, value)
            putBoolean(key, value)
            trigger()
        }
    }
    fun putInt(key: String, value: Int) {
        with (JsMacros.createCustomEvent("HoldAction")){
            GlobalVars.putInt(key, value)
            putInt(key, value)
            trigger()
        }
    }
    var globalInterval
        get() = GlobalVars.getInt("globalInterval") ?: 2
        set(value) { putInt("globalInterval", value) }
    var attackEnabled
        get() = GlobalVars.getBoolean("attackEnabled") == true
        set(value) { putBoolean("attackEnabled", value) }
    var attackInterval
        get() = GlobalVars.getInt("attackInterval") ?: 20
        set(value) { putInt("attackInterval", value) }
    var attackIntervalRandom
        get() = GlobalVars.getInt("attackIntervalRandom") ?: 20
        set(value) { putInt("attackIntervalRandom", value) }
    var interactEnabled
        get() = GlobalVars.getBoolean("interactEnabled") == true
        set(value) { putBoolean("interactEnabled", value) }
    var interactInterval
        get() = GlobalVars.getInt("interactInterval") ?: 2
        set(value) { putInt("interactInterval", value) }
    var interactIntervalRandom
        get() = GlobalVars.getInt("interactIntervalRandom") ?: 0
        set(value) { putInt("interactIntervalRandom", value) }
}

val GlobalProperties = listOf("globalInterval", "attackEnabled", "attackInterval", "attackIntervalRandom", "interactEnabled", "interactInterval", "interactIntervalRandom")

val HoldActionConfig = Globals()

val keybinds = HashMap<String, (e: EventKey) -> Any>()
var configCallback = fun(_: Int){}
var selectedConfig = -1

keybinds["key.keyboard.keypad.1"] = fun(_: Any){selectedConfig = 0; configCallback = fun(v){HoldActionConfig.globalInterval += v}}
keybinds["key.keyboard.keypad.4"] = fun(_: Any){HoldActionConfig.attackEnabled = !HoldActionConfig.attackEnabled}
keybinds["key.keyboard.keypad.5"] = fun(_: Any){selectedConfig = 2; configCallback = fun(v){HoldActionConfig.attackInterval += v}}
keybinds["key.keyboard.keypad.6"] = fun(_: Any){selectedConfig = 3; configCallback = fun(v){HoldActionConfig.attackIntervalRandom += v}}
keybinds["key.keyboard.keypad.7"] = fun(_: Any){HoldActionConfig.interactEnabled = !HoldActionConfig.interactEnabled}
keybinds["key.keyboard.keypad.8"] = fun(_: Any){selectedConfig = 5; configCallback = fun(v){HoldActionConfig.interactInterval += v}}
keybinds["key.keyboard.keypad.9"] = fun(_: Any){selectedConfig = 6; configCallback = fun(v){HoldActionConfig.interactIntervalRandom += v}}
keybinds["key.keyboard.keypad.add"] = fun(_: Any){configCallback(1)}
keybinds["key.keyboard.keypad.subtract"] = fun(_: Any){configCallback(-1)}

JsMacros.on("Key", JavaWrapper.methodToJava(fun(e : EventKey, _: Any) {
    if (e.action != 1)
        return;

    val callback = keybinds.get(e.key) ?: return
    callback.invoke(e)
} as Function2<*,*,*>))

fun onTick() {
    Globals::class.memberProperties.forEach(fun(property) {

        val index = GlobalProperties.indexOf(property.name)
        val string = property.name + "-".repeat(if(property.name.length > 24) 1 else 25 - property.name.length) + property.get(HoldActionConfig)
        texts[index].setText(string).setColor(if(index == selectedConfig) 0xffff00 else 0xffffff)
    })
}

var tickEnabled = true

thread {
    while (tickEnabled) {
        onTick()
        Client.waitTick()
    }
}

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
    tickEnabled = false
    d2d.unregister()
} as Function0<*>)