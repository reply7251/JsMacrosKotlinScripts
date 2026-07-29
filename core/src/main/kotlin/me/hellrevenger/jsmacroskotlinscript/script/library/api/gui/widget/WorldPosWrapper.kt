package me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget

import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.client.renderer.SubmitNodeCollector
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f
import org.joml.Vector4f
import xyz.wagyourtail.jsmacros.api.math.Pos3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw2D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components.RenderElement
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper

open class WorldPosWrapper(
    val draw2d: Draw2D,
    private var pos: Pos3D = Pos3D(0.0, 0.0, 0.0),
    var parent: Draw2D? = null,
    private var zIndex: Int = 0,
    var bindEntity: EntityHelper<*>? = null,
    var offset: Pos3D = Pos3D(0.0, 0.0, 0.0),
) : RenderElement {
    companion object {
        var projection = Matrix4f()
            set(value) {
                field = value

                val cam = Minecraft.getInstance().cameraEntity ?: return

                val delta = getDelta()

                camera = Pos3D(cam.getEyePosition(delta))

                val rotateX = Quaternionf().rotateLocalX(
                    Math.toRadians(cam.getXRot(delta).toDouble()).toFloat()
                )
                val rotateY = Quaternionf().rotateLocalY(
                    Math.toRadians(180.0 + cam.getYRot(delta).toDouble()).toFloat()
                )
                clipMatrix = Matrix4f(value).rotate(rotateX).rotate(rotateY)
            }

        var clipMatrix = Matrix4f()

        var camera = Pos3D(0.0, 0.0, 0.0)
        val mc = Minecraft.getInstance()

        fun getDelta() = mc.deltaTracker.getGameTimeDeltaPartialTick(true)
    }

    var removed = false

    override fun render3D(
        matrixStack: PoseStack,
        light: Int,
        seeThrough: Boolean,
        collector: SubmitNodeCollector,
        delta: Float
    ) { }

    override fun extractRenderState(graphics: GuiGraphicsExtractor, mouseX: Int, mouseY: Int, a: Float) {
        bindEntity?.let {
            if (!it.isAlive || it.raw.level() != mc.level) {
                removed = true
                parent?.removeElement(this)
                return
            }
        }

        val tmpPos = getPos()

        val clip = Vector4f(tmpPos.x.toFloat(), tmpPos.y.toFloat(), tmpPos.z.toFloat(), 1f)
        clipMatrix.transform(clip)

        if(clip.w < 0) return

        val width = mc.window.guiScaledWidth
        val height = mc.window.guiScaledHeight

        val clip2 = Vector3f(
            (clip.x / clip.w + 1f) / 2f * width,
            (1f - clip.y / clip.w) / 2f * height,
            -clip.w + zIndex * 0.001f
        )

        val matrix = graphics.pose()
        matrix.pushMatrix()
        matrix.translate(clip2.x, clip2.y)

        draw2d.render(graphics)

        matrix.popMatrix()
    }

    open fun bind(entity: EntityHelper<*>?): WorldPosWrapper {
        this.bindEntity = entity
        return this
    }

    open fun offset(pos: Pos3D): WorldPosWrapper {
        this.offset = pos
        return this
    }

    open fun move(pos: Pos3D): WorldPosWrapper {
        this.pos = pos
        return this
    }

    open fun move(x: Double, y: Double, z: Double): WorldPosWrapper {
        return move(Pos3D(x, y, z))
    }

    fun getPos() =
        bindEntity?.let {
            Pos3D(it.raw.getPosition(getDelta())).sub(camera).add(offset)
        } ?: pos.sub(camera).add(offset)

    override fun getZIndex(): Int {
        return zIndex - (getPos().toVector().magnitude * 10).toInt()
    }

    fun getZIndexDouble() = zIndex * 0.01 - getPos().toVector().magnitude

    open fun addToDraw2d(d2d: Draw2D) {
        parent = d2d
        d2d.reAddElement(this)
    }
}

class ComplexDraw2D : Draw2D() {
    override fun getElementsByZIndex(): Iterator<RenderElement?>? {
        return elements.stream().sorted(Comparator.comparingDouble {
            (it as? WorldPosWrapper)?.getZIndexDouble() ?: it.zIndex.toDouble()
        }).iterator()
    }
}