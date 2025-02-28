@file:ImportJar("../libs/jars/wynntils.jar")

import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.core.notifications.event.NotificationEvent
import com.wynntils.core.persisted.config.Config
import com.wynntils.features.combat.QuickCastFeature
import com.wynntils.models.abilities.AbilityModel
import com.wynntils.models.abilities.type.OphanimOrb
import com.wynntils.models.abilities.type.ShamanMaskType
import javassist.ClassPool
import me.hellrevenger.generated.Map_LivingEntity.removeStatusEffectInternal
import me.hellrevenger.generated.Map_MinecraftClient.getRenderTickCounter
import me.hellrevenger.generated.Map_RenderTickCounter.getTickDelta
import me.hellrevenger.generated.Map_StatusEffects.*
import me.hellrevenger.generated.MinecraftClient
import me.hellrevenger.generated.StatusEffects
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.implementation.bytecode.assign.Assigner
import net.bytebuddy.matcher.ElementMatchers
import net.minecraft.*
import org.jetbrains.kotlin.backend.common.pop
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.ScriptScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.RenderElement3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventArmorChange
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventDeath
import xyz.wagyourtail.jsmacros.client.api.library.impl.FPlayer
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.impl.FGlobalVars
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.pow

val global = this

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

object Format {
    val formatChar = '§'

    fun coloredBoolean(bool: Boolean) = formatChar + (if(bool) "2" else "c") + bool

    fun <T> coloredNumber(num: T) = formatChar + "6$num"

    fun coloredKey(key: String?) = key ?.let { "${formatChar}6${key}${formatChar}r" } ?: ""

    fun coloredConfig(configName: String) = if(SharedBindData.configIndex == configName) formatChar + "5" else ""
}

object SharedBindData {
    var configIndex = ""
    var currentBind: BindValue<*>? = null

    fun modifyConfig(positive: Boolean) {
        currentBind?.modify(positive)
    }
}

open class Bind(val key: String, val callback: (Bind) -> Unit) {
    val simpleName = key.substring(key.lastIndexOf('.')+1)

    open fun trigger() {
        callback(this)
    }
}

open class BindValue<T>(key: String, var value: T, callback: (Bind) -> Unit) : Bind(key, callback) {
    var onModify: ((BindValue<T>, Boolean) -> Unit)? = null

    var _beforeValueChange: ((Bind) -> Unit)? = null
    var _afterValueChange: ((Bind) -> Unit)? = null

    override fun trigger() {
        _beforeValueChange?.invoke(this)
        super.trigger()
        _afterValueChange?.invoke(this)
    }

    fun set(newValue: T) {
        _beforeValueChange?.invoke(this)
        value = newValue
        _afterValueChange?.invoke(this)
    }

    open fun modify(positive: Boolean) {

    }

    fun <U: BindValue<T>> setAfterValueChange(new: ((Bind) -> Unit)? = null): U {
        _afterValueChange = new
        return this as U
    }
}

open class BindBoolean(key: String, value: Boolean = false, callback: (Bind) -> Unit) : BindValue<Boolean>(key, value, callback) {
    override fun trigger() {
        value = !value
        super.trigger()
    }
}

open inner class BindModifiable<T>(key: String, val configIndex: String, value: T, val diff: T, callback: (Bind) -> Unit) : BindValue<T>(key, value, callback) {
    override fun trigger() {
        SharedBindData.configIndex = configIndex
        SharedBindData.currentBind = this
        super.trigger()
    }

    override fun toString(): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredNumber(value)
        return  result
    }
}

open class BindNumber<T: Number>(key: String, val configIndex: String, value: T, val diff: T, callback: (Bind) -> Unit) : BindValue<T>(key, value, callback) {
    override fun trigger() {
        SharedBindData.configIndex = configIndex
        SharedBindData.currentBind = this
        super.trigger()
    }

    override fun toString(): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredNumber(value)
        return  result
    }

    override fun modify(positive: Boolean) {
        if(onModify != null) {
            onModify!!.invoke(this, positive)
        } else {
            val newValue: T = ((value as? Double)?.let {
                if(positive) (it + (diff as Double))
                else (it - (diff as Double))
            } ?: (value as? Int)?.let {
                if(positive) (it + (diff as Int))
                else (it - (diff as Int))
            } ?: value) as T
            set(newValue)
        }
        super.modify(positive)
    }
}
class BindInt(key: String, val configIndex: String, value: Int, val diff: Int = 1, callback: (Bind) -> Unit) : BindValue<Int>(key, value, callback) {
    override fun trigger() {
        SharedBindData.configIndex = configIndex
        SharedBindData.currentBind = this
        super.trigger()
    }

    override fun toString(): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredNumber(value)
        return  result
    }

    override fun modify(positive: Boolean) {
        if(onModify != null) {
            onModify!!.invoke(this, positive)
        } else {
            if(positive) set(value + diff)
            else set(value - diff)
        }
        super.modify(positive)
    }
}

class BindPos(key: String, value: Pos3D, callback: (Bind) -> Unit): BindValue<Pos3D>(key, value, callback) {
    override fun trigger() {
        if(value == Pos3D.ZERO) {
            value = FPlayer().player!!.pos
        } else {
            value = Pos3D.ZERO
        }
        super.trigger()
    }
}

