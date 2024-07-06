

import com.wynntils.core.components.Managers;

import com.wynntils.features.overlays.InfoBoxFeature
import com.wynntils.overlays.infobox.InfoBoxOverlay
import com.wynntils.core.components.Services.Ping
import com.wynntils.core.persisted.config.Config
import com.wynntils.core.text.StyledText
import com.wynntils.features.overlays.SpellCastMessageOverlayFeature
import com.wynntils.overlays.SpellCastMessageOverlay
import com.wynntils.models.spells.type.SpellFailureReason
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventHeldItemChange
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val infoBoxOverlaysField = Reflection.getDeclaredField(InfoBoxFeature::class.java, "infoBoxOverlays")
infoBoxOverlaysField.trySetAccessible()

val infoBoxFeature = Managers.Feature.getFeatureInstance(InfoBoxFeature::class.java)
val infoBoxes = infoBoxOverlaysField.get(infoBoxFeature) as List<InfoBoxOverlay>

val spellCastOverlayField = Reflection.getDeclaredField(SpellCastMessageOverlayFeature::class.java, "spellCastOverlay")
spellCastOverlayField.trySetAccessible()
val spellCastOverlay = spellCastOverlayField.get(Managers.Feature.getFeatureInstance(SpellCastMessageOverlayFeature::class.java)) as SpellCastMessageOverlay

val spellMessageField = Reflection.getDeclaredField(SpellCastMessageOverlay::class.java, "spellMessage")
spellMessageField.trySetAccessible()
val spellMessageTimerField = Reflection.getDeclaredField(SpellCastMessageOverlay::class.java, "spellMessageTimer")
spellMessageTimerField.trySetAccessible()

fun SpellCastMessageOverlay.spellMessage(): StyledText = spellMessageField.get(this) as StyledText
fun SpellCastMessageOverlay.spellMessageTimer(): Int = spellMessageTimerField.get(this) as Int

class InfoBoxData {
    fun fix(s: String, len: Int = 24): String {
        return if (s.length < len) s + " ".repeat(len-s.length) else s
    }

    fun enableColor(boolean: Boolean): String {
        return if (boolean) "§2true" else "§cfalse"
    }
    fun updateMessage() {
        var result = ""
        result += this.fix("\nEnabled---------" + enableColor(status.enabled))
        result += this.fix("\nMelee(4)--------" + enableColor(status.melee))
        result += this.fix("\nOtherSpell(5)---" + enableColor(status.useOtherSpell))
        result += this.fix("\nCharge(6)-------" + enableColor(status.useCharge))
        result += this.fix("\nInterval(+ -)---" + "§6" + status.spellInterval)
        result += this.fix("\nKeepHeight(9 r)---" + enableColor(macro.keepHeight))
        result += this.fix("\nHeight(arrow)---" + "§6" + macro.height)
        result += this.fix("\nTargetY(7+ 8-)---%.2f".format(macro.targetHeight))
        result += this.fix("\nQuick(3)---------" + enableColor(status.quick))
        if(status.debugMessage.isNotEmpty()) result += this.fix("\n" + status.debugMessage)
        setOverlayMessage(0, result);
    }
}

val infoBox = InfoBoxData()

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

val HoldActionConfig = Globals()

object status {
    var enabled = false
    var counter = 0
    var entityCounter = 0
    var tickToWait = 0
    var message = null
    var lastMessageTime = 0
    var cycleIndex = 0
    var cycleTimer = 0
    var manualFly = true
    var fly = true
    var manualFlying = false
    var useOtherSpell = true
    var useCharge = true
    var useWarScream = true
    var melee = true
    var useOldFlyMethod = false
    var debugMessage = ""
    var spellInterval = 20
    var quick = true
}

val keybinds = KeyBind.getKeyBindings();
object Spell {
    var bash = keybinds.get("Cast 1st Spell")
    var charge = keybinds.get("Cast 2nd Spell")
    var uppercut = keybinds.get("Cast 3rd Spell")
    var warScream = keybinds.get("Cast 4th Spell")
}

val spellComboWithoutCharge = arrayOf(Spell.warScream, Spell.uppercut, Spell.bash, Spell.bash)
val spellComboWithCharge = arrayOf(Spell.warScream, Spell.uppercut, Spell.charge, Spell.bash, Spell.uppercut, Spell.charge, Spell.warScream)
val spellComboWithoutOther = arrayOf(Spell.warScream, Spell.uppercut, Spell.charge, Spell.charge)

