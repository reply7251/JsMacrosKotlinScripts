import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.core.notifications.event.NotificationEvent
import com.wynntils.core.text.StyledText
import com.wynntils.models.abilities.AbilityModel
import com.wynntils.models.abilities.type.OphanimOrb
import com.wynntils.models.abilities.type.ShamanMaskType
import me.hellrevenger.generated.BLINDNESS
import me.hellrevenger.generated.DARKNESS
import me.hellrevenger.generated.StatusEffects
import me.hellrevenger.generated.removeStatusEffectInternal
import me.hellrevenger.library.api.EventListener
import org.jetbrains.kotlin.backend.common.pop
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
    val R = 1
    val L = 2
    val map = mapOf(
        cast1 to arrayOf(R, L, R),
        cast2 to arrayOf(R, R, R),
        cast3 to arrayOf(R, L, L),
        cast4 to arrayOf(R, R, L)
    )
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

val attackCooldown = mc::class.java.getDeclaredField("field_1771")
attackCooldown.trySetAccessible()

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
    var lineIndex = -1
    var modifyConfig: (Boolean) -> Unit = { }

    var configPos = 150 to 50

    var targetY = -1.0
    var height = 5

    var terminated = false

    var spamSneak = false

    var reverseMouse = false
    var castQueue = mutableListOf<Int>()
    var spellCooldown = 10
    var castCooldown = 0
    var rightCooldown = 0
    var customCastEnabled = false


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

        binds["spellCooldown"] = Bind("key.keyboard.keypad.decimal") {
            configIndex = "spellCooldown"
            modifyConfig = { add ->
                if(add) spellCooldown += 1
                else spellCooldown -= 1
            }
            updateConfig()
        }

//        binds["customCastEnabled"] = Bind("key.keyboard.keypad.decimal") {
//            customCastEnabled = !customCastEnabled
//            updateConfig()
//        }

        return this
    }

    fun press(key: String) {
        KeyBind.pressKey(key)
        Client.waitTick()
        KeyBind.releaseKey(key)
    }

    fun pressKeyBind(key: String, record: Boolean = false, release: Boolean = true): Boolean {
        if(record) lastAction = key
        if(customCastEnabled) return cast(Actions.cast1)
        KeyBind.pressKeyBind(key)
        if(release) {
            Client.waitTick()
            KeyBind.releaseKeyBind(key)
        }
        return false
    }

    fun cast(action: String): Boolean {
        if(castQueue.size > 3) {
            return false
        }

        val queue = Actions.map[action]!!.map { if(reverseMouse) 2 - it else it }

        castQueue.addAll(queue)
        return true
    }

    fun cast1(release: Boolean = true) = pressKeyBind(Actions.cast1, true, release)

    fun cast2(release: Boolean = true) = pressKeyBind(Actions.cast2, true, release)

    fun cast3(release: Boolean = true) = pressKeyBind(Actions.cast3, true, release)

    fun cast4(release: Boolean = true) = pressKeyBind(Actions.cast4, true, release)

    fun melee() {
        lastMelee = World.time
        attackCooldown.set(mc, 0)
        Player.interactions()?.attack()
        attackCooldown.set(mc, 0)
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
        resetLineIndex()
    }

    fun removeBlind() {
        val player = Player.player?.raw ?: return
        player.removeStatusEffectInternal(StatusEffects::class.BLINDNESS)
        player.removeStatusEffectInternal(StatusEffects::class.DARKNESS)
    }

    open fun main() {
        reset()
        thread {
            while (enabled && World.isWorldLoaded) {
                if(!isBlocked())
                    chooseAction()
                Client.waitTick()
            }
            enabled = false
        }
    }

    open fun chooseAction() { }

    open fun updateConfig() {
        texts.forEach { d2d.reAddElement(it) }
        resetLineIndex()
        nextLine().setText("Enabled (${coloredKey(binds["enabled"]?.simpleName)}): " + coloredBoolean(enabled))
        nextLine().setText(coloredConfig("spellCooldown" ) + "SpellCooldown ${formatChar}r(${coloredKey(binds["spellCooldown"]?.simpleName)}): " + coloredNumber(spellCooldown))
        //nextLine().setText("Custom Spell Cast (${coloredKey(binds["customCastEnabled"]?.simpleName)}): " + coloredBoolean(customCastEnabled))
        nextLine().setText("Spam Shift (${coloredKey(binds["spamSneak"]?.simpleName)}): " + coloredBoolean(spamSneak))
    }

    fun coloredBoolean(bool: Boolean) = formatChar + (if(bool) "2" else "c") + bool

    fun coloredNumber(num: Number) = formatChar + "6$num"

    fun coloredKey(key: String?) = key ?.let { "${formatChar}6${key}${formatChar}r" } ?: ""

    fun coloredConfig(configName: String) = if(configIndex == configName) formatChar + "5" else ""

    fun resetLineIndex() {
        lineIndex = -1
    }

    fun nextLine(): Text {
        lineIndex++
        while(lineIndex >= texts.size) {
            texts.add(d2d.addText("", configPos.first, configPos.second + texts.size * 10, 0xffffff, true))
        }
        return texts[lineIndex]
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
        return Models.CharacterStats.blocksAboveGround < height - dy
    }

    fun getMana() = Models.CharacterStats.mana.percentage
    fun getHealth() = Models.CharacterStats.health.percentage

    fun findEffect(name: String) = Models.StatusEffect.statusEffects.find { it.name.contains(name) }
    fun isHoldItem(name: String) = Player.player?.let { it.mainHand.name.stringStripFormatting.lowercase() == name } ?: false

    open fun holdAction() {
    }

    fun smoothPitch(target: Float, ticks: Int = 1) {
        val player = Player.player?: return
        val pitch = player.pitch
        val perTick = (target - pitch) / ticks
        for(i in 1..ticks) {
            player.lookAt(player.yaw.toDouble(), (pitch + perTick * i).toDouble())
            Client.waitTick()
        }
    }

    open fun onIncompatible() { }

    open fun isBlocked() = false

    open fun onTick() {
        if(World.time % 2 == 0L) {
            if(World.isWorldLoaded && spamSneak) {
                pressKeyBind("key.sneak")
            }
        }
        castCooldown--
        if(castCooldown < 0 && castQueue.isNotEmpty()) {
            if(castQueue.pop() == Actions.L) {
                melee()
                castCooldown = 2
            } else {
                Player.interactions()?.interact()
                castCooldown = 4
            }
        }
        removeBlind()
    }
}

