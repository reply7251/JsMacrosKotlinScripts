import me.hellrevenger.generated.getCustomName
import me.hellrevenger.library.api.EventListener
import me.hellrevenger.library.api.WorldPosWrapper
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventNameChange
import xyz.wagyourtail.jsmacros.client.api.helpers.TextHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.specialized.display.TextDisplayEntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val service = event as EventService
service.unregisterOnStop(true)

var running = true
val whitelist = listOf("That Which")
val custom = arrayListOf<String>()
val blacklist = listOf("Req:")
val traced = mutableSetOf<net.minecraft.class_1297>()

val d2d = Hud.createDraw2D()
d2d.register()

val d3d = Hud.createDraw3D()
d3d.register()

val textDisplays = mutableSetOf<TextDisplayEntityHelper>()

fun getEntityName(entity: EntityHelper<*>) = (entity.raw.getCustomName()?.let { return@let TextHelper.wrap(it) } ?: entity.name)
    //(entity as? TextDisplayEntityHelper)?.data?.text

fun nameCheck(name: String?) = name != null && ((whitelist.find { name.contains(it, true) } != null && blacklist.find { name.contains(it, true) } == null)
        || custom.find { name.contains(it, true) } != null)

fun check(entity: EntityHelper<*>) {
    if(nameCheck(getEntityName(entity).stringStripFormatting)) {
        addEntity(entity)
    }
}

fun addEntity(entity: EntityHelper<*>) {
    val d2d2 = Hud.createDraw2D()
    d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
    d2d2.textBuilder().pos(9, -16).text(getEntityName(entity).stringStripFormatting).shadow(true).buildAndAdd()
    WorldPosWrapper(d2d2).move(0.0, 0.7, 0.0).bind(entity).addToDraw2d(d2d)
    d3d.addEntityTraceLine(entity, 0xffffff)
    traced.add(entity.raw)

}

fun reCheck() {
    d2d.register()
    d3d.entityTraceLines.forEach {
        d3d.removeTraceLine(it)
    }
    textDisplays.clear()

    World.entities?.forEach {
        check(it)
    }
}

thread {
    while (running) {
        World.entities?.forEach {
            if(it is TextDisplayEntityHelper) {
                if(it !in textDisplays) {
                    val data = it.data ?: return@forEach
                    val name = data.text.stringStripFormatting ?: return@forEach
                    if((whitelist.find { name.contains(it, true) } != null && blacklist.find { name.contains(it, true) } == null)
                        || custom.find { name.contains(it, true) } != null) {
                        textDisplays.add(it)
                        val d2d2 = Hud.createDraw2D()
                        d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
                        d2d2.textBuilder().pos(9, -16).text(data.text).shadow(true).buildAndAdd()
                        WorldPosWrapper(d2d2).move(0.0, 0.7, 0.0).bind(it).addToDraw2d(d2d)
                        d3d.addEntityTraceLine(it, 0xffffff)
                    }
                }
            }
        }
        textDisplays.removeIf { !it.isAlive }
        Client.waitTick()
    }
}

EventListener(context, EventEntityLoad::class.java, {
    check(it.entity)
})

EventListener(context, EventNameChange::class.java, {
    if(nameCheck(it.oldName?.stringStripFormatting)) {

    } else if(nameCheck(it.newName?.stringStripFormatting)) {
        addEntity(it.entity)
    }
})

Chat.commandManager.createCommandBuilder("/find")
    .literalArg("add").greedyStringArg("name").executes(JavaWrapper.methodToJava { ctx ->
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