class Macro(
    var nextAction: (()->Any)? = null,
    var lastAction: String = "",
    var nextActionTime: Int = 0,
    var freeTime: Int = 0,
    var height: Int = 2,
    var keepHeight: Boolean = true,
    var lastWarScream: Int = 0,

    var meleeTime: Int = 0,
    var lastBash: Int = 0,
    var targetHeight: Float = -1f,
    var averagePing: Float = 200f,
    var spellComboIndex: Int = 0,
    var lastSpellIndex: Int = 0,
    var interactCounter: Int = 0,
    var cacheIdol: Boolean = false

    ) {

    fun reset() {
        this.nextAction = { this.chooseAction() };
        this.nextActionTime = 0;
        this.lastBash = 0;
        this.lastWarScream = 0;
        this.meleeTime = 0;
        this.spellComboIndex = 0
        this.interactCounter = 0
    }

    fun mainloop() {
        this.nextAction = { this.chooseAction() };
        while(status.enabled && World.isWorldLoaded()) {
            this.averagePing = this.averagePing * 0.9f + Ping.getPing() * 0.1f
            status.debugMessage = "ping: %.2f".format(averagePing)
            infoBox.updateMessage()

            val player = Player.getPlayer();
            this.nextActionTime--;
            if(this.nextActionTime < 1) {
                this.nextAction?.let { it() }
            } else if(status.melee && this.nextActionTime < this.freeTime && this.nextActionTime > 1 && World.getTime() - this.meleeTime >  4 && !(player?.getMainHand()?.isOnCooldown() == true)) {
                this.meleeTime = World.getTime().toInt()
                Player.getInteractionManager()?.attack();
            }
            Client.waitTick()
        }
        status.enabled = false;
        infoBox.updateMessage();
    }

    fun heightCheck(): Boolean {
        var player = Player.getPlayer() ?: return false;
        var speed = player.velocity.getY();
        val delay = Math.floor((this.averagePing / 50).toDouble()).toInt() - 4;
        var dy = 0.0;

        for(tick in -delay..5) {
            speed -= 0.08;
            speed *= 0.98
            dy += speed;
        }

        if(this.targetHeight != -1f && player.y + dy - this.height < this.targetHeight) return true;
        val distance = Math.ceil(this.height - dy).toInt();

        val playerPos = player.getBlockPos()
        val x = playerPos.getX()
        val y = playerPos.getY()
        val z = playerPos.getZ()
        for(i in 0..distance) {
            if(World.getBlock(x, y-i, z)?.getBlockStateHelper()?.isSolid() == true) {
                return true;
            }
        }
        return false;
    }



    fun chooseAction(){
        if(this.cacheIdol) {
            this.idol()
        } else {
            this.normalMonk()
        }
    }

    fun idol() {
        if(!this.keepHeight || this.heightCheck()) {
            if(World.getTime() % 2L == 0L) {
                Player.interactions()?.interact();
                this.interactCounter++;
            }
            if(status.useOtherSpell && (this.meleeTime < World.getTime() || this.idolInterruptChargeCheck())) {
                Player.interactions()?.attack()
                this.meleeTime = (World.getTime() + status.spellInterval + Math.floor(Math.random() * 5)).toInt()
                this.interactCounter = 0
            }
        } else {
            this.meleeTime++;
        }
        this.freeTime = 0;
        this.nextActionTime = 1;
    }

    fun normalMonk() {
        if(spellCastOverlay.spellMessageTimer() > 0 && spellCastOverlay.spellMessage().equals(SpellFailureReason.NOT_ENOUGH_MANA.getMessage())) {
            this.nextActionTime = status.spellInterval
            this.freeTime = this.nextActionTime - 8
            this.spellComboIndex = this.lastSpellIndex
            return;
        }
        var spellCombo: Array<String?>;
        if(status.useCharge) {
            if(status.useOtherSpell) {
                spellCombo = spellComboWithCharge;
            } else {
                spellCombo = spellComboWithoutOther
            }
        } else {
            spellCombo = spellComboWithoutCharge
        }
        this.spellComboIndex %= spellCombo.size
        this.lastSpellIndex = this.spellComboIndex
        val spell = spellCombo[this.spellComboIndex++]
        press(spell)

        this.nextActionTime = if (status.useCharge && (spell === Spell.uppercut || !status.useOtherSpell)) 10 else status.spellInterval
        this.freeTime = this.nextActionTime - 8
    }

    fun idolInterruptChargeCheck(): Boolean {
        val msg = spellCastOverlay.spellMessage()?.getStringWithoutFormatting()?.lowercase() ?: return false

        return msg.startsWith("Charge") && msg.contains("-1 ")
    }

    fun isIdol(): Boolean {
        val player = Player.player ?: return false
        this.cacheIdol = player.getMainHand().getName().getStringStripFormatting().lowercase() == "idol"
        return cacheIdol
    }
}

