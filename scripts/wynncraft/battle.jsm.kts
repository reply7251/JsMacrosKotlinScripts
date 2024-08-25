import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.models.abilities.BossBarModel
import com.wynntils.models.abilities.type.OphanimOrb
import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventArmorChange
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.math.ceil

object Actions {
    val cast1 = "Cast 1st Spell"
    val cast2 = "Cast 2nd Spell"
    val cast3 = "Cast 3rd Spell"
    val cast4 = "Cast 4th Spell"
    val jump = "key.jump"
}

val skill1Key = "key.keyboard.c"
var enableMelee = true

val d2d = Hud.createDraw2D()

class Bind(val key: String, val callback: () -> Unit) {
    val simpleName = key.substring(key.lastIndexOf('.')+1)
}
val mc = Client.minecraft
val interactKey =  mc.field_1690.field_1904;
val attackKey = mc.field_1690.field_1886;

open inner class WynnClass {
    var lastAction = ""
    var ping = 200.0
    var lastMelee = 0L
    var enabled = false
    val texts = arrayListOf<Text>()
    val binds = hashMapOf<String, Bind>()
    val crossHair = d2d.addText("", 0, 0, 0xffffff, true)
    val formatChar = '§'

    var configIndex = ""
    var modifyConfig: (Boolean) -> Unit = { }

    var configPos = 150 to 50

    var targetY = -1.0
    var height = 5

    var terminated = false

    var spamSneak = false

    init {
        onInit()
    }

    private fun onInit() {
        onInitOverride()
    }

    open fun onInitOverride(): WynnClass {
        binds["enabled"] = Bind("key.keyboard.f") {
            enabled = !enabled
            updateConfig()
            if(enabled) {
                main()
            }
        }

        binds["addKey"] = Bind("key.keyboard.keypad.add") {
            modifyConfig.invoke(true)
            updateConfig()
        }
        binds["subKey"] = Bind("key.keyboard.keypad.subtract") {
            modifyConfig.invoke(false)
            updateConfig()
        }

        binds["spamSneak"] = Bind("key.keyboard.keypad.0") {
            spamSneak = !spamSneak
            updateConfig()
        }

        return this
    }

    fun press(key: String) {
        KeyBind.pressKey(key)
        Client.waitTick()
        KeyBind.releaseKey(key)
    }

    fun pressKeyBind(key: String, record: Boolean = false) {
        if(record) lastAction = key
        KeyBind.pressKeyBind(key)
        Client.waitTick()
        KeyBind.releaseKeyBind(key)
    }

    fun cast1() = pressKeyBind(Actions.cast1, true)

    fun cast2() = pressKeyBind(Actions.cast2, true)

    fun cast3() = pressKeyBind(Actions.cast3, true)

    fun cast4() = pressKeyBind(Actions.cast4, true)

    fun melee() {
        lastMelee = World.time
        Player.interactions()?.attack()
    }

    fun updatePing(): Double {
        val ping0 = Services.Ping.ping
        ping = if (ping0 > ping * 1.2 || ping0 < ping * 0.8) {
            ping0.toDouble()
        } else {
            ping * 0.9 + ping0
        }
        return ping
    }

    open fun reset() {
        lastMelee = 0
    }

    open fun main() {
        reset()
        thread {
            while (enabled && World.isWorldLoaded) {
                chooseAction()
                Client.waitTick()
            }
            enabled = false
        }
    }

    open fun chooseAction() { }

    open fun updateConfig() {
        texts.forEach { d2d.reAddElement(it) }
        getLine(0).setText("Enabled (${coloredKey(binds["enabled"]?.simpleName)}): " + coloredBoolean(enabled))
        getLine(1).setText("Spam Shift (${coloredKey(binds["spamSneak"]?.simpleName)}): " + coloredBoolean(spamSneak))
    }

    fun coloredBoolean(bool: Boolean) = formatChar + (if(bool) "2" else "c") + bool

    fun coloredNumber(num: Number) = formatChar + "6$num"

    fun coloredKey(key: String?) = key ?.let { "${formatChar}6${key}${formatChar}r" } ?: ""

    fun coloredConfig(configName: String) = if(configIndex == configName) formatChar + "5" else ""

    fun getLine(index: Int): Text {
        while(index+1 >= texts.size) {
            texts.add(d2d.addText("", configPos.first, configPos.second + texts.size * 10, 0xffffff, true))
        }
        return texts[index]
    }

    fun setCrossHairText(text: String) {
        crossHair.setText(text)
        crossHair.y = d2d.height / 2 + 10
        crossHair.x = (d2d.width - crossHair.width) / 2
    }

    open fun onKey(e: EventKey) {
        if(e.action != 1) return
        binds.values.forEach {
            if(it.key == e.key) {
                it.callback.invoke()
            }
        }
    }

    open fun restart() {
        terminated = false
        d2d.unregister()
        d2d.register()
        d2d.reAddElement(crossHair)
        updateConfig()
        texts.forEach { d2d.reAddElement(it) }
        KeyBind.setKeyBind("key.attack", "key.mouse.left")
        KeyBind.setKeyBind("key.use", "key.mouse.right")
        holdAction()
    }

    open fun terminate() {
        texts.forEach {
            d2d.removeText(it)
        }
        d2d.removeText(crossHair)
        terminated = true
    }

    fun yAboveTarget(dy: Double): Boolean {
        val player = Player.player ?: return false
        if(player.y + dy - height < targetY) return true
        val distance = ceil(height - dy).toInt()
        var blockPos = player.blockPos
        for(i in 0..distance) {
            if(World.getBlock(blockPos)?.blockStateHelper?.isSolid == true) return true
            blockPos = blockPos.down()
        }
        return false
    }

    fun getMana() = Models.CharacterStats.mana.percentage
    fun getHealth() = Models.CharacterStats.health.percentage

    open fun holdAction() {
        thread {
            while (!terminated) {
                if(World.isWorldLoaded && spamSneak) {
                    pressKeyBind("key.sneak")
                }
                Client.waitTick(2)
            }
        }
    }
}

