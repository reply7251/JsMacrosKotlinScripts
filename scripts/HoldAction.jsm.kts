@file:Suppress("HasPlatformType")

import me.hellrevenger.jsmacroskotlinscript.script.library.api.literal
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.helper.CommandContextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.screen.ClickableWidgetHelper
import xyz.wagyourtail.jsmacros.client.api.helper.screen.SliderWidgetHelper
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import kotlin.concurrent.thread

val mc = Client.minecraft
val interactKey = mc.options.keyUse
val attackKey = mc.options.keyAttack

object Globals {
    var globalInterval = 2

    var attackEnabled = false
    var attackInterval = 20
    var attackIntervalRandom = 20
    var interactEnabled = false
    var interactInterval = 2
    var interactIntervalRandom = 0
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

JsMacros.on("HoldAction", JavaWrapper.methodToJava { event: BaseEvent, _: EventContainer<*> ->
    if (event !is EventCustom) return@methodToJava
    with(event) {
        if (getBoolean("loadFromGlobal") == true) {
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
        if (globalInterval == 0) {
            globalInterval = 1
        }
    }
})

val customEvent = JsMacros.createCustomEvent("HoldAction")
customEvent.putBoolean("loadFromGlobal", true)
customEvent.trigger()

var tick = 0L

EventListener.registerForScript(ClientTickEvents.START_CLIENT_TICK, ClientTickEvents.StartTick {
    if ((tick++).toInt() % globalInterval == 0) {
        if(nextAttackTime > tick + attackIntervalRandom + attackInterval) {
            nextAttackTime = 0
        }
        if(nextInteractTime > tick + interactIntervalRandom + interactInterval) {
            nextInteractTime = 0
        }
        if (attackEnabled && attackKey.isDown && tick > nextAttackTime) {
            Player.interactions()!!.attack()
            nextAttackTime = tick + attackInterval + (Math.random() * attackIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", true)
        } else if (interactEnabled && interactKey.isDown && tick > nextInteractTime) {
            Player.interactions()?.interact()
            nextInteractTime = tick + interactInterval + (Math.random() * interactIntervalRandom).toLong()
            JsMacros.createCustomEvent("HoldActionCallback").putBoolean("attack", false)
        }
    }
})


val screen = Hud.createScreen("HoldActionConfig", false)

fun IScreen.labeledButton(labelText: String, x: Int, y: Int, buttonText: String,
                          callback: (ClickableWidgetHelper<*, *>, IScreen) -> Unit): Pair<Text, ClickableWidgetHelper<*, *>> {
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
fun getText(text: String) = TextHelper.wrap(text.literal())

fun initScreen() {
    val iscreen = screen as IScreen

    iscreen.setOnInit(JavaWrapper.m2j1 { screen ->
        val left = screen.width / 3
        val top = screen.height / 3

        iscreen.labeledSlider("Global Interval", left, top,
            (globalInterval - 1).toDouble() / 19, 19) { slider, _ ->
            globalInterval = (slider.value * 19).toInt() + 1
            return@labeledSlider globalInterval
        }

        iscreen.labeledButton("Attack Enabled", left, top + 30, attackEnabled.toString()) { btn, _ ->
            attackEnabled = !attackEnabled
            btn.setLabel(getText(attackEnabled.toString()))

        }

        iscreen.labeledSlider("Attack Interval", left, top + 60,
            attackInterval.toDouble() / 40, 40) { slider, _ ->
            attackInterval = (slider.value * 39).toInt()
            return@labeledSlider attackInterval
        }

        iscreen.labeledSlider("Attack Interval Random", left, top + 90,
            attackIntervalRandom.toDouble() / 40, 40) { slider, _ ->
            attackIntervalRandom = (slider.value * 40).toInt()
            return@labeledSlider attackIntervalRandom
        }

        iscreen.labeledButton("Interact Enabled", left, top + 120, interactEnabled.toString()) { btn, _ ->
            interactEnabled = !interactEnabled
            btn.setLabel(getText(interactEnabled.toString()))
        }

        iscreen.labeledSlider("Interact Interval", left, top + 150,
            interactInterval.toDouble() / 40, 40) { slider, _ ->
            interactInterval = (slider.value * 40).toInt()
            return@labeledSlider interactInterval
        }

        iscreen.labeledSlider("Interact Interval Random", left, top + 180,
            (interactIntervalRandom).toDouble() / 40, 40) { slider, _ ->
            interactIntervalRandom = (slider.value * 40).toInt()
            return@labeledSlider interactIntervalRandom
        }

    })
}
initScreen()

Chat.commandManager.createCommandBuilder("/hold")
    .executes(JavaWrapper.methodToJava(fun (ctx: CommandContextHelper) {
        thread {
            Client.waitTick(1)
            Hud.openScreen(screen as IScreen)
        }
    }))
    .register()

context.onContextClosed {
    Chat.commandManager.unregisterCommand("/hold")
}

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}
Chat.toast("hold action enabled", "")