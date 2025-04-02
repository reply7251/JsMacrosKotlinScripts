@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
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
import me.hellrevenger.generated.*
import me.hellrevenger.generated.Map_ClientPlayerEntity.input
import me.hellrevenger.generated.Map_Input.*
import me.hellrevenger.generated.Map_MathHelper.wrapDegrees
import me.hellrevenger.generated.Map_MinecraftClient.getRenderTickCounter
import me.hellrevenger.generated.Map_MinecraftClient.player
import me.hellrevenger.generated.Map_PlayerInput.backward
import me.hellrevenger.generated.Map_PlayerInput.forward
import me.hellrevenger.generated.Map_PlayerInput.left
import me.hellrevenger.generated.Map_PlayerInput.right
import me.hellrevenger.generated.Map_PlayerInput.sneak
import me.hellrevenger.generated.Map_PlayerInput.sprint
import me.hellrevenger.generated.Map_PlayerInput.jump
import me.hellrevenger.generated.Map_RenderTickCounter.getTickDelta
import net.minecraft.class_332
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.helper.world.BlockPosHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.Box
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.RenderElement3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.helper.screen.ButtonWidgetHelper
import kotlin.concurrent.thread
import kotlin.jvm.optionals.getOrNull
import kotlin.math.*
import kotlin.random.Random

val radian = Math.PI / 180
fun Location.toBlockPosHelper() = BlockPosHelper(toBlockPos())
fun BlockPosHelper.getCenter(): Pos3D = toPos3D().add(0.5, 0.5, 0.5)
fun Pos3D.getRaw() = Vec3d(x, y, z)
fun Pos3D.distanceTo(another: Pos3D) = toVector(another).magnitude
fun Pos3D.distanceToIgnoreY(another: Pos3D) = toVector(another).multiply(1.0,0.0,1.0,1.0,0.0,1.0).magnitude
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
fun <K,V> Map<K, V>.findCloset(callback: (Map.Entry<K,V>) -> Double) = asIterable()?.findCloset(callback)
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
fun follow() {
    val lootrun = getLootrun() ?: return
    val points = lootrun.points
    var target = points[pathIndex]
    val player = Player.player ?: return
    stuckCounter++
    if(Pos3D(target).distanceToIgnoreY(player.pos) < 1.1 || Pos3D(points[(pathIndex+1)% points.size]).distanceToIgnoreY(player.pos) < 1.1) {
        pathIndex++
        pathIndex %= points.size
        target = points[pathIndex]
        stuckCounter = 0
    }
    myInput?.targetPos = Pos3D(target)
}
fun getLootrun(): LootrunPath? {
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
    return Client.minecraft.player?.let {
        val result = MyInput(it.input)
        it.input = result
        result
    }
}
fun resetInput() {
    Client.minecraft.player?.let { player ->
        (player.input as? MyInput)?.let {
            player.input = it.parent
            resetInput()
        }
    }
}

enum class State {
    NONE,
    RECORDING,
    MOVE,
    FIND_NODE,
    HARVEST,
    WAIT
}
class MyInput(val parent: Input) : Input() {
    var targetPos = Pos3D.ZERO
    fun getMovement(positive: Boolean, negative: Boolean) = if(positive == negative) 0f else if(positive) 1f else -1f
    fun roundMovement(value: Double) = if(abs(value) < 0.1) 0.0 else value / abs(value)
    override fun method_3129() {
        val player = Player.player!!
        if(targetPos.equals(Pos3D.ZERO)) {
            parent.tick()
            playerInput = parent.playerInput
            val jump = World.getBlock(player.blockPos)?.blockStateHelper?.isLiquid == true
            val forward = stuckCounter > 8
            if(shouldOverrideInput() && (jump || forward)) {
                val inp = Reflection.getClass<Any>("net.minecraft.class_10185").constructors[0]
                    .newInstance(playerInput.forward() || forward, playerInput.backward(),
                    playerInput.left(), playerInput.right(), playerInput.jump() || jump, playerInput.sneak(), playerInput.sprint())
                playerInput = inp as net.minecraft.class_10185
                stuckCounter = stuckCounter * 2 / 3
            }
        } else {
            val vec = player.pos.toReverseVector(targetPos)
            val target = atan2(-vec.deltaX, vec.deltaZ) / radian
            smooth.lookAt(lerpDegrees(player.yaw.toDouble(), target, 0.1), player.pitch.toDouble())
            val diff = (((player.yaw - target) - 22.5) / 45).roundToInt() * radian * 45
            val forward = if(stuckCounter > 20) 1.0 else roundMovement(cos(diff))
            val side = roundMovement(sin(diff))
            val jump = targetPos.y - player.pos.y > 0.501 && player.pos.distanceToIgnoreY(targetPos) < 2
                    || (World.getBlock(player.blockPos)?.blockStateHelper?.isLiquid == true)
                    || stuckCounter > 20
            val sneak = false
            val sprint = false


            val inp = Reflection.getClass<Any>("net.minecraft.class_10185").constructors[0]
                .newInstance(forward > 0, forward < 0, side > 0, side < 0, jump, sneak, sprint)

            playerInput = inp as net.minecraft.class_10185
        }

        movementForward = getMovement(playerInput.forward(), playerInput.backward())
        movementSideways = getMovement(playerInput.left(), playerInput.right())
    }
}
fun shouldOverrideInput() = currentState != State.NONE && currentState != State.RECORDING
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
    if(abs(diff) < min) diff *= min / abs(diff)
    if(abs(diff) > abs(diff0)) diff = diff0
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
class Smooth {
    var enabled = false
    private var targetYaw = 0.0
    var targetPitch = 0.0
    private var prevYaw = 0.0
    var prevPitch = 0.0
    var tick = 0L

