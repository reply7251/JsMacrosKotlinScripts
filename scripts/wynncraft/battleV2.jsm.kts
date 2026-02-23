@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

@file:Suppress("MemberVisibilityCanBePrivate", "ConstPropertyName", "HasPlatformType")

import com.google.gson.GsonBuilder
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
import com.wynntils.models.activities.ActivityModel
import com.wynntils.models.character.CharacterModel
import com.wynntils.models.character.event.CharacterUpdateEvent
import com.wynntils.models.character.type.ClassType
import com.wynntils.models.items.items.game.CraftedConsumableItem
import com.wynntils.models.items.items.game.MultiHealthPotionItem
import com.wynntils.models.items.items.game.PotionItem
import com.wynntils.models.raid.event.RaidChallengeEvent
import com.wynntils.models.raid.event.RaidEndedEvent
import com.wynntils.models.spells.SpellModel
import com.wynntils.models.spells.type.SpellDirection
import com.wynntils.models.statuseffects.type.StatusEffect
import com.wynntils.models.worlds.event.WorldStateEvent
import com.wynntils.models.worlds.type.WorldState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock
import me.hellrevenger.KotlinExtension
import me.hellrevenger.SharedLibraries
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.KtGlobals
import me.hellrevenger.library.api._getField
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.api.createCoroutine
import me.hellrevenger.library.api.wrapTask
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CShadow
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.minecraft.class_10185
import net.minecraft.class_1294
import net.minecraft.class_2561
import net.minecraft.class_304
import net.minecraft.class_332
import net.minecraft.class_408
import net.minecraft.class_744
import net.neoforged.bus.api.EventPriority
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.ScriptScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.helper.inventory.ItemStackHelper
import xyz.wagyourtail.jsmacros.client.api.library.impl.FPlayer
import xyz.wagyourtail.wagyourgui.elements.Button
import java.io.File
import java.util.regex.Matcher
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.map
import kotlin.collections.set
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resume
import kotlin.getValue
import kotlin.jvm.optionals.getOrNull
import kotlin.math.abs
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.setValue
import xyz.wagyourtail.jsmacros.client.api.library.impl.FKeyBind
import xyz.wagyourtail.wagyourgui.overlays.SelectorDropdownOverlay
import net.minecraft.class_327
import net.minecraft.class_341
import net.minecraft.class_4185
import net.minecraft.class_9848
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import net.minecraft.class_437
import xyz.wagyourtail.jsmacros.client.api.helper.screen.ButtonWidgetHelper
import net.minecraft.class_339
import java.util.Queue
import java.util.concurrent.LinkedBlockingDeque


if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

while(Managers.Feature.getFeatureInstance(QuickCastFeature::class.java) == null) {
    Client.waitTick(5)
}
val quickCastFeature = Managers.Feature.getFeatureInstance(QuickCastFeature::class.java)
val autoAttackFeature = Managers.Feature.getFeatureInstance(AutoAttackFeature::class.java)

var running = true
context.onContextClosed {
    running = false
}

val keyBinds = KeyBind.keyBindings


val Coroutine = createCoroutine()
suspend fun waitTick(tick: Int = 1) = wrapTask {
    Client.waitTick(tick)
}
//@OptIn(DelicateCoroutinesApi::class)
//val Coroutine = CoroutineScope(newFixedThreadPoolContext(4, "coroutine context"))
//suspend fun waitTick(tick: Int = 1) = suspendCancellableCoroutine { continuation ->
//    Client.waitTick(tick)
//    continuation.resume(Unit)
//}

class MyKeyBind(keyBind: KeyBind) : Runnable {
    val runnable: Runnable
    val key: String = keyBinds[keyBind.keyMapping.method_1431()]!!
    var pressedTime = 0L
    var onPress by keyBind._getField<Runnable>("onPress")

    init {
        runnable = onPress!!
        onPress = this
    }

    override fun run() {
        if(GlobalState.running.value) return
        val action = if(Time.time() - pressedTime < 60) 3 else 1
        pressedTime = Time.time()
        val event = EventKey(action, key, "custom")
        event.trigger()
        if(!event.isCanceled)
            runnable.run()
    }
}

fun createDropDown(
    screen: ScriptScreen, message: class_2561, options: List<class_2561>,
    x: Int, y: Int, width: Int = 40, height: Int = 10,
    dropDownWidth: Int = -1,
    onChoice: (Int) -> Unit
): ButtonWidgetHelper<class_4185> {
    val textRenderer = screen.method_64506()
    val iscreen = screen as IScreen

    val dropDownWidth = if(dropDownWidth == -1) options.maxOf(textRenderer::method_27525) else dropDownWidth
    return iscreen.buttonBuilder()
        .pos(x, y).size(width, height)
        .message(TextHelper.wrap(message))
        .action(JavaWrapper.methodToJava { btn, _ ->
            val overlay = SelectorDropdownOverlay(x, y + height + 10, dropDownWidth + 10, options.size * (textRenderer.field_2000 + 1) + 4, options, textRenderer, screen) { choice ->
                btn.label = TextHelper.wrap(options[choice])
                onChoice(choice)
            }
            screen.openOverlay(overlay)
            overlay.savedBtnStates[btn.raw as class_339] = true
        }).build()
//    return Button(x, y, width, height, screen.method_64506(), color, borderColor, highlightColor, textColor, message) { btn ->
//        screen.openOverlay(SelectorDropdownOverlay(x, y + 10, width / 2, options.size * (textRenderer.field_2000 + 1) + 4, options, textRenderer, screen) { choice ->
//            btn.method_25355(options[choice])
//            onChoice(choice)
//        })
//    }
}
typealias WPair<A,B> = com.wynntils.utils.type.Pair<A,B>

object MixinSpellModelCallback {
    var onClear = {}
    var onAddSpell = { _: List<SpellDirection> -> }
}

@CTransformer(SpellModel::class)
class MixinSpellModel {
    @CInject(method = ["onWorldStateChange", "onHeldItemChange"], target = [CTarget(CTargetType.HEAD)])
    fun clearQueue() {
        MixinSpellModelCallback.onClear()
    }

    @CInject(method = ["addSpellToQueue"], target = [CTarget(CTargetType.HEAD)])
    fun addToQueue(spell: List<SpellDirection> ) {
        MixinSpellModelCallback.onAddSpell(spell)
    }
}

