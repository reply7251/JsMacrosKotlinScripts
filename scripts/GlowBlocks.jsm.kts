
import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.Box
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventChunkLoad
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventChunkUnload
import xyz.wagyourtail.jsmacros.client.api.helpers.world.BlockStateHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread
import kotlin.script.experimental.jvm.util.KotlinJars

val JWrapper = FWrapper(context.ctx as KotlinScriptContext, KotlinLanguageDefinition::class.java)

//class EventListener(val eventName: String, val callback: (BaseEvent) -> Unit) : IEventListener {
//    init {
//        Core.getInstance().eventRegistry.addListener(eventName, this)
//        context.ctx.eventListeners[this] = eventName
//    }
//
//    override fun off() {
//        Core.getInstance().eventRegistry.removeListener(eventName, this)
//    }
//
//    override fun joined(): Boolean {
//        return true
//    }
//
//    override fun trigger(p0: BaseEvent): EventContainer<*> {
//        try {
//            callback.invoke(p0)
//        } catch (e: Throwable) {
//            off()
//            Core.getInstance().profile.logError(e)
//        }
//        return context
//    }
//}

val glowColors = hashMapOf<String, Int>()
val glowings = hashMapOf<Pos3D, Box>()
val d3ds = hashMapOf<Pair<Int, Int>, Draw3D>()
var enabled = true
var scanner = World.worldScanner.build()

fun onChunkLoad(x: Int, z: Int) {
    if(enabled) {
        val d3d = Hud.createDraw3D()

        thread {
            scanner.scanChunkRange(x, z, 0).forEach { pos ->
                val block = World.getBlock(pos) ?: return@forEach
                val id = block.blockStateHelper.id
                glowColors[id]?.let { color ->
                    val box = d3d.addBox(pos.x, pos.y, pos.z, pos.x + 1, pos.y + 1, pos.z + 1, color, color, true)
                    box.setAlpha(127)
                    box.setFillAlpha(10)
                    glowings[pos] = box
                }
            }
        }

        d3ds[x to z] = d3d
        d3d.register()
    }
}

fun onChunkUnload(x: Int, z: Int) {
    d3ds.remove(x to z)?.let {
        it.unregister()
        it.boxes.forEach { box ->
            glowings.remove(box.pos.start)
        }
    }
}

fun enable() {
    disable()
    enabled = true
    scanner = World.worldScanner.withBlockFilter("getId").`is`("EQUALS", *glowColors.keys.toTypedArray()).build()
    val player = Player.player ?: return
    val x = player.chunk.chunkX
    val z = player.chunk.chunkZ

    for (dx in -8..8) {
        for(dz in -8..8) {
            if(World.isChunkLoaded(x+dx, z+dz)) {
                onChunkLoad(x+dx, z+dz)
            }
        }
    }
}
KotlinJars.stdlib
fun disable() {
    if(enabled) {
        enabled = false
        d3ds.values.forEach { it.unregister() }
        d3ds.clear()
        glowings.clear()
    }
}

EventListener(context, EventChunkLoad::class.java) {
    (it as? EventChunkLoad)?.let {
        onChunkLoad(it.x, it.z)
    }
}

EventListener(context, EventChunkUnload::class.java) {
    (it as? EventChunkUnload)?.let {
        onChunkUnload(it.x, it.z)
    }
}

Chat.commandManager.unregisterCommand("/scan")

Chat.commandManager.createCommandBuilder("/scan")
    .literalArg("add")
    .blockArg("block")
    .executes(JWrapper.methodToJava { ctx ->
        glowColors[(ctx.getArg("block") as BlockStateHelper).id] = 0xff0000
        enable()
    })
    .regexArgType("color", "([\\da-fA-F]{1,6})", "")
    .executes(JWrapper.methodToJava { ctx ->
        glowColors[(ctx.getArg("block") as BlockStateHelper).id] = Integer.valueOf((ctx.getArg("color") as Array<String>)[1], 16)
        enable()
    }).or().or().or()
    .literalArg("remove")
    .blockArg("block")
    .executes(JWrapper.methodToJava { ctx ->
        glowColors.remove((ctx.getArg("block") as BlockStateHelper).id)
        enable()
    }).or().or()
    .literalArg("enable")
    .executes(JWrapper.methodToJava { ctx ->
        enable()
    }).or()
    .literalArg("disable")
    .executes(JWrapper.methodToJava { ctx ->
        disable()
    }).register()

JsMacros.assertEvent(event, "Service")

val service = event as EventService

service.unregisterOnStop(true)

service.stopListener = JWrapper.methodToJava { ->
    disable()
}

Chat.toast("glow block", "enabled")