val macro = Macro()


fun press(key: String?) {
    KeyBind.pressKey(key)
    Client.waitTick();
    KeyBind.releaseKey(key)
}
fun updateWynntils(config: Config<*>) {
    infoBoxFeature.updateConfigOption(config)
}
fun setOverlayMessage(index: Int, message: String) {
    infoBoxes.get(index).content.store(message)
    updateWynntils(infoBoxes.get(index).content)
}
fun clamp(v: Double, min: Double, max: Double): Double {
    return Math.max(min, Math.min(v, max));
}
fun clamp(v: Int, min: Int, max: Int): Int {
    return Math.max(min, Math.min(v, max));
}

val mc = Client.getMinecraft()
val interactKey =  mc.field_1690.field_1904;
val attackKey = mc.field_1690.field_1886;
/*
JsMacros.on("Tick", JavaWrapper.methodToJava(fun (e: BaseEvent, _: Any) {
    val time = World.time;
    if(!status.enabled && status.quick && (time % 2) == 1L && macro.cacheIdol && status.useCharge) {
        if (attackKey.method_1434() && macro.meleeTime < time) {
            macro.meleeTime = (time + status.spellInterval + Math.floor(Math.random() * 4)).toInt();
            Player.interactions()?.attack()
        }
        else if (interactKey.method_1434()) {
            Player.interactions()?.interact()
        }
        if (macro.meleeTime > time + status.spellInterval + 20) {
            macro.meleeTime = 0;
        }
    }
}))
 */

fun updateHoldAction() {
    val flag = macro.isIdol() && !status.enabled && status.quick && status.useCharge
    HoldActionConfig.attackEnabled = flag
    HoldActionConfig.interactEnabled = flag
}

JsMacros.on("HeldItemChange", JavaWrapper.methodToJava(fun(e: EventHeldItemChange, _: Any) {
    updateHoldAction()
} as Function2<*,*,*>))

(event as? EventService)?.stopListener = JavaWrapper.methodToJava(fun(){
    infoBoxFeature.setUserEnabled(false)
} as Function0<*>)

JsMacros.on("Key", JavaWrapper.methodToJava(fun(e: EventKey) {
    if (e.action != 1)
        return;
    if (e.key === "key.keyboard.f") {
        status.enabled = !status.enabled;
        status.counter = 0;
        status.cycleIndex = 0;
        if (status.enabled) {
            macro.reset();
            thread {
                macro.mainloop()
            }
        }
        updateHoldAction()
    }
    else if (e.key === "key.keyboard.keypad.6") {
        status.useCharge = !status.useCharge;
        updateHoldAction()
    }
    else if (e.key === "key.keyboard.keypad.5") {
        status.useOtherSpell = !status.useOtherSpell;
    }
    else if (e.key === "key.keyboard.keypad.4") {
        status.melee = !status.melee;
    }
    else if (e.key === "key.keyboard.keypad.add") {
        status.spellInterval = clamp(status.spellInterval + 1, 9, 50);
    }
    else if (e.key === "key.keyboard.keypad.subtract") {
        status.spellInterval = clamp(status.spellInterval - 1, 9, 50);
    }
    else if (e.key === "key.keyboard.keypad.9" || e.key === "key.keyboard.r") {
        macro.keepHeight = !macro.keepHeight;
    }
    else if (e.key === "key.keyboard.up") {
        macro.height = clamp(macro.height + 1, -1, 10);
    }
    else if (e.key === "key.keyboard.down") {
        macro.height = clamp(macro.height - 1, -1, 10);
    }
    else if (e.key === "key.keyboard.keypad.8") {
        macro.targetHeight = -1f;
        infoBox.updateMessage();
    }
    else if (e.key === "key.keyboard.keypad.7") {
        macro.targetHeight = Player.getPlayer()?.getY()?.toFloat() ?: -1f;
        infoBox.updateMessage();
    }
    else if (e.key === "key.keyboard.keypad.3") {
        status.quick = !status.quick;
        updateHoldAction()
        infoBox.updateMessage();
    }
    else {
        return;
    }
    infoBox.updateMessage();
} as Function2<*,*,*>))