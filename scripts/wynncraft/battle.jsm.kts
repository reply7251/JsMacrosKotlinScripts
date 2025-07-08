@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

@file:Suppress("MemberVisibilityCanBePrivate", "ConstPropertyName", "HasPlatformType")
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Handlers
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.consumers.features.Feature
import com.wynntils.core.keybinds.KeyBind
import com.wynntils.core.notifications.event.NotificationEvent
import com.wynntils.core.text.StyledText
import com.wynntils.features.combat.AutoAttackFeature
import com.wynntils.features.combat.QuickCastFeature
import com.wynntils.handlers.bossbar.TrackedBar
import com.wynntils.models.abilities.AbilityModel
import com.wynntils.models.abilities.type.OphanimOrb
import com.wynntils.models.abilities.type.ShamanMaskType
import com.wynntils.models.character.CharacterModel
import com.wynntils.models.character.event.CharacterUpdateEvent
import com.wynntils.models.items.items.game.CraftedConsumableItem
import com.wynntils.models.items.items.game.MultiHealthPotionItem
import com.wynntils.models.items.items.game.PotionItem
import com.wynntils.models.spells.type.SpellDirection
import com.wynntils.models.worlds.event.WorldStateEvent
import com.wynntils.models.worlds.type.WorldState
import me.hellrevenger.KotlinExtension
import me.hellrevenger.generated.Input
import me.hellrevenger.generated.Map_ClientPlayerEntity.input
import me.hellrevenger.generated.Map_Input.movementForward
import me.hellrevenger.generated.Map_Input.movementSideways
import me.hellrevenger.generated.Map_Input.playerInput
import me.hellrevenger.generated.Map_Input.tick
import me.hellrevenger.generated.Map_KeyBinding.*
import me.hellrevenger.generated.Map_LivingEntity.removeStatusEffectInternal
import me.hellrevenger.generated.Map_MinecraftClient.getRenderTickCounter
import me.hellrevenger.generated.Map_MinecraftClient.player
import me.hellrevenger.generated.Map_MinecraftClient.tick
import me.hellrevenger.generated.Map_PlayerInput.*
import me.hellrevenger.generated.Map_RenderTickCounter.getTickDelta
import me.hellrevenger.generated.Map_StatusEffects.StatusEffectsKt
import me.hellrevenger.generated.Map_Text.TextKt
import me.hellrevenger.generated.PlayerInput
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.api.KtGlobals
import me.hellrevenger.library.api._getField
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.impl.EventType
import net.minecraft.class_10185
import net.minecraft.class_332
import net.neoforged.bus.api.EventPriority
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.ScriptScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.RenderElement3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventArmorChange
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.EventDeath
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventDimensionChange
import xyz.wagyourtail.jsmacros.client.api.helper.inventory.ItemStackHelper
import xyz.wagyourtail.jsmacros.client.api.library.impl.FPlayer
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.util.regex.Matcher
import kotlin.concurrent.thread
import kotlin.jvm.optionals.getOrNull
import kotlin.math.*


if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

while(Managers.Feature.getFeatureInstance(QuickCastFeature::class.java) == null) {
    Client.waitTick(5)
}

object Actions {
    const val cast1 = "Cast 1st Spell"
    const val cast2 = "Cast 2nd Spell"
    const val cast3 = "Cast 3rd Spell"
    const val cast4 = "Cast 4th Spell"
    const val melee = "key.attack"
    const val jump = "key.jump"
    const val sneak = "key.sneak"
    const val R = 1
    const val L = 2
    val map = mapOf(
        cast1 to arrayOf(R, L, R),
        cast2 to arrayOf(R, R, R),
        cast3 to arrayOf(R, L, L),
        cast4 to arrayOf(R, R, L)
    )
}
val keyBinds = KeyBind.keyBindings

val jumpKey = keyBinds[Actions.jump]!!
val skill1Key = keyBinds[Actions.cast1]!!
val skill2Key = keyBinds[Actions.cast2]!!
val skill3Key = keyBinds[Actions.cast3]!!
val skill4Key = keyBinds[Actions.cast4]!!
val meleeKey = keyBinds[Actions.melee]!!

val d2d = Hud.createDraw2D()

val offsetKey = "CameraOffset"

object Format {
    const val formatChar = '§'

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

interface HasBind {
    fun addBind(name: String, bind: Bind)
}


open class Bind(val key: String, val callback: (Bind) -> Unit) {
    val simpleName = key.substring(key.lastIndexOf('.')+1)
    var bindTo: HasBind? = null

    open fun trigger() {
        callback(this)
    }
}


open class BindValue<T>(key: String, var value: T, callback: (Bind) -> Unit) : Bind(key, callback) {
    var onModify: ((BindValue<T>, Boolean) -> Unit)? = null

    var beforeValueChange: ((Bind) -> Unit)? = null

    var persist = true
    var dirty = false

    override fun trigger() {
        beforeValueChange?.invoke(this)
        super.trigger()
        dirty = true
    }

    fun set(newValue: T) {
        beforeValueChange?.invoke(this)
        value = newValue
        callback(this)
        dirty = true
    }

    open fun modify(positive: Boolean) { }

    open fun updateFromString(string: String) {
        dirty = false
    }
}


open class BindBoolean(key: String, value: Boolean = false, callback: (Bind) -> Unit) : BindValue<Boolean>(key, value, callback) {
    override fun trigger() {
        value = !value
        super.trigger()
    }

    fun toString(name: String): String {
        return  "$name ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredBoolean(value)
    }

    override fun updateFromString(string: String) {
        set(string.toBoolean())
        super.updateFromString(string)
    }
}

open class BindNumber<T: Number>(key: String, val configIndex: String, value: T, val diff: T, callback: (Bind) -> Unit)
    : BindValue<T>(key, value, callback) {
    override fun trigger() {
        SharedBindData.configIndex = configIndex
        SharedBindData.currentBind = this
        super.trigger()
    }

    override fun toString(): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredNumber(value)
        return result
    }

    fun toString(fixedValue: T): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${Format.formatChar}r(${Format.coloredKey(simpleName)}): " + Format.coloredNumber(fixedValue)
        return result
    }

    fun modifier() = if(KeyBind.pressedKeys.contains("key.keyboard.left.control")) 10 else 1

    override fun modify(positive: Boolean) {
        if(onModify != null) {
            onModify!!.invoke(this, positive)
        } else {
            val newValue = ((value as? Double)?.let {
                if(positive) (it + (diff as Double) * modifier())
                else (it - (diff as Double))
            } ?: (value as? Int)?.let {
                if(positive) (it + (diff as Int) * modifier())
                else (it - (diff as Int))
            } ?: value) as T
            set(newValue)
        }
        super.modify(positive)
    }
}
class BindInt(key: String, configIndex: String, value: Int, diff: Int = 1, callback: (Bind) -> Unit) :
    BindNumber<Int>(key, configIndex, value, diff, callback) {
    override fun updateFromString(string: String) {
        set(string.toInt())
        super.updateFromString(string)
    }
}
class BindDouble(key: String, configIndex: String, value: Double, diff: Double = 1.0, callback: (Bind) -> Unit) :
    BindNumber<Double>(key, configIndex, value, diff, callback){
    override fun updateFromString(string: String) {
        set(string.toDouble())
        super.updateFromString(string)
    }
}

class BindPos(key: String, value: Pos3D, callback: (Bind) -> Unit): BindValue<Pos3D>(key, value, callback) {
    override fun trigger() {
        value = if(value == Pos3D.ZERO) {
            FPlayer(KotlinExtension.runner).player!!.pos
        } else {
            Pos3D.ZERO
        }
        super.trigger()
    }
}

val mc = Client.minecraft
val interactKey =  mc.field_1690.field_1904
val attackKey = mc.field_1690.field_1886

var attackCooldown by mc._getField<Int>("field_1771")

val quickCastFeature = Managers.Feature.getFeatureInstance(QuickCastFeature::class.java)
val autoAttackFeature = Managers.Feature.getFeatureInstance(AutoAttackFeature::class.java)