    var dYaw = 0.0
    var dPitch = 0.0

    fun lookAt(yaw: Double, pitch: Double, lerp: Double = 1.0) {
        val player = Player.player ?: return
        enabled = true
        prevYaw = warp180(player.yaw.toDouble())
        prevPitch = player.pitch.toDouble()
        targetYaw = lerpDegrees(prevYaw, yaw, lerp, 5.0)
        targetPitch = MathUtils.lerp(prevPitch, pitch, lerp)
        tick = World.time
    }
    val cameraUpdater = RenderGetter {
        val player = Player.player ?: return@RenderGetter
        if(!enabled) return@RenderGetter
        if(abs(World.time - tick) > 1) {
            enabled = false
            return@RenderGetter
        }

        val delta = Client.minecraft.getRenderTickCounter().getTickDelta(true)
        player.lookAt(lerpDegrees(prevYaw, targetYaw, delta.toDouble()),
            MathUtils.lerp(prevPitch, targetPitch, delta.toDouble()))
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
fun makeScreen(): IScreen {
    val screen = Hud.createScreen("", false)
    screen.shouldPause = false
    val iscreen = screen as IScreen
    iscreen.setOnInit(JavaWrapper.methodToJava { iscreen ->
        val hw = iscreen.width / 2
        val hh = iscreen.height / 2

        val btns = arrayOfNulls<ButtonWidgetHelper<*>>(4)
        btns[0] = iscreen.buttonBuilder()
            .x(hw - 100).y(hh)
            .width(200)
            .message(if(currentState != State.NONE && currentState != State.RECORDING) enableText else disableText)
            .action(JavaWrapper.methodToJava { btn, iscreen ->
                btns[0]?.let {
                    val enabled = currentState == State.NONE
                    if(enabled) {
                        myInput = setInput()
                        holdTool()
                        getLootrun()?.let {  path ->
                            Player.player?.let { player ->
                                var nearestDistance = 1e5
                                path.points.forEachIndexed { index, class243 ->
                                    val distance = player.distanceTo(Pos3D(class243))
                                    if(distance < nearestDistance) {
                                        pathIndex = index
                                        nearestDistance = distance
                                    }
                                }
                            }
                        }
                    }
                    it.label = if(enabled) enableText else disableText
                    currentState = if(enabled) State.MOVE else State.NONE
                }
            }).build()

        btns[1] = iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 40)
            .width(200)
            .message(Chat.createTextBuilder().append("skill: ").append(if(enableSkill) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, iscreen ->
                btns[1]?.let {
                    enableSkill = !enableSkill
                    it.label = Chat.createTextBuilder().append("skill: ")
                        .append(if(enableSkill) enableText else disableText).build()
                }
            }).build()
        btns[2] = iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 100)
            .width(200)
            .message(Chat.createTextBuilder().append("recording: ").append(if(currentState == State.RECORDING) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, iscreen ->
                btns[2]?.let {
                    val enabled = currentState != State.RECORDING
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
                    it.label = Chat.createTextBuilder().append("recording: ")
                        .append(if(enabled) enableText else disableText).build()
                }
            }).build()
        btns[3] = iscreen.buttonBuilder()
            .x(hw - 100).y(hh + 60)
            .width(200)
            .message(Chat.createTextBuilder().append("harvest with left click: ").append(if(harvestLeft) enableText else disableText).build())
            .action(JavaWrapper.methodToJava { btn, iscreen ->
                btns[3]?.let {
                    harvestLeft = !harvestLeft
                    it.label = Chat.createTextBuilder().append("harvest with left click: ")
                        .append(if(harvestLeft) enableText else disableText).build()
                }
            }).build()
    })
    return iscreen
}
fun holdAndUseWeapon() {
    val inv = Player.openInventory()
    inv.getSlots("hotbar").firstOrNull {
        (Models.Item.getWynnItem(inv.getSlot(it).raw).getOrNull() as? GearItem)?.meetsActualRequirements() == true
    }?.let {
        val newSelect = it - (inv.totalSlots - 10)
        if(newSelect == inv.selectedHotbarSlotIndex) {
            if(nextTotem < 0 && enableSkill) {
                nextTotem = 62
                thread {
                    KeyBind.pressKeyBind("Cast 1st Spell")
                    Client.waitTick(2)
                    KeyBind.releaseKeyBind("Cast 1st Spell")
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
    val lr = getLootrun() ?: return false
    val player = Player.player ?: return false
    if(lr.points.isEmpty()) return false
    val dist1 = player.pos.distanceTo(pos)
    val dist2 = Pos3D(lr.points[pathIndex]).distanceTo(pos) + 0.1
    val dist3 = Pos3D(lr.points[(pathIndex+1) % lr.points.size]).distanceTo(pos) + 0.15
    val dist4 = Pos3D(lr.points[(pathIndex+2) % lr.points.size]).distanceTo(pos) + 0.2
    return dist2 < dist1 || dist3 < dist1 || dist4 < dist1
}
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
            if(currentState == State.WAIT || currentState == State.HARVEST) {
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
        val player = Player.player ?: return
        val root = player.vehicle ?: player
        val pos = root.pos
        if(myRecording.points.size == 0 || pos.distanceTo(Pos3D(myRecording.points.last())) >= 0.7) {
            myRecording.points.add(pos.getRaw())
        }
    }
    @SubscribeEvent
    fun onTeleported(event: PlayerTeleportEvent) {
        currentState = State.NONE
    }
    @SubscribeEvent
    fun onTick(event: TickEvent) {
        val player = Player.player ?: return
        myInput?.targetPos = if(shouldOverrideInput())
            getLootrun()?.points?.get(pathIndex)?.let {
                val target = Pos3D(it)
                if(player.distanceTo(target) > 5)
                    target
                else Pos3D.ZERO
            } ?: Pos3D.ZERO
        else
            Pos3D.ZERO
        val filtered = availableNodes.filter { it.key.toBlockPosHelper().getCenter().distanceTo(player.eyePos) < 3.6 && it.value == toolType }

        nextHarvest--
        nextTotem--
        val harvestNode = filtered.findCloset {
            it.key.toBlockPosHelper().getCenter().distanceTo(player.eyePos)
        }?.key

        if(currentState == State.MOVE) {
            if(harvestNode != null && (!isNextNodeCloserTo(harvestNode.toBlockPosHelper().getCenter()) || harvestNode.toBlockPosHelper().getCenter().distanceTo(player.eyePos) < 2.7)) {
                currentState = State.FIND_NODE
            } else {
                follow()
                holdAndUseWeapon()
            }
        }

        if(currentState == State.FIND_NODE || currentState == State.HARVEST) {
            holdTool()
            if(harvestNode == null) {
                if(currentState == State.FIND_NODE)
                    currentState = State.MOVE
            } else {
                val vec = offsetMap[toolType]?.let {
                    player.eyePos.toReverseVector(harvestNode.toBlockPosHelper().getCenter().add(it))
                } ?: player.eyePos.toReverseVector(harvestNode.toBlockPosHelper().getCenter())
                val yaw = if(abs(vec.yaw - player.yaw) > 5)
                    lerpDegrees(player.yaw.toDouble(), vec.yaw.toDouble(), 0.2, 5.0)
                else
                    vec.yaw.toDouble()
                val pitch = if(abs(vec.pitch - player.pitch) > 5)
                    lerpDegrees(player.pitch.toDouble(), vec.pitch.toDouble(), 0.3, 5.0)
                else
                    vec.pitch.toDouble()

                if(currentState == State.FIND_NODE) {
                    smooth.lookAt(yaw, pitch)
                    if(player.yaw == vec.yaw && player.pitch == vec.pitch) {
                        currentState = State.HARVEST
                        lastHarvestNode = harvestNode.toBlockPosHelper()
                    }
                }
                if(currentState == State.HARVEST) {
                    if(harvestNode.toBlockPosHelper() == lastHarvestNode) {
                        if(nextHarvest < 0) {
                            nextHarvest = 3L
                            if(harvestLeft) {
                                Player.interactions()?.attack()
                            } else {
                                Player.interactions()?.interact()
                            }
                            stuckCounter++
                        }
                        smooth.lookAt(yaw, pitch + (World.time % 80 - 40) * 1.2, 0.1)
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

val availableNodes = mutableMapOf<Location, ProfessionType>()
val d3d = Hud.createDraw3D()
d3d.register()
val smooth = Smooth()
d3d.reAddElement(smooth.cameraUpdater)
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

EventListener(EventKey::class.java, {
    if(it.key == "key.keyboard.n" && it.action == 0) {
        Hud.openScreen(screen)
    }
})

var myInput = setInput()
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    resetInput()
    WynntilsMod.unregisterEventListener(eventListeners)
    d3d.unregister()
    d2d.unregister()
}

Chat.toast("profession", "enabled")