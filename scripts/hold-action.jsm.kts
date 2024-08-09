

import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.impl.FWrapper
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.event.Event
import net.minecraft.class_2561
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.helpers.CommandContextHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.screen.ClickableWidgetHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.screen.SliderWidgetHelper
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val mc = Client.getMinecraft()
val interactKey =  mc.field_1690.field_1904;
val attackKey = mc.field_1690.field_1886;

object Globals {
    var globalInterval = 2

    var attackEnabled = false
    var attackInterval = 20
    var attackIntervalRandom = 20
    var interactEnabled = false
    var interactInterval = 2
    var interactIntervalRandom = 0

    var nextAttackTime = 0L
    var nextInteractTime = 0L
}

var globalInterval
    get() = Globals.globalInterval
    set(value) {
        Globals.globalInterval = value
        GlobalVars.putInt("globalInterval", value)
    }

var attackEnabled
    get() = Globals.attackEnabled
    set(value) {
        Globals.attackEnabled = value
        GlobalVars.putBoolean("attackEnabled", value)
    }
var attackInterval
    get() = Globals.attackInterval
    set(value) {
        Globals.attackInterval = value
        GlobalVars.putInt("attackInterval", value)
    }
var attackIntervalRandom
    get() = Globals.attackIntervalRandom
    set(value) {
        Globals.attackIntervalRandom = value
        GlobalVars.putInt("attackIntervalRandom", value)
    }
var interactEnabled
    get() = Globals.interactEnabled
    set(value) {
        Globals.interactEnabled = value
        GlobalVars.putBoolean("interactEnabled", value)
    }
var interactInterval
    get() = Globals.interactInterval
    set(value) {
        Globals.interactInterval = value
        GlobalVars.putInt("interactInterval", value)
    }
var interactIntervalRandom
    get() = Globals.interactIntervalRandom
    set(value) {
        Globals.interactIntervalRandom = value
        GlobalVars.putInt("interactIntervalRandom", value)
    }

var nextAttackTime = 0L
var nextInteractTime = 0L

JsMacros.createCustomEvent("HoldAction").registerEvent()
JsMacros.on("HoldAction", JavaWrapper.methodToJava(fun(event: BaseEvent, _: EventContainer<*>){
    if(event !is EventCustom) return
    with(event) {
        if(getBoolean("loadFromGlobal") == true) {
            Globals.globalInterval = GlobalVars.getInt("globalInterval") ?: globalInterval
            Globals.attackEnabled = GlobalVars.getBoolean("attackEnabled") ?: attackEnabled
            Globals.attackInterval = GlobalVars.getInt("attackInterval") ?: attackInterval
            Globals.attackIntervalRandom = GlobalVars.getInt("attackIntervalRandom") ?: attackIntervalRandom
            Globals.interactEnabled = GlobalVars.getBoolean("interactEnabled") ?: interactEnabled
            Globals.interactInterval = GlobalVars.getInt("interactInterval") ?: interactInterval
            Globals.interactIntervalRandom = GlobalVars.getInt("interactIntervalRandom") ?: interactIntervalRandom
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
}))

val _event = JsMacros.createCustomEvent("HoldAction")
_event.putBoolean("loadFromGlobal", true)
_event.trigger()

var tick = 0L

val closedField = Reflection.getDeclaredField(BaseScriptContext::class.java, "closed")
closedField.trySetAccessible()
EventCenter.registerEvent(context.ctx, ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
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

val screen = Hud.createScreen("HoldActionConfig", false)

fun IScreen.labeledButton(labelText: String, x: Int, y: Int, buttonText: String,
                          callback: (ClickableWidgetHelper<*,*>, IScreen) -> Unit): Pair<Text, ClickableWidgetHelper<*, *>> {
    val label = this.addText(labelText, x, y + 6, 0xffffff, true)
    val button = this.addButton(x + label.width + 10, y, 60, 20, buttonText, JavaWrapper.m2j2(callback))
    return label to button
}

fun IScreen.labeledSlider(labelText: String, x: Int, y: Int, initValue: Double = 1.0, steps: Int = 20,
                          callback: (SliderWidgetHelper, IScreen) -> Any): Pair<SliderWidgetHelper, Text> {
    val label = this.labeled(labelText, x, y)
    val slider = this.addSlider(label.second + 20,
        y, 100, 20, "", initValue, steps, JavaWrapper.m2j2 {slider, screen ->
            val result = callback(slider, screen)
            label.first.setText("$labelText: $result")
    })
    label.first.setText("$labelText: ${callback(slider, this)}")
    return slider to label.first
}
fun IScreen.labeled(labelText: String, x: Int, y: Int): Pair<Text, Int> {
    val label = this.addText(labelText, x, y + 6, 0xffffff, true)
    return label to x + label.width + 10
}
fun getText(text: String) = TextHelper.wrap(class_2561.method_43470(text))

fun initScreen() {
    val iscreen = screen as IScreen

    iscreen.setOnInit(JavaWrapper.m2j1 { screen ->
        val left = screen.width / 3
        val top = screen.height / 3

        iscreen.labeledSlider("Global Interval", left, top,
            (globalInterval - 1).toDouble() / 19, 19) { slider, screen ->
            globalInterval = (slider.value * 19).toInt() + 1
            return@labeledSlider globalInterval
        }

        iscreen.labeledButton("Attack Enabled", left, top + 30, attackEnabled.toString()) { btn, screen ->
            attackEnabled = !attackEnabled
            btn.setLabel(getText(attackEnabled.toString()))

        }

        iscreen.labeledSlider("Attack Interval", left, top + 60,
            attackInterval.toDouble() / 40, 40) { slider, screen ->
            attackInterval = (slider.value * 39).toInt()
            return@labeledSlider attackInterval
        }

        iscreen.labeledSlider("Attack Interval Random", left, top + 90,
            attackIntervalRandom.toDouble() / 40, 40) { slider, screen ->
            attackIntervalRandom = (slider.value * 40).toInt()
            return@labeledSlider attackIntervalRandom
        }

        iscreen.labeledButton("Interact Enabled", left, top + 120, interactEnabled.toString()) { btn, screen ->
            interactEnabled = !interactEnabled
            btn.setLabel(getText(interactEnabled.toString()))
        }

        iscreen.labeledSlider("Interact Interval", left, top + 150,
            interactInterval.toDouble() / 40, 40) { slider, screen ->
            interactInterval = (slider.value * 40).toInt()
            return@labeledSlider interactInterval
        }

        iscreen.labeledSlider("Interact Interval Random", left, top + 180,
            (interactIntervalRandom).toDouble() / 40, 40) { slider, screen ->
            interactIntervalRandom = (slider.value * 40).toInt()
            return@labeledSlider interactIntervalRandom
        }

    })
}
initScreen()

Chat.commandManager.createCommandBuilder("/hold")
    .executes(JavaWrapper.methodToJava(fun(ctx: CommandContextHelper){
        thread {
            Client.waitTick(1)
            Hud.openScreen(screen as IScreen)
        }
    }))
    .register()

(event as EventService).stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    Chat.commandManager.unregisterCommand("/hold")
} as Function0<*>)

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}
Chat.toast("hold action enabled", "")