fun getSpellCaster(spellOrder: String): () -> Unit {
    val m = quickCastFeature::class.java.getDeclaredMethod("cast${spellOrder}Spell")
    m.trySetAccessible()
    return { m.invoke(quickCastFeature) }
}
val spells = listOf(
    Actions.cast1 to "First", Actions.cast2 to "Second",
    Actions.cast3 to "Third", Actions.cast4 to "Fourth"
).associate { it.first to getSpellCaster(it.second) }

fun getSpellInProgress() = Models.Spell.lastSpell

fun lerp(from: Double, to: Double, delta: Float) = from + (to - from) * delta
fun lerp(from: Float, to: Float, delta: Float) = from + (to - from) * delta

class Smooth {
    var enabled = false
    var targetYaw = 0f
    var targetPitch = 0f
    var prevYaw = 0f
    var prevPitch = 0f
    var tick = 0L

    fun grim(current: Float, target: Float) = current + mouseToAngle(angleToMouse(target - current))

    fun mouseToAngle(delta: Int): Float {
        val f = (Client.gameOptions.controlOptions.mouseSensitivity * 0.6f + 0.2f).toFloat()
        return delta * f * f * f * 8f * 0.15f
    }

    fun angleToMouse(angle: Float) = round(angle / mouseToAngle(1)).toInt()

    fun lookAt(yaw: Double, pitch: Double) = lookAt(yaw.toFloat(), pitch.toFloat())

    fun lookAt(yaw: Float, pitch: Float) {
        val player = Player.player ?: return
        enabled = true
        prevYaw = player.yaw
        prevPitch = player.pitch

        targetYaw = grim(player.yaw, yaw)
        targetPitch = grim(player.pitch, pitch)
        player.lookAt(targetYaw.toDouble(), targetPitch.toDouble())

        tick = World.time
    }
}

val smooth = Smooth()

KtGlobals.getVariable<MutableMap<String, () -> Pair<Float, Float>>>(offsetKey)?.put(smooth.hashCode().toString()) {
    if(!smooth.enabled || World.time > smooth.tick) {
        smooth.enabled = false
        0f to 0f
    } else {
        val delta = Client.minecraft.getRenderTickCounter().getTickDelta(true)
        val yaw = lerp(smooth.targetYaw - smooth.prevYaw, 0f, 1-delta)
        val pitch = lerp(smooth.targetPitch - smooth.prevPitch, 0f, 1-delta)

        yaw to pitch
    }
}

val hotBarRegex = "key.keyboard.(\\d)".toRegex()

enum class Mode {
    None,
    Melee,

    Acrobat,
    Trickster,
    Trickshade,

    ScreamSurf,
    BashSurf,
    ChargeSpam,
    BashScream,
    AlterScream,
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

open class WynnClass: HasBind {
    var lastAction = ""
    var burstAction = 0
    var lastMelee = 0L
    lateinit var enabled: BindBoolean
    val texts = arrayListOf<Text>()
    val binds = hashMapOf<String, Bind>()
    val crossHair = d2d.addText("", 0, 0, 0xffffff, true)

    var lineIndex = -1
    var modifyConfig: (Boolean) -> Unit = { }

    var configPos = 250 to 50

    lateinit var targetY: BindDouble
    lateinit var height: BindInt

    var terminated = true

    lateinit var spamSneak: BindBoolean

    var castQueue = mutableListOf<String>()
    lateinit var spellCooldown: BindInt

    var blockSwapItem = false
    var blockSwapItemTarget = -1

    lateinit var anchor: BindPos
    var anchorSpread = 30
    var anchorMomentum = 0.0
    var anchorThreshold = false

    open var mode = Mode.None
    val modeSelectorScreen: ScriptScreen = Hud.createScreen("", false)
    open var quickMode = Mode.None

    var manualSkill = ""
    var lastSpell = 0L
    lateinit var enableMelee: BindBoolean
    lateinit var maxRepeat: BindInt
    var nextSpells = mutableListOf<String>()
    var blockedByHotbar = false
    
    var lastSneak = 0L

    var lastSpells = spells.mapValues { (k,v) -> 0L }.toMutableMap()

    init {
        onInit()
    }

    fun onInit() {
        onInitOverride()
    }

    fun <T : Bind> T.bind(name: String = this.simpleName): T {
        this@WynnClass.addBind(name, this)
        return this
    }

    fun <U, T : BindValue<U>> T.setPersist(value: Boolean = false): T {
        this.persist = value
        return this
    }

    open fun onInitOverride() {
        enabled = BindBoolean("key.keyboard.f") {
            if(enabled.value) {
                main()
            } else {
                onDisable()
            }
            updateConfig()
        }.bind().setPersist()

        spellCooldown = BindInt("key.keyboard.keypad.decimal", "spellCooldown", 10) { updateConfig() }
            .bind()

        spamSneak = BindBoolean("key.keyboard.keypad.0") { updateConfig() }.bind().setPersist()

        Bind("key.keyboard.keypad.add") {
            SharedBindData.modifyConfig(true)
        }.bind()
        Bind("key.keyboard.keypad.subtract") {
            SharedBindData.modifyConfig(false)
        }.bind()
        Bind("key.keyboard.keypad.5") {
            openModeSelector()
            updateConfig()
        }.bind("modeSelector")

        targetY = BindDouble("key.keyboard.keypad.2", "TargetY", -1.0, 1.0) { updateConfig() }.bind()
        targetY.onModify = { bind, positive ->
            bind.value = if(positive) Player.player?.y ?: -1.0 else -1.0
        }

        anchor = BindPos("key.keyboard.keypad.9", Pos3D.ZERO) { updateConfig() }.bind().setPersist()
        enableMelee = BindBoolean("key.keyboard.keypad.7", true) { updateConfig() }.bind()

        maxRepeat = BindInt("key.keyboard.keypad.8", "MaxRepeat", 1) { updateConfig() }.bind()
    }

    open fun getSpellCooldownWithMana() = spellCooldown.value + (if(getMana() > 35) 0 else if(getMana() > 19) 1 else 2)

    fun pressAndRelease(key: String) {
        KeyBind.pressKey(key)
        Client.waitTick()
        KeyBind.releaseKey(key)
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
        KeyBind.pressKeyBind(key)
        if(release) {
            Client.waitTick()
            KeyBind.releaseKeyBind(key)
        }
        return false
    }

    fun cast(spell: String) {
        recordAction(spell)
        lastSpells[spell] = World.time
        spells[spell]?.invoke()
    }

    fun cast1() = cast(Actions.cast1)

    fun cast2() = cast(Actions.cast2)

    fun cast3() = cast(Actions.cast3)

    fun cast4() = cast(Actions.cast4)

    open fun melee() {
        lastMelee = World.time
        attackCooldown = 0
        Player.interactions()?.attack()
        lastSpellPacket = Time.time()
    }

    open fun onDisable() {
        Managers.Feature.enableFeature(autoAttackFeature)
    }

    open fun reset() {
        lastMelee = 0
        lastSpell = 0
        lastSneak = 0
        customInput?.forceForward = false
    }

    fun removeBlind() {
        val player = Player.player?.raw ?: return
        player.removeStatusEffectInternal(StatusEffectsKt.BLINDNESS)
        player.removeStatusEffectInternal(StatusEffectsKt.DARKNESS)
    }
    
    open fun checkManual(): Boolean {
        if(manualSkill != "") {
            val action = manualSkill
            manualSkill = ""
            waitSpell(action)
            return true
        }
        return false
    }

    open fun main() {
        Managers.Feature.disableFeature(autoAttackFeature)
        reset()
        customInput = setInput()
        thread {
            while (enabled.value && World.isWorldLoaded) {
                if(!isBlocked() && !checkManual()) {
                    val nextSpell = getSpellCooldownWithMana() - (World.time - lastSpell)
                    if(KeyBind.pressedKeys.contains(meleeKey)) {
                        melee()
                        Client.waitTick()
                    } else if(nextSpell > 0) {
                        if(Player.player?.mainHand?.isOnCooldown != true && enableMelee.value) {
                            melee()
                            Client.waitTick()
                        }
                    } else if(nextSpells.isNotEmpty()) {
                        waitSpell(nextSpells.removeFirst())
                    } else {
                        chooseAction()
                        if(nextSpells.isNotEmpty()) {
                            Client.waitTick()
                            if(!checkManual()) {
                                waitSpell(nextSpells.removeFirst())
                            }
                        }
                    }
                }
                Client.waitTick()
            }
            enabled.set(false)
        }
    }