var lastSpellPacket = 0L
fun setupSpellCaster() {
    val packetCountdown = quickCastFeature._getField<Int>("packetCountdown")

    val originalQueue = Models.Spell._getPrivateValue<Queue<SpellDirection>>("SPELL_PACKET_QUEUE")!!
    val queue = LinkedBlockingDeque<SpellDirection>()

    MixinSpellModelCallback.onClear = {
        queue.clear()
    }
    MixinSpellModelCallback.onAddSpell = {
        if(queue.size < 3)
            queue.addAll(it)
    }
    suspend fun pollSpell() = suspendCancellableCoroutine { continuation ->
        continuation.resume(queue.take())
    }

    Coroutine.launch {
        while (running) {
            try {
                if(Time.time() - lastSpellPacket < 83) {
                    delay(Time.time() - lastSpellPacket)
                }
                pollSpell().sendPacketRunnable.run()
                try {
                    originalQueue.poll()
                } catch (e: Exception) { }

                delay(83)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    Coroutine.launch {
        while (running) {
            packetCountdown.set(4)
            delay(50)
        }
    }

//    Coroutine.launch {
//        while (running) {
//            var sleep = 50L
//            if(World.isWorldLoaded && Player.player != null && !Models.Spell.isSpellQueueEmpty) {
//                val interval = 33//if(right) 35 else 30
//                if(Time.time() >= lastSpellPacket + 50 + interval) {
//                    lastSpellPacket = Time.time()
//                    try {
//                        Models.Spell.sendNextSpell()
//                    } catch (_: Exception) { }
//                    sleep += interval
////                    if(Models.Spell.isSpellQueueEmpty) {
////                        currentWynnClass.onSpellCasted()
////                    }
//                }
//            }
//            packetCountdown.set(4)
//
//            delay(sleep)
//        }
//    }

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

fun getSpellCaster(spellOrder: String): () -> Unit {
    val m = quickCastFeature::class.java.getDeclaredMethod("cast${spellOrder}Spell")
    m.trySetAccessible()
    return { m.invoke(quickCastFeature) }
}

fun getSpellInProgress() = Models.Spell.lastSpell

object Actions {
    const val cast1 = "Cast 1st Spell"
    const val cast2 = "Cast 2nd Spell"
    const val cast3 = "Cast 3rd Spell"
    const val cast4 = "Cast 4th Spell"
    const val melee = "key.attack"
    const val jump = "key.jump"
    const val sneak = "key.sneak"
    const val wait = "wait"
    const val select = "select"
    const val prevent = "prevent"
    const val preventEnd = "preventEnd"
    const val force = "force"
    const val forceEnd = "forceEnd"

    fun force(str: String) = "$force $str"
    fun forceEnd(str: String) = "$forceEnd $str"
    fun prevent(str: String) = "$prevent $str"
    fun preventEnd(str: String) = "$preventEnd $str"
}

val spells = listOf(
    Actions.cast1 to "First", Actions.cast2 to "Second",
    Actions.cast3 to "Third", Actions.cast4 to "Fourth"
).associate { it.first to getSpellCaster(it.second) }

val jumpKey = keyBinds[Actions.jump]!!
val skill1Key = keyBinds[Actions.cast1]!!
val skill2Key = keyBinds[Actions.cast2]!!
val skill3Key = keyBinds[Actions.cast3]!!
val skill4Key = keyBinds[Actions.cast4]!!
val meleeKey = keyBinds[Actions.melee]!!

val d2d = Hud.createDraw2D()
val fakeText = d2d.textBuilder().build()
d2d.register()
context.onContextClosed { d2d.unregister() }

object Keys {
    lateinit var keybind: FKeyBind
    val isControlPressed get() = keybind.pressedKeys.contains(controlKey)
    val isShiftPressed get() = keybind.pressedKeys.contains(shiftKey)
    val isSneaking get() = keybind.pressedKeys.contains(keybind.keyBindings[Actions.sneak])

    const val keyBoard = "key.keyboard"
    const val keyPad = "$keyBoard.keypad"

    const val subKey = "$keyPad.subtract"
    const val addKey = "$keyPad.add"
    const val mulKey = "$keyPad.multiply"
    const val divKey = "$keyPad.divide"

    const val shiftKey = "$keyBoard.left.shift"
    const val controlKey = "$keyBoard.left.control"
    const val playKey = "$keyBoard.f"
    const val flyKey = "$keyPad.1"
    const val heightKey = "$keyPad.2"
    const val targetYKey = "$keyPad.3"
    const val enableMeleeKey = "$keyPad.4"
    const val modeKey = "$keyPad.5"
    const val maxRepeatKey = "$keyPad.8"
    const val anchorKey = "$keyPad.9"
    const val spellCooldownKey = "$keyPad.decimal"

    const val bloodPactKey = "$keyPad.6"

    const val iceSnakeKey = "$keyPad.6"
    const val meteorKey = "$keyPad.7"

    const val autoEscape = "$keyPad.6"

    const val auraKey = "$keyPad.6"
    const val awakenedKey = "$keyPad.7"
    const val maskKey = "$keyPad.2"

    const val slowFall = "$keyPad.6"
    const val dive = "$keyPad.7"
}
Keys.keybind = KeyBind

object Format {
    const val formatChar = '§'

    fun coloredBoolean(bool: Boolean) = formatChar + (if(bool) "2" else "c") + bool

    fun <T> coloredNumber(num: T) = formatChar + "6$num"

    fun coloredKey(key: String?) = key ?.let { "${formatChar}6${key.substringAfterLast(".")}${formatChar}r" } ?: ""

    fun coloredConfig(configName: String) = if(SharedBindData.configIndex == configName) formatChar + "5" else ""
}

object SharedBindData {
    var configIndex = ""
    var currentBind: BindValue<*>? = null

    fun modifyConfig(positive: Boolean) {
        currentBind?.modify(positive)
    }
}

open class Bind(val key: String) {
    val keyName = key.substringAfterLast(".")//key.substring(key.lastIndexOf('.')+1)
    val R = "r".formatted()
    var callback: () -> Unit = {}
    var preTrigger: () -> Unit = {}
    var postTrigger: () -> Unit = {}

    open fun trigger() {
        preTrigger()
        callback()
        postTrigger()
    }

    fun String.colored() = Format.coloredKey(this)
    fun String.formatted() = "${Format.formatChar}$this"
    fun Boolean.colored() = Format.coloredBoolean(this)
    fun Number.colored() = Format.coloredNumber(this)
}

open class BindValue<T>(key: String, var value: T) : Bind(key) {
    var onModify: ((Boolean) -> Unit)? = null

    var persist = true
    var dirty = false

    override fun trigger() {
        super.trigger()
        dirty = true
    }

    fun set(newValue: T) {
        preTrigger()
        value = newValue
        callback()
        postTrigger()
        dirty = true
    }

    open fun modify(positive: Boolean) { }

    open fun updateFromString(string: String) {
        dirty = false
    }
}

open class BindBoolean(key: String, value: Boolean = false, val renderName: String = key) : BindValue<Boolean>(key, value) {
    override fun trigger() {
        set(!value)
    }

    fun toString(name: String) = "$name ${R}(${keyName.colored()}): ${value.colored()}"

    override fun toString() = toString(renderName)

    override fun updateFromString(string: String) {
        set(string.toBoolean())
        super.updateFromString(string)
    }
}
open class BindNumber<T: Number>(key: String, val configIndex: String, value: T, val diff: T) : BindValue<T>(key, value) {
    var fixedValueCallback: (T) -> T = { it }

    override fun trigger() {
        SharedBindData.configIndex = configIndex
        SharedBindData.currentBind = this
        super.trigger()
    }

    fun fixedValue() = fixedValueCallback(value)

    override fun toString(): String {
        var result = if(SharedBindData.currentBind == this) Format.formatChar + "5" else ""
        result += "$configIndex ${R}(${keyName.colored()}): ${fixedValue().colored()}"
        return result
    }

    fun modifier() = (if(Keys.isControlPressed) 10 else 1) * (if(Keys.isShiftPressed) 100 else 1)

    @Suppress("UNCHECKED_CAST")
    operator fun T.plus(other: T) = when(this) {
        is Double -> this + other.toDouble()
        is Int -> this + other.toInt()
        else -> this
    } as T

    @Suppress("UNCHECKED_CAST")
    operator fun T.times(other: Number) = when(this) {
        is Double -> this * other.toDouble()
        is Int -> this * other.toInt()
        else -> this
    } as T

    override fun modify(positive: Boolean) {
        if(onModify != null) {
            onModify!!.invoke(positive)
        } else {
            set(if (positive) value + diff * modifier() else value + diff * -modifier())
        }
        super.modify(positive)
    }
}
class BindInt(key: String, configIndex: String, value: Int, diff: Int = 1):
        BindNumber<Int>(key, configIndex, value, diff) {
    override fun updateFromString(string: String) {
        set(string.toIntOrNull() ?: 0)
        super.updateFromString(string)
    }
}
class BindDouble(key: String, configIndex: String, value: Double, diff: Double = 1.0):
        BindNumber<Double>(key, configIndex, value, diff){
    override fun updateFromString(string: String) {
        set(string.toDoubleOrNull() ?: 0.0)
        super.updateFromString(string)
    }
}
class BindPos(key: String, value: Pos3D): BindValue<Pos3D>(key, value) {
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

val offsetKey = "CameraOffset"
KtGlobals.waitAndGetVariable<MutableMap<String, () -> Pair<Float, Float>>>(offsetKey)[smooth.hashCode().toString()] = {
    if(!smooth.enabled || World.time > smooth.tick) {
        smooth.enabled = false
        0f to 0f
    } else {
        val delta = Client.minecraft.method_61966().method_60637(true)
        val yaw = lerp(smooth.prevYaw - smooth.targetYaw, 0f, delta)
        val pitch = lerp(smooth.prevPitch - smooth.targetPitch, 0f, delta)

        yaw to pitch
    }
}

context.onContextClosed {
    smooth.enabled = false
    KtGlobals.getVariable<MutableMap<String, () -> Pair<Float, Float>>>(offsetKey)?.apply {
        remove(smooth.hashCode().toString())
    }
}

class CustomInput(val parent: class_744) : class_744() {
    var targetPos = Pos3D.ZERO
    var forceForward = false
    var stuckCounter = 0
    fun getMovement(positive: Boolean, negative: Boolean) = if(positive == negative) 0f else if(positive) 1f else -1f
    fun roundMovement(value: Double) = if(abs(value) < 0.1) 0.0 else value / abs(value)
    fun resetPos() {
        targetPos = Pos3D.ZERO
    }

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

    override fun method_3129() {
        val player = Player.player!!
        if(targetPos.equals(Pos3D.ZERO)) {
            parent.method_3129()
            this.field_54155 = parent.field_54155
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

            this.field_54155 = class_10185(forward > 0, forward < 0, side > 0, side < 0, jump, sneak, sprint)
        }
        if(forceForward) {
            this.field_54155 = class_10185(true, this.field_54155.comp_3160(),
                this.field_54155.comp_3161(), this.field_54155.comp_3162(), this.field_54155.comp_3163() , this.field_54155.comp_3164() , this.field_54155.comp_3165())
        }
        this.field_3905 = getMovement(this.field_54155.comp_3159(), this.field_54155.comp_3160())
        this.field_3907 = getMovement(this.field_54155.comp_3161(), this.field_54155.comp_3162())
    }
}
fun setInput(): CustomInput? {
    resetInput()
    return Client.minecraft.field_1724?.let {
        val result = CustomInput(it.field_3913)
        it.field_3913 = result
        result
    }
}
fun resetInput() {
    Client.minecraft.field_1724?.let { player ->
        (player.field_3913 as? CustomInput)?.let {
            player.field_3913 = it.parent
            resetInput()
        }
    }
}
var customInput = setInput()
context.onContextClosed{ resetInput() }



object Config {
    lateinit var folder: String
    val gson = GsonBuilder().setPrettyPrinting().create()
    val configFile by lazy {
        File(folder, "battleV2.json").apply {
            if(!exists()) {
                createNewFile()
                writeText("""{"-":{"":""}}""")
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    val json by lazy {
        gson.fromJson(configFile.reader(), MutableMap::class.java) as MutableMap<String, Map<String, String>>
    }

    fun save() {
        configFile.writeText(gson.toJson(json))
    }
}
Config.folder = file!!.parent

object MyKeybinding {
    var callback: (Any, Any?) -> Any? = { _, _ -> false }
    var prevents = mutableSetOf<String>()
    var forces = mutableSetOf<String>()
    fun reset() {
        forces.clear()
        prevents.clear()
    }
}

object MixinCallback {
    var cancelScan = { cachedId: String -> false }
}

MyKeybinding.callback = { instance, original ->
    val zhis = instance as class_304
    zhis.method_1431()?.let {
        val bind = KeyBind.keyBindings[it] ?: return@let null
        if(!it.startsWith("key") && KeyBind.pressedKeys.contains("key.keyboard.f3"))
            return@let null
        (Hud.openScreen == null || (it == Actions.sneak && Hud.openScreen is class_408 && GlobalState.running.value))
                && (MyKeybinding.forces.contains(it) || (KeyBind.pressedKeys.contains(bind) && !MyKeybinding.prevents.contains(it)))
    } ?: original
}
MixinCallback.cancelScan = { cachedId ->
    if(!Models.Character.id.equals(cachedId) && (cachedId == "-" || Models.Character.id == "-")) {
        Chat.toast("ActivityModel", "cancel a scan!")
    }
    cachedId == "-" || Models.Character.id == "-"
}


@CTransformer(class_304::class)
class MixinKeyBinding {
    @CInject(method = ["method_1434"], target = [CTarget(CTargetType.RETURN)], cancellable = true)
    fun onIsPressedReturn(ic: InjectionCallback) {
        ic.returnValue = MyKeybinding.callback(this, ic.returnValue)
    }
}

@CTransformer(ActivityModel::class)
class MixinActivityModel {
    @CShadow
    private lateinit var currentProgressCharacter: String

    @CInject(method=["onCharacterUpdated"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onCharacterUpdated(ic: InjectionCallback) {
        if (MixinCallback.cancelScan(currentProgressCharacter)) {
            ic.isCancelled = true
        }
    }
}

@CTransformer(CharacterModel::class)
class MixinCharacterModel {
    @CInject(method = ["updateCharacterId"], target = [CTarget(CTargetType.TAIL)])
    fun postUpdateCharacterId() {
        WynntilsMod.postEvent(CharacterUpdateEvent())
    }
}

class CharacterImpl {
    val classes = mapOf(
        "archer" to Archer(),
        "assassin" to Assassin(),
        "warrior" to Warrior(),
        "mage" to Mage(),
        "shaman" to Shaman(),
    )

    var currentWynnClass = WynnClass()
    var lastWynnClass = currentWynnClass
    var currentClassString = ""

    var lastCharacterId = ""
    val hasCharacterId get() = Models.Character.hasCharacter()
    val currentCharacterId get() = Models.Character.id

    fun checkClass() {
        lastWynnClass = currentWynnClass
        val newClass = Models.Character.classType.getName().lowercase()

        if(newClass != currentClassString) {
            currentClassString = newClass
            GlobalState.running.set(false)
            currentWynnClass.disabled()
            currentWynnClass = classes[currentClassString] ?: return
            currentWynnClass.enabled()
        }
        if(hasCharacterId && currentCharacterId != lastCharacterId) {
            SharedLibraries.Chat.log("character id $lastCharacterId -> $currentCharacterId")
            if(lastCharacterId.isNotEmpty())
                lastWynnClass.saveConfig()
            lastCharacterId = currentCharacterId
            currentWynnClass.loadConfig()
        } else {
            SharedLibraries.Chat.log("character id $currentCharacterId")
        }
    }
}
val Character = CharacterImpl()


class WynnListener {
    val shaman = StyledText.fromComponent(class_2561.method_43471("feature.wynntils.chatRedirect.shaman.notification"))
    var characterUpdated = false
    var lastEvent: WorldStateEvent? = null
    var counter = 0

    fun register() {
        WynntilsMod.registerEventListener(this)
        pitchOffsetFixers[roomPitchOffset] = 0 to ::doFixPitch
    }

    fun unregister() {
        WynntilsMod.unregisterEventListener(this)
        pitchOffsetFixers.remove(roomPitchOffset)
    }

    @SubscribeEvent
    fun characterUpdate(event: CharacterUpdateEvent) {
        Character.checkClass()
        characterUpdated = true
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    fun worldStateChanged(event: WorldStateEvent) {

        if(event.newState == WorldState.CHARACTER_SELECTION || event.oldState == WorldState.WORLD) {
            characterUpdated = false
        }
//        if(event == lastEvent) {
//            counter++
//        } else {
//            counter = 0
//            lastEvent = event
//        }
        if(event.newState == WorldState.WORLD && !characterUpdated && lastEvent != event) {
            lastEvent = event
            Coroutine.launch {
                delay(5000)
                if(!characterUpdated) {
                    Chat.log("retrying check character: $counter")
                    WynntilsMod.postEvent(event)
                }
            }
        }
    }
    fun onNotification(event: NotificationEvent) {
        if(event.messageContainer.message.contains(shaman)) {
            (Character.currentWynnClass as? Shaman)?.let {
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

    val pitchFixersKey = "PitchOffsetFixer"
    val roomPitchOffset = "roomPitchOffset"
    val pitchOffsetFixers = KtGlobals.waitAndGetVariable<MutableMap<String, Pair<Int, (Float) -> Float>>>(pitchFixersKey)

    var fixedPitch: Float? = null
    val roomsToReset = listOf(
        "Slime Gathering", "Tunnel Traversal",
        "Lava Lake", "Labyrinth", "Golem Escort", "Binding Seal",
        "Flooding Canyon", "Weeping Soulroot", "Twisted Jungle"
    )

    @SubscribeEvent
    fun onRoomStart(event: RaidChallengeEvent.Started) {
        if(roomsToReset.contains(event.raid.currentRoom.roomName)) {
            fixedPitch = 0f
        }
    }

    @SubscribeEvent
    fun onRoomEnd(event: RaidChallengeEvent.Completed) {
        fixedPitch = null
    }

    @SubscribeEvent
    fun onRaidEnd(event: RaidEndedEvent.Completed) {
        fixedPitch = null
    }

    @SubscribeEvent
    fun onRaidEnd(event: RaidEndedEvent.Failed) {
        fixedPitch = null
    }

    fun doFixPitch(offset: Float) = fixedPitch ?: offset
}

class ShadeBar : TrackedBar(".+Mirror Image: §a(\uE040+)(§7(\uE040*))?".toPattern()) {

    override fun onUpdateName(match: Matcher?) {
        match?.let {
            val current = it.group(1).length
            updateValue(current, current + (it.group(3)?.length ?: 0))
        } ?: updateValue(0, 0)
    }
}

class MultiLineText(val d2d: Draw2D, val x: Int, val y: Int, val color: Int = 0xffffff) : RenderElement {
    val texts = arrayListOf<Text>()
    var currentText: String = ""
    var hidden = false
    var autoHide = 4000L
    var lastUpdate = 0L

    val originalText = Chat.createTextBuilder()
        .append("test").withColor(255,0,0)
        .append("test").withColor(0,255,0)
        .build().raw
    val orderedTexts by lazy {
        class_341.method_1850(originalText, 1000, Client.minecraft.field_1772)
    }

    fun setText(text: String) {
        lastUpdate = Time.time()
        val text = text.trim()
        if (text == currentText) return
        d2d.reAddElement(this)
        currentText = text

        val lines = currentText.lines()

        for (i in 0..<lines.size) {
            if (i >= texts.size) {
                texts.add(Text(lines[i], x, y + texts.size * 10, color, 0, true, 1.0, 0f))
            } else {
                texts[i].setText(lines[i])
            }
        }
        for (i in lines.size..<texts.size) {
            texts[i].setText("")
        }
    }

    fun newLine(text: String = "") {
        setText("$currentText\n$text")
    }

    override fun getZIndex() = 0

    override fun method_25394(context: class_332, mouseX: Int, mouseY: Int, delta: Float) {
        if(hidden) return

//        context.method_27535(Client.minecraft.field_1772,originalText, 250, 10, class_9848.method_61330(255, -1))
//        context.method_35720(Client.minecraft.field_1772,orderedTexts.first(), 250, 25, class_9848.method_61330(255, -1))
//        Text(TextHelper.wrap(originalText), 250, 35, color, 0, true, 1.0, 0f)
//            .method_25394(context, mouseX, mouseY, delta)
        if (autoHide != -1L && lastUpdate + autoHide < Time.time()) return
        synchronized(texts) {
            texts.forEach {
                it.method_25394(context, mouseX, mouseY, delta)
            }
        }
    }
}

val multiLineText = MultiLineText(d2d, 250, 50)

enum class Mode(val classType: ClassType = ClassType.NONE) {
    None,
    Melee,

    Acrobat(ClassType.ASSASSIN),
    Trickster(ClassType.ASSASSIN),
    Trickshade(ClassType.ASSASSIN),
    FourShade(ClassType.ASSASSIN),
    AcrobatTest(ClassType.ASSASSIN),

    ScreamSurf(ClassType.WARRIOR),
    AlterSurf(ClassType.WARRIOR),
    BashScream(ClassType.WARRIOR),
    UpperScream(ClassType.WARRIOR),

    AuraSpam(ClassType.SHAMAN),
    Acolyte(ClassType.SHAMAN),
    AfkAcolyte(ClassType.SHAMAN),
    TotemSpam(ClassType.SHAMAN),
    PuppetBomber(ClassType.SHAMAN),

    Arcanist(ClassType.MAGE),
    LightBender(ClassType.MAGE),
    RiftWalker(ClassType.MAGE);
}

fun getModes(classType: ClassType) =
    Mode.entries.filter {
        it.classType == ClassType.NONE || it.classType == classType
    }.toTypedArray()

class Combo(val comboString: String, initString: String = "") {
    var currentIndex: Int = 0
    var initialized = false
    val combo: List<String>
    val init: List<String>
    var currentRepeat = 0
    var repeatStartIndex = 0

    init {
        combo = parseCombo(comboString)
        init = parseCombo(initString)
        reset()
    }

    fun reset() {
        initialized = init.isEmpty()
        currentIndex = 0
        currentRepeat = 0
    }

    fun nextAction(repeat: Int = 1, enableMelee: Boolean = true): String {
        if(!initialized) {
            val result = init[currentIndex++]
            if (currentIndex >= init.size) {
                initialized = true
                currentIndex = 0
            }
            return result
        }
        if (currentIndex >= comboString.length) {
            currentIndex = 0
        }
        val result = when(val char = comboString[currentIndex++]) {
            '(' -> {
                repeatStartIndex = currentIndex
                nextAction(repeat, enableMelee)
            }
            ')' -> {
                if(repeat > currentRepeat+1) {
                    currentIndex = repeatStartIndex
                    currentRepeat++
                } else {
                    currentRepeat = 0
                }
                nextAction(repeat, enableMelee)
            }
            ' ' -> nextAction(repeat, enableMelee)
            else -> parseCombo(char)
        }
        return if(!enableMelee && result == Actions.melee)
            nextAction(repeat, false)
        else result
    }

    fun parseCombo(char: Char) =
        when(char) {
            '1' -> Actions.cast1
            '2' -> Actions.cast2
            '3' -> Actions.cast3
            '4' -> Actions.cast4
            'm' -> Actions.melee
            'w' -> Actions.wait
            's' -> Actions.sneak
            'j' -> Actions.jump
            'f' -> Actions.force(nextAction())
            'F' -> Actions.forceEnd(nextAction())
            'p' -> Actions.prevent(nextAction())
            'P' -> Actions.preventEnd(nextAction())
            else -> ""
        }

    fun parseCombo(string: String) = string.map(::parseCombo).filter { it.isNotEmpty()}
}

abstract class HasBind {
    val binds = mutableMapOf<String, Bind>()

    fun <T : Bind> T.build(buildCallback: T.() -> Unit = { }): T {
        buildCallback()
        this@HasBind.binds[this.key] = this
        return this
    }

    fun <T : Bind> T.buildWithCallback(buildCallback: () -> Unit = { }) =
        build { callback = buildCallback }

    abstract fun onKey(event: EventKey)
}

class GlobalStateImpl : HasBind() {
    val currentWynnClass get() = Character.currentWynnClass

    init {
        EventListener(EventType.Tick) { onTick() }
        EventListener(EventType.Key, true, ::onKey)
        EventListener(EventType.Death) {
            running.set(false)
        }

        Bind(Keys.addKey).buildWithCallback {
            SharedBindData.modifyConfig(true)
        }
        Bind(Keys.subKey).buildWithCallback  {
            SharedBindData.modifyConfig(false)
        }
        Bind(Keys.modeKey).buildWithCallback {
            currentWynnClass.openModeSelector()
        }
    }

    val running = BindBoolean(Keys.playKey, false, "Enabled").build {
        callback = {
            if(value) currentWynnClass.play() else currentWynnClass.paused()
            currentWynnClass.updateDraw2D()
        }
    }
    val targetY = BindDouble(Keys.targetYKey, "TargetY", -1.0).build {
        callback = { currentWynnClass.updateDraw2D() }
        onModify = { positive ->
            value = if(positive) Player.player?.y ?: -1.0 else -1.0
            currentWynnClass.updateDraw2D()
        }
    }
    val height = BindInt(Keys.heightKey, "height", 0).buildWithCallback {
        currentWynnClass.updateDraw2D()
    }
    val anchor = BindPos(Keys.anchorKey, Pos3D.ZERO).buildWithCallback {
        currentWynnClass.updateDraw2D()
    }
    var anchorSpread = 30
    var anchorMomentum = 0.0
    var anchorThreshold = false

    override fun onKey(event: EventKey) {
        if(event.action == 1) {
            binds[event.key]?.trigger()
        }
        currentWynnClass.onKey(event)
    }

    fun onTick() {
        currentWynnClass.onTick()
    }
}
val GlobalState = GlobalStateImpl()

open class WynnClass : HasBind() {

    override fun onKey(event: EventKey) {
        if(event.action == 1) {
            binds[event.key]?.trigger()
        }
    }

    open fun enabled() {}
    open fun play() {}
    open fun paused() {}
    open fun disabled() {}
    open fun saveConfig() {}
    open fun loadConfig() {}
    open fun onTick() {}
    open fun updateDraw2D() {}
    open fun openModeSelector() {}
}
open class WynnClassBase(classType: ClassType) : WynnClass() {
    val shared get() = GlobalState
    val running get() = shared.running.value
    val hotBarRegex = "key.keyboard.(\\d)".toRegex()
    var enabled = false

    var mode = Mode.None
    val modes = getModes(classType)
    val onModeSelectorScreenInit = mutableListOf<(IScreen) -> Unit>({ iscreen ->
        val hw = iscreen.width / 2
        val hh = iscreen.height / 2
        modes.forEachIndexed { index, mode ->
            iscreen.buttonBuilder()
                .x(hw - 100).y(hh - modes.size * 12 + index * 25).width(200)
                .message(mode.name)
                .action(JavaWrapper.methodToJava { _, _ ->
                    this@WynnClassBase.mode = mode
                    updateDraw2D()
                    iscreen.close()
                }).build()
        }
    })
    val modeSelectorScreen: ScriptScreen = Hud.createScreen("", false).apply {
        shouldPause = false
        val iscreen = this as IScreen
        iscreen.setOnInit(JavaWrapper.methodToJava { _ ->
            onModeSelectorScreenInit.forEach { it(iscreen) }
        })
    }

    var burstAction = 0
    val nextActions = mutableListOf<String>()
    var lastSpell = 0L
    var lastMelee = 0L
    val lastSpells = spells.mapValues { (k,v) -> 0L }.toMutableMap()
    var lastAction = Actions.wait

    var blockedByHotbar = false
    var blockSwapItem = false
    var blockSwapItemTarget = 0

    val comboMap = mutableMapOf<Mode, Combo>()
    val currentCombo get() = comboMap[mode]

    val spellCooldown = BindInt(Keys.spellCooldownKey, "SpellCooldown", 10).buildWithUpdateDraw2d()
    val enableMelee = BindBoolean(Keys.enableMeleeKey, true, "Melee").buildWithUpdateDraw2d()
    val maxRepeat = BindInt(Keys.maxRepeatKey, "MaxRepeat", 1).buildWithUpdateDraw2d()
    val fly = BindBoolean(Keys.flyKey, renderName = "Fly").buildWithUpdateDraw2d().apply {
        persist = false
    }

    fun <T : Bind> T.buildWithUpdateDraw2d() = buildWithCallback(::updateDraw2D)

    open fun getSpellCooldown() = spellCooldown.fixedValue()

    fun cast(spell: String) {
        if(spell == lastAction) {
            burstAction += 1
        } else {
            burstAction = 1
            lastAction = spell
        }
        lastSpells[spell] = World.time
        spells[spell]?.invoke()
    }

    suspend fun pressKeyBind(key: String, release: Boolean = true): Boolean {
        val flag = key in KeyBind.pressedKeys
        if(flag) {
            KeyBind.releaseKeyBind(Actions.jump)
            waitTick()
        }

        KeyBind.pressKeyBind(key)
        if(release) {
            waitTick()
            KeyBind.releaseKeyBind(key)
        }

        if(flag) {
            waitTick()
            KeyBind.pressKeyBind(key)
        }
        return false
    }

    open fun melee() {
        lastMelee = World.time
        attackCooldown = 0
        Player.interactions()?.attack()
        lastSpellPacket = Time.time()
    }

    fun removeBlind() {
        val player = Player.player?.raw ?: return
        player.method_6111(class_1294.field_5919)
        player.method_6111(class_1294.field_38092)
    }

    fun addAction(action: String) = synchronized(nextActions) { nextActions.add(action) }
    fun addActions(vararg action: String) = synchronized(nextActions) { nextActions.addAll(action) }
    fun hasActions() = synchronized(nextActions) { nextActions.isNotEmpty() }

    fun getYAboveTarget(): Double =
        Player.player?.let { player ->
            if(shared.targetY.value > 0) {
                player.y - shared.targetY.value
            } else {
                Models.CharacterStats.blocksAboveGround
            }
        } ?: 0.0

    fun yAboveTarget(dy: Double): Boolean {
        val player = Player.player ?: return false
        if(player.y + dy - shared.height.value < shared.targetY.value) return true
        return Models.CharacterStats.blocksAboveGround < shared.height.value - dy
    }

    fun getMana() = Models.CharacterStats.mana.getOrNull()?.percentage ?: 0.0
    fun getHealth() = Models.CharacterStats.health.getOrNull()?.percentage ?: 0.0
    fun findEffect(name: String) = Models.StatusEffect.statusEffects.find { it.name.contains(name) }

    fun getEffectTimer(name: String) = findEffect(name)?.let { it.displayedTime.stringWithoutFormatting.split(":")[1].split(")")[0].toInt() }

    // §3⌚ §8⬤
    fun isEffectInCooldown(effect: StatusEffect) = effect.prefix.endsWith("⬤")

    fun isEffectInCooldown(name: String) = findEffect(name)?.let { isEffectInCooldown(it) } ?: false

    fun isHoldItem(name: String) = Player.player?.mainHand?.name?.stringStripFormatting?.lowercase()?.contains(name) ?: false

    fun force(action: String) = MyKeybinding.forces.add(action)
    fun forceEnd(action: String) = MyKeybinding.forces.remove(action)
    fun prevent(action: String) = MyKeybinding.prevents.add(action)
    fun preventEnd(action: String) = MyKeybinding.prevents.remove(action)

    override fun openModeSelector() {
        if (Keys.isControlPressed) {
            updateDraw2D()
            multiLineText.hidden = !multiLineText.hidden
            return
        }


        Hud.openScreen(modeSelectorScreen as IScreen)
    }
    override fun onTick() {
        removeBlind()
        Player.player?.let {
            if(it.hasStatusEffect("invisibility") && it.vehicle != null || !Player.gameMode.contains("adve", true)) {
                shared.running.set(false)
            }
        }

        var forward = false
        if(running) {
            if(shared.anchor.value != Pos3D.ZERO) {
                val player = Player.player!!
                val vec = shared.anchor.value.toVector(player.pos)
                var target = 0.0
                if(vec.deltaZ.pow(2) + vec.deltaX.pow(2) > 9) {
                    var diff = player.yaw - vec.yaw
                    if(diff > 180)  diff -= 360
                    if(diff < -180)  diff += 360
                    val absDiff = abs(diff)
                    if(absDiff > shared.anchorSpread || !shared.anchorThreshold) {
                        val sign = if(diff > 0) -1 else 1
                        target = Math.random() * 10 * log10(abs(diff)) * sign
                        shared.anchorThreshold = absDiff < shared.anchorSpread - 15
                    }
                }
                shared.anchorMomentum = shared.anchorMomentum * 0.9 + target * 0.25
                if(abs(shared.anchorMomentum) > 1) {
                    smooth.lookAt(player.yaw + shared.anchorMomentum, player.pitch.toDouble())
                }
                forward = true
            }
        }
        customInput?.forceForward = forward
    }

    override fun onKey(event: EventKey) {
        if(event.action != 1) return

        hotBarRegex.matchEntire(event.key)?.let {
            val index = it.groupValues[1].toInt() - 1
            if(blockSwapItem) {
                blockSwapItemTarget = index
                event.cancel()
            } else if(running) {
                Coroutine.launch {
                    checkUndoSelectHotbar(index)
                }
                event.cancel()
            }
        }

        spells.keys.forEach {
            if(event.key == keyBinds[it]) {
                if(running) {
                    event.cancel()
                    if (Keys.isSneaking) {
                        runBlocking {
                            force(Actions.sneak) {
                                addAction(it)
                            }
                        }
                    } else {
                        addAction(it)
                    }
                } else {
                    lastSpells[it] = World.time
                }
                currentCombo?.reset()
                return@forEach
            }
        }

        super.onKey(event)
    }

    suspend fun pollAction(): Boolean {
        val action = synchronized(nextActions) {
            nextActions.removeFirst()
        }
        var canSkip = false
        when (action) {
            Actions.melee -> {
                if(Player.player?.mainHand?.isOnCooldown == false) {
                    melee()
                    waitTick(1)
                }
            }
            Actions.jump -> {
                pressKeyBind(action)
                canSkip = true
            }
            Actions.wait -> {
                waitTick()
            }
            else -> {
                if (action.startsWith(Actions.select)) {
                    val inv = Player.openInventory()
                    action.substring(Actions.select.length + 1).toIntOrNull()?.let {
                        inv.selectedHotbarSlotIndex = it
                    }
                } else if (action.startsWith("prevent")) {
                    val bind = action.split(" ").drop(1).joinToString(" ")
                    if(action.startsWith("preventEnd")) {
                        preventEnd(bind)
                    } else prevent(bind)
                    canSkip = true
                } else if (action.startsWith("force")) {
                    val bind = action.split(" ").drop(1).joinToString(" ")
                    if(action.startsWith("forceEnd")) {
                        forceEnd(bind)
                    } else force(bind)
                    canSkip = true
                } else {
                    lastSpell = World.time
                    cast(action)
                    waitTick(4)
                }
            }
        }
        return canSkip
    }

    open suspend fun waitAction(action: String, extraTick: Int = 0, hotbar: Int = -1): Boolean {
        var extraTick = extraTick
        val hotbar = hotbar.coerceAtLeast(blockSwapItemTarget)
        var canSkip = false
        blockSwapItem = true

        addAction(action)


        while(hasActions()) {
            canSkip = pollAction()
            if(!canSkip)
                waitTick()
        }

        if(hotbar != -1) {
            checkUndoSelectHotbar(hotbar)
            blockSwapItemTarget = -1
            extraTick = extraTick.coerceAtLeast(1)
        }
        if(extraTick > 0)
            waitTick(extraTick)

        blockSwapItem = false
        return canSkip
    }

    suspend fun force(action: String, wait: Boolean = false, callback: suspend () -> Unit) {
        val toCall: suspend (String) -> Boolean = if(wait) ::waitAction else ::addAction
        toCall(Actions.force(action))
        callback()
        toCall(Actions.forceEnd(action))
    }

    suspend fun prevent(action: String, wait: Boolean = false, callback: suspend () -> Unit) {
        val toCall: suspend (String) -> Boolean = if(wait) ::waitAction else ::addAction
        toCall(Actions.prevent(action))
        callback()
        toCall(Actions.preventEnd(action))
    }

    open suspend fun checkUndoSelectHotbar(newSelect: Int) {
        blockedByHotbar = true
        val inv = Player.openInventory()
        val oldSelect = inv.selectedHotbarSlotIndex
        if (oldSelect == newSelect) {
            blockedByHotbar = false
            return
        }
        inv.selectedHotbarSlotIndex = newSelect

        if(isConsumable(Player.player!!.mainHand)) {
            waitTick(2)
            Player.interactions()?.interact()
            waitTick(2)
            inv.selectedHotbarSlotIndex = oldSelect
        }
        blockedByHotbar = false
    }

    fun isConsumable(item: ItemStackHelper) =
        Models.Item.asWynnItem(item.raw, PotionItem::class.java).isPresent
                || Models.Item.asWynnItem(item.raw, MultiHealthPotionItem::class.java).isPresent
                || Models.Item.asWynnItem(item.raw, CraftedConsumableItem::class.java).isPresent

    override fun play() {
        Managers.Feature.disableFeature(autoAttackFeature, true)
        customInput = setInput()
        main()
    }
    override fun paused() {
        Managers.Feature.enableFeature(autoAttackFeature)
        MyKeybinding.reset()
        lastSpells.replaceAll { _, _ -> 0L }
        lastSpell = 0L
        lastMelee = 0L
        lastAction = Actions.wait
        currentCombo?.reset()
        customInput?.forceForward = false
        synchronized(nextActions) { nextActions.clear() }
    }
    override fun disabled() {
        multiLineText.setText("")
        saveConfig()
        fly.set(false)
    }
    override fun saveConfig() {
        var dirty = Config.json[Character.lastCharacterId]?.get("mode") == mode.toString()
        val map = binds.mapNotNull { (key, bind) ->
            (bind as? BindValue<*>)?.let {
                if(!it.persist) return@let null
                if(it.dirty)
                    dirty = true
                key to it.value.toString()
            }
        }.toMap().toMutableMap()
        map["mode"] = mode.toString()
        synchronized(Config.json) {
            Config.json[Character.lastCharacterId] = map
            if(dirty) {
                Config.save()
            }
        }
    }
    override fun loadConfig() {
        val map = Config.json[Character.currentCharacterId] ?: return
        synchronized(this) {
            map["mode"]?.let {
                mode = try {
                    Mode.valueOf(it)
                } catch (_: Exception) {
                    Mode.None
                }
            }
            map.forEach { (key, value) ->
                (binds[key] as? BindValue<*>)?.updateFromString(value)
            }
            updateDraw2D()
        }
    }

    override fun updateDraw2D() {
        multiLineText.setText("""
            ${shared.running}
            $spellCooldown
            Mode (${Format.coloredKey("5")}): $mode
            ${Format.coloredConfig("anchor" )}Anchor ${Format.formatChar}r(${Format.coloredKey(shared.anchor.key)}): ${Format.coloredBoolean(GlobalState.anchor.value != Pos3D.ZERO)}
            $enableMelee
            $maxRepeat
        """.trimIndent())
    }
    fun main() = Coroutine.launch {
        while (running && World.isWorldLoaded && shared.currentWynnClass == this@WynnClassBase) {
            if(!blockedByHotbar) {
                val nextSpell = getSpellCooldown() - (World.time - lastSpell)
                if(KeyBind.pressedKeys.contains(meleeKey)) {
                    melee()
                    waitTick()
                } else if(nextSpell > 0) {
                    if(Player.player?.mainHand?.isOnCooldown != true && enableMelee.value) {
                        melee()
                        waitTick()
                    }
                } else {
                    val t = World.time
                    if(!hasActions())
                        chooseAction()
                    if(t == World.time) {
                        var canContinue = true
                        while (canContinue && hasActions()) {
                            canContinue = pollAction()
                        }
                    }
                }
            }
            waitTick()
        }
        shared.running.set(false)
    }
    open suspend fun chooseAction(): Boolean {
        currentCombo?.let {
            val nextAction = it.nextAction(maxRepeat.fixedValue(), enableMelee.value)
            addAction(nextAction)
            return true
        }
        return false
    }
}
class Warrior : WynnClassBase(ClassType.WARRIOR) {
    val lastWarScream get() = lastSpells[Actions.cast4] ?: 0L

    val bloodPact = BindBoolean(Keys.bloodPactKey, renderName = "Blood Pact").buildWithUpdateDraw2d()

    init {
        comboMap[Mode.AlterSurf] = Combo("424231423 421233423 421233423 421233423","4233")
        comboMap[Mode.ScreamSurf] = Combo("432 342342342 342342342 342342","423")
        comboMap[Mode.BashScream] = Combo("1(4)")
        comboMap[Mode.UpperScream] = Combo("3(4)")
        //comboMap[Mode.ScreamSurf] = Combo("423 342342342 342342342 342342","4233")
    }

    override suspend fun chooseAction(): Boolean {
        if(isHoldItem("elaborated ")) return true
        if(isHoldItem("rhythm") || isHoldItem("catamaran")) {
            force(Actions.sneak, true) {
                waitAction(Actions.cast2, 5)
                waitAction(Actions.cast3, 5)
            }
            return true
        }
        if (super.chooseAction())
            return true

        return true
    }

    override fun onTick() {
        super.onTick()

        if(!isHoldItem("elaborated ")) {
            if(!running && fly.value && World.time % 7 < 3L) {
                val c = World.time / 7
                if(c % 5 == 0L) {
                    cast(Actions.cast4)
                } else {
                    cast(Actions.cast2)
                }
            }
        }
        if(running && abs(Player.player!!.pitch) < 45 && (mode == Mode.AlterSurf || mode == Mode.ScreamSurf)) {
            customInput?.forceForward = true
        }
    }

    override fun updateDraw2D() {
        super.updateDraw2D()

        multiLineText.newLine("""
            $fly
            $bloodPact
            upper: charge charge scream upper
            bash(scream): scream scream
        """.trimIndent())
    }

    override fun onKey(event: EventKey) {
        super.onKey(event)

        if(event.key == skill2Key && event.action == 3 && World.time % 18 < 6L) {
            event.cancel()
            cast(Actions.cast4)
        }
    }

    override fun getSpellCooldown() =
        if(bloodPact.value && getHealth() > 20)
            spellCooldown.value
        else
            super.getSpellCooldown()
}
class Mage : WynnClassBase(ClassType.MAGE) {
    val lastHeal get() = lastSpells[Actions.cast1] ?: 0L

    val enableIceSnake = BindBoolean(Keys.iceSnakeKey, renderName = "IceSnake").buildWithUpdateDraw2d()
    val enableMeteor = BindBoolean(Keys.meteorKey, renderName = "Meteor").buildWithUpdateDraw2d()

    val timeLockInCooldown get() = isEffectInCooldown("Timelocked")
    val timeLocked get() = findEffect("Timelocked") != null && !timeLockInCooldown
    var wasTimeLocked = false

    init {
        comboMap[Mode.Arcanist] = Combo("m(4333)331")
    }

    fun orbNotHealthy() =
        AbilityModel.ophanimBar.orbs.any {
            it.string.startsWith(OphanimOrb.HealthState.DYING.color.toString())
        }

    override suspend fun chooseAction(): Boolean {
        if(super.chooseAction()) {
            return true
        }
        val player = Player.player ?: return true
        val health = getHealth()
        when(mode) {
            Mode.LightBender -> {
                val notHealthy = health < 60 || orbNotHealthy()
                val timeSinceLastHeal = World.time - lastHeal
                // healPulse: 0~24 30~54, 60~84
                val inHealPulse = timeSinceLastHeal < 84
                if(notHealthy && !inHealPulse && getMana() > 40) {
                    addAction(Actions.cast1)
                } else if(World.time - lastMelee >= 4 && !player.mainHand.isOnCooldown) {
                    addAction(Actions.melee)
                } else if(enableIceSnake.value && getMana() > 75 && (lastAction != Actions.cast4 || Models.Spell.repeatedSpellCount < maxRepeat.fixedValue())) {
                    addAction(Actions.cast4)
                } else if((lastAction == Actions.cast4 && Models.Spell.repeatedSpellCount >= maxRepeat.fixedValue()) && World.time - lastMelee <= 20 && getMana() > 75) {
                    addAction(Actions.cast1)
                }
            }
            Mode.RiftWalker -> {
                val inTimeLocked = timeLocked
                val select = Player.openInventory().selectedHotbarSlotIndex
                if (wasTimeLocked && !inTimeLocked && select == 0) {
                    addAction(Actions.select + " 1")
                } else if(player.isSneaking && !inTimeLocked && !timeLockInCooldown) {
                    addAction(Actions.select + " 0")
                    addAction(Actions.cast1)
                }
                if (inTimeLocked) {
                    for (i in 1..maxRepeat.fixedValue()) {
                        addAction(Actions.cast3)
                    }
                    if(health < 80) addAction(Actions.cast1)
                    else addAction(Actions.cast4)
                } else {
                    for (i in 1..maxRepeat.fixedValue()) {
                        addAction(Actions.cast4)
                        if (enableMelee.value || getMana() < 30)
                            addAction(Actions.melee)
                    }
                    prevent(Actions.sneak) {
                        addAction(Actions.cast1)
                    }
                }
                wasTimeLocked = inTimeLocked
            }
            else -> {}
        }
        return true
    }

    override fun updateDraw2D() {
        super.updateDraw2D()
        multiLineText.newLine("""
            $enableIceSnake
            $enableMeteor
        """.trimIndent())
    }
}
class Archer : WynnClassBase(ClassType.ARCHER) {
    val lastEscape get() = lastSpells[Actions.cast2] ?: 0L

    val autoEscape = BindBoolean(Keys.autoEscape, renderName = "Auto Escape").buildWithUpdateDraw2d()

    var counter = 0

    override suspend fun chooseAction(): Boolean {
        if(autoEscape.value && Player.player!!.pitch > 45
            && Models.CharacterStats.blocksAboveGround < 2 && (World.time - lastEscape >= 20 || lastAction != Actions.cast2)) {
            addAction(Actions.cast2)
            return true
        }
        if(super.chooseAction())
            return true

        val shield = Models.Shield.shieldCharge < 3

        if(counter++ % 3 == 0) addAction(Actions.cast4)
        addAction(Actions.cast1)
        for(i in 1..maxRepeat.fixedValue())
            addAction(Actions.cast3)

        if(World.time % 2L == 0L && enableMelee.value) {
            addAction(Actions.melee)
        }

        return true
    }

    override fun melee() {
        lastMelee = World.time
        Player.interactions()?.interact()
        lastSpellPacket = Time.time()
    }

    override fun onTick() {
        super.onTick()
        if(interactKey.method_1434() && World.time % 2 == 0L) {
            melee()
        }
    }

    override fun updateDraw2D() {
        super.updateDraw2D()

        multiLineText.newLine("""
            $autoEscape
        """.trimIndent())
    }
}
class Shaman : WynnClassBase(ClassType.SHAMAN) {
    val lastAura get() = lastSpells[Actions.cast3] ?: 0L
    val lastTotem get() = lastSpells[Actions.cast1] ?: 0L
    val lastUproot get() = lastSpells[Actions.cast4] ?: 0L
    val lastHaul get() = lastSpells[Actions.cast2] ?: 0L

    val awakenedProgress get() = AbilityModel.awakenedBar.barProgress?.value?.progress ?: 0.0
    val blood get() = AbilityModel.bloodPoolBar.barProgress?.value?.current ?: 0

    val maskOrder = arrayOf(ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC, ShamanMaskType.LUNATIC, ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    val masks = arrayOf(ShamanMaskType.FANATIC, ShamanMaskType.HERETIC)
    var targetMask = ShamanMaskType.FANATIC

    val enableAwakened = BindBoolean(Keys.awakenedKey, renderName = "Awakened").buildWithUpdateDraw2d()
    val enableAura = BindBoolean(Keys.auraKey, renderName = "Aura").buildWithUpdateDraw2d()

    var flyCounter = 0
    var lastNoTotemNotify = 0L

    var fullSummoner = false
    var lastBird = false

    init {
        Bind(Keys.maskKey).buildWithCallback {
            targetMask = masks[(masks.indexOf(targetMask)+1) % masks.size]
            updateDraw2D()
        }

        maxRepeat.fixedValueCallback = {
            if(mode == Mode.TotemSpam || mode == Mode.PuppetBomber)  it - 5
            else it
        }

        fly.preTrigger = { flyCounter = -1 }

//        comboMap[Mode.AuraSpam] = Combo("1ps(3)Ps")
    }

    override suspend fun chooseAction(): Boolean {
        if(fly.value) return true
        if(super.chooseAction()) return true
        val totem = Models.ShamanTotem.activeTotems.firstOrNull()
        if(Models.Ability.hummingBirdsState != lastBird) {
            lastBird = Models.Ability.hummingBirdsState
            fullSummoner = true
        }

        if(mode == Mode.Acolyte) {
            if(World.time - lastTotem > 50 && (blood > 59 || !Keys.isSneaking) && (totem == null || Models.ShamanTotem.activeTotems.any { it.time !in 3..15 })) {
                if(Models.ShamanTotem.activeTotems.any { it.time !in 3..15 }) {
                    force(Actions.sneak, true) {
                        waitAction(Actions.cast1, 2)
                    }
                } else if(Models.ShamanTotem.activeTotems.size < 2) {
                    waitAction(Actions.cast1)
                    waitAction(Actions.cast1)
                }
            }

            val shouldUproot = blood > 119
            val shouldAura = (100 - getHealth())
            val tooManyUproot = lastAction == Actions.cast4 && burstAction > 1 && World.time - lastUproot < 60
            val tooManyAura = lastAction == Actions.cast3 && burstAction > 1
            val sorrowDuration = if(isHoldItem("resonance")) 35 else 140
            if(((getMana() > 50 && shouldAura > 30) || shouldAura > 50) && (World.time - lastAura > 19 && enableAura.value) || (shouldUproot && tooManyUproot)) {
                waitAction(Actions.cast3, 2)
            } else if(shouldUproot && World.time - lastUproot > sorrowDuration || (shouldAura > 20 && tooManyAura)) {
                force(Actions.sneak, true) {
                    waitAction(Actions.cast4, 1)
                }
            }
            if(enableMelee.value && World.time % 2L == 0L) {
                melee()
            }
        } else if(mode == Mode.AuraSpam) {
            waitAction(Actions.cast1)

            val flag2 = !AbilityModel.commanderBar.isActivated && AbilityModel.commanderBar.duration > 10
            if (fullSummoner) {
                val flag1 = !Models.Ability.hummingBirdsState && World.time - lastHaul > 100
                if (flag1 || flag2) {
                    force(Actions.sneak) {
                        if (flag1) waitAction(Actions.cast2)
                        if (flag2) waitAction(Actions.cast3)
                    }
                }
            }
            if(!flag2 || !fullSummoner) {
                waitAction(Actions.cast3)
            }
            prevent(Actions.sneak) {
                for(i in 2..maxRepeat.fixedValue()) {
                    waitAction(Actions.cast3)
                }
            }
        } else if(mode == Mode.TotemSpam) {
            if(!awakened(true)) {
                waitAction(Actions.cast4)
                if(getMana() < 60) {
                    waitAction(Actions.cast4)
                }
            }
            for(i in 1..maxRepeat.fixedValue()) {
                waitAction(Actions.cast1)
            }
        } else if(mode == Mode.PuppetBomber) {
            if(!awakened(true)) {
                if(enableAura.value) {
                    waitAction(Actions.cast3)
                } else {
                    waitAction(Actions.cast2)
                }
                if(World.time - lastUproot > 20) {
                    switchMask(ShamanMaskType.FANATIC, true)
                }
            }
            for(i in 1..maxRepeat.fixedValue()) {
                waitAction(Actions.cast1)
            }
        } else if (mode == Mode.AfkAcolyte) {
            if(World.time - lastTotem > 50 && (blood > 59 || !Keys.isSneaking) && (totem == null || Models.ShamanTotem.activeTotems.any { it.time < 3 })) {
                if(Models.ShamanTotem.activeTotems.any { it.time < 3}) {
                    force(Actions.sneak, true) {
                        waitAction(Actions.cast1, 2)
                    }
                } else if(Models.ShamanTotem.activeTotems.size < 2) {
                    waitAction(Actions.cast1)
                    waitAction(Actions.cast1)
                }
            }
            if (World.time - lastAura > 40 && getHealth() < 70) {
                waitAction(Actions.cast3)
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

        return true
    }

    override fun updateDraw2D() {
        super.updateDraw2D()

        multiLineText.newLine("""
            Mask (${Format.coloredKey(Keys.maskKey)}): $targetMask
            $enableAwakened
            $fly
            $enableAura
        """.trimIndent())
    }

    suspend fun switchMask(target: ShamanMaskType, canCancel: Boolean = false) {
        if(canCancel) {
            if(Models.ShamanMask.currentMaskType == target) return
            if(Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED && target == targetMask) return
        }
        val inventory = Player.openInventory()
        val hotbar = inventory.selectedHotbarSlotIndex
        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        waitTick()
        val currentIndex = when(Models.ShamanMask.currentMaskType) {
            ShamanMaskType.AWAKENED -> 1
            ShamanMaskType.NONE -> 2
            else -> maskOrder.indexOf(Models.ShamanMask.currentMaskType)
        }
        val targetIndex = maskOrder.lastIndexOf(target)
        var counter = targetIndex - currentIndex
        val progress = AbilityModel.awakenedBar.barProgress?.progress ?: 0f
        if(progress >= 0.999f)
            counter = 1
        while(counter > 3) counter -= 3

        while (counter-- > 0) {
            waitAction(Actions.cast4)
        }
        inventory.selectedHotbarSlotIndex = hotbar
        waitTick()
    }

    suspend fun awakened(cancelMask: Boolean = false): Boolean {
        if(!enableAwakened.value) return false
        val progress = awakenedProgress
        if(findEffect("Awakened") != null || World.time - lastUproot < 15 || Models.ShamanMask.currentMaskType == ShamanMaskType.AWAKENED) {
            return false
        }

        if(progress >= 1) {
            waitAction(Actions.cast4)
            return true
        }

        val inventory = Player.openInventory()
        val hotbar = inventory.selectedHotbarSlotIndex
        if(progress < 0.999) {
            switchMask(ShamanMaskType.FANATIC, cancelMask)
            inventory.selectedHotbarSlotIndex = 1
            waitTick()
            if(progress < 0.34f) {
                waitAction(Actions.cast1)
                waitTick()
            }
            for(i in 0..3) {
                if(awakenedProgress >= 0.999)
                    break
                if(World.time - lastUproot > 20)
                    switchMask(ShamanMaskType.FANATIC, true)
                if(inventory.selectedHotbarSlotIndex != 1) {
                    inventory.selectedHotbarSlotIndex = 1
                    waitTick()
                }
                waitAction(Actions.cast1)
                waitTick()
            }
        }
        inventory.selectedHotbarSlotIndex = if(inventory.getSlot(38).name.stringStripFormatting.startsWith("Silent B")) 2 else 1
        waitTick()
        waitAction(Actions.cast4)
        inventory.selectedHotbarSlotIndex = hotbar
        waitTick()
        return true
    }

    override fun paused() {
        super.paused()

        val bird = Models.Ability.hummingBirdsState && World.time - lastHaul < 100
        val commander = AbilityModel.commanderBar.isActivated && AbilityModel.commanderBar.duration > 10
        if(KeyBind.pressedKeys.contains(Keys.playKey) && (commander || bird)) {
            Coroutine.launch {
                waitTick(10)
                if(!running) {
                    force(Actions.sneak, true) {
                        if(commander) waitAction(Actions.cast3)
                        if(bird) waitAction(Actions.cast2)
                    }
                }
            }
        }
        lastNoTotemNotify = 0
        fullSummoner = false
        lastBird = false
    }

    override fun onTick() {
        super.onTick()

        if(fly.value && (!hasActions() || !running)) {
            val div = spellCooldown.value
            if(World.time % div < 3L) {
                if(flyCounter == -1)
                    flyCounter = 4 - (World.time / div).toInt() % 4
                val action = World.time / div + flyCounter
                if(action % 4 == 0L) {
                    cast(Actions.cast1)
                } else if(action % 4 < 3L) {
                    cast(Actions.cast2)
                }
            }
        }
    }

    override fun onKey(event: EventKey) {
        super.onKey(event)

        if(event.action != 1 && event.action != 3) return
        if(!running && event.key == skill2Key) {
            if(World.time - lastTotem > 60 && Player.player?.isSneaking != true || lastNoTotemNotify > lastTotem) {
                event.cancel()
                Coroutine.launch {
                    waitAction(Actions.cast1)
                    waitAction(Actions.cast2)
                }
            }
        }
        if(event.key == skill4Key && event.action == 3) {
            event.cancel()
        }
        if(mode == Mode.Acolyte && event.action == 3 && event.key == skill3Key) {
            event.cancel()
        }
    }
}
class Assassin : WynnClassBase(ClassType.ASSASSIN) {
    val lastSmoke get() = lastSpells[Actions.cast4] ?: 0L
    val lastDash get() = lastSpells[Actions.cast2] ?: 0L
    val lastSpin get() = lastSpells[Actions.cast1] ?: 0L

    val slowFall = BindBoolean(Keys.slowFall, renderName = "Slow Fall").buildWithUpdateDraw2d()
    val dive = BindBoolean(Keys.dive, renderName = "Swan Dive").buildWithUpdateDraw2d()

    val shadeBar = ShadeBar()

    var lastDJump = 0L

    val acrobatTests = mapOf<String, suspend () -> Unit>(
        "delay 12" to { // acrobat, seems broken
            scheduleHop(22)
            waitAction(Actions.cast1, 7)
            waitAction(Actions.cast2, 7)
            waitAction(Actions.cast3, 7)
        },
        "dynamic 1" to {
            scheduleHop(spellCooldown.value) // 9~12 is good
            waitAction(Actions.cast1, 4)
            waitAction(Actions.cast3, 4)
            waitAction(Actions.cast1, 4)
            waitAction(Actions.cast2, 4)
        },
        "dynamic 2" to { // 92~113 gaining height
            val extra = spellCooldown.value % 10
            scheduleHop(spellCooldown.value / 10)
            waitAction(Actions.cast1, extra)
            waitAction(Actions.cast3, extra)
            waitAction(Actions.cast1, extra)
            waitAction(Actions.cast2, extra)
        }
    )

    var acrobatTest = ""

    init {
//        spellCooldown.fixedValueCallback = {
//            5
//        }
        onModeSelectorScreenInit.add { iscreen ->
            val selects = acrobatTests.keys.toList()
            iscreen.reAddElement(createDropDown(iscreen as ScriptScreen, class_2561.method_43470(acrobatTest), selects.map(class_2561::method_43470), 30, 30, 100) { choice ->
                acrobatTest = selects[choice]
            })
        }
    }

    override suspend fun chooseAction(): Boolean {
        if(super.chooseAction()) return true
        val player = Player.player ?: return false
        if(mode == Mode.FourShade) {
            val shades = if (shadeBar.isActive) shadeBar.barProgress?.value()?.current() ?: 0 else 0
            for (i in 1..shades) {
                addActions(Actions.cast3, Actions.melee, Actions.cast4, Actions.melee)
            }
            val image = getEffectTimer("Mirror Image") ?: 0
            val vanish = getEffectTimer("Vanish") ?: 0
            val projection = getEffectTimer("Shadow Projection") ?: 0
            if((lastAction != Actions.cast2 || World.time - lastDash > 20) && (image < shades * 1.5 + 0.01 && vanish < shades * 1.5 + 0.01)) {
                force(Actions.sneak) {
                    addAction(Actions.cast2)
                }
            } else if (lastAction != Actions.cast4 && getMana() > 80) {
                addAction(Actions.cast4)
            } else if(getMana() > 80) {
                addAction(Actions.cast1)
            }
            if (projection == 0 && World.time - lastDJump > 170) {
                addActions(Actions.jump, Actions.melee, Actions.jump)
                lastDJump = World.time
            } else {
                addAction(Actions.melee)
            }
        } else if(mode == Mode.Acrobat) {
            // 12 cd 123
            //  9 cd 1323
            //  6 cd 132323
            // 18 cd total 36
//            val flag = heightCheck() || player.pitch < 0
//            scheduleHop(22)
//            waitAction(Actions.cast1, 4)
            if(heightCheck() || player.pitch < 0) { // go up
                var extra = spellCooldown.value - 6
                if(player.pitch < -30) extra -= 1
                scheduleHop(10)
                waitAction(Actions.cast1, extra)
                waitTick(spellCooldown.value)
                waitAction(Actions.cast1, extra)
                waitAction(Actions.cast2, extra)
            } else {
                val extra = spellCooldown.value - 5 + ((getYAboveTarget().toInt()-2).coerceAtLeast(0) / 4) // prevent too high
                scheduleHop(10) // 9~12 is good
                waitAction(Actions.cast1, extra)
                smokeOrMultihit()?.let {
                    waitAction(it, extra)
                } ?: waitTick(spellCooldown.value)
                waitAction(Actions.cast1, extra)
                waitAction(Actions.cast2, extra)
            }
        } else if(mode == Mode.AcrobatTest) {
            acrobatTests[acrobatTest]?.invoke()
        }
        return true
    }

    fun smokeOrMultihit(): String? {
        if(World.time - lastSmoke > 60) {
            return Actions.cast4
        } else if(getMana() > 40) {
            return Actions.cast3
        }
        return null
    }

    fun scheduleHop(ticks: Int) = Coroutine.launch {
        waitTick(ticks)
        pressKeyBind(Actions.jump)
        waitTick()
        pressKeyBind(Actions.jump)
        lastDJump = World.time
    }

    fun heightCheck(): Boolean {
        val player = Player.player ?: return false

        return player.velocity.y < -1 || yAboveTarget(player.velocity.y.coerceAtMost(0.0))
    }

    override fun updateDraw2D() {
        super.updateDraw2D()
        multiLineText.newLine("""
            ${shared.targetY}
            ${shared.height}
            $slowFall
        """.trimIndent())
        if (mode == Mode.Acrobat) {
            multiLineText.newLine(dive.toString())
        }
    }

    override fun onKey(event: EventKey) {
        if((event.action == 1 || event.action == 3) && event.key == skill1Key && mode == Mode.Acrobat) {
            if ((World.time - lastSpin < 22 && World.time != lastSpin) || running) {
                event.cancel()
                return
            }
            scheduleHop(22)
        }
        super.onKey(event)
    }

    override fun paused() {
        super.paused()
        lastDJump = 0
    }
}


EventListener(EventType.DimensionChange) {
    Character.currentWynnClass.paused()
    Character.currentWynnClass.saveConfig()
}


val bars = listOf(ShadeBar())
bars.forEach {
    Handlers.BossBar.registerBar(it)
}

context.onContextClosed {
    Handlers.BossBar._getPrivateValue<MutableList<TrackedBar>>("knownBars")?.let { knownBars ->
        bars.forEach {
            knownBars.remove(it)
        }
    }
    synchronized(Config.json) {
        Character.currentWynnClass.saveConfig()
        Config.save()
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinCharacterModel::class)
RuntimeTransform.addTransformer(MixinKeyBinding::class)
RuntimeTransform.addTransformer(MixinActivityModel::class)
RuntimeTransform.addTransformer(MixinSpellModel::class)
RuntimeTransform.transform()

val wynnListener = WynnListener().apply {
    register()
}
context.onContextClosed { wynnListener.unregister() }

WynntilsMod.postEvent(CharacterUpdateEvent())
Character.checkClass()

Chat.toast("battle", "enabled")