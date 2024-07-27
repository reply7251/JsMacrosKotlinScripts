import me.hellrevenger.generated.*

import net.minecraft.class_332
import org.joml.Vector3d
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.Text
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.Pair

val mc = Client.minecraft

class MyDraw2d : Draw2D(){
    val worldElements = hashSetOf<Pair<Pos3D, RenderElement>>()

    fun getDelta() = mc.method_60646().getTickDelta(true)

    override fun render(drawContext: class_332) {
        val player = Player.player ?: return
        val matrixStack = drawContext.method_51448()

        val width = width
        val height = height
        val delta = getDelta()

        val lerpPos = player.raw.getLerpedPos(delta)
        val (x, y, z) = Triple(lerpPos.x, lerpPos.y + player.eyeHeight, lerpPos.z)
        val rotationX = org.joml.Quaternionf().rotateLocalX(Math.toRadians(player.pitch.toDouble()).toFloat())
        val rotationY = org.joml.Quaternionf().rotateLocalY(Math.toRadians(180+player.yaw.toDouble()).toFloat())

        val projection0 = mc.gameRenderer.getBasicProjectionMatrix(mc.options.method_41808().value.toDouble())
        projection0.rotate(rotationX).rotate(rotationY)

        worldElements.forEach { (pos, element) ->
            val dx = pos.x - x
            val dy = pos.y - y
            val dz = pos.z - z

            val projection = projection0.clone() as Matrix4f

            val clip = Vector4f(dx.toFloat(), dy.toFloat(), dz.toFloat(), 1f)
            projection.transform(clip)
            val clip2 = Vector3d(
                ((clip.x() / clip.w() + 1) / 2.0) * width,
                (1 - clip.y() / clip.w()) / 2.0 * height,
                (clip.z()).toDouble()
            )

            if(clip2.z() < 0) return@forEach
            if(clip2.z() > 100) clip2.z = 100.0

            matrixStack.push()
            matrixStack.translate(clip2.x(), clip2.y(), clip2.z())

            element.method_25394(drawContext, 0, 0, 0f)
            matrixStack.pop()
        }
    }

    open fun addWorldElement(pos: Pos3D, element: RenderElement) {
        worldElements.add(pos to element)
    }
}
val d2d = MyDraw2d()
d2d.register()

val entities = World.getEntities("item")
if(entities != null) {
    for(entity in entities) {

        val text =Text.Builder(null).text(entity.name).shadow(true).build()
        text.x = -text.width / 2
        text.y = -5
        d2d.addWorldElement(entity.pos.add(0.0, 0.7, 0.0), text)

    }
}

/*
(event as EventService).stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    d2d.unregister()
} as Function0<*>)
 */
Chat.toast("d2d", "enabled")
JsMacros.waitForEvent("InteractBlock")
d2d.unregister()