    fun addSpell(action: String) = synchronized(nextSpells) { nextSpells.add(action) }

    open fun chooseAction() { }

    open fun updateConfig() {
        texts.forEach { d2d.reAddElement(it) }
        resetLineIndex()
        nextLine().setText(enabled.toString("Enabled"))
        nextLine().setText(spellCooldown.toString())
        nextLine().setText("Mode (${Format.coloredKey(binds["modeSelector"]?.simpleName)}): " + mode + " <--> " + quickMode)
        nextLine().setText(spamSneak.toString("Spam Shift"))
        nextLine().setText(Format.coloredConfig("anchor" ) + "Anchor ${Format.formatChar}r(${Format.coloredKey(anchor.simpleName)}): " + Format.coloredBoolean(anchor.value != Pos3D.ZERO))
        nextLine().setText(enableMelee.toString("Melee"))
        nextLine().setText(maxRepeat.toString(getMaxRepeatValue()))
    }

    fun resetLineIndex() {
        lineIndex = -1
        hideLines()
        lineIndex = -1
    }

    fun nextLine(): Text {
        lineIndex++
        while(lineIndex >= texts.size) {
            texts.add(d2d.addText("", configPos.first, configPos.second + texts.size * 10, 0xffffff, true))
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
        crossHair.y = d2d.height / 2 + 10
        crossHair.x = (d2d.width - crossHair.width) / 2
    }

    open fun onKey(e: EventKey) {
        if(e.action != 1) return

        hotBarRegex.matchEntire(e.key)?.let {
            val index = it.groupValues[1].toInt() - 1
            if(blockSwapItem) {
                blockSwapItemTarget = index
                e.cancel()
            } else if(enabled.value) {
                thread {
                    checkUndoSelectHotbar(index)
                }
                e.cancel()
            }
        }

        spells.keys.forEach {
            if(e.key == keyBinds[it]) {
                if(enabled.value) {
                    manualSkill = it
                    e.cancel()
                } else {
                    lastSpells[it] = World.time
                    recordAction(it)
                }
                return@forEach
            }
        }
        
        binds.values.forEach {
            if(it.key == e.key) {
                it.trigger()
            }
        }
    }

    open fun restart() {
        terminated = false
        d2d.register()
        d2d.reAddElement(crossHair)
        KeyBind.setKeyBind("key.attack", "key.mouse.left")
        KeyBind.setKeyBind("key.use", "key.mouse.right")

        spellCooldown.callback.invoke(spellCooldown)
        updateConfig()
    }

    open fun terminate() {
        reset()
        texts.forEach {
            d2d.removeText(it)
        }
        d2d.removeText(crossHair)
        terminated = true
        enabled.set(false)
        saveConfig()
    }

    open fun onWorldChange() {
        lastSpells.replaceAll { _, _ -> 0L }
        lastAction = ""
    }

    fun yAboveTarget(dy: Double): Boolean {
        val player = Player.player ?: return false
        if(player.y + dy - height.value < targetY.value) return true
        return Models.CharacterStats.blocksAboveGround < height.value - dy
    }

    fun getMana() = Models.CharacterStats.mana.getOrNull()?.percentage ?: 0.0
    fun getHealth() = Models.CharacterStats.health.getOrNull()?.percentage ?: 0.0

    fun findEffect(name: String) = Models.StatusEffect.statusEffects.find { it.name.contains(name) }
    fun isHoldItem(name: String) = Player.player?.mainHand?.name?.stringStripFormatting?.lowercase()?.contains(name)
        ?: false

    fun smoothPitch(target: Float, ticks: Int = 1) {
        val player = Player.player?: return
        val pitch = player.pitch
        val perTick = (target - pitch) / ticks
        for(i in 1..ticks) {
            player.lookAt(player.yaw.toDouble(), (pitch + perTick * i).toDouble())
            Client.waitTick()
        }
    }

    open fun isBlocked() = blockedByHotbar

    open fun onTick() {
        if(World.time % 2 == 0L) {
            if(spamSneak.value) {
                pressKeyBind(Actions.sneak)
            }
        }
        
        removeBlind()
        Player.player?.let {
            if(it.hasStatusEffect("invisibility") && it.vehicle != null || !Player.gameMode.contains("adve", true)) {

                enabled.set(false)
                updateConfig()
            }
            
            if(it.isSneaking) {
                lastSneak = World.time
            }
        }
        var forward = false
        if(enabled.value) {
            if(anchor.value != Pos3D.ZERO) {
                val player = Player.player!!
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
                    smooth.lookAt(player.yaw + anchorMomentum, player.pitch.toDouble())
                }
                forward = true
            }
        }
        customInput?.forceForward = forward
    }

    open fun waitSpell(spell: String, extraTick: Int = 0, hotbar: Int = -1) {
        if(checkManual()) {
            Client.waitTick()
        }
        lastSpell = World.time
        var extraTick = extraTick
        val hotbar = hotbar.coerceAtLeast(blockSwapItemTarget)
        blockSwapItem = true
        cast(spell)
        Client.waitTick(5)
        if(hotbar != -1) {
            checkUndoSelectHotbar(hotbar)
            blockSwapItemTarget = -1
            extraTick = extraTick.coerceAtLeast(1)
        }

        if(extraTick != 0)
            Client.waitTick(extraTick)

        blockSwapItem = false
    }

    open fun checkUndoSelectHotbar(newSelect: Int) {
        blockedByHotbar = true
        val inv = Player.openInventory()
        val oldSelect = inv.selectedHotbarSlotIndex
        inv.selectedHotbarSlotIndex = newSelect
        if(oldSelect != newSelect && isPotion(Player.player!!.mainHand)) {
            Client.waitTick(2)
            Player.interactions()?.interact()
            Client.waitTick(2)
            inv.selectedHotbarSlotIndex = oldSelect
        }
        blockedByHotbar = false
    }

    fun isPotion(item: ItemStackHelper) =
        Models.Item.asWynnItem(item.raw, PotionItem::class.java).isPresent
                || Models.Item.asWynnItem(item.raw, MultiHealthPotionItem::class.java).isPresent
                || Models.Item.asWynnItem(item.raw, CraftedConsumableItem::class.java).isPresent

    open fun getAvailableModes() = arrayOf<Mode>()

    fun openModeSelector() {
        if(Player.player?.isSneaking == true) {
            if(mode != quickMode) {
                val tmp = mode
                mode = quickMode
                quickMode = tmp
                return
            }
        }

        modeSelectorScreen.shouldPause = false
        val iscreen = modeSelectorScreen as IScreen
        iscreen.setOnInit(JavaWrapper.methodToJava { _ ->
            val hw = iscreen.width / 2
            val hh = iscreen.height / 2
            val modes = getAvailableModes()
            modes.forEachIndexed { index, mode ->
                iscreen.buttonBuilder()
                    .x(hw - 100).y(hh - modes.size * 12 + index * 25)
                    .width(200)
                    .message(mode.name)
                    .action(JavaWrapper.methodToJava { _, _ ->
                        if(mode == quickMode) {
                            quickMode = this.mode
                        }
                        this.mode = mode
                        updateConfig()
                    })
                    .build()
            }
        })
        iscreen.setOnMouseDown(JavaWrapper.methodToJava { _, _ ->
            iscreen.close()
        })
        Hud.openScreen(iscreen)
    }

    override fun addBind(name: String, bind: Bind) {
        binds[name] = bind
    }
    
    open fun getMaxRepeatValue() = maxRepeat.value

