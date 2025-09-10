@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")
import com.wynntils.core.components.Models
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.specialized.display.TextDisplayEntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val service = event as EventService
service.unregisterOnStop(true)

var running = true
val whitelist = listOf("That Which", "❃", "") // "\ue02a"
val custom = arrayListOf<String>()
val blacklist = listOf("Req:")
val traced = mutableSetOf<net.minecraft.class_1297>()
val levelPattern = "\ue00b\ue015 ([\ue020-\ue029])".toPattern()
val d2d = Hud.createDraw2D()
d2d.register()

val d3d = Hud.createDraw3D()
d3d.register()

val textDisplays = mutableSetOf<TextDisplayEntityHelper>()

fun nameCheck(name: String?) = name != null && ((whitelist.find { name.contains(it, true) } != null && blacklist.find { name.contains(it, true) } == null)
        || custom.find { name.contains(it, true) } != null)


fun reCheck() {
    d2d.register()
    d3d.entityTraceLines.forEach {
        d3d.removeTraceLine(it)
    }
    textDisplays.clear()
    traced.clear()
}
fun getDisplays() =
    World.entities?.let {
        mapOf(*it.filterIsInstance<TextDisplayEntityHelper>().filterNot { it.raw in traced }
            .mapNotNull { it.data?.let { data -> it to data.text } }.toTypedArray())
    }
thread {
    while (running) {
        if(Models.Raid.currentRaid == null) {
            getDisplays()?.forEach { (entity, name) ->
                if(nameCheck(name.stringStripFormatting) || nameCheck(name.string)) {
                    textDisplays.add(entity)
                    traced.add(entity.raw)
                    d3d.addEntityTraceLine(entity, 0xffffff)
                    thread {
                        for(i in 0..4) {
                            World.playSound("entity.experience_orb.pickup")
                            Client.waitTick(3)
                        }
                    }
                }
            }
        }
        traced.removeIf { !it.method_5805() }
        textDisplays.removeIf { !it.isAlive }
        Client.waitTick()
    }
}

Chat.commandManager.createCommandBuilder("/find")
    .literalArg("add").greedyStringArg("name").suggest(JavaWrapper.methodToJava { ctx, builder ->
        getDisplays()?.let{
            it.map { it.value.stringStripFormatting }.toSet().forEach {
                if(it.contains(builder.remaining, true))
                    builder.suggest(it)
            }
        }
    }).executes(JavaWrapper.methodToJava { ctx ->
        custom.add(ctx.getArg("name") as String)
        reCheck()
    }).or().or()
    .literalArg("addformat").greedyStringArg("name").suggest(JavaWrapper.methodToJava { ctx, builder ->
        getDisplays()?.let{
            it.map { it.value.string }.toSet().forEach {
                if(it.contains(builder.remaining, true) && levelPattern.matcher(it).find())
                    builder.suggest(it)
            }
        }
    }).executes(JavaWrapper.methodToJava { ctx ->
        custom.add(ctx.getArg("name") as String)
        reCheck()
    }).or().or()
    .literalArg("remove").greedyStringArg("name").suggest(JavaWrapper.methodToJava { ctx, builder ->
        builder.suggestMatching(custom)
    }).executes(JavaWrapper.methodToJava { ctx ->
        if(custom.remove(ctx.getArg("name"))) {
            reCheck()
        }
    }).register()



service.stopListener = JavaWrapper.methodToJava { ->
    d2d.unregister()
    d3d.unregister()
    running = false
    Chat.commandManager.unregisterCommand("/find")
}

if(World.isWorldLoaded) {
    reCheck()
}

Chat.toast("EntityFinder", "enabled")