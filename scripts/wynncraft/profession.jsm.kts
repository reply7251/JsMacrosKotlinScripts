@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.features.combat.QuickCastFeature
import com.wynntils.handlers.labels.event.LabelIdentifiedEvent
import com.wynntils.handlers.labels.event.LabelsRemovedEvent
import com.wynntils.mc.event.PlayerTeleportEvent
import com.wynntils.mc.event.TickEvent
import com.wynntils.models.items.items.game.GatheringToolItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.profession.label.GatheringNodeHarvestLabelInfo
import com.wynntils.models.profession.label.ProfessionGatheringNodeLabelInfo
import com.wynntils.models.profession.type.ProfessionType
import com.wynntils.services.lootrunpaths.LootrunCompiler
import com.wynntils.services.lootrunpaths.UncompiledLootrunPath
import com.wynntils.services.lootrunpaths.type.LootrunPath
import com.wynntils.services.lootrunpaths.type.LootrunState
import com.wynntils.utils.MathUtils
import com.wynntils.utils.mc.type.Location
import me.hellrevenger.library.api.KtGlobals
import net.minecraft.class_332
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.Box
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.RenderElement3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.screen.ButtonWidgetHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.BlockPosHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.jvm.optionals.getOrNull
import kotlin.math.*
import net.minecraft.class_243
import net.minecraft.class_2338
import net.minecraft.class_1923
import net.minecraft.class_744
import net.minecraft.class_10185

val radian = Math.PI / 180
fun Location.toBlockPosHelper() = BlockPosHelper(toBlockPos())
fun BlockPosHelper.getCenter(): Pos3D = toPos3D().add(0.5, 0.5, 0.5)
fun Pos3D.getRaw() = class_243(x, y, z)
fun Pos3D.distanceTo(another: Pos3D) = toVector(another).magnitude
fun Pos3D.distanceToIgnoreY(another: Pos3D, yMulti: Double = 0.0) = toVector(another).multiply(1.0,yMulti,1.0,1.0,yMulti,1.0).magnitude
fun Pos3D.toBlockPos() = BlockPosHelper(class_2338.method_49638(getRaw()))
fun <T> Iterable<T>.findCloset(callback: (T) -> Double): T? {
    var nearest: T? = null
    var nearestDistance = Double.MAX_VALUE
    forEach {
        val distance = callback(it)
        if(distance < nearestDistance) {
            nearestDistance = distance
            nearest = it
        }
    }
    return nearest
}
fun <K,V> Map<K, V>.findCloset(callback: (Map.Entry<K,V>) -> Double) = asIterable().findCloset(callback)
fun removeBoxAt(block: BlockPosHelper) {
    boxes.remove(block)?.let {
        d3d.removeBox(it)
    }
}
fun addBoxAt(block: BlockPosHelper) {
    removeBoxAt(block)
    val box = d3d.boxBuilder(block).color(255,0,0).build()
    boxes[block] = box
    d3d.addBox(box)
}

fun <T> List<T>.getOffset(offset: Int) = this[(pathIndex+offset) % size]
fun getNode(offset: Int) = getLootrunPath()?.points?.getOffset(offset)
fun getNoteAt(pos: Pos3D) =
    getLootrun()?.notes?.get(class_1923(pos.toRawBlockPos()).method_8324())?.let { it.firstOrNull {
        Pos3D(it.position.method_10216(), it.position.method_10214(), it.position.method_10215()).toBlockPos() == pos.toBlockPos()
    } }?.let { TextHelper.wrap(it.component) }