    open fun saveConfig() {
        var dirty = json[lastCharacterId]?.get("mode") == mode.toString()
        val map = binds.mapNotNull { (key, bind) ->
            (bind as? BindValue<*>)?.let {
                if(!it.persist) return@let null
                if(it.dirty)
                    dirty = true
                key to it.value.toString()
            }
        }.toMap().toMutableMap()
        map["mode"] = mode.toString()
        map["quickMode"] = quickMode.toString()
        synchronized(json) {
            json[lastCharacterId] = map
            if(dirty) {
                configFile.writeText(gson.toJson(json))
            }
        }
    }

    open fun loadConfig() {
        val map = json[currentCharacterId] ?: return
        synchronized(this) {
            map["mode"]?.let {
                mode = Mode.valueOf(it)
            }
            map["quickMode"]?.let {
                quickMode = Mode.valueOf(it)
            }
            map.forEach { (key, value) ->
                (binds[key] as? BindValue<*>)?.updateFromString(value)
            }
            updateConfig()
        }
    }
    
    open fun onSpellCasted() {}
}

inner class Warrior() : WynnClass() {
    val lastBash get() = lastSpells[Actions.cast1] ?: 0L
    val lastWarScream get() = lastSpells[Actions.cast4] ?: 0L

    lateinit var bloodPact: BindBoolean
    var interactCounter = 0
    var attackCounter = 0
    var hotbarChanged = false
    var chargeCounter = 0
    var charging = false
    var chargeCooldown = 0

    lateinit var meleeInterval: BindInt
    //var quick = true
    var cspam = false
    lateinit var fly: BindBoolean

    val modes = arrayOf(Mode.BashSurf, Mode.ScreamSurf, Mode.ChargeSpam, Mode.BashScream, Mode.AlterScream, Mode.AlterSurf, Mode.UpperScream)
    override var mode = Mode.BashScream
    override var quickMode = Mode.AlterSurf

    override fun onInitOverride() {
        height = BindInt("key.keyboard.keypad.3", "Height", 5) { updateConfig() }.bind()

        meleeInterval = BindInt("key.keyboard.keypad.1", "MeleeInterval", 20, 3) { updateConfig() }.bind()

        bloodPact = BindBoolean("key.keyboard.keypad.6") { updateConfig() }.bind()
        fly = BindBoolean("key.keyboard.keypad.4") { updateConfig() }.bind().setPersist()

        super.onInitOverride()

        maxRepeat.set(2)
        spellCooldown.set(8)
    }

    override fun updateConfig() {
        super.updateConfig()

        if(mode == Mode.ChargeSpam) {
            nextLine().setText(targetY.toString())
            nextLine().setText(height.toString())
        }
        nextLine().setText(meleeInterval.toString())
        nextLine().setText(fly.toString("Fly"))
        nextLine().setText(bloodPact.toString("Blood Pact"))
        nextLine().setText("upper: charge charge scream upper")
        nextLine().setText("bash(scream): scream scream\ntest")
    }
    
    override fun main() {
        if(mode == Mode.ScreamSurf) {
            addSpell(Actions.cast2)
            addSpell(Actions.cast2)
            addSpell(Actions.cast4)
            addSpell(Actions.cast3)
        } else if(mode == Mode.BashSurf) {
            addSpell(Actions.cast4)
            addSpell(Actions.cast4)
        }
        super.main()
    }

    fun heightCheck(time: Int = 4): Boolean {
        val player = Player.player ?: return false

        var speed = player.velocity.y
        if(speed < -1) return true

        val delay = 0
        var dy = 0.0
        val end = 4 + time
        for(tick in -delay..end) {
            speed -= 0.08
            speed *= 0.98
            dy += speed
        }
        return yAboveTarget(dy)
    }

    override fun reset() {
        super.reset()
        interactCounter = 0
        attackCounter = 0
    }

    fun isIdol() = isHoldItem("idol")

    fun burstCharge() = Models.Spell.lastBurstSpellName.lowercase().contains("charge") && Models.Spell.repeatedBurstSpellCount > 5

    override fun chooseAction() {
        if(isHoldItem("elaborated ")) return
        if(isHoldItem("rhythm") || isHoldItem("catamaran")) {
            KeyBind.pressKeyBind(Actions.sneak)
            waitSpell(Actions.cast2, 5)
            waitSpell(Actions.cast3, 5)
            KeyBind.releaseKeyBind(Actions.sneak)
        } else if(mode == Mode.ChargeSpam && isIdol()) {
            if(World.time % 2L == 0L) {
                Player.interactions()?.interact()
                interactCounter++
            }
            if(lastMelee + meleeInterval.value + (Math.random() * 5).toInt() < World.time
                || burstCharge()) {
                melee()
                interactCounter = 0
            }
        } else if(mode == Mode.BashSurf || mode == Mode.ScreamSurf) {
            addSpell(Actions.cast3)
            addSpell(Actions.cast2)
            if(World.time >= lastWarScream + 200 || hotbarChanged || mode == Mode.ScreamSurf) {
                hotbarChanged = false
                addSpell(Actions.cast4)
            } else {
                addSpell(Actions.cast1)
            }
        } else if(mode == Mode.BashScream || mode == Mode.UpperScream) {
            if(mode == Mode.BashScream) {
                addSpell(Actions.cast1)
            } else {
                addSpell(Actions.cast3)
            }
            for(i in 1..maxRepeat.value) {
                addSpell(Actions.cast4)
            }
        } else if(mode == Mode.AlterScream) {
            val trumpet = Models.StatusEffect.statusEffects.find { it.name.stringWithoutFormatting.contains("Heavenly Trumpet") }
            val trumpetTime = trumpet?.let { it.displayedTime.stringWithoutFormatting.split(":")[1].split(")")[0].toInt() } ?: 0
            addSpell(Actions.cast1)
            var repeat = getMaxRepeatValue()
            if(AbilityModel.holyPowerBar.barProgress != null && ((AbilityModel.holyPowerBar.barProgress.progress > 0.8 && trumpetTime > 3 && getMana() > 50) || World.time - lastSneak > 40)) {
                addSpell(Actions.cast3)
                repeat -= 1
            }
            
            for(i in 1..repeat) {
                addSpell(Actions.cast4)
            }
        } else if(mode == Mode.AlterSurf) {
            addSpell(Actions.cast3)
            addSpell(Actions.cast2)
            addSpell(Actions.cast4)
            addSpell(Actions.cast3)
            addSpell(Actions.cast2)
            addSpell(Actions.cast1)
        }
    }

    override fun onTick() {
        super.onTick()

        if(!isHoldItem("elaborated ")) {
            if(!enabled.value && fly.value && World.time % 7 < 3L) {
                val c = World.time / 7
                if(c % (getMaxRepeatValue()+1) == 0L) {
                    cast4()
                } else {
                    cast2()
                }
            } else {
                if(attackKey.method_1434() && (lastMelee + meleeInterval.value + (Math.random() * 5).toInt() < World.time || (burstCharge() && attackCounter % 3 != 0))) {
                    melee()
                    interactCounter = 0
                    attackCounter++
                } else {
                    attackCounter = 0
                }
                if(interactKey.method_1434() && (World.time % 3 == 0L || isIdol())) {
                    Player.interactions()?.interact()
                    interactCounter++
                }
            }
        }
        if(enabled.value && abs(Player.player!!.pitch) < 45 && (mode == Mode.BashSurf || mode == Mode.ScreamSurf)) {
            customInput?.forceForward = true
        }
    }

    override fun onKey(e: EventKey) {
        super.onKey(e)

        if(e.key == skill2Key && e.action == 3) {
            charging = true
        }
    }
    
    override fun onSpellCasted() {
        if(charging) {
            if(chargeCounter++ > 2) {
                chargeCounter = 0
                cast4()
            }
            charging = false
        }
    }

    override fun waitSpell(spell: String, extraTick: Int, hotbar: Int) {
        var inv = Player.openInventory()
        val oldSelect = inv.selectedHotbarSlotIndex
        super.waitSpell(spell, extraTick, hotbar)
        inv = Player.openInventory()
        val newSelect = inv.selectedHotbarSlotIndex
        if(oldSelect != newSelect) {
            if(isHoldItem("elaborated ")) {
                inv.selectedHotbarSlotIndex = oldSelect
                Client.waitTick()
            }
        }
    }
    
    override fun checkUndoSelectHotbar(newSelect: Int) {
        super.checkUndoSelectHotbar(newSelect)
        hotbarChanged = true
    }

    override fun getSpellCooldownWithMana() =
        if(bloodPact.value && getHealth() > 30)
            spellCooldown.value
        else
            super.getSpellCooldownWithMana()

    override fun getAvailableModes() = modes
}

inner class Assassin() : WynnClass() {
    var tickToHop = 20

    val modes = arrayOf(Mode.Trickster, Mode.Acrobat, Mode.Trickshade, Mode.None)
    override var mode = Mode.Trickshade

    lateinit var slowFall: BindBoolean
    lateinit var dive: BindBoolean

    val lastSmoke get() = lastSpells[Actions.cast4] ?: 0L
    val lastDash get() = lastSpells[Actions.cast2] ?: 0L
    val lastSpin get() = lastSpells[Actions.cast1] ?: 0L

    var counter = 0
    var blocking = false
    var flyAt = 0L

    val momentumBar = MomentumBar()

    override fun onInitOverride() {
        height = BindInt("key.keyboard.keypad.6", "Height", 3) { updateConfig() }.bind()
        slowFall = BindBoolean("key.keyboard.keypad.4", true) { updateConfig() }.bind()
        dive = BindBoolean("key.keyboard.keypad.1", true) { updateConfig() }.bind()

        super.onInitOverride()
        spellCooldown.set(12)
        maxRepeat.set(2)
    }

    fun smoke() {
        waitSpell(Actions.cast4)
    }

    fun multiHit(){
        waitSpell(Actions.cast3)
    }

    fun dash() {
        waitSpell(Actions.cast2)
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText(targetY.toString())
        nextLine().setText(height.toString())
        nextLine().setText(slowFall.toString("Slow Fall"))
        if(mode == Mode.Acrobat) {
            nextLine().setText(dive.toString("Dive"))
        }
    }

    fun heightCheck(): Boolean {
        val player = Player.player ?: return false

        var speed = player.velocity.y
        if(speed < -1) return true

        return yAboveTarget(0.0)
    }

    override fun chooseAction(){
        val player = Player.player ?: return
        blocking = true
        if(mode == Mode.Trickster) {
            dash()
            smoke()
        } else if(mode == Mode.Acrobat) {
            if(World.time - lastSpin > 20 && (lastAction != Actions.cast1 || World.time - lastSpin > 62)) {
                if(heightCheck()) {
                    flyAt = World.time + 17
                    waitSpell(Actions.cast1)
                } else if(enableMelee.value) {
                    melee()
                    Client.waitTick()
                }
            } else if(getMana() > 30 && World.time - lastSmoke > 100) {
                smoke()
            } else if(dive.value && momentumBar.barProgress?.progress?.let { it >= 1f } == true && Models.CharacterStats.blocksAboveGround > 5) {
                dash()
            } else if(getMana() > 50 && lastAction != Actions.cast3) {
                multiHit()
            } else if(getMana() > 30 && lastAction != Actions.cast2 && player.pitch < 30) {
                dash()
            } else if(enableMelee.value) {
                melee()
                Client.waitTick()
            }
        } else if (mode == Mode.Trickshade) {
            if(World.time - lastDash > 600) {
                dash()
                Client.waitTick()
                melee()
                Client.waitTick()
            } else if(getMana() > 30 && World.time - lastSmoke > 100) {
                smoke()
            } else if(getMana() > 30 && (lastAction != Actions.cast3 || burstAction < getMaxRepeatValue())) {
                multiHit()
            } else if(getMana() > 30 && lastAction != Actions.cast1) {
                waitSpell(Actions.cast1)
            }
        }
        blocking = false
    }

    override fun onKey(e: EventKey) {
        if(e.action == 1 && e.key == skill1Key) {
            if(blocking) {
                e.cancel()
                return
            } else if(!enabled.value && mode == Mode.Acrobat) {
                blocking = true
                setCrossHairText("Wait !!!")
                flyAt = World.time + 17
                thread {
                    Client.waitTick(6)
                    chooseAction()
                }
            }
        }
        super.onKey(e)
    }

    override fun getAvailableModes() = modes

    override fun restart() {
        super.restart()

        Handlers.BossBar.registerBar(momentumBar)

        thread {
            while (!terminated) {
                if(World.time >= flyAt && flyAt != 0L) {
                    flyAt = 0L
                    val wasJump = KeyBind.pressedKeys.contains(jumpKey)
                    KeyBind.releaseKeyBind(Actions.sneak)
                    KeyBind.releaseKeyBind(Actions.jump)
                    Client.waitTick()
                    pressKeyBind(Actions.jump)
                    Client.waitTick()
                    pressKeyBind(Actions.jump)
                    Client.waitTick()
                    if(slowFall.value && Models.CharacterStats.blocksAboveGround > 1.25) {
                        KeyBind.pressKeyBind(Actions.sneak)
                    }
                    if(wasJump) {
                        KeyBind.pressKeyBind(Actions.jump)
                    }
                    
                    setCrossHairText("")
                    blocking = false
                }
                if(slowFall.value && enabled.value) {
                    KeyBind.keyBind(Actions.sneak, Models.CharacterStats.blocksAboveGround > 1)
                }
                Client.waitTick()
            }
        }
    }

    override fun reset() {
        super.reset()
        flyAt = 0
        KeyBind.releaseKeyBind(Actions.sneak)
    }

    override fun terminate() {
        super.terminate()
        Handlers.BossBar._getPrivateValue<MutableList<TrackedBar>>("knownBars")?.remove(momentumBar)
    }

    inner class MomentumBar : TrackedBar(".+?(\\d).+Momentum".toPattern()) {
        override fun onUpdateName(match: Matcher?) {
            match?.group(1)?.toInt()?.let {
                updateValue(it, it)
            }
        }
    }
}

inner class Mage() : WynnClass() {
    val lastHeal get() = lastSpells[Actions.cast1] ?: 0L
    val lastIceSnake get() = lastSpells[Actions.cast4] ?: 0L
    lateinit var enableIceSnake: BindBoolean
    lateinit var enableMeteor: BindBoolean
    var lastTimeLock = 0L
    var teleportCounter = 0
    val timeLocked get() = findEffect("Timelocked") != null

    val modes = arrayOf(Mode.Arcanist, Mode.LightBender, Mode.RiftWalker)
    override var mode = Mode.Arcanist
    override var quickMode = Mode.LightBender

    override fun getAvailableModes() = modes

    fun getArchType(): String {
        return if(AbilityModel.ophanimBar.isActive || mode == Mode.LightBender) "lb"
        else if(AbilityModel.manaBankBar.isActive || mode == Mode.Arcanist) "ar"
        else "rw"
    }

    override fun onInitOverride() {
        enableIceSnake = BindBoolean("key.keyboard.keypad.4", true) {
            updateConfig()
        }.bind()
        enableMeteor = BindBoolean("key.keyboard.keypad.1", true) {
            updateConfig()
        }.bind()

        super.onInitOverride()
        maxRepeat.set(1)
        spellCooldown.set(6)
    }

    override fun updateConfig() {
        super.updateConfig()

        nextLine().setText(enableIceSnake.toString("IceSnake"))
        nextLine().setText(enableMeteor.toString("Meteor"))
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
        val player = Player.player ?: return
        val health = getHealth()
        val notHealthy = health < 60 || orbNotHealthy()
        val timeSinceLastHeal = World.time - lastHeal
        val inHealPulse = abs(timeSinceLastHeal - 12) < 12 || abs(timeSinceLastHeal - 42) < 12 || abs(timeSinceLastHeal - 72) < 12

        if(notHealthy && !inHealPulse && (lastAction != Actions.cast1 || Models.Spell.repeatedSpellCount < 3) && getMana() > 40) {
            waitSpell(Actions.cast1)
        } else if(World.time - lastMelee >= 9 && !player.mainHand.isOnCooldown) {
            melee()
            Client.waitTick(1)
        } else if(enableIceSnake.value && getMana() > 75 && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat.value) || (notHealthy && getMana() > 55)) {
            waitSpell(Actions.cast4)
        } else if((lastAction == Actions.cast4 && Models.Spell.repeatedSpellCount >= maxRepeat.value) && World.time - lastMelee <= 20 && getMana() > 75) {
            waitSpell(Actions.cast1)
        }
    }

