import me.hellrevenger.generated.Map_Nameable.getCustomName
import me.hellrevenger.library.api.WorldPosWrapper
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventNameChange
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.specialized.display.TextDisplayEntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val service = event as EventService
service.unregisterOnStop(true)

var running = true
val whitelist = listOf("That Which", "❃", "")
val custom = arrayListOf<String>()
val blacklist = listOf("Req:")
val traced = mutableSetOf<net.minecraft.class_1297>()

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
}

thread {
    while (running) {
        World.entities?.forEach {
            if(it is TextDisplayEntityHelper) {
                if(it !in textDisplays) {
                    val data = it.data ?: return@forEach
                    val name = data.text.stringStripFormatting ?: return@forEach
                    if(nameCheck(name)) {
                        textDisplays.add(it)
                        d3d.addEntityTraceLine(it, 0xffffff)
                    }
                }
            }
        }
        textDisplays.removeIf { !it.isAlive }
        Client.waitTick()
    }
}

Chat.commandManager.createCommandBuilder("/find")
    .literalArg("add").greedyStringArg("name").suggest(JavaWrapper.methodToJava { ctx, builder ->
        val names = mutableSetOf<String>()
        World.entities?.forEach {
            if(it is TextDisplayEntityHelper) {
                val data = it.data ?: return@forEach
                val name = data.text.stringStripFormatting ?: return@forEach
                names.add(name)
            }
        }
        names.forEach {
            if(it.contains(builder.remaining, true))
                builder.suggest(it)
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