fun getSpellCaster(spellOrder: String): () -> Unit {
    val feat = Managers.Feature.getFeatureInstance(QuickCastFeature::class.java)
    val m = feat::class.java.getDeclaredMethod("cast${spellOrder}Spell")
    m.trySetAccessible()
    return { m.invoke(feat) }
}
fun follow() {
    val lootrun = getLootrunPath() ?: return
    val player = Player.player ?: return
    val points = lootrun.points
    if(teleported) {
        teleported = false
        setupCurrentPathIndex()
        if(Pos3D(points[pathIndex]).distanceTo(player.pos) > 30) {
            currentState = State.NONE
        }
    }
    var target = points[pathIndex]
    stuckCounter++
    val pos = Pos3D(target)
    if(pos.distanceToIgnoreY(player.pos) < 1.1 || Pos3D(points[(pathIndex+1)% points.size]).distanceToIgnoreY(player.pos) < 1.1) {
        pathIndex++
        pathIndex %= points.size
        target = points[pathIndex]
        stuckCounter = 0
    }
    if(flying) {
        if(World.time % 7 == 0L) {
            if(flyCounter % 4 == 0) {
                if(player.pos.y < pos.y + 10) {
                    spells[0]()
                    flyCounter++
                }
            } else if(flyCounter % 4 < 3) {
                spells[1]()
                flyCounter++
            }
        }
        getNoteAt(pos)?.let {
            if(pos.distanceToIgnoreY(player.pos) < 5 && it.string.contains(stopFlyingText)) {
                flying = false
                pathIndex++
            }
        }
    }

    getNoteAt(pos)?.let {
        if(it.string.contains(startFlyingText)) {
            flying = true
            pathIndex++
            flyCounter = 0
        }
    }
    myInput?.targetPos = Pos3D(target)
}
fun getLootrun() = Services.LootrunPaths.currentLootrun
fun getLootrunPath(): LootrunPath? {
    Services.LootrunPaths.let {
        it.currentLootrun?.let {
            return it.path
        }
        val m = Reflection.getDeclaredMethod(it::class.java, "getActiveLootrun")
        if(m.trySetAccessible()) {
            return (m.invoke(it) as? UncompiledLootrunPath)?.path
        }
    }
    return null
}
fun setInput(): MyInput? {
    resetInput()
    return Client.minecraft.field_1724?.let {
        val result = MyInput(it.field_3913)
        it.field_3913 = result
        result
    }
}
fun resetInput() {
    Client.minecraft.field_1724?.let { player ->
        (player.field_3913 as? MyInput)?.let {
            player.field_3913 = it.parent
            resetInput()
        }
    }
}

enum class State {
    NONE,
    RECORDING,
    PAUSE_RECORD,
    MOVE,
    FIND_NODE,
    HARVEST
}

class MyInput(val parent: class_744) : class_744() {
    var targetPos = Pos3D.ZERO
    fun getMovement(positive: Boolean, negative: Boolean) = if(positive == negative) 0f else if(positive) 1f else -1f
    fun roundMovement(value: Double) = if(abs(value) < 0.1) 0.0 else value / abs(value)
    override fun method_3129() {
        val player = Player.player!!
        if(targetPos.equals(Pos3D.ZERO)) {
            parent.method_3129()

            field_54155 = parent.field_54155
            val jump = World.getBlock(player.blockPos.up())?.blockStateHelper?.isLiquid == true && currentState != State.FIND_NODE
            val forward = stuckCounter > 14
            if(shouldOverrideInput() && (jump || forward)) {
                this.field_54155 = class_10185(field_54155.comp_3159() || forward, field_54155.comp_3160(),
                    field_54155.comp_3161(), field_54155.comp_3162(), field_54155.comp_3163() || jump, field_54155.comp_3164() || forward, field_54155.comp_3165())
                stuckCounter = 0
            }
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

        this.field_3905 = getMovement(field_54155.comp_3159(), field_54155.comp_3160())
        this.field_3907 = getMovement(field_54155.comp_3161(), field_54155.comp_3162())
    }
}
fun shouldOverrideInput() = currentState != State.NONE && currentState != State.RECORDING && currentState != State.PAUSE_RECORD
fun warpDegree(degree: Double) = ((degree + 720) % 360) + 360
fun warp180(degree: Double): Double {
    var v = (degree + 720) % 360
    if(v > 180) v -= 360
    if(v < -180) v += 360
    return v
}
fun compareDegree(from: Double, to: Double) = warp180(to - from)
fun lerpDegrees(from: Double, to: Double, lerp: Double, min: Double = 0.0): Double {
    val diff0 = warp180(to - from)
    var diff = diff0 * lerp
    if(abs(diff) >= 0.001) {
        if(abs(diff) < min) diff *= min / abs(diff)
        if(abs(diff) > abs(diff0)) diff = diff0
    }
    return warp180(from + diff)
}

class RenderGetter(val callback: () -> Unit) : RenderElement3D<RenderGetter> {
    override fun render(p0: class_332?, p1: Float) {
        callback()
    }