    fun rw() {
        val player = Player.player ?: return
        val health = getHealth()
        
        val manaFlag = getMana() > 25 || timeLocked
        val repeatFlag = Models.Spell.repeatedSpellCount < maxRepeat.value
        if(player.isSneaking && World.time - lastTimeLock > 100 && !timeLocked) {
            lastTimeLock = World.time
            waitSpell(Actions.cast1)
        } else if((health < 90) && lastAction != Actions.cast1) {
            if(player.isSneaking)
                lastTimeLock = World.time
            waitSpell(Actions.cast1)
        } else if((manaFlag || health < 80)
            && ((lastAction != Actions.cast4 && !timeLocked) || World.time - lastIceSnake > 62 || (repeatFlag && !timeLocked) 
            || (!repeatFlag && timeLocked && lastAction != Actions.cast4) )) {
            waitSpell(Actions.cast4)
        } else if(enableMeteor.value && (manaFlag || health < 80)
            && (lastAction != Actions.cast3 || (repeatFlag && timeLocked))) {
            waitSpell(Actions.cast3)
        } else if(!enableMeteor.value && lastAction == Actions.cast4 && manaFlag) {
            if(player.isSneaking)
                lastTimeLock = World.time
            waitSpell(Actions.cast1)
        } else if(enableMelee.value && World.time - lastMelee > 4 && !player.mainHand.isOnCooldown) {
            melee()
        }
    }

