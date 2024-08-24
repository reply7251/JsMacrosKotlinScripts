package me.hellrevenger.library.api

import me.hellrevenger.generated.*
import net.minecraft.class_332
import org.joml.Vector3d
import xyz.wagyourtail.jsmacros.client.api.classes.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.PlayerEntityHelper
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.core.library.impl.FReflection

val mc get() = MinecraftClient::class.getInstance()

val methodFov = net.minecraft.class_757::class.java.declaredMethods.first { it.name == "method_3196" }

open class WorldPosWrapper(
    val draw2d: Draw2D,
    var pos: Pos3D = Pos3D(0.0, 0.0, 0.0),
    var parent: Draw2D? = null,
    private var zIndex: Int = 0
) : RenderElement {
    companion object {
        var clipMatrix = Matrix4f()
        var projectionMatrix = Matrix4f()

        var camera = Pos3D(0.0, 0.0, 0.0)
        var rotation = Quaternionf()
        var lastFov = 0.0
        var yaw = 0f
        var pitch = 0f
    }

    fun getDelta() = mc.getRenderTickCounter().getTickDelta(true)

    var bindEntity: EntityHelper<*>? = null

    var removed = false

    fun getFov(cam: net.minecraft.class_4184, delta: Float, a3: Boolean): Double {
        val gameRenderer = mc.gameRenderer
        if(methodFov.trySetAccessible()) {
            return methodFov.invoke(gameRenderer, cam, delta, a3) as? Double ?: 70.0
        }
        return 70.0
    }

    fun updateIfNecessary() {
        val gameRenderer = mc.gameRenderer
        val cam = gameRenderer.getCamera()
        camera = Pos3D(cam.getPos())

        val fov = mc.options.getFov().getValue().toDouble().coerceAtLeast(getFov(cam, getDelta(), true))
        if (fov != lastFov) {
            projectionMatrix = gameRenderer.getBasicProjectionMatrix(fov)
            lastFov = fov
            pitch = 1000f;
        }
        mc.isInSingleplayer()
        val player = mc.player?.let { PlayerEntityHelper.create(it) } ?: return
        val cPitch = player.pitch
        val cYaw = player.yaw
        if (cPitch != pitch || cYaw != yaw) {
            pitch = cPitch
            yaw = cYaw
            clipMatrix = projectionMatrix.clone() as Matrix4f
            val rotationX = org.joml.Quaternionf().rotateLocalX(Math.toRadians(player.pitch.toDouble()).toFloat())
            val rotationY = org.joml.Quaternionf().rotateLocalY(Math.toRadians(180 + player.yaw.toDouble()).toFloat())
            clipMatrix.rotate(rotationX).rotate(rotationY)
        }
    }

    override fun method_25394(context: class_332, p1: Int, p2: Int, delta: Float) {
        if (mc.world == null || removed) return
        updateIfNecessary()
        val bind = bindEntity
        var tmpPos = pos.sub(camera)
        if (bind != null) {
            if (!bind.isAlive || bind.raw.getEntityWorld() != mc.world) {
                removed = true
                parent?.removeElement(this)
                return
            }
            tmpPos = tmpPos.add(Pos3D(bind.raw.getLerpedPos(getDelta())))
        }

        val width = context.getScaledWindowWidth()
        val height = context.getScaledWindowHeight()

        val matrixStack = context.getMatrices()
        val clip = Vector4f(tmpPos.x.toFloat(), tmpPos.y.toFloat(), tmpPos.z.toFloat(), 1f)

        clipMatrix.transform(clip)

        if(clip.z() < 0) return
        val clip2 = Vector3d(
            (clip.x() / clip.w() + 1.0) / 2.0 * width,
            (1.0 - clip.y() / clip.w()) / 2.0 * height,
            -clip.z() + zIndex * 0.001
        )

        matrixStack.push()
        matrixStack.translate(clip2.x(), clip2.y(), clip2.z())
        draw2d.render(context)
        matrixStack.pop()
    }

    open fun bind(entity: EntityHelper<*>?): WorldPosWrapper {
        this.bindEntity = entity
        return this
    }

    open fun move(pos: Pos3D): WorldPosWrapper {
        this.pos = pos
        return this
    }

    open fun move(x: Double, y: Double, z: Double): WorldPosWrapper {
        return move(Pos3D(x,y,z))
    }

    override fun getZIndex(): Int {
        return zIndex
    }

    open fun addToDraw2d(d2d: Draw2D) {
        parent = d2d
        d2d.reAddElement(this)
    }
}