inner class Warrior : WynnClass() {
    var lastBash = 0L
    var lastWarScream = 0L
    var keepHeight = true
    var interactCounter = 0

    var meleeInterval = 20
    var quick = true

    override fun onInitOverride(): WynnClass {
        binds["quick"] = Bind("key.keyboard.keypad.5") {
            quick = !quick
            updateConfig()
        }


        binds["keepHeight"] = Bind("key.keyboard.keypad.7") {
            keepHeight = !keepHeight
            updateConfig()
        }

        binds["targetY"] = Bind("key.keyboard.keypad.8") {
            configIndex = "targetY"
            modifyConfig = { onSet ->
                targetY = if(onSet) Player.player?.y ?: -1.0 else -1.0
            }
            updateConfig()
        }

        binds["height"] = Bind("key.keyboard.keypad.9") {
            configIndex = "height"
            modifyConfig = { add ->
                if(add) height += 3
                else height -= 3
            }
            updateConfig()
        }

        binds["meleeInterval"] = Bind("key.keyboard.keypad.1") {
            configIndex = "meleeInterval"
            modifyConfig = { add ->
                if(add) meleeInterval += 3
                else meleeInterval -= 3
            }
            updateConfig()
        }

        return super.onInitOverride()
    }

    override fun updateConfig() {
        super.updateConfig()

        getLine(2).setText("Quick (${coloredKey(binds["quick"]?.simpleName)}): " + coloredBoolean(quick))
        getLine(3).setText("KeepHeight (${coloredKey(binds["keepHeight"]?.simpleName)}): " + coloredBoolean(keepHeight))
        getLine(4).setText(coloredConfig("targetY" ) + "Target Y ${formatChar}r(${coloredKey(binds["targetY"]?.simpleName)}): " + coloredNumber(targetY))
        getLine(5).setText(coloredConfig("height" ) + "Height ${formatChar}r(${coloredKey(binds["height"]?.simpleName)}): " + coloredNumber(height))
        getLine(6).setText(coloredConfig("meleeInterval" ) + "MeleeInterval ${formatChar}r(${coloredKey(binds["meleeInterval"]?.simpleName)}): " + coloredNumber(meleeInterval))
    }

    fun heightCheck(): Boolean {
        val player = Player.player ?: return false

        var speed = player.velocity.y
        if(speed < -1) return true

        val delay = ((ping / 50) - 4).toInt()
        var dy = 0.0
        for(tick in -delay..4) {
            speed -= 0.08;
            speed *= 0.98
            dy += speed;
        }
        return yAboveTarget(dy)
    }

    override fun reset() {
        super.reset()
        interactCounter = 0
    }

    fun isIdol() = Player.player?.let { it.mainHand.name.stringStripFormatting.lowercase() == "idol" } ?: false

    fun burstCharge() = Models.Spell.lastBurstSpellName.lowercase().contains("charge") && Models.Spell.repeatedBurstSpellCount > 5

    override fun chooseAction() {
        if(isIdol()) {
            if(!keepHeight || heightCheck()) {
                if(World.time % 2L == 0L) {
                    Player.interactions()?.interact()
                    interactCounter++
                }
                if(lastMelee + meleeInterval + (Math.random() * 5).toInt() < World.time
                    || burstCharge()) {
                    melee()
                    interactCounter = 0
                }
            }
        }
    }

    override fun holdAction() {
        super.holdAction()

        thread {
            while (!terminated) {
                if(World.isWorldLoaded && isIdol() && quick) {
                    if(attackKey.method_1434() && (lastMelee + meleeInterval + (Math.random() * 5).toInt() < World.time || burstCharge())) {
                        melee()
                        interactCounter = 0
                    } else if(interactKey.method_1434()) {
                        Player.interactions()?.interact()
                        interactCounter++
                    }
                }
                Client.waitTick()
            }
        }
    }
}