    fun ar() {
        val player = Player.player ?: return
        if(enableMelee.value) {
            melee()
            Client.waitTick()
        }
        for(i in 1..maxRepeat.value) {
            addSpell(Actions.cast4)
            addSpell(Actions.cast3)
            addSpell(Actions.cast3)
        }
        addSpell(Actions.cast1)
    }

    override fun onTick() {
        super.onTick()
        if(World.time % 2 == 0L) {
            if(isHoldItem("warp") && !enabled.value) {
                if(interactKey.method_1434()) {
                    Player.interactions()?.interact()
                }
            }
        }
    }

    override fun reset() {
        super.reset()

        lastTimeLock = 0L
    }

    override fun onKey(e: EventKey) {
        super.onKey(e)

        if(e.key == skill3Key && e.action == 3 && getArchType() == "lb") {
            e.cancel()
        }
        if(e.key == skill2Key) {
            if(e.action == 3) {
                if(teleportCounter++ < 6) {
                    e.cancel()
                }
            } else {
                teleportCounter = 0
            }
        }
    }
}

inner class Archer() : WynnClass() {
    val lastShield get() = lastSpells[Actions.cast4] ?: 0L
    val lastBomb get() = lastSpells[Actions.cast3] ?: 0L
    val lastEscape get() = lastSpells[Actions.cast2] ?: 0L
    lateinit var autoEscape: BindBoolean

    override fun onInitOverride() {
        autoEscape = BindBoolean("key.keyboard.keypad.1") {
            updateConfig()
        }.bind("escape")

        super.onInitOverride()

        spellCooldown.set(8)
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText(autoEscape.toString("Auto Escape"))
    }

    override fun chooseAction() {
        var melee = true
        val shield = Models.Shield.shieldCharge < 3
        if(autoEscape.value && Player.player!!.pitch > 45
            && Models.CharacterStats.blocksAboveGround < 2 && (World.time - lastEscape >= 20 || lastAction != Actions.cast2)) {
            waitSpell(Actions.cast2)
        } else if(isHoldItem("anthracite")) {
            if(getMana() > 80) {
                if((World.time - lastShield >= 60 || lastAction != Actions.cast4) && shield) {
                    waitSpell(Actions.cast4)
                } else if(World.time - lastBomb >= 260) {
                    waitSpell(Actions.cast3)
                }
            }
        } else if(getMana() > 50) {
            melee = false
            if(World.time - lastShield >= 60 && shield) {
                waitSpell(Actions.cast4)
            } else if(Models.Spell.repeatedSpellCount < maxRepeat.value || lastAction != Actions.cast3) {
                waitSpell(Actions.cast3)
            } else {
                waitSpell(Actions.cast1)
            }
        }
        if(World.time % 2L == 0L && melee && enableMelee.value) {
            melee()
            Client.waitTick()
        }
    }
    
    override fun melee() {
        lastMelee = World.time
        Player.interactions()?.interact()
    }

    override fun onTick() {
        super.onTick()
        if(interactKey.method_1434() && World.time % 2 == 0L) {
            melee()
        }
    }

    override fun reset() {
        super.reset()
    }
}