    override fun compareToSame(p0: RenderGetter?): Int {
        return 0
    }
}
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
fun getFieldValue(obj: Any, field: String): Any? {
    val f = Reflection.getDeclaredField(obj::class.java, field)
    f.trySetAccessible()
    return f.get(obj)
}
fun setFieldValue(obj: Any, field: String, value: Any) {
    val f = Reflection.getDeclaredField(obj::class.java, field)
    f.trySetAccessible()
    f.set(obj, value)
}
fun setupCurrentPathIndex() {
    getLootrunPath()?.let { path ->
        Player.player?.let { player ->
            val p = path.points.findCloset { player.distanceTo(Pos3D(it)) }
            pathIndex = path.points.indexOf(p)
        }
    }
}
fun makeScreen(): IScreen {
    val screen = Hud.createScreen("", false)
    screen.shouldPause = false
    val iscreen = screen as IScreen
    iscreen.setOnInit(JavaWrapper.methodToJava { _ ->
        val hw = iscreen.width / 2
        val hh = iscreen.height / 2

        iscreen.buttonBuilder()
            .x(hw - 100).y(hh).width(200)
            .message(if(shouldOverrideInput()) enableText else disableText)
            .action(JavaWrapper.methodToJava { btn, _ ->
                val enabled = currentState == State.NONE
                if(enabled) {
                    myInput = setInput()
                    holdTool()
                    setupCurrentPathIndex()
                }
                btn.label = if(enabled) enableText else disableText
                currentState = if(enabled) State.MOVE else State.NONE
            }).build()

        iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 40).width(200)
            .message(Chat.createTextBuilder().append("skill: ").append(if(enableSkill) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                enableSkill = !enableSkill
                btn.label = Chat.createTextBuilder().append("skill: ")
                    .append(if(enableSkill) enableText else disableText).build()
            }).build()
        iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 100).width(200)
            .message(Chat.createTextBuilder().append("recording: ").append(if(currentState == State.RECORDING || currentState == State.PAUSE_RECORD) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                btn.let {
                    val enabled = currentState != State.RECORDING && currentState != State.PAUSE_RECORD
                    currentState = if(enabled) {
                        myRecording.points.clear()
                        Services.LootrunPaths.startRecording()
                        State.RECORDING
                    } else {
                        if(Services.LootrunPaths.state == LootrunState.RECORDING)
                            Services.LootrunPaths.stopRecording()
                        Services.LootrunPaths.let {  service ->
                            val f = Reflection.getDeclaredField(service::class.java, "uncompiled")
                            f.trySetAccessible()
                            (f.get(service) as? UncompiledLootrunPath)?.let { origin ->
                                val uncompiled = UncompiledLootrunPath(myRecording, origin.chests, origin.notes, origin.file)
                                setFieldValue(service, "lootrun", LootrunCompiler.compile(uncompiled, false))
                                f.set(service, uncompiled)
                            }
                        }
                        State.NONE
                    }
                    flying = false
                    it.label = Chat.createTextBuilder().append("recording: ")
                        .append(if(enabled) enableText else disableText).build()
                }
            }).build()
        iscreen.buttonBuilder()
            .x(hw + 110).y(hh + 100).width(100)
            .message(Chat.createTextBuilder().append("Paused: ").append(if(currentState == State.PAUSE_RECORD) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                if(currentState == State.RECORDING) {
                    currentState = State.PAUSE_RECORD
                    record(true)
                } else if (currentState == State.PAUSE_RECORD) {
                    currentState = State.RECORDING
                }
                btn.label = Chat.createTextBuilder().append("Paused: ")
                    .append(if(currentState == State.PAUSE_RECORD) enableText else disableText).build()
            }).build()
        iscreen.buttonBuilder()
            .x(hw - 200).y(hh + 100).width(90)
            .message(Chat.createTextBuilder().append("Fly: ").append(if(flying) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                flying = !flying
                if(flying) {
                    if(currentState == State.RECORDING) {
                        currentState = State.PAUSE_RECORD
                        record(true)
                    }
                    startFlyingText
                } else {
                    if(currentState == State.PAUSE_RECORD)
                        currentState = State.RECORDING
                    stopFlyingText
                }.let {
                    Services.LootrunPaths.addNote(Chat.createTextBuilder().append(it).build().raw)
                }
                btn.label = Chat.createTextBuilder().append("Fly: ")
                    .append(if(flying) enableText else disableText).build()
            }).build()
        iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 60).width(200)
            .message(Chat.createTextBuilder().append("harvest with left click: ").append(if(harvestLeft) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                btn.let {
                    harvestLeft = !harvestLeft
                    it.label = Chat.createTextBuilder().append("harvest with left click: ")
                        .append(if(harvestLeft) enableText else disableText).build()
                }
            }).build()
        iscreen.buttonBuilder()
            .x(hw + 150).y(hh + 60).width(200)
            .message(Chat.createTextBuilder().append("extend reach: ").append(if(extendReach) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, _ ->
                extendReach = !extendReach
                btn.label = Chat.createTextBuilder().append("extend reach: ")
                    .append(if(extendReach) enableText else disableText).build()
            }).build()
    })
    return iscreen
}
fun holdAndUseWeapon() {
    if(!enableSkill) return
    val inv = Player.openInventory()
    inv.getSlots("hotbar").firstOrNull {
        (Models.Item.getWynnItem(inv.getSlot(it).raw).getOrNull() as? GearItem)?.meetsActualRequirements() == true
    }?.let {
        val newSelect = it - (inv.totalSlots - 10)
        if(newSelect == inv.selectedHotbarSlotIndex) {
            if(nextTotem < 0) {
                nextTotem = 63
                if(Models.Spell.repeatedBurstSpellCount < 4) {
                    spells[0]()
                }
            }
        }
        inv.selectedHotbarSlotIndex = newSelect
    }

}
fun holdTool() {
    val inv = Player.openInventory()
    inv.getSlots("hotbar").firstOrNull {
        (Models.Item.getWynnItem(inv.getSlot(it).raw).getOrNull() as? GatheringToolItem)?.let {
            if(it.durability.percentageInt > 0) {
                toolType = it.toolProfile.toolType.professionType
                true
            } else
                false
        } ?: false
    }?.let {
        val newSelect = it - (inv.totalSlots - 10)
        inv.selectedHotbarSlotIndex = newSelect
        return
    }
    currentState = State.NONE
}
fun isNextNodeCloserTo(pos: Pos3D): Boolean {
    val lr = getLootrunPath() ?: return false
    val player = Player.player ?: return false
    if(lr.points.isEmpty()) return false
    val dist1 = player.pos.distanceTo(pos)
    val dist2 = Pos3D(lr.points[pathIndex]).distanceTo(pos) + 0.1
    val dist3 = Pos3D(lr.points[(pathIndex+1) % lr.points.size]).distanceTo(pos) + 0.15
    val dist4 = Pos3D(lr.points[(pathIndex+2) % lr.points.size]).distanceTo(pos) + 0.2
    return dist2 < dist1 || dist3 < dist1 || dist4 < dist1
}
fun record(force: Boolean = false) {
    val player = Player.player ?: return
    val root = player.vehicle ?: player
    val pos = root.pos
    if(myRecording.points.isEmpty() || pos.distanceTo(Pos3D(myRecording.points.last())) >= 0.7 || force) {
        myRecording.points.add(pos.getRaw())
    }
}
fun getFilterDistance() = if (extendReach) 5.6 else 3.6
class EventListeners {
    @SubscribeEvent
    fun onLabelIdentified(event: LabelIdentifiedEvent) {
        (event.labelInfo as? ProfessionGatheringNodeLabelInfo)?.let {

            availableNodes[it.location] = it.professionType
            addBoxAt(it.location.toBlockPosHelper())
        }
        (event.labelInfo as? GatheringNodeHarvestLabelInfo)?.let {
            availableNodes.remove(it.location)
            removeBoxAt(it.location.toBlockPosHelper())
            if(currentState == State.HARVEST && !it.materialProfile.isPresent) {
                currentState = State.MOVE
            }
        }
    }
    @SubscribeEvent
    fun onLabelRemoved(event: LabelsRemovedEvent) {
        event.removedLabels.forEach {
            (it as? ProfessionGatheringNodeLabelInfo)?.let {
                availableNodes.remove(it.location)
                removeBoxAt(it.location.toBlockPosHelper())
            }
        }
    }
    @SubscribeEvent
    fun onRecordTick(event: TickEvent) {
        if(currentState != State.RECORDING) return
        record()
    }
    @SubscribeEvent
    fun onTeleported(event: PlayerTeleportEvent) {
        teleported = true
    }
    @SubscribeEvent
    fun onTick(event: TickEvent) {
        val player = Player.player ?: return
        myInput?.targetPos = Pos3D.ZERO
        val filtered = availableNodes.filter { it.key.toBlockPosHelper().getCenter().distanceTo(player.eyePos) < getFilterDistance() && it.value == toolType }

        nextHarvest--
        nextTotem--
        val harvestNode = filtered.findCloset {
            it.key.toBlockPosHelper().getCenter().distanceTo(player.eyePos)
        }?.key

        if(currentState == State.MOVE) {
            if(harvestNode != null && (!isNextNodeCloserTo(harvestNode.toBlockPosHelper().getCenter()) || harvestNode.toBlockPosHelper().getCenter().distanceTo(player.eyePos) < getFilterDistance() - 0.6)) {
                currentState = State.FIND_NODE
            } else {
                follow()
                holdAndUseWeapon()
            }
        }

        if(currentState == State.FIND_NODE || currentState == State.HARVEST) {
            holdTool()
            if(harvestNode == null) {
                if(currentState == State.FIND_NODE) {
                        currentState = State.MOVE
                }
            } else {
                val vec = offsetMap[toolType]?.let {
                    player.eyePos.toReverseVector(harvestNode.toBlockPosHelper().getCenter().add(it))
                } ?: player.eyePos.toReverseVector(harvestNode.toBlockPosHelper().getCenter())
                val yaw = if(abs(vec.yaw - player.yaw) > 5)
                    lerpDegrees(player.yaw.toDouble(), vec.yaw.toDouble(), 0.2, 5.0)
                else
                    vec.yaw.toDouble()

                if(currentState == State.FIND_NODE) {
                    val pitch = if(abs(vec.pitch - player.pitch) > 5)
                        lerpDegrees(player.pitch.toDouble(), vec.pitch.toDouble(), 0.3, 5.0)
                    else
                        vec.pitch.toDouble()
                
                    smooth.lookAt(yaw, pitch)
                    if(player.yaw == vec.yaw && player.pitch == vec.pitch) {
                        stuckCounter = 0
                        lastHarvestNode = harvestNode.toBlockPosHelper()
                        currentState = State.HARVEST
                    }
                }
                if(currentState == State.HARVEST) {
                    if(harvestNode.toBlockPosHelper() == lastHarvestNode) {
                        if(nextHarvest < 0) {
                            nextHarvest = 2L
                            if(harvestLeft) {
                                Player.interactions()?.attack()
                            } else {
                                Player.interactions()?.interact()
                            }
                            stuckCounter++
                        }
                        smooth.lookAt(yaw, vec.pitch.toDouble() + (World.time % 70 - 40) * 1.5)
                    } else {
                        stuckCounter = 0
                    }
                }
            }
        }
        info?.setText(currentState.name)
    }
}
val disableText = Chat.createTextBuilder().withColor(255,0,0).append("Disabled").build()
val enableText = Chat.createTextBuilder().withColor(0,255,0).append("Enabled").build()
val eventListeners = EventListeners()
WynntilsMod.registerEventListener(eventListeners)
val offsetMap = mapOf(
    ProfessionType.FISHING to Pos3D(0.0, -1.5, 0.0),
    ProfessionType.FARMING to Pos3D(0.0, -1.0, 0.0)
)