inner class Assassin : WynnClass() {
    var tickToHop = 20

    var enableFly = true
    var enableDash = true
    var enableSmoke = true
    var enableMultiHit = true

    var enableManualFly = true
    var manualFlying = false

    var lastSmoke = 0L
    var lastDash = 0L


    override fun onInitOverride(): WynnClass {
        binds["enableDash"] = Bind("key.keyboard.keypad.1") {
            enableDash = !enableDash
            updateConfig()
        }
        binds["enableSmoke"] = Bind("key.keyboard.keypad.2") {
            enableSmoke = !enableSmoke
            updateConfig()
        }
        binds["enableMultiHit"] = Bind("key.keyboard.keypad.3") {
            enableMultiHit = !enableMultiHit
            updateConfig()
        }

        binds["enableFly"] = Bind("key.keyboard.keypad.5") {
            enableFly = !enableFly
            updateConfig()
        }

        binds["enableManualFly"] = Bind("key.keyboard.keypad.4") {
            enableManualFly = !enableManualFly
            updateConfig()
        }

        binds["manualFlying"] = Bind(skill1Key) {
            if(enabled) return@Bind
            manualFlying = true
            thread {
                setCrossHairText("Wait !!!")
                //cast1()
                Client.waitTick(17)
                pressKeyBind(Actions.jump)
                Client.waitTick()
                pressKeyBind(Actions.jump)
                chooseAction()
                setCrossHairText("")
                manualFlying = false
            }
        }

        binds["targetY"] = Bind("key.keyboard.keypad.7") {
            configIndex = "targetY"
            modifyConfig = { onSet ->
                targetY = if(onSet) Player.player?.y ?: -1.0 else -1.0
            }
            updateConfig()
        }

        binds["height"] = Bind("key.keyboard.keypad.8") {
            configIndex = "height"
            modifyConfig = { add ->
                if(add) height += 3
                else height -= 3
            }
            updateConfig()
        }

        return super.onInitOverride()
    }

    fun smoke() {
        cast4()
        lastSmoke = World.time
        Client.waitTick(12)
    }

    fun multiHit(){
        cast3()
        Client.waitTick(12)
    }

    fun dash() {
        cast2()
        lastDash = World.time
        Client.waitTick(12)
    }

    override fun updateConfig() {
        super.updateConfig()
        getLine(2).setText("Dash (${coloredKey(binds["enableDash"]?.simpleName)}): " + coloredBoolean(enableDash))
        getLine(3).setText("Smoke (${coloredKey(binds["enableSmoke"]?.simpleName)}): " + coloredBoolean(enableSmoke))
        getLine(4).setText("MultiHit (${coloredKey(binds["enableMultiHit"]?.simpleName)}): " + coloredBoolean(enableMultiHit))
        getLine(5).setText("Fly (${coloredKey(binds["enableFly"]?.simpleName)}): " + coloredBoolean(enableFly))
        getLine(6).setText("ManualFly (${coloredKey(binds["enableManualFly"]?.simpleName)}): " + coloredBoolean(enableManualFly))
        getLine(7).setText(coloredConfig("targetY" ) + "Target Y ${formatChar}r(${coloredKey(binds["targetY"]?.simpleName)}): " + coloredNumber(targetY))
        getLine(8).setText(coloredConfig("height" ) + "Height ${formatChar}r(${coloredKey(binds["height"]?.simpleName)}): " + coloredNumber(height))
    }

    fun heightCheck(): Boolean {
        val player = Player.player ?: return false

        var speed = player.velocity.y
        if(speed < -1) return true

        val delay = ((ping / 50) - 4).toInt()
        var dy = 0.0
        for(tick in -delay..tickToHop-1) {
            if(tick == 10) {
                speed = 0.22
            } else {
                speed -= 0.08;
            }
            speed *= 0.98
            dy += speed;
        }
        return yAboveTarget(dy)
    }

    fun tryMelee() {
        if(enableMelee && World.time - lastMelee > 4) {
            melee()
        }
    }

    override fun chooseAction(){
        val player = Player.player ?: return
        if(!manualFlying && lastAction != Actions.cast1) {
            if(!heightCheck()) {
                tryMelee()
                return
            }
            cast1()
            Client.waitTick(15)
            tryMelee()
            if(enableFly) {
                val wasJumping = KeyBind.pressedKeys.contains(KeyBind.keyBindings[Actions.jump])
                KeyBind.releaseKeyBind(Actions.jump)
                Client.waitTick()
                pressKeyBind(Actions.jump)
                Client.waitTick()
                pressKeyBind(Actions.jump)
                if(wasJumping) {
                    Client.waitTick()
                    KeyBind.pressKeyBind(Actions.jump)
                }
            }
        } else if(enableSmoke && getMana() > 55 && World.time - lastSmoke > 100) {
            smoke()
        } else if(enableMultiHit && getMana() > 75 && (World.time - lastDash < 120 || !enableDash)) {
            multiHit()
        } else if(!enableDash) {
            if(enableSmoke) {
                smoke()
            } else if(enableMultiHit) {
                multiHit()
            } else {
                lastAction = ""
            }
        } else {
            dash()
        }
    }

    override fun onKey(e: EventKey) {
        if(manualFlying && e.action == 1 && e.key == skill1Key) {
            e.cancel()
            return
        }
        super.onKey(e)
    }

    override fun reset() {
        super.reset()
        lastSmoke = 0
        lastDash = 0
        lastAction = ""
    }
}