inner class Shaman() : WynnClass() {
    val lastAura get() = lastSpells[Actions.cast3] ?: 0L
    lateinit var enableAwakened: BindBoolean
    lateinit var enableBlood: BindBoolean
    var assertMask = false
    val lastTotem get() = lastSpells[Actions.cast1] ?: 0L
    val lastUproot get() = lastSpells[Actions.cast4] ?: 0L
    var recordedPitch = 0f
    lateinit var enableAura: BindBoolean
    lateinit var fly: BindBoolean
    var counter = 0
    var flyCounter = -1
    val maskOrder = arrayOf(ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC, ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    val masks = arrayOf(ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    var targetMask = ShamanMaskType.FANATIC
    override var mode = Mode.TotemSpam
    val modes = arrayOf(Mode.None, Mode.TotemSpam, Mode.Acolyte, Mode.AuraSpam, Mode.PuppetBomber, Mode.Melee)
    override var quickMode = Mode.PuppetBomber
    var lastNoTotemNotify = 0L
    
    val awakenedProgress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f

    override fun onInitOverride() {

        Bind("key.keyboard.keypad.1") {
            targetMask = masks[(masks.indexOf(targetMask)+1) % masks.size]
            updateConfig()
        }.bind("mask")

        enableAwakened = BindBoolean("key.keyboard.keypad.6") {
            updateConfig()
        }.bind()

        fly = BindBoolean("key.keyboard.keypad.4") {
            updateConfig()
            flyCounter = -1
        }.bind().setPersist()

        enableAura = BindBoolean("key.keyboard.keypad.3", true) {
            updateConfig()
        }.bind()


        super.onInitOverride()
        spellCooldown.set(6)
        maxRepeat.set(8)
    }

    override fun updateConfig() {
        super.updateConfig()
        nextLine().setText("Mask (${Format.coloredKey(binds["mask"]?.simpleName)}): " + targetMask)
        nextLine().setText(enableAwakened.toString("Awakened"))
        nextLine().setText(fly.toString("Fly"))
        nextLine().setText(enableAura.toString("Aura"))
    }

    fun isMask(target: ShamanMaskType, awakened : Boolean = true): Boolean {
        val mask = Models.ShamanMask.currentMaskType
        return (mask == ShamanMaskType.AWAKENED && awakened) || mask == target
    }

    override fun getMaxRepeatValue(): Int {
        return if(mode == Mode.TotemSpam || mode == Mode.PuppetBomber) {
            maxRepeat.value - 5
        } else {
            maxRepeat.value
        }
    }

    fun switchMask(target: ShamanMaskType, canCancel: Boolean = false) {
        if(canCancel) {
            if(Models.ShamanMask.currentMaskType == target) return
            if(Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED && target == ShamanMaskType.FANATIC) return
        }
        //if(canCancel) Chat.log("current: ${Models.ShamanMask.currentMaskType} target: $target")
        val inventory = Player.openInventory()
        val hotbar = inventory.selectedHotbarSlotIndex
        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        Client.waitTick()
        var currentIndex = maskOrder.indexOf(Models.ShamanMask.currentMaskType)
        if(Models.ShamanMask.currentMaskType == ShamanMaskType.NONE)
            currentIndex = 2
        else if(Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED)
            currentIndex = 1
        val targetIndex = maskOrder.lastIndexOf(target)
        var counter = targetIndex - currentIndex
        val progress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f
        if(progress >= 1f) {
            counter = 1
        }
        while(counter > 3) counter -= 3
        //Chat.log("counter: $counter")
        while (counter-- > 0) {
            waitSpell(Actions.cast4)
        }
        inventory.selectedHotbarSlotIndex = hotbar
        Client.waitTick()
    }

    override fun chooseAction() {
        if(fly.value) return
        val totem = Models.ShamanTotem.activeTotems.firstOrNull()
        if(mode == Mode.Acolyte) {
            if(World.time - lastTotem > 540 || (World.time - lastTotem > 400 && Player.player!!.pitch > 45)) {
                waitSpell(Actions.cast1)
                waitSpell(Actions.cast1)
            }
            val shouldUproot = AbilityModel.bloodPoolBar.barProgress.value.current > 81
            val shouldAura = (100 - getHealth())
            val tooManyUproot = lastAction == Actions.cast4 && burstAction > 1 && World.time - lastUproot < 60
            val tooManyAura = lastAction == Actions.cast3 && burstAction > 1
            if(((getMana() > 50 && shouldAura > 20) || shouldAura > 40) && (World.time - lastAura > 19 && enableAura.value) || (shouldUproot && tooManyUproot)) {
                waitSpell(Actions.cast3, 2)
            }
            if(shouldUproot || (shouldAura > 20 && tooManyAura)) {
                val release = !KeyBind.pressedKeys.contains(keyBinds[Actions.sneak])
                if(shouldUproot)
                    KeyBind.pressKeyBind(Actions.sneak)
                waitSpell(Actions.cast4, 2)

                if(release)
                    KeyBind.releaseKeyBind(Actions.sneak)
                if(shouldUproot && enableAura.value) {
                    waitSpell(Actions.cast4, 2)
                }
            }
        } else if(mode == Mode.AuraSpam) {
            addSpell(Actions.cast1)
            
            for(i in 1..getMaxRepeatValue()) {
                addSpell(Actions.cast3)
            }
        } else if(mode == Mode.TotemSpam) {
            if(!awakened(true)) {
                addSpell(Actions.cast4)
                if(getMana() < 60) {
                    addSpell(Actions.cast4)
                }
            }
            for(i in 1..getMaxRepeatValue()) {
                addSpell(Actions.cast1)
            }
        } else if(mode == Mode.PuppetBomber) {
            if(!awakened(true)) {
                if(enableAura.value) {
                    addSpell(Actions.cast3)
                } else {
                    addSpell(Actions.cast2)
                }
                if(World.time - lastUproot > 20) {
                    switchMask(ShamanMaskType.FANATIC, true)
                }
            }
            for(i in 1..getMaxRepeatValue()) {
                addSpell(Actions.cast1)
            }
        } else if(mode == Mode.Melee) {
            awakened(true)
            if(World.time - lastUproot > 20) {
                switchMask(ShamanMaskType.HERETIC, true)
            }
            if(World.time % 2L == 0L) {
                melee()
            }
        } else if(World.time % 2L == 0L) {
            melee()
        }
    }

    fun awakened(cancelMask: Boolean = false): Boolean {
        if(!enableAwakened.value) return false
        val progress = awakenedProgress
        if(findEffect("Awakened") != null || World.time - lastUproot < 15 || Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED) {
            return false
        }
        if(progress >= 1) {
            waitSpell(Actions.cast4)
            return true
        }
        if(KeyBind.pressedKeys.contains(keyBinds[Actions.cast1])) {
            KeyBind.releaseKeyBind(Actions.cast1)
            Client.waitTick(spellCooldown.value)
        } else {
            KeyBind.releaseKeyBind(Actions.cast1)
        }
        val inventory = Player.openInventory()
        val hotbar = inventory.selectedHotbarSlotIndex
        if(progress < 1f) {
            switchMask(ShamanMaskType.FANATIC, cancelMask)
            inventory.selectedHotbarSlotIndex = 1
            Client.waitTick()
            if(progress < 0.34f) {
                waitSpell(Actions.cast1)
                Client.waitTick()
            }
            for(i in 0..3) {
                if(awakenedProgress >= 1f)
                    break
                if(World.time - lastUproot > 20)
                    switchMask(ShamanMaskType.FANATIC, true)
                if(inventory.selectedHotbarSlotIndex != 1) {
                    inventory.selectedHotbarSlotIndex = 1
                    Client.waitTick()
                }
                waitSpell(Actions.cast1)
                Client.waitTick()
            }
        }
        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        Client.waitTick()
        waitSpell(Actions.cast4)
        inventory.selectedHotbarSlotIndex = hotbar
        Client.waitTick()
        return true
    }

    override fun onDisable() {
        super.onDisable()
        KeyBind.releaseKeyBind(Actions.cast1)
        KeyBind.releaseKeyBind(Actions.cast3)
        counter = 0
    }

    override fun reset() {
        super.reset()
        assertMask = false
        fly.set(false)
        counter = 0
        lastNoTotemNotify = 0
        KeyBind.releaseKeyBind(Actions.cast1)
        KeyBind.releaseKeyBind(Actions.cast3)
    }

    override fun onTick() {
        super.onTick()

        if(fly.value) {
            if(World.time % 7 < 3L) {
                if(flyCounter == -1) {
                    flyCounter = 4 - (World.time / 7).toInt() % 4
                }
                val action = World.time / 7 + flyCounter
                if(action % 4 == 0L) {
                    cast1()
                } else if(action % 4 < 3L) {
                    cast2()
                }
            }
        }
        if(attackKey.method_1434() && World.time % 2 == 0L) {
            melee()
        }
    }

    override fun getAvailableModes() = modes

    override fun restart() {
        val mainItem = Player.openInventory().getSlot(36).name.stringStripFormatting.lowercase()
        if(mainItem.contains("abso")) {
            mode = Mode.Acolyte
        } else if(mainItem.contains("panic ")) {
            mode = Mode.AuraSpam
        } else if(mainItem.contains("a16")) {
            mode = Mode.TotemSpam
        } else if(mainItem.contains("hadal")) {
            mode = Mode.PuppetBomber
        }
        super.restart()
    }

    override fun onKey(e: EventKey) {
        super.onKey(e)

        if(e.action != 1 && e.action != 3) return
        if(!enabled.value && e.key == skill2Key) { // && (mode == Mode.PuppetBomber || mode == Mode.AuraSpam)
            if(World.time - lastTotem > 60 && Player.player?.isSneaking != true || lastNoTotemNotify > lastTotem) {
                e.cancel()
                thread {
                    waitSpell(Actions.cast1)
                    waitSpell(Actions.cast2)
                }
            }
        }
        if(e.key == skill4Key && e.action == 3) {
            e.cancel()
        }
        if(mode == Mode.Acolyte && e.action == 3 && (e.key == skill3Key || e.key == skill4Key)) {
            e.cancel()
        }
    }
}


var lastCharacterId = ""
val hasCharacterId get() = Models.Character.hasCharacter()
val currentCharacterId get() = Models.Character.id
val gson = GsonBuilder().setPrettyPrinting().create()
val configFile = File(file!!.parent, "battle.json")
if(!configFile.exists()) {
    configFile.createNewFile()
    configFile.writeText("""{"-":{"":""}}""")
}

val json: MutableMap<String, Map<String, String>> = gson.fromJson(configFile.reader(), MutableMap::class.java) as MutableMap<String, Map<String, String>>

var currentWynnClass: WynnClass = WynnClass()
var lastWynnClass: WynnClass = currentWynnClass
var currentClassString = ""
var lastCheckClass = 0L

val classes = mapOf(
    "archer" to Archer(),
    "assassin" to Assassin(),
    "warrior" to Warrior(),
    "mage" to Mage(),
    "shaman" to Shaman(),
)

currentWynnClass.terminate()
classes.forEach {
    it.value.terminate()
}

fun checkClass() {
    lastWynnClass = currentWynnClass
    val newClass = Models.Character.classType.getName().lowercase()

    if(newClass != currentClassString) {
        currentClassString = newClass
        currentWynnClass.enabled.set(false)
        currentWynnClass.terminate()
        currentWynnClass = classes[currentClassString] ?: return
        currentWynnClass.restart()
    }
    if(hasCharacterId && currentCharacterId != lastCharacterId) {
        Chat.log("character id $lastCharacterId -> $currentCharacterId")
        if(lastCharacterId.isNotEmpty())
            lastWynnClass.saveConfig()
        lastCharacterId = currentCharacterId
        currentWynnClass.loadConfig()
    } else {
        Chat.log("character id $currentCharacterId")
    }
}

EventListener(EventType.Key, { e ->
    currentWynnClass.onKey(e)
}, true)

fun warp180(degree: Double): Double {
    var v = (degree + 720) % 360
    if(v > 180) v -= 360
    if(v < -180) v += 360
    return v
}
fun lerpDegrees(from: Double, to: Double, lerp: Double, min: Double = 0.0): Double {
    val diff0 = warp180(to - from)
    var diff = diff0 * lerp
    if(abs(diff) >= 0.001) {
        if(abs(diff) < min) diff *= min / abs(diff)
        if(abs(diff) > abs(diff0)) diff = diff0
    }
    return warp180(from + diff)
}
fun Pos3D.distanceToIgnoreY(another: Pos3D, yMulti: Double = 0.0) = toVector(another).multiply(1.0,yMulti,1.0,1.0,yMulti,1.0).magnitude
val radian = Math.PI / 180
class CustomInput(val parent: Input) : Input() {
    var targetPos = Pos3D.ZERO
    var forceForward = false
    var stuckCounter = 0
    fun getMovement(positive: Boolean, negative: Boolean) = if(positive == negative) 0f else if(positive) 1f else -1f
    fun roundMovement(value: Double) = if(abs(value) < 0.1) 0.0 else value / abs(value)
    fun resetPos() {
        targetPos = Pos3D.ZERO
    }

    override fun method_3129() {
        val player = Player.player!!
        if(targetPos.equals(Pos3D.ZERO)) {
            parent.tick()
            playerInput = parent.playerInput
        } else {
            val vec = player.pos.toReverseVector(targetPos)
            val target = atan2(-vec.deltaX, vec.deltaZ) / radian
            smooth.lookAt(lerpDegrees(player.yaw.toDouble(), target, 0.1), lerpDegrees(player.pitch.toDouble(), 0.0, 0.1))
            val diff = (((player.yaw - target) - 22.5) / 45).roundToInt() * radian * 45
            val forward = if(stuckCounter > 20) 1.0 else roundMovement(cos(diff))
            val side = roundMovement(sin(diff))
            val jump = (targetPos.y - player.pos.y > 0.501 && player.pos.distanceToIgnoreY(targetPos) < 2)
                    || (World.getBlock(player.blockPos)?.blockStateHelper?.isLiquid == true)
                    || stuckCounter > 20
            val sneak = false
            val sprint = false

            playerInput = PlayerInput(forward > 0, forward < 0, side > 0, side < 0, jump, sneak, sprint)
        }
        if(forceForward) {
            playerInput = PlayerInput(forceForward, playerInput.backward(),
                playerInput.left(), playerInput.right(), playerInput.jump() , playerInput.sneak() , playerInput.sprint())as class_10185
        }

        movementForward = getMovement(playerInput.forward(), playerInput.backward())
        movementSideways = getMovement(playerInput.left(), playerInput.right())
    }
}
fun setInput(): CustomInput? {
    resetInput()
    return Client.minecraft.player?.let {
        val result = CustomInput(it.input)
        it.input = result
        result
    }
}
fun resetInput() {
    Client.minecraft.player?.let { player ->
        (player.input as? CustomInput)?.let {
            player.input = it.parent
            resetInput()
        }
    }
}
var customInput = setInput()

EventListener(EventType.DimensionChange, {
    currentWynnClass.onWorldChange()
    currentWynnClass.saveConfig()
})

EventListener(EventType.Death, {
    currentWynnClass.enabled.set(false)
})

var running = true
thread {
    while (running) {
        if(World.isWorldLoaded && Player.player != null)
            currentWynnClass.onTick()
        Client.waitTick()
    }
}

class MyKeyBind(val keyBind: KeyBind) : Runnable {
    val runnable: Runnable
    val key: String = keyBinds[keyBind.keyMapping.getTranslationKey()]!!
    var pressedTime = 0L
    var onPress by keyBind._getField<Runnable>("onPress")

    init {
        runnable = onPress!!
        onPress = this
    }

    fun setKeyBindRunnable(runnable: Runnable) {
        onPress = runnable
    }

    override fun run() {
        val action = if(Time.time() - pressedTime < 60) 3 else 1
        pressedTime = Time.time()
        val event = EventKey(action, key, "custom")
        event.trigger()
        if(!event.isCanceled)
            runnable.run()
    }
}

typealias WPair<A,B> = com.wynntils.utils.type.Pair<A,B>
var lastSpellPacket = 0L
fun setupSpellCaster() {
    var packetCountdown by quickCastFeature._getField<Int>("packetCountdown")
    thread {
        while (running) {
            var sleep = 50L
            if(World.isWorldLoaded && Player.player != null && !Models.Spell.isSpellQueueEmpty) {
                val right = Models.Spell.checkNextSpellDirection() == SpellDirection.RIGHT
                val interval = if(right)  35 else 30
                if(Time.time() >= lastSpellPacket + 50 + interval) {
                    lastSpellPacket = Time.time()
                    Models.Spell.sendNextSpell()
                    packetCountdown = 3
                    sleep += interval
                    if(Models.Spell.isSpellQueueEmpty) {
                        currentWynnClass.onSpellCasted()
                    }
                }
            }

            Time.sleep(sleep)
        }
    }

    val keyBindManager = Managers.KeyBind
    keyBindManager._getPrivateValue<Map<Feature,MutableList<WPair<KeyBind, String>>>>("keyBinds")?.let { binds ->
        val bindsInner = binds[quickCastFeature] ?: return@let
        val runnables = bindsInner.map { MyKeyBind(it.key()) }
        context.onContextClosed {
            runnables.forEach {
                it.onPress = it.runnable
            }
        }
    }
}
setupSpellCaster()

class WynnListener {
    val shaman = StyledText.fromComponent(TextKt.translatable("feature.wynntils.chatRedirect.shaman.notification"))
    var characterUpdated = false

    @SubscribeEvent
    fun characterUpdate(event: CharacterUpdateEvent) {
        checkClass()
        characterUpdated = true
    }
    @SubscribeEvent(priority = EventPriority.LOWEST)
    fun worldStateChanged(event: WorldStateEvent) {
        if(event.newState == WorldState.CHARACTER_SELECTION || event.oldState == WorldState.WORLD) {
            characterUpdated = false
        }
        if(event.newState == WorldState.WORLD && !characterUpdated) {
            thread {
                Client.waitTick(60)
                if(!characterUpdated)
                    WynntilsMod.postEvent(event)
            }
        }
    }
    fun onNotification(event: NotificationEvent) {
        if(event.messageContainer.message.contains(shaman)) {
            (currentWynnClass as? Shaman)?.let {
                it.lastNoTotemNotify = World.time
            }
        }
    }
    @SubscribeEvent
    fun notification(event: NotificationEvent.Edit) {
        onNotification(event)
    }
    @SubscribeEvent
    fun notification(event: NotificationEvent.Queue) {
        onNotification(event)
    }
}
val listener = WynnListener()
WynntilsMod.registerEventListener(listener)

context.onContextClosed {
    running = false
    d2d.unregister()
    currentWynnClass.terminate()

    smooth.enabled = false
    resetInput()

    WynntilsMod.unregisterEventListener(listener)

    KtGlobals.getVariable<MutableMap<String, () -> Pair<Float, Float>>>(offsetKey)?.remove(smooth.hashCode().toString())
    synchronized(json) {
        currentWynnClass.saveConfig()
        configFile.writeText(gson.toJson(json))
    }
}

checkClass()

Chat.toast("battle", "enabled")