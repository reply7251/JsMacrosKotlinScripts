import com.jsmacrosce.jsmacros.client.api.classes.render.components.RenderElement
import com.jsmacrosce.jsmacros.client.api.helper.world.entity.EntityHelper
import com.jsmacrosce.jsmacros.client.api.helper.world.entity.ItemEntityHelper
import me.hellrevenger.library.api.WorldPosWrapper
import net.minecraft.class_332

val d2d = Hud.createDraw2D()

d2d.register()

class A : RenderElement {
    override fun getZIndex() = 0

    override fun method_25394(p0: class_332?, p1: Int, p2: Int, p3: Float) {
        Chat.actionbar("A rendered")
    }
}

fun onLoad(e: EntityHelper<*>) {
    val entity = e as? ItemEntityHelper ?: return
    val d2d2 = Hud.createDraw2D()
    val wrapper = WorldPosWrapper(d2d2)
    wrapper.bind(e)
    wrapper.addToDraw2d(d2d)
    val name = Chat.createTextBuilder().append(entity.containedItemStack.name).append(" x${entity.containedItemStack.count}")
        .build()

    d2d2.addText(name, 0, -30, 0xffffffffu.toInt(), true)
}

EventListener(EventType.EntityLoad) { event ->
    onLoad(event.entity)
}

val d3d = Hud.createDraw3D()
d3d.register()

World.worldScanner.build().scanAroundPlayer(1).forEach { pos ->
    val block = World.getBlock(pos)
    if(block?.name?.string?.contains("dirt") != true) return@forEach
    val d2d2 = d3d.addDraw2D(pos.x, pos.y + 2, pos.z)
    d2d2.renderBack = true
    d2d2.addText("Dirt!", 0, 0, 0xffffffffu.toInt(), true)
}

//d2d.reAddElement(A())
Client.minecraft.execute {
    World.entities?.forEach(::onLoad)
}

context.onContextClosed {
    d3d.unregister()
    d2d.unregister()
}

Chat.log("enabled")