inner class Mage : WynnClass() {
    var lastHeal = 0L
    var enableIceSnake = true
    var enableMeteor = true
    var maxRepeat = 2

    fun getArchType(): String {
        return if(BossBarModel.ophanimBar.isActive) "lb"
        else if(BossBarModel.manaBankBar.isActive) "ar"
        else "rw"
    }

    override fun onInitOverride(): WynnClass {
        binds["enableIceSnake"] = Bind("key.keyboard.keypad.4") {
            enableIceSnake = !enableIceSnake
            updateConfig()
        }
        binds["enableMeteor"] = Bind("key.keyboard.keypad.5") {
            enableMeteor = !enableMeteor
            updateConfig()
        }

        binds["maxRepeat"] = Bind("key.keyboard.keypad.7") {
            configIndex = "maxRepeat"
            modifyConfig = { onSet ->
                maxRepeat = if(onSet) maxRepeat+1 else maxRepeat-1
            }
            updateConfig()
        }


        return super.onInitOverride()
    }

    override fun updateConfig() {
        super.updateConfig()

        getLine(2).setText("IceSnake (${coloredKey(binds["enableIceSnake"]?.simpleName)}): " + coloredBoolean(enableIceSnake))
        getLine(3).setText("Meteor (${coloredKey(binds["enableMeteor"]?.simpleName)}): " + coloredBoolean(enableMeteor))
        getLine(4).setText(coloredConfig("maxRepeat" ) + "Repeat ${formatChar}r(${coloredKey(binds["maxRepeat"]?.simpleName)}): " + coloredNumber(maxRepeat))
    }

    override fun chooseAction() {
        when (getArchType()) {
            "ar" -> { }
            "lb" -> lb()
            "rw" -> rw()
        }
    }

    fun orbNotHealthy() =
        BossBarModel.ophanimBar.orbs.any {
            it.string.startsWith(OphanimOrb.HealthState.DYING.color.toString())
        }

    fun lb() {
        val player = Player.player ?: return
        val health = getHealth()
        val notHealthy = health < 60 || orbNotHealthy()

        if(notHealthy && lastAction != Actions.cast1) {
            cast1()
            lastHeal = World.time
            Client.waitTick(10)
        } else if(World.time - lastMelee >= 30 && !player.mainHand.isOnCooldown) {
            melee()
            Client.waitTick(10)
        } else if(enableIceSnake && getMana() > 75 && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat) || notHealthy) {
            cast4()
            Client.waitTick(10)
        } else if((lastAction == Actions.cast4 && Models.Spell.repeatedSpellCount >= maxRepeat) && World.time - lastMelee <= 20 && getMana() > 75) {
            cast1()
            lastHeal = World.time
            Client.waitTick(10)
        }
    }

    fun rw() {
        val player = Player.player ?: return
        val health = getHealth()
        if(health < 90 && lastAction != Actions.cast1) {
            cast1()
            lastHeal = World.time
            Client.waitTick(10)
        } else if(enableIceSnake && (getMana() > 75 || health < 80)
            && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat)) {
            cast4()
            Client.waitTick(10)
        } else if(enableMeteor && (getMana() > 75 || health < 80) && lastAction != Actions.cast3) {
            cast3()
            Client.waitTick(10)
        } else if(!enableMeteor && lastAction == Actions.cast4) {
            cast1()
            lastHeal = World.time
            Client.waitTick(10)
        } else if(enableMelee && World.time - lastMelee > 4 && !player.mainHand.isOnCooldown) {
            melee()
        }
    }
}