var currentState = State.NONE
var pathIndex = 0
var harvestLeft = false
var nextTotem = 0L
var nextHarvest = 0L
var lastHarvestNode = BlockPosHelper(0,0,0)
var enableSkill = true
var toolType: ProfessionType? = null
val myRecording = LootrunPath(mutableListOf())
var stuckCounter = 0
var flying = false
var flyCounter = 0
var extendReach = false
var teleported = false

val startFlyingText = "start flying"
val stopFlyingText = "stop flying"
val spells = listOf("First", "Second", "Third", "Fourth").map { getSpellCaster(it) }
val availableNodes = mutableMapOf<Location, ProfessionType>()
val d3d = Hud.createDraw3D()
d3d.register()
val boxes = mutableMapOf<BlockPosHelper, Box>()
val screen = makeScreen()
val d2d = Hud.createDraw2D()
val info = d2d.textBuilder().build()
d2d.setOnInit(JavaWrapper.methodToJava { d2d ->
    info.setPos(d2d.width / 2, d2d.height / 5)
    d2d.reAddElement(info)
    info.shadow = true
    info.scale = 2.0
})
d2d.register()

EventListener(EventType.Key) {
    if (it.key == "key.keyboard.n" && it.action == 0) {
        Hud.openScreen(screen)
    }
}

var myInput = setInput()
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    resetInput()
    WynntilsMod.unregisterEventListener(eventListeners)
    d3d.unregister()
    d2d.unregister()
}

Chat.toast("profession", "enabled")