inner class Warrior : WynnClass() {
    var lastBash = 0L
    var lastWarScream = 0L
    var keepHeight = true
    var interactCounter = 0
    var attackCounter = 0

    var meleeInterval = 20
    var quick = true
    var cspam = false

    override fun onInitOverride(): WynnClass {
        binds["quick"] = Bind("key.keyboard.keypad.5") {
            quick = !quick
            updateConfig()
        }

        binds["cspam"] = Bind("key.keyboard.keypad.4") {
            cspam = !cspam
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
                if(add) height += 1
                else height -= 1
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

        nextLine().setText("CSpam (${coloredKey(binds["cspam"]?.simpleName)}): " + coloredBoolean(cspam))
        nextLine().setText("Quick (${coloredKey(binds["quick"]?.simpleName)}): " + coloredBoolean(quick))
        nextLine().setText("KeepHeight (${coloredKey(binds["keepHeight"]?.simpleName)}): " + coloredBoolean(keepHeight))
        nextLine().setText(coloredConfig("targetY" ) + "Target Y ${formatChar}r(${coloredKey(binds["targetY"]?.simpleName)}): " + coloredNumber(targetY))
        nextLine().setText(coloredConfig("height" ) + "Height ${formatChar}r(${coloredKey(binds["height"]?.simpleName)}): " + coloredNumber(height))
        nextLine().setText(coloredConfig("meleeInterval" ) + "MeleeInterval ${formatChar}r(${coloredKey(binds["meleeInterval"]?.simpleName)}): " + coloredNumber(meleeInterval))
    }

    fun heightCheck(time: Int = 4): Boolean {
        val player = Player.player ?: return false

        var speed = player.velocity.y
        if(speed < -1) return true

        val delay = ((ping / 50) - 4).toInt()
        var dy = 0.0
        val end = 4 + time
        for(tick in -delay..end) {
            speed -= 0.08;
            speed *= 0.98
            dy += speed;
        }
        return yAboveTarget(dy)
    }

    override fun reset() {
        super.reset()
        lastBash = 0
        lastWarScream = 0
        interactCounter = 0
        attackCounter = 0
    }

    fun isIdol() = isHoldItem("idol")

    fun burstCharge() = Models.Spell.lastBurstSpellName.lowercase().contains("charge") && Models.Spell.repeatedBurstSpellCount > 5

    override fun chooseAction() {
        if(cspam && isIdol()) {
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
        } else {
            if(World.time >= lastWarScream + 200) {
                cast4()
                lastWarScream = World.time
                Client.waitTick(spellCooldown)
            } else if(lastAction != Actions.cast1 && World.time >= lastBash + 30) {
                lastBash = World.time
                cast1()
                Client.waitTick(spellCooldown)
            } else if(lastAction != Actions.cast2 && keepHeight) {
                cast2()
                Client.waitTick(spellCooldown)
            } else if(World.time >= lastWarScream + 30) {
                cast4()
                lastWarScream = World.time
                Client.waitTick(spellCooldown)
            } else {
                cast3()
                Client.waitTick(spellCooldown)
            }
//            else if (lastMelee + meleeInterval + (Math.random() * 5).toInt() < World.time) {
//                melee()
//            }
        }
    }

    override fun onTick() {
        super.onTick()

        if(World.isWorldLoaded && isIdol() && quick) {
            if(attackKey.method_1434() && (lastMelee + meleeInterval + (Math.random() * 5).toInt() < World.time || (burstCharge() && attackCounter < 3))) {
                melee()
                interactCounter = 0
                attackCounter++
            } else {
                attackCounter = 0
            }
            if(interactKey.method_1434()) {
                Player.interactions()?.interact()
                interactCounter++
            }
        }
    }
}

inner class Assassin : WynnClass() {
    var tickToHop = 20

    var enableFly = true
    var enableDash = false
    var enableSmoke = false
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
                if(add) height += 1
                else height -= 1
            }
            updateConfig()
        }
        height = 3
        spellCooldown = 12
        return super.onInitOverride()
    }

    fun smoke() {
        cast4()
        lastSmoke = World.time
        Client.waitTick(spellCooldown)
    }

    fun multiHit(){
        cast3()
        Client.waitTick(spellCooldown)
    }

    fun dash() {
        cast2()
        lastDash = World.time
        Client.waitTick(spellCooldown)
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText("Dash (${coloredKey(binds["enableDash"]?.simpleName)}): " + coloredBoolean(enableDash))
        nextLine().setText("Smoke (${coloredKey(binds["enableSmoke"]?.simpleName)}): " + coloredBoolean(enableSmoke))
        nextLine().setText("MultiHit (${coloredKey(binds["enableMultiHit"]?.simpleName)}): " + coloredBoolean(enableMultiHit))
        nextLine().setText("Fly (${coloredKey(binds["enableFly"]?.simpleName)}): " + coloredBoolean(enableFly))
        nextLine().setText("ManualFly (${coloredKey(binds["enableManualFly"]?.simpleName)}): " + coloredBoolean(enableManualFly))
        nextLine().setText(coloredConfig("targetY" ) + "Target Y ${formatChar}r(${coloredKey(binds["targetY"]?.simpleName)}): " + coloredNumber(targetY))
        nextLine().setText(coloredConfig("height" ) + "Height ${formatChar}r(${coloredKey(binds["height"]?.simpleName)}): " + coloredNumber(height))
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
            Client.waitTick(16)
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
    var maxRepeat = 1
    var blocked = false

    fun getArchType(): String {
        return if(AbilityModel.ophanimBar.isActive) "lb"
        else if(AbilityModel.manaBankBar.isActive) "ar"
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

        nextLine().setText("IceSnake (${coloredKey(binds["enableIceSnake"]?.simpleName)}): " + coloredBoolean(enableIceSnake))
        nextLine().setText("Meteor (${coloredKey(binds["enableMeteor"]?.simpleName)}): " + coloredBoolean(enableMeteor))
        nextLine().setText(coloredConfig("maxRepeat" ) + "Repeat ${formatChar}r(${coloredKey(binds["maxRepeat"]?.simpleName)}): " + coloredNumber(maxRepeat))
    }

    override fun reset() {
        super.reset()
        lastHeal = 0
    }

    override fun chooseAction() {
        when (getArchType()) {
            "ar" -> { }
            "lb" -> lb()
            "rw" -> rw()
        }
    }

    fun orbNotHealthy() =
        AbilityModel.ophanimBar.orbs.any {
            it.string.startsWith(OphanimOrb.HealthState.DYING.color.toString())
        }

    fun lb() {
        val player = Player.player ?: return
        val health = getHealth()
        val notHealthy = health < 60 || orbNotHealthy()

        if(notHealthy && (lastAction != Actions.cast1 || World.time > lastHeal + 80) && getMana() > 40) {
            lastHeal = World.time
            cast1()
            Client.waitTick(spellCooldown)
        } else if(World.time - lastMelee >= 20 && !player.mainHand.isOnCooldown) {
            melee()
            Client.waitTick(1)
        } else if(enableIceSnake && getMana() > 75 && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat) || (notHealthy && getMana() > 55)) {
            cast4()
            Client.waitTick(spellCooldown)
        } else if((lastAction == Actions.cast4 && Models.Spell.repeatedSpellCount >= maxRepeat) && World.time - lastMelee <= 20 && getMana() > 75) {
            lastHeal = World.time
            cast1()
            Client.waitTick(spellCooldown)
        }
    }

    fun rw() {
        val player = Player.player ?: return
        val health = getHealth()
        if(health < 90 && lastAction != Actions.cast1) {
            cast1()
            lastHeal = World.time
            Client.waitTick(spellCooldown)
        } else if(enableIceSnake && (getMana() > 75 || health < 80)
            && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat)) {
            cast4()
            Client.waitTick(spellCooldown)
        } else if(enableMeteor && (getMana() > 75 || health < 80) && lastAction != Actions.cast3) {
            cast3()
            Client.waitTick(spellCooldown)
        } else if(!enableMeteor && lastAction == Actions.cast4) {
            cast1()
            lastHeal = World.time
            Client.waitTick(spellCooldown)
        } else if(enableMelee && World.time - lastMelee > 4 && !player.mainHand.isOnCooldown) {
            melee()
        }
    }

    override fun holdAction() {
        super.holdAction()

        thread {
            while (!terminated) {

                Client.waitTick()
                Client.waitTick()
            }
        }
    }

    override fun onTick() {
        super.onTick()
        if(World.time % 2 == 0L) {
            if(World.isWorldLoaded && isHoldItem("warp") && !enabled) {
                if(interactKey.method_1434()) {
                    Player.interactions()?.interact()
                }
            }
        }
    }

    override fun isBlocked(): Boolean {
        return blocked
    }
}

