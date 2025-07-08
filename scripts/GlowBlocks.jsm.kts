
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw3D
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventChunkLoad
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventChunkUnload
import xyz.wagyourtail.jsmacros.client.api.helper.world.BlockStateHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

val glowColors = hashMapOf<String, Int>()
val d3ds = hashMapOf<Pair<Int, Int>, Draw3D>()
val d3dsToRemove = hashSetOf<Pair<Int, Int>>()
var enabled = true
var scanner = World.worldScanner.build()

fun onChunkLoad(x: Int, z: Int) {
    if(enabled) {
        val d3d = Hud.createDraw3D()
        d3d.register()

        thread {
            scanner.scanChunkRange(x, z, 0).forEach { pos ->
                val block = World.getBlock(pos) ?: return@forEach
                val id = block.blockStateHelper.id
                glowColors[id]?.let { color ->
                    val box = d3d.addBox(pos.x, pos.y, pos.z, pos.x + 1, pos.y + 1, pos.z + 1, color, color, false)
                    box.setAlpha(127)
                }
            }
        }

        d3ds[x to z] = d3d
    }
}

fun onChunkUnload(x: Int, z: Int) {
    val d3d = d3ds.remove(x to z)
    if(d3d == null) {
        d3dsToRemove.add(x to z)
    } else {
        d3d.unregister()
        d3dsToRemove.forEach { (x, z) ->
            if(!World.isChunkLoaded(x, z)) {
                if(d3ds.remove(x to z)?.unregister() != null) {
                    d3dsToRemove.remove(x to z)
                    return@forEach
                }
            }
        }
    }
}

fun enable() {
    disable()
    if(glowColors.isEmpty()) return
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

fun disable() {
    if(enabled) {
        enabled = false
        d3ds.values.forEach { it.unregister() }
        d3ds.clear()
    }
}

EventListener(EventType.ChunkLoad, {
    onChunkLoad(it.x, it.z)
})

EventListener(EventType.ChunkUnload, {
    onChunkUnload(it.x, it.z)
})

Chat.commandManager.unregisterCommand("/scan")

Chat.commandManager.createCommandBuilder("/scan")
    .literalArg("add")
    .blockArg("block")
    .executes(JavaWrapper.methodToJava { ctx ->
        glowColors[(ctx.getArg("block") as BlockStateHelper).id] = 0xff0000
        enable()
    })
    .regexArgType("color", "(0x)?([\\da-fA-F]{1,6})", "")
    .executes(JavaWrapper.methodToJava { ctx ->
        glowColors[(ctx.getArg("block") as BlockStateHelper).id] = Integer.valueOf((ctx.getArg("color") as Array<String>)[2], 16)
        enable()
    }).or().or().or()
    .literalArg("remove")
    .blockArg("block").suggestMatching(*glowColors.keys.toTypedArray())
    .executes(JavaWrapper.methodToJava { ctx ->
        glowColors.remove((ctx.getArg("block") as BlockStateHelper).id)
        enable()
    }).or().or()
    .literalArg("clear")
    .executes(JavaWrapper.methodToJava { ctx ->
        glowColors.clear()
        enable()
    }).or()
    .literalArg("enable")
    .executes(JavaWrapper.methodToJava { ctx ->
        enable()
    }).or()
    .literalArg("disable")
    .executes(JavaWrapper.methodToJava { ctx ->
        disable()
    }).register()

context.onContextClosed {
    disable()
}

Chat.toast("glow block", "enabled")