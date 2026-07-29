import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper
import me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget.WorldPosWrapper
import xyz.wagyourtail.jsmacros.api.math.Pos3D

val d2d = Hud.createDraw2D()

d2d.setOnInit(JavaWrapper.methodToJava { d2d ->
    World.entities?.forEach(::addNameTag)
})

fun addNameTag(entity: EntityHelper<*>) {
    if (entity == Player.player) return
    Client.runOnMainThread(JavaWrapper.methodToJava { ->
        val d2d2 = Hud.createDraw2D()
        val text = d2d2.addText(entity.name, 0, 0, 0xffffffffu.toInt(), true)
        text.x -= text.width / 2

        WorldPosWrapper(d2d2)
            .bind(entity)
            .offset(Pos3D(0.0, entity.eyeHeight + 0.5, 0.0))
            .addToDraw2d(d2d)
    })
}

EventListener(EventType.EntityLoad) {
    addNameTag(it.entity)
}

d2d.register()

context.onContextClosed {
    d2d.unregister()
}

Chat.log("NameTag enabled")