inner class Archer : WynnClass() {
    override fun onInitOverride(): WynnClass {
        reverseMouse = true

        return super.onInitOverride()
    }

    override fun chooseAction() {
        if(World.time % 2L == 0L) {
            Player.interactions()?.interact()
        }
    }

    override fun onTick() {
        super.onTick()
        if(World.isWorldLoaded) {
            if(interactKey.method_1434() && World.time % 2 == 0L) {
                Player.interactions()?.interact()
            }
        }
    }
}

inner class Shaman : WynnClass() {
    var lastAura = 0L
    var enableAwakened = false
    var enableBlood = false
    var assertMask = false
    var normal = true
    var lastTimeMask = 0L
    var recordedPitch = 0f
    var enableAura = false

    override fun onInitOverride(): WynnClass {

        binds["enableBlood"] = Bind("key.keyboard.keypad.5") {
            enableBlood = !enableBlood
            updateConfig()
        }

        binds["enableAwakened"] = Bind("key.keyboard.keypad.2") {
            enableAwakened = !enableAwakened
            updateConfig()
        }

        binds["normal"] = Bind("key.keyboard.keypad.8") {
            normal = !normal
            updateConfig()
        }

        binds["enableAura"] = Bind("key.keyboard.keypad.9") {
            enableAura = !enableAura
            updateConfig()
        }

        return super.onInitOverride()
    }

    override fun updateConfig() {
        super.updateConfig()

        nextLine().setText("Awakened (${coloredKey(binds["enableAwakened"]?.simpleName)}): " + coloredBoolean(enableAwakened))
        nextLine().setText("Blood (${coloredKey(binds["enableBlood"]?.simpleName)}): " + coloredBoolean(enableBlood))
        nextLine().setText("Normal (${coloredKey(binds["normal"]?.simpleName)}): " + coloredBoolean(normal))
        nextLine().setText("Aura (${coloredKey(binds["enableAura"]?.simpleName)}): " + coloredBoolean(enableAura))
    }

    override fun chooseAction() {
        if(awakened()) {
            val totem = Models.ShamanTotem.activeTotems.firstOrNull()
            if((totem == null || (totem.time < 2 && totem.time != -1)) && (enableBlood || normal) && Models.Spell.repeatedBurstSpellCount < 2) {
                totem(spellCooldown)
            } else if (((getHealth() < 65 && World.time - lastAura > 30 && totem != null) || (normal && !enableBlood)) && Models.Spell.repeatedBurstSpellCount < 3 && enableAura && getMana() > 40){
                cast3()
                lastAura = World.time
                Client.waitTick(spellCooldown)
            } else if(normal && !enableAwakened && enableAura) {
                cast4()
                Client.waitTick(spellCooldown)
            } else if(World.time % 2L == 0L) {
                melee()
            }
        } else if(World.time % 2L == 0L) {
            melee()
        }
    }

    fun awakened(): Boolean {
        if(!enableAwakened) return true
        val mask = Models.ShamanMask.currentMaskType
        val progress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f
        if(mask == ShamanMaskType.AWAKENED && findEffect("Awakened") != null) {
            Player.openInventory().selectedHotbarSlotIndex = 0
            return true
        } else if(progress >= 1f) {
            //Chat.log("try awakened")
            Player.openInventory().selectedHotbarSlotIndex = 0
            cast4()
            if(recordedPitch != 0f) {
                smoothPitch(recordedPitch, spellCooldown + 5)
                recordedPitch = 0f
            } else {
                Client.waitTick(spellCooldown + 5)
            }
            return false
        } else if(mask != ShamanMaskType.FANATIC && !assertMask) {
            //Chat.log("try switch mask")
            Player.openInventory().selectedHotbarSlotIndex = 0
            cast4()
            Client.waitTick(20)
            return false
        }  else {
            //Chat.log("try summon totem")
            assertMask = true
            val originalSlot = Player.openInventory().selectedHotbarSlotIndex
            Player.openInventory().selectedHotbarSlotIndex = 1
            if(recordedPitch == 0f) recordedPitch = Player.player!!.pitch
            totem(12, false)
            Player.openInventory().selectedHotbarSlotIndex = originalSlot
            return false
        }
    }

    override fun reset() {
        super.reset()
        lastAura = 0
        lastTimeMask = 0
        assertMask = false
    }

    fun totem(tick: Int = 10, back: Boolean = true) {
        val lookDown = 2
        val interval = 5
        val lookUp = tick - lookDown - interval
        val player = Player.player ?: return
        val pitch = player.pitch
        cast1()
        smoothPitch(90f, lookDown)
        Client.waitTick(interval)
        if(back) {
            smoothPitch(pitch, lookUp)
        } else {
            Client.waitTick(lookUp)
        }
    }

    fun setInterval(interval: Int = 100) {
        //right_interval_ms.set(configData, interval)
    }

    override fun onTick() {
        super.onTick()


        if(World.isWorldLoaded) {
            if(attackKey.method_1434() && World.time % 2 == 0L) {
                melee()
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
    "shaman" to Shaman(),
    "archer" to Archer(),
)

currentWynnClass.terminate()
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
}, true)

EventListener(context, EventArmorChange::class.java, { checkClass() }, true)



val notificationEvent = { it: NotificationEvent.Queue ->
    if(it.messageContainer.message.string.contains("Please wait for the incompatible spell-cast to finish.")) {
        thread {
            currentWynnClass.onIncompatible()
        }
    }
}

//WynntilsMod.registerListener(notificationEvent)

var running = true
thread {
    while (running) {
        currentWynnClass.onTick()
        Client.waitTick()
    }
}

JsMacros.assertEvent(event, "Service")
val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    running = false
    d2d.unregister()
    currentWynnClass.reset()
    currentWynnClass.terminate()
//    WynntilsMod.unregisterEventListener(notificationEvent)
}

checkClass()

Chat.toast("battle", "enabled")