inner class Archer : WynnClass() {

    override fun restart() {
        super.restart()

        KeyBind.setKeyBind("key.attack", "key.mouse.right")
        KeyBind.setKeyBind("key.use", "key.mouse.left")
    }

    override fun chooseAction() {
        if(World.time % 2L == 0L) {
            Player.interactions()?.interact()
        }
    }

    override fun holdAction() {
        super.holdAction()
        thread {
            while (!terminated) {
                if(World.isWorldLoaded) {
                    if(interactKey.method_1434()) {
                        Player.interactions()?.interact()
                    }
                }
                Client.waitTick()
            }
        }
    }
}


var currentWynnClass: WynnClass = WynnClass()
var currentClassString = ""

val classes = mapOf(
    "assassin" to Assassin(),
    "warrior" to Warrior(),
    "mage" to Mage(),
    "shaman" to WynnClass(),
    "archer" to Archer(),
)

classes.forEach {
    it.value.terminate()
}

fun checkClass() {
    if(!World.isWorldLoaded) return
    val weapon = Player.openInventory().getSlot(36)
    weapon.lore.firstOrNull {
        it.withoutFormatting().string.contains("Class Req:")
    }?.let {
        val newClass = it.withoutFormatting().string.split(" ")[3].split("/")[0].lowercase()
        if(newClass != currentClassString) {
            currentWynnClass.enabled = false
            currentWynnClass.reset()
            currentWynnClass.terminate()
            currentClassString = newClass
            currentWynnClass = classes[currentClassString] ?: return@let
            currentWynnClass.restart()
        }
    }
}

EventListener(context, EventKey::class.java, { e ->
    currentWynnClass.onKey(e)
})

EventListener(context, EventArmorChange::class.java, { checkClass() })



JsMacros.assertEvent(event, "Service")
val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    d2d.unregister()
}

checkClass()

Chat.toast("battle", "enabled")