if(!global.World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

while(Managers.Feature.getFeatureInstance(QuickCastFeature::class.java) == null) {
    Client.waitTick(5)
}

val mc = MinecraftClient.method_1551()
val interactKey =  mc.field_1690.field_1904;
val attackKey = mc.field_1690.field_1886;

val attackCooldown = mc::class.java.getDeclaredField("field_1771")
attackCooldown.trySetAccessible()

val quickCastFeature = Managers.Feature.getFeatureInstance(QuickCastFeature::class.java)
val leftDelay: Config<Int> = quickCastFeature.getConfigOptionFromString("leftClickTickDelay").get() as Config<Int>
val rightDelay: Config<Int> = quickCastFeature.getConfigOptionFromString("rightClickTickDelay").get() as Config<Int>

fun getSpellInProgress() = Models.Spell.lastSpell
fun setSpellCooldown(cooldown: Int) {
    leftDelay.setValue((cooldown+1) / 3)
    rightDelay.setValue((cooldown+1) / 3)
}

fun lerp(from: Double, to: Double, delta: Float) = from + (to - from) * delta

class RenderGetter(val callback: () -> Unit) : RenderElement3D<RenderGetter> {
    override fun render(p0: class_332?, p1: Float) {
        callback()
    }

    override fun compareToSame(p0: RenderGetter?): Int {
        return 0
    }
}
inner class Smooth {
    var enabled = false
    var targetYaw = 0.0
    var targetPitch = 0.0
    var prevYaw = 0.0
    var prevPitch = 0.0
    var tick = 0L

    fun lookAt(yaw: Double, pitch: Double) {
        val player = global.Player.player ?: return
        enabled = true
        prevYaw = player.yaw.toDouble()
        prevPitch = player.pitch.toDouble()
        targetYaw = yaw
        targetPitch = pitch
        tick = global.World.time
    }
    val cameraUpdater = RenderGetter {
        val player = global.Player.player ?: return@RenderGetter
        if(!enabled) return@RenderGetter
        if(abs(global.World.time - tick) > 1) {
            enabled = false
            return@RenderGetter
        }

        val delta = Client.minecraft.getRenderTickCounter().getTickDelta(true)
        player.lookAt(global.lerp(prevYaw, targetYaw, delta), global.lerp(prevPitch, targetPitch, delta))
    }
}
val smooth = Smooth()
val d3d = Hud.createDraw3D()
d3d.register()
d3d.reAddElement(smooth.cameraUpdater)

val hotBarRegex = "key.keyboard.(\\d)".toRegex()

enum class Mode {
    None,

    Acrobat,
    Trickster,

    ScreamSurf,
    BashSurf,
    ChargeSpam,
    BashScream,
    BashUpperScream,
    UpperScream,
    AlterSurf,

    AuraSpam,
    Acolyte,
    TotemSpam,
    PuppetBomber,

    Arcanist,
    LightBender,
    RiftWalker
}



open class WynnClass(val global: Battle_jsm) {

    var lastAction = ""
    var burstAction = 0
    var ping = 200.0
    var lastMelee = 0L
    lateinit var enabled: BindBoolean
    val texts = arrayListOf<Text>()
    val binds = hashMapOf<String, Bind>()
    val crossHair = global.d2d.addText("", 0, 0, 0xffffff, true)

    var lineIndex = -1
    var modifyConfig: (Boolean) -> Unit = { }

    var configPos = 150 to 50

    lateinit var targetY: BindNumber<Double>
    lateinit var height: BindInt

    var terminated = false

    lateinit var spamSneak: BindBoolean
    var castingSpell = false
    var spamCounter = 0

    var reverseMouse = false
    var castQueue = mutableListOf<Int>()
    lateinit var spellCooldown: BindInt
    var castCooldown = 0
    var rightCooldown = 0
    var customCastEnabled = false

    var blockSwapItem = false
    var blockSwapItemTarget = -1

    lateinit var anchor: BindPos
    var anchorSpread = 30
    var anchorMomentum = 0.0
    var anchorThreshold = false

    open var mode = Mode.None
    val modeSelectorScreen: ScriptScreen = global.Hud.createScreen("", false)

    init {
        onInit()
    }

    fun onInit() {
        onInitOverride()
    }

    open fun onInitOverride() {
        enabled = BindBoolean("key.keyboard.f") {
            (it as? BindBoolean)?.let {
                if(it.value) {
                    main()
                } else {
                    onDisable()
                }
            }
        }.setAfterValueChange { updateConfig() }
        binds["enabled"] = enabled


        spellCooldown = BindInt("key.keyboard.keypad.decimal", "spellCooldown", 10) {
            (it as? BindInt)?.let {
                global.setSpellCooldown(it.value)
            }
        }.setAfterValueChange { updateConfig() }
        binds["spellCooldown"] = spellCooldown

        spamSneak = BindBoolean("key.keyboard.keypad.0") {}.setAfterValueChange { updateConfig() }
        binds["spamSneak"] = spamSneak

        binds["addKey"] = Bind("key.keyboard.keypad.add") {
            SharedBindData.modifyConfig(true)
        }
        binds["subKey"] = Bind("key.keyboard.keypad.subtract") {
            SharedBindData.modifyConfig(false)
        }
        binds["modeSelector"] = Bind("key.keyboard.keypad.5") {
            openModeSelector()
            updateConfig()
        }
        anchor = BindPos("key.keyboard.keypad.2", Pos3D.ZERO) {}.setAfterValueChange { updateConfig() }
        binds["anchor"] = anchor
    }

    open fun getSpellCooldownWithMana() = spellCooldown.value + (if(getMana() > 35) 0 else if(getMana() > 19) 1 else 2)

    fun pressAndRelease(key: String) {
        global.KeyBind.pressKey(key)
        global.Client.waitTick()
        global.KeyBind.releaseKey(key)
    }

    fun recordAction(key: String) {
        if(key == lastAction) {
            burstAction += 1
        } else {
            burstAction = 1
            lastAction = key
        }
    }

    fun pressKeyBind(key: String, record: Boolean = false, release: Boolean = true): Boolean {
        if(record) recordAction(key)
        if(customCastEnabled) return cast(Actions.cast1)
        global.KeyBind.pressKeyBind(key)
        if(release) {
            global.Client.waitTick()
            global.KeyBind.releaseKeyBind(key)
        }
        return false
    }

    fun pressKeyBindLong(key: String, ticks: Int = -1, record: Boolean = false): Boolean {
        if(record) recordAction(key)
        global.KeyBind.pressKeyBind(key)
        global.Client.waitTick(if(ticks <= 0) getSpellCooldownWithMana() else ticks)
        global.KeyBind.releaseKeyBind(key)
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

    fun press1(ticks: Int = -1) = pressKeyBindLong(Actions.cast1, ticks, true)

    fun press2(ticks: Int = -1) = pressKeyBindLong(Actions.cast2, ticks, true)

    fun press3(ticks: Int = -1) = pressKeyBindLong(Actions.cast3, ticks, true)

    fun press4(ticks: Int = -1) = pressKeyBindLong(Actions.cast4, ticks, true)

    fun melee() {
        lastMelee = global.World.time
        global.attackCooldown.set(global.mc, 0)
        global.Player.interactions()?.attack()
        global.attackCooldown.set(global.mc, 0)
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

    open fun onDisable() { }

    open fun reset() {
        lastMelee = 0
        CustomInput.override = false
    }

    fun removeBlind() {
        val player = global.Player.player?.raw ?: return
        player.removeStatusEffectInternal(StatusEffects::class.BLINDNESS)
        player.removeStatusEffectInternal(StatusEffects::class.DARKNESS)
    }

    open fun main() {
        reset()
        thread {
            while (enabled.value && global.World.isWorldLoaded) {
                if(!isBlocked())
                    chooseAction()
                global.Client.waitTick()
            }
            enabled.set(false)
        }
    }

    open fun chooseAction() { }

    open fun updateConfig() {
        texts.forEach { global.d2d.reAddElement(it) }
        resetLineIndex()
        nextLine().setText("Enabled (${Format.coloredKey(enabled.simpleName)}): " + Format.coloredBoolean(enabled.value))
        nextLine().setText(spellCooldown.toString())
        nextLine().setText("Mode (${Format.coloredKey(binds["modeSelector"]?.simpleName)}): " + mode)
        nextLine().setText("Spam Shift (${Format.coloredKey(spamSneak.simpleName)}): " + Format.coloredBoolean(spamSneak.value))
        nextLine().setText(Format.coloredConfig("anchor" ) + "Anchor ${Format.formatChar}r(${Format.coloredKey(anchor.simpleName)}): " + Format.coloredBoolean(anchor.value != Pos3D.ZERO))
    }

    fun resetLineIndex() {
        lineIndex = -1
        hideLines()
        lineIndex = -1
    }

    fun nextLine(): Text {
        lineIndex++
        while(lineIndex >= texts.size) {
            texts.add(global.d2d.addText("", configPos.first, configPos.second + texts.size * 10, 0xffffff, true))
        }
        return texts[lineIndex]
    }

    fun hideLines() {
        while(++lineIndex < texts.size) {
            texts[lineIndex].setText("")
        }
    }

    fun setCrossHairText(text: String) {
        crossHair.setText(text)
        crossHair.y = global.d2d.height / 2 + 10
        crossHair.x = (global.d2d.width - crossHair.width) / 2
    }

    open fun onKey(e: EventKey) {
        if(e.action != 1) return
        if(blockSwapItem)
            global.hotBarRegex.matchEntire(e.key)?.let {
                blockSwapItemTarget = it.groupValues[1].toInt() - 1
                e.cancel()
            }

        binds.values.forEach {
            if(it.key == e.key) {
                it.trigger()
            }
        }
    }

    open fun restart() {
        terminated = false
        global.d2d.register()
        global.d2d.reAddElement(crossHair)
        updateConfig()
        texts.forEach { global.d2d.reAddElement(it) }
        global.KeyBind.setKeyBind("key.attack", "key.mouse.left")
        global.KeyBind.setKeyBind("key.use", "key.mouse.right")

        spellCooldown.callback.invoke(spellCooldown)
    }

    open fun terminate() {
        reset()
        texts.forEach {
            global.d2d.removeText(it)
        }
        global.d2d.removeText(crossHair)
        terminated = true
        enabled.set(false)
    }

    fun yAboveTarget(dy: Double): Boolean {
        val player = global.Player.player ?: return false
        if(player.y + dy - height.value < targetY.value) return true
        return Models.CharacterStats.blocksAboveGround < height.value - dy
    }

    fun getMana() = Models.CharacterStats.mana.percentage
    fun getHealth() = Models.CharacterStats.health.percentage

    fun findEffect(name: String) = Models.StatusEffect.statusEffects.find { it.name.contains(name) }
    fun isHoldItem(name: String) = global.Player.player?.let { it.mainHand.name.stringStripFormatting.lowercase().contains(name) } ?: false

    fun smoothPitch(target: Float, ticks: Int = 1) {
        val player = global.Player.player?: return
        val pitch = player.pitch
        val perTick = (target - pitch) / ticks
        for(i in 1..ticks) {
            player.lookAt(player.yaw.toDouble(), (pitch + perTick * i).toDouble())
            global.Client.waitTick()
        }
    }

    open fun onIncompatible() { }

    open fun isBlocked() = false

    open fun onTick() {
        if(global.World.time % 2 == 0L) {
            if(spamSneak.value) {
                pressKeyBind("key.sneak")
            }
        }
        castCooldown--
        if(castCooldown < 0 && castQueue.isNotEmpty()) {
            if(castQueue.pop() == Actions.L) {
                melee()
                castCooldown = 2
            } else {
                global.Player.interactions()?.interact()
                castCooldown = 4
            }
        }
        removeBlind()
        val flag = global.getSpellInProgress().isEmpty()
        if(castingSpell && flag) {
            onSpellCastFinished()
        }
        castingSpell = flag
        global.Player.player?.let {
            if(it.hasStatusEffect("invisibility") && it.vehicle != null || !global.Player.gameMode.contains("adve", true)) {

                enabled.set(false)
                updateConfig()
            }
        }
        var forward = false
        if(enabled.value) {
            if(anchor.value != Pos3D.ZERO) {
                val player = global.Player.player!!
                val vec = anchor.value.toVector(player.pos)
                var target = 0.0
                if(vec.deltaZ.pow(2) + vec.deltaX.pow(2) > 9) {
                    var diff = player.yaw - vec.yaw
                    if(diff > 180)  diff -= 360
                    if(diff < -180)  diff += 360
                    val absDiff = abs(diff)
                    if(absDiff > anchorSpread || !anchorThreshold) {
                        val sign = if(diff > 0) -1 else 1
                        target = Math.random() * 10 * log10(abs(diff)) * sign
                        anchorThreshold = absDiff < anchorSpread - 15
                    }
                }
                anchorMomentum = anchorMomentum * 0.9 + target * 0.2
                if(abs(anchorMomentum) > 1) {
                    global.smooth.lookAt(player.yaw + anchorMomentum, player.pitch.toDouble())
                }
                forward = true
            }
        }
        CustomInput.override = forward
    }

    open fun onSpellCastFinished() {}

    open fun getSpam(): Array<String> = arrayOf()

    fun doSpam() {
        val spam = getSpam()
    }

    fun waitSpell(spell: String, extraTick: Int = 0, hotbar: Int = -1) {
        var extraTick = extraTick
        val hotbar = hotbar.coerceAtLeast(blockSwapItemTarget)
        blockSwapItem = true
        pressKeyBind(spell, true)
        global.Client.waitTick(getSpellCooldownWithMana())
        if(hotbar != -1) {
            global.Player.openInventory().selectedHotbarSlotIndex = hotbar
            blockSwapItemTarget = -1
            extraTick = extraTick.coerceAtLeast(1)
        }
        if(extraTick != 0)
            global.Client.waitTick(extraTick)
        blockSwapItem = false
    }

    open fun getAvailableModes() = arrayOf<Mode>()

    fun openModeSelector() {
        modeSelectorScreen.shouldPause = false
        val iscreen = modeSelectorScreen as IScreen
        iscreen.setOnInit(global.JavaWrapper.methodToJava { _ ->
            val hw = iscreen.width / 2
            val hh = iscreen.height / 2
            val modes = getAvailableModes()
            modes.forEachIndexed { index, mode ->
                iscreen.buttonBuilder()
                    .x(hw - 100).y(hh - modes.size * 12 + index * 25)
                    .width(200)
                    .message(mode.name)
                    .action(global.JavaWrapper.methodToJava { btn, iscreen ->
                        this.mode = mode
                        updateConfig()
                    })
                    .build()
            }
        })
        iscreen.setOnMouseDown(global.JavaWrapper.methodToJava { a, b ->
            iscreen.close()
        })
        global.Hud.openScreen(iscreen)
    }
}

inner class Warrior(global: Battle_jsm) : WynnClass(global) {
    var lastBash = 0L
    var lastWarScream = 0L
    lateinit var keepHeight: BindBoolean
    var interactCounter = 0
    var attackCounter = 0

    lateinit var meleeInterval: BindInt
    //var quick = true
    var cspam = false
    lateinit var maxRepeat: BindInt


    val modes = arrayOf(Mode.BashSurf, Mode.ScreamSurf, Mode.ChargeSpam, Mode.BashScream, Mode.BashUpperScream, Mode.AlterSurf, Mode.UpperScream)
    override var mode = Mode.BashUpperScream

    override fun onInitOverride() {

        keepHeight = BindBoolean("key.keyboard.keypad.7") {}

        targetY = BindNumber("key.keyboard.keypad.8", "TargetY", -1.0, 1.0) {}
            .setAfterValueChange { updateConfig() }
        targetY.onModify = { bind, positive ->
            bind.value = if(positive) global.Player.player?.y ?: -1.0 else -1.0
        }

        binds["targetY"] = targetY

        height = BindInt("key.keyboard.keypad.9", "Height", 5) {}.setAfterValueChange { updateConfig() }
        binds["height"] = height

        meleeInterval = BindInt("key.keyboard.keypad.1", "MeleeInterval", 20, 3) {}.setAfterValueChange { updateConfig() }
        binds["meleeInterval"] = meleeInterval


        maxRepeat = BindInt("key.keyboard.keypad.7", "MaxRepeat", 2) {}.setAfterValueChange { updateConfig() }
        binds["maxRepeat"] = maxRepeat

        super.onInitOverride()


        spellCooldown.set(8)
    }

    override fun updateConfig() {
        super.updateConfig()

        if(mode == Mode.ChargeSpam) {
            nextLine().setText("KeepHeight (${Format.coloredKey(binds["keepHeight"]?.simpleName)}): " + Format.coloredBoolean(keepHeight.value))
            nextLine().setText(targetY.toString())
            nextLine().setText(height.toString())
        }
        nextLine().setText(meleeInterval.toString())
        nextLine().setText(maxRepeat.toString())
        nextLine().setText("upper: charge charge scream upper")
        nextLine().setText("bash(scream): scream scream")
    }

    fun heightCheck(time: Int = 4): Boolean {
        val player = global.Player.player ?: return false

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
        spamCounter = 0
    }

    override fun onDisable() {
        super.onDisable()

        spamCounter = 0
    }

    fun isIdol() = isHoldItem("idol")

    fun burstCharge() = Models.Spell.lastBurstSpellName.lowercase().contains("charge") && Models.Spell.repeatedBurstSpellCount > 5

    override fun chooseAction() {
        if(isHoldItem("rhythm") || isHoldItem("catamaran")) {
            global.KeyBind.pressKeyBind("key.sneak")
            waitSpell(Actions.cast2, 1)
            waitSpell(Actions.cast3, 1)
            global.KeyBind.releaseKeyBind("key.sneak")
        } else if(mode == Mode.ChargeSpam && isIdol()) {
            if(!keepHeight.value || heightCheck()) {
                if(global.World.time % 2L == 0L) {
                    global.Player.interactions()?.interact()
                    interactCounter++
                }
                if(lastMelee + meleeInterval.value + (Math.random() * 5).toInt() < global.World.time
                    || burstCharge()) {
                    melee()
                    interactCounter = 0
                }
            }
        } else if(mode == Mode.BashSurf || mode == Mode.ScreamSurf) {
            waitSpell(Actions.cast3)
            waitSpell(Actions.cast2)
            if(global.World.time >= lastWarScream + 200 || (mode == Mode.ScreamSurf && global.World.time - lastBash < 300)) {
                waitSpell(Actions.cast4)
                lastWarScream = global.World.time
            } else {
                waitSpell(Actions.cast1)
                lastBash = global.World.time
            }
        } else if(mode == Mode.BashScream || mode == Mode.UpperScream) {
            if(mode == Mode.BashScream) {
                waitSpell(Actions.cast1)
            } else {
                waitSpell(Actions.cast3)
            }
            for(i in 1..maxRepeat.value) {
                waitSpell(Actions.cast4)
            }
        } else if(mode == Mode.BashUpperScream) {
            waitSpell(Actions.cast4)
            waitSpell(Actions.cast3)
            waitSpell(Actions.cast1)
        } else if(mode == Mode.AlterSurf) {
            waitSpell(Actions.cast3)
            waitSpell(Actions.cast2)
            waitSpell(Actions.cast4)
            waitSpell(Actions.cast3)
            waitSpell(Actions.cast2)
            waitSpell(Actions.cast1)
        }
    }

    override fun onTick() {
        super.onTick()


        if(global.attackKey.method_1434() && (lastMelee + meleeInterval.value + (Math.random() * 5).toInt() < global.World.time || (burstCharge() && attackCounter < 3))) {
            melee()
            interactCounter = 0
            attackCounter++
        } else {
            attackCounter = 0
        }
        if(global.interactKey.method_1434() && (global.World.time % 3 == 0L || isIdol())) {
            global.Player.interactions()?.interact()
            interactCounter++
        }
        if(enabled.value && abs(global.Player.player!!.pitch) < 45 && (mode == Mode.BashSurf || mode == Mode.ScreamSurf)) {
            CustomInput.override = true
        }
    }

    override fun getAvailableModes() = modes
}

inner class Assassin(global: Battle_jsm) : WynnClass(global) {
    var tickToHop = 20

    val modes = arrayOf(Mode.Trickster, Mode.Acrobat, Mode.None)
    override var mode = Mode.Acrobat

    var enableDash = false
    var enableSmoke = false
    var enableMultiHit = true

    var lastSmoke = 0L
    var lastDash = 0L

    var counter = 0
    var blocking = false

    override fun onInitOverride() {
        binds["enableDash"] = Bind("key.keyboard.keypad.7") {
            enableDash = !enableDash
            updateConfig()
        }
        binds["enableSmoke"] = Bind("key.keyboard.keypad.8") {
            enableSmoke = !enableSmoke
            updateConfig()
        }
        binds["enableMultiHit"] = Bind("key.keyboard.keypad.9") {
            enableMultiHit = !enableMultiHit
            updateConfig()
        }

        binds["manualFlying"] = Bind(skill1Key) {
            if(enabled.value) return@Bind
            blocking = true
            thread {
                setCrossHairText("Wait !!!")
                //cast1()
                recordAction(Actions.cast1)
                global.Client.waitTick(17)
                pressKeyBind(Actions.jump)
                global.Client.waitTick()
                pressKeyBind(Actions.jump)
                chooseAction()
                setCrossHairText("")
            }
        }

        targetY = BindNumber("key.keyboard.keypad.8", "TargetY", -1.0, 1.0) {}.setAfterValueChange { updateConfig() }
        targetY.onModify = { bind, positive ->
            bind.value = if(positive) global.Player.player?.y ?: -1.0 else -1.0
        }
        binds["targetY"] = targetY

        height = BindInt("key.keyboard.keypad.6", "Height", 3) {}.setAfterValueChange { updateConfig() }
        binds["height"] = height

        super.onInitOverride()
        spellCooldown.set(12)
    }

    fun smoke() {
        cast4()
        lastSmoke = global.World.time
        global.Client.waitTick(getSpellCooldownWithMana())
    }

    fun multiHit(){
        cast3()
        global.Client.waitTick(getSpellCooldownWithMana())
    }

    fun dash() {
        cast2()
        lastDash = global.World.time
        global.Client.waitTick(getSpellCooldownWithMana())
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText("Dash (${Format.coloredKey(binds["enableDash"]?.simpleName)}): " + Format.coloredBoolean(enableDash))
        nextLine().setText("Smoke (${Format.coloredKey(binds["enableSmoke"]?.simpleName)}): " + Format.coloredBoolean(enableSmoke))
        nextLine().setText("MultiHit (${Format.coloredKey(binds["enableMultiHit"]?.simpleName)}): " + Format.coloredBoolean(enableMultiHit))
        nextLine().setText(targetY.toString())
        nextLine().setText(height.toString())
    }

    fun heightCheck(): Boolean {
        val player = global.Player.player ?: return false

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
        if(enableMelee && global.World.time - lastMelee > 4) {
            melee()
        }
    }

    override fun chooseAction(){
        val player = global.Player.player ?: return
        blocking = true
        if(mode == Mode.Trickster) {
            dash()
            smoke()
        } else if(mode == Mode.Acrobat) {
            if(lastAction != Actions.cast1) {
                if(!heightCheck()) {
                    tryMelee()
                    blocking = false
                    return
                }
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana())
                tryMelee()
                global.Client.waitTick(16 - getSpellCooldownWithMana())
                val wasJumping = global.KeyBind.pressedKeys.contains(global.KeyBind.keyBindings[Actions.jump])
                global.KeyBind.releaseKeyBind(Actions.jump)
                global.Client.waitTick()
                pressKeyBind(Actions.jump)
                global.Client.waitTick()
                pressKeyBind(Actions.jump)
                if(wasJumping) {
                    global.Client.waitTick()
                    global.KeyBind.pressKeyBind(Actions.jump)
                }

            } else if(enableSmoke && getMana() > 55 && global.World.time - lastSmoke > 100) {
                smoke()
            } else if(enableMultiHit && getMana() > 75 && (global.World.time - lastDash < 120 || !enableDash)) {
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
        blocking = false
    }

    override fun onSpellCastFinished() {
        super.onSpellCastFinished()
        //if(enabled) chooseAction()
    }

    override fun onKey(e: EventKey) {
        if(blocking && e.action == 1 && e.key == skill1Key) {
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

    override fun getAvailableModes() = modes

    override fun getSpellCooldownWithMana() = if(mode == Mode.BashUpperScream) spellCooldown.value else super.getSpellCooldownWithMana()
}

inner class Mage(global: Battle_jsm) : WynnClass(global) {
    var lastHeal = 0L
    var enableIceSnake = true
    var enableMeteor = true
    lateinit var maxRepeat: BindInt
    var blocked = false
    lateinit var enableMelee: BindBoolean


    val modes = arrayOf(Mode.Arcanist, Mode.LightBender, Mode.RiftWalker)
    override var mode = Mode.Arcanist

    override fun getAvailableModes() = modes

    fun getArchType(): String {
        return if(AbilityModel.ophanimBar.isActive || mode == Mode.LightBender) "lb"
        else if(AbilityModel.manaBankBar.isActive || mode == Mode.Arcanist) "ar"
        else "rw"
    }

    override fun onInitOverride() {
        binds["enableIceSnake"] = Bind("key.keyboard.keypad.4") {
            enableIceSnake = !enableIceSnake
            updateConfig()
        }
        binds["enableMeteor"] = Bind("key.keyboard.keypad.1") {
            enableMeteor = !enableMeteor
            updateConfig()
        }


        maxRepeat = BindInt("key.keyboard.keypad.7", "MaxRepeat", 1) {}.setAfterValueChange { updateConfig() }
        binds["maxRepeat"] = maxRepeat

        enableMelee = BindBoolean("key.keyboard.keypad.3", true) {}.setAfterValueChange { updateConfig() }
        binds["enableMelee"] = enableMelee


        super.onInitOverride()
        spellCooldown.set(6)
    }

    override fun updateConfig() {
        super.updateConfig()

        nextLine().setText("IceSnake (${Format.coloredKey(binds["enableIceSnake"]?.simpleName)}): " + Format.coloredBoolean(enableIceSnake))
        nextLine().setText("Meteor (${Format.coloredKey(binds["enableMeteor"]?.simpleName)}): " + Format.coloredBoolean(enableMeteor))
        nextLine().setText("Melee (${Format.coloredKey(enableMelee.simpleName)}): " + Format.coloredBoolean(enableMelee.value))

        nextLine().setText(maxRepeat.toString())
    }

    override fun reset() {
        super.reset()
        lastHeal = 0
    }

    override fun chooseAction() {
        when (getArchType()) {
            "ar" -> ar()
            "lb" -> lb()
            "rw" -> rw()
        }
    }

    fun orbNotHealthy() =
        AbilityModel.ophanimBar.orbs.any {
            it.string.startsWith(OphanimOrb.HealthState.DYING.color.toString())
        }

    fun lb() {
        val player = global.Player.player ?: return
        val health = getHealth()
        val notHealthy = health < 60 || orbNotHealthy()

        if(notHealthy && (lastAction != Actions.cast1 || global.World.time > lastHeal + 80) && getMana() > 40) {
            lastHeal = global.World.time
            cast1()
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if(global.World.time - lastMelee >= 9 && !player.mainHand.isOnCooldown) {
            melee()
            global.Client.waitTick(1)
        } else if(enableIceSnake && getMana() > 75 && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat.value) || (notHealthy && getMana() > 55)) {
            cast4()
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if((lastAction == Actions.cast4 && Models.Spell.repeatedSpellCount >= maxRepeat.value) && global.World.time - lastMelee <= 20 && getMana() > 75) {
            lastHeal = global.World.time
            cast1()
            global.Client.waitTick(getSpellCooldownWithMana())
        }
    }

    fun rw() {
        val player = global.Player.player ?: return
        val health = getHealth()
        if(health < 90 && lastAction != Actions.cast1) {
            cast1()
            lastHeal = global.World.time
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if(enableIceSnake && (getMana() > 75 || health < 80)
            && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat.value)) {
            cast4()
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if(enableMeteor && (getMana() > 75 || health < 80) && lastAction != Actions.cast3) {
            cast3()
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if(!enableMeteor && lastAction == Actions.cast4) {
            cast1()
            lastHeal = global.World.time
            global.Client.waitTick(getSpellCooldownWithMana())
        } else if(enableMelee.value && global.World.time - lastMelee > 4 && !player.mainHand.isOnCooldown) {
            melee()
        }
    }

    fun ar() {
        val player = global.Player.player ?: return
        if(enableMelee.value) {
            melee()
            global.Client.waitTick()
        }
        for(i in 1..maxRepeat.value) {
            cast3()
            global.Client.waitTick(getSpellCooldownWithMana())
            cast3()
            global.Client.waitTick(getSpellCooldownWithMana())
            cast4()
            global.Client.waitTick(getSpellCooldownWithMana())
        }
        cast1()
        global.Client.waitTick(getSpellCooldownWithMana())
    }

    override fun onTick() {
        super.onTick()
        if(global.World.time % 2 == 0L) {
            if(isHoldItem("warp") && !enabled.value) {
                if(global.interactKey.method_1434()) {
                    global.Player.interactions()?.interact()
                }
            }
        }
    }

    override fun isBlocked(): Boolean {
        return blocked
    }
}

inner class Archer(global: Battle_jsm) : WynnClass(global) {
    var counter = 0
    var lastShield = 0L

    override fun onInitOverride() {

        super.onInitOverride()

        spellCooldown.set(15)
    }

    override fun chooseAction() {
        if(getMana() > 44 && !isHoldItem("anthracite")) {
            if(global.World.time - lastShield > 20 && lastAction != Actions.cast4 && counter++ % 5 == 0) {
                cast4()
                global.Client.waitTick(getSpellCooldownWithMana())
                lastShield = global.World.time
            } else if(Models.Spell.repeatedSpellCount < 2) {
                cast3()
                global.Client.waitTick(getSpellCooldownWithMana())
            } else {
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana())
            }
        } else if(global.World.time % 2L == 0L) {
            global.Player.interactions()?.interact()
        }
    }

    override fun onTick() {
        super.onTick()
        if(global.interactKey.method_1434() && global.World.time % 2 == 0L) {
            global.Player.interactions()?.interact()
        }
    }

    override fun reset() {
        super.reset()
        counter = 0
        lastShield = 0
    }
}

inner class Shaman(global: Battle_jsm) : WynnClass(global) {
    var lastAura = 0L
    var enableAwakened = false
    var enableBlood = false
    var assertMask = false
    var lastTimeMask = 0L
    var lastTotem = 0L
    var recordedPitch = 0f
    lateinit var maxRepeat: BindInt
    var enableAura = true
    var fly = false
    var counter = 0
    val maskOrder = arrayOf(ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC, ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    val masks = arrayOf(ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    var targetMask = ShamanMaskType.FANATIC
    override var mode = Mode.TotemSpam
    val modes = arrayOf(Mode.None, Mode.TotemSpam, Mode.Acolyte, Mode.AuraSpam, Mode.PuppetBomber)

    override fun onInitOverride() {

        binds["mask"] = Bind("key.keyboard.keypad.1") {
            targetMask = masks[(masks.indexOf(targetMask)+1) % masks.size]
            updateConfig()
        }

        binds["enableAwakened"] = Bind("key.keyboard.keypad.8") {
            enableAwakened = !enableAwakened
            updateConfig()
        }
        maxRepeat = BindInt("key.keyboard.keypad.7", "maxRepeat", 8) {}.setAfterValueChange { updateConfig() }
        binds["maxRepeat"] = maxRepeat

        binds["fly"] = Bind("key.keyboard.keypad.4") {
            fly = !fly
            updateConfig()
        }

        binds["enableAura"] = Bind("key.keyboard.keypad.9") {
            enableAura = !enableAura
            updateConfig()
        }


        super.onInitOverride()
        spellCooldown.set(6)
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText("Mask (${Format.coloredKey(binds["mask"]?.simpleName)}): " + targetMask)

        nextLine().setText("Awakened (${Format.coloredKey(binds["enableAwakened"]?.simpleName)}): " + Format.coloredBoolean(enableAwakened))
        nextLine().setText(Format.coloredConfig("maxRepeat" ) + "Repeat ${Format.formatChar}r(${Format.coloredKey(maxRepeat.simpleName)}): " + Format.coloredNumber(getMaxRepeatValue()))

        nextLine().setText("Fly (${Format.coloredKey(binds["fly"]?.simpleName)}): " + Format.coloredBoolean(fly))
        nextLine().setText("Aura (${Format.coloredKey(binds["enableAura"]?.simpleName)}): " + Format.coloredBoolean(enableAura))
    }

    fun isMask(target: ShamanMaskType, awakened : Boolean = true): Boolean {
        val mask = Models.ShamanMask.currentMaskType
        return (mask == ShamanMaskType.AWAKENED && awakened) || mask == target
    }

    fun getMaxRepeatValue(): Int {
        return if(mode == Mode.TotemSpam || mode == Mode.PuppetBomber) {
            maxRepeat.value - 5
        } else {
            maxRepeat.value
        }
    }

    fun switchMask(target: ShamanMaskType, canCancel: Boolean = false) {
        if(Models.ShamanMask.currentMaskType == target && canCancel) return
        val inventory = global.Player.openInventory()
        val hotbar = inventory.selectedHotbarSlotIndex
        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        global.Client.waitTick()
        var currentIndex = maskOrder.indexOf(Models.ShamanMask.currentMaskType)
        if(Models.ShamanMask.currentMaskType == ShamanMaskType.NONE)
            currentIndex = 2
        val targetIndex = maskOrder.lastIndexOf(target)
        var counter = targetIndex - currentIndex
        val progress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f
        if(progress >= 1f) {
            counter = 1
        } else if(Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED) {
            counter = 3
        }
        if(counter > 3) counter -= 3
        while (counter-- > 0) {
            cast4()
            global.Client.waitTick(getSpellCooldownWithMana())
            lastTimeMask = global.World.time
        }
        inventory.selectedHotbarSlotIndex = hotbar
        global.Client.waitTick()
    }

    override fun chooseAction() {
        if(fly) return
        val totem = Models.ShamanTotem.activeTotems.firstOrNull()
        if(isHoldItem("abso") || mode == Mode.Acolyte) {
            if(global.World.time - lastTotem > 190 && lastAction != Actions.cast1) {
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana())
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana())
                lastTotem = global.World.time
            }
            val shouldUproot = AbilityModel.bloodPoolBar.barProgress.value.current > 81
            val shouldAura = (100 - getHealth())
            val tooManyUproot = lastAction == Actions.cast4
            val tooManyAura = lastAction == Actions.cast3 && burstAction > 1
            if(((getMana() > 50 && shouldAura > 20) || shouldAura > 40) && global.World.time - lastAura > 19 || (shouldUproot && tooManyUproot)) {
                cast3()
                global.Client.waitTick(getSpellCooldownWithMana()+2)
                lastAura = global.World.time
            }
            if(shouldUproot || (shouldAura > 20 && tooManyAura)) {
                val release = !global.KeyBind.pressedKeys.contains(global.KeyBind.keyBindings["key.sneak"])
                if(shouldUproot)
                    global.KeyBind.pressKeyBind("key.sneak")
                cast4()
                global.Client.waitTick(getSpellCooldownWithMana()+2)
                if(release)
                    global.KeyBind.releaseKeyBind("key.sneak")
                if(shouldUproot && enableAura) {
                    cast4()
                    global.Client.waitTick(getSpellCooldownWithMana()+2)
                }
            }
        } else if(isHoldItem("panic ") || mode == Mode.AuraSpam) {
            cast1()
            global.Client.waitTick(getSpellCooldownWithMana()-1)
            for(i in 1..getMaxRepeatValue()) {
                if(!enabled.value) return
                cast3()
                global.Client.waitTick(getSpellCooldownWithMana()-1)
            }
        } else if(mode == Mode.TotemSpam) {
            if(!awakened()) {
                cast4()
                global.Client.waitTick(getSpellCooldownWithMana()-1)
                if(getMana() < 60) {
                    cast4()
                    global.Client.waitTick(getSpellCooldownWithMana()-1)
                }
                lastTimeMask = global.World.time
            }
            for(i in 1..getMaxRepeatValue()) {
                if(!enabled.value) return
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana()-1)
            }
        } else if(mode == Mode.PuppetBomber) {
            if(!awakened()) {
                cast3()
                global.Client.waitTick(getSpellCooldownWithMana()-1)
            }
            for(i in 1..getMaxRepeatValue()) {
                if(!enabled.value) return
                cast1()
                global.Client.waitTick(getSpellCooldownWithMana()-1)
            }
        }else if(global.World.time % 2L == 0L) {
            melee()
        }
    }

    fun awakened(cancelMask: Boolean = false): Boolean {
        if(!enableAwakened) return false
        val progress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f
        if(findEffect("Awakened") != null || global.World.time - lastTimeMask < 15) {
            return false
        }
        if(global.KeyBind.pressedKeys.contains(global.KeyBind.keyBindings[Actions.cast1])) {
            global.KeyBind.releaseKeyBind(Actions.cast1)
            global.Client.waitTick(spellCooldown.value)
        } else {
            global.KeyBind.releaseKeyBind(Actions.cast1)
        }
        val inventory = global.Player.openInventory()
        if(progress < 1f) {
            switchMask(ShamanMaskType.FANATIC, cancelMask)
        }
        val hotbar = inventory.selectedHotbarSlotIndex
        inventory.selectedHotbarSlotIndex = 1
        global.Client.waitTick()
        if(progress < 0.34f) {
            cast1()
            global.Client.waitTick(getSpellCooldownWithMana()-1)
        }
        cast1()
        global.Client.waitTick(getSpellCooldownWithMana()-1)
        cast1()
        global.Client.waitTick(getSpellCooldownWithMana()-1)

        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        global.Client.waitTick()
        cast4()
        global.Client.waitTick(getSpellCooldownWithMana()-1)
        inventory.selectedHotbarSlotIndex = hotbar
        global.Client.waitTick()
        lastTimeMask = global.World.time
        return true
    }

    override fun onDisable() {
        super.onDisable()
        global.KeyBind.releaseKeyBind(Actions.cast1)
        global.KeyBind.releaseKeyBind(Actions.cast3)
        counter = 0
    }

    override fun reset() {
        super.reset()
        lastAura = 0
        lastTimeMask = 0
        lastTotem = 0
        assertMask = false
        fly = false
        counter = 0
        global.KeyBind.releaseKeyBind(Actions.cast1)
        global.KeyBind.releaseKeyBind(Actions.cast3)
    }

    fun totem(tick: Int = 10, back: Boolean = true) {
        if(isHoldItem("a16")) {
            cast1()
            global.Client.waitTick(tick)
            return
        }
        val lookDown = 2
        val interval = 5
        val lookUp = tick - lookDown - interval
        val player = global.Player.player ?: return
        val pitch = player.pitch
        cast1()
        smoothPitch(90f, lookDown)
        global.Client.waitTick(interval)
        if(back) {
            smoothPitch(pitch, lookUp)
        } else {
            global.Client.waitTick(lookUp)
        }
    }

    fun setInterval(interval: Int = 100) {
        //right_interval_ms.set(configData, interval)
    }

    override fun onTick() {
        super.onTick()


        if(fly) {
            var action = global.World.time / spellCooldown.value
            if(action % 3 == 0L) {
                cast1()
            } else {
                cast2()
            }
        }
        if(global.attackKey.method_1434() && global.World.time % 2 == 0L) {
            melee()
        }
    }

    override fun getAvailableModes() = modes

    override fun restart() {
        super.restart()
        val mainItem = global.Player.openInventory().getSlot(36).name.stringStripFormatting.lowercase()
        if(mainItem.contains("abso")) {
            mode = Mode.Acolyte
        } else if(mainItem.contains("panic ")) {
            mode = Mode.AuraSpam
        } else if(mainItem.contains("a16")) {
            mode = Mode.TotemSpam
        }
        updateConfig()
    }
}

var currentWynnClass: WynnClass = WynnClass(this)
var currentClassString = ""

//RuntimeMixin.writeResult(EventContainer(context), Archer::class.java, "archer.class")
//RuntimeMixin.writeResult(EventContainer(context), WynnClass::class.java, "wynn.class")
//
//RuntimeMixin.writeResult(EventContainer(context), BindValue::class.java, "BindValue.class")
//RuntimeMixin.writeResult(EventContainer(context), BindInt::class.java, "BindInt.class")
//RuntimeMixin.writeResult(EventContainer(context), Bind::class.java, "Bind.class")

val classes = mapOf(
    "archer" to Archer(this),
    "assassin" to Assassin(this),
    "warrior" to Warrior(this),
    "mage" to Mage(this),
    "shaman" to Shaman(this),
)

currentWynnClass.terminate()
classes.forEach {
    it.value.terminate()
}

fun checkClass() {
    if(!global.World.isWorldLoaded) return
    val weapon = global.Player.openInventory().getSlot(36)
    weapon.lore.firstOrNull {
        it.withoutFormatting().string.contains("Class Req:")
    }?.let {
        val newClass = it.withoutFormatting().string.split(" ")[3].split("/")[0].lowercase()
        if(newClass != currentClassString) {
            currentWynnClass.enabled.set(false)
            currentWynnClass.terminate()
            currentClassString = newClass
            currentWynnClass = classes[currentClassString] ?: return@let
            currentWynnClass.restart()
        }
    }
}

EventListener(EventKey::class.java, { e ->
    currentWynnClass.onKey(e)
}, true)

EventListener(EventArmorChange::class.java, { checkClass() }, true)

val notificationEvent = { it: NotificationEvent.Queue ->
    if(it.messageContainer.message.string.contains("Please wait for the incompatible spell-cast to finish.")) {
        thread {
            currentWynnClass.onIncompatible()
        }
    }
}

object CustomInput  {
    var override = false
        set(value) {
            field = value
            FGlobalVars.globalRaw["overrideInput"] = value
        }

    @Advice.OnMethodExit
    @JvmStatic
    fun getBlockParticle(@Advice.This(typing = Assigner.Typing.DYNAMIC)zhis: class_743?, @Advice.Argument(0) sneak: Boolean?, @Advice.Argument(1) slow: Float?) {
        if(FGlobalVars.globalRaw["overrideInput"] as? Boolean ?: false) {
            zhis?.field_3905 = if(sneak ?: false) {
                slow ?: 1f
            } else {
                1f
            }
        }
    }
}
val matcher = ElementMatchers.named<MethodDescription>("method_3129")

val mixinInput = Advice.to(CustomInput::class.java).on(matcher)

//RuntimeMixin.debug(context)

RuntimeMixin.addMixin(net.minecraft.class_743::class.java, mixinInput)
RuntimeMixin.doMixin(net.minecraft.class_743::class.java)


EventListener(EventDeath::class.java, {
    currentWynnClass.enabled.set(false)
})

var running = true
thread {
    while (running) {

        if(global.World.isWorldLoaded && global.Player.player != null)
            currentWynnClass.onTick()
        global.Client.waitTick()
    }
}


(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    running = false
    d2d.unregister()
    currentWynnClass.terminate()
    RuntimeMixin.removeMixin(net.minecraft.class_743::class.java, mixinInput)
    RuntimeMixin.doMixin(net.minecraft.class_743::class.java)

    smooth.enabled = false
    d3d.unregister()
}

checkClass()

Chat.toast("battle", "enabled")