
import com.mojang.blaze3d.buffers.GpuBufferSlice
import com.mojang.blaze3d.platform.DepthTestFunction
import com.mojang.blaze3d.systems.RenderSystem
import me.hellrevenger.library.api._getField
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.minecraft.*
import org.joml.Matrix4f
import xyz.wagyourtail.jsmacros.client.api.classes.render.Draw3D
import xyz.wagyourtail.jsmacros.client.api.classes.render.components3d.Box
import xyz.wagyourtail.jsmacros.client.api.helper.world.BlockStateHelper
import xyz.wagyourtail.jsmacros.client.api.library.impl.FHud

import net.minecraft.class_4587
import net.minecraft.class_9974
import net.minecraft.class_9960
import net.minecraft.class_1921
import net.minecraft.class_10799
import net.minecraft.class_758
import net.minecraft.class_758.class_4596
import kotlin.math.roundToInt

val mc = class_310.method_1551()

var lineDepthTestFunction by class_10799.field_56833._getField<DepthTestFunction>("depthTestFunction")
val oldLineDepthTestFunction = lineDepthTestFunction
var boxDepthTestFunction by class_10799.field_56837._getField<DepthTestFunction>("depthTestFunction")
val oldBoxDepthTestFunction = boxDepthTestFunction

val fogRenderer by mc.field_1773._getField<class_758>("field_60793")
val frameBufferSetF by mc.field_1769._getField<class_9960>("field_53081")

fun draw(box: Box, matrixStack: class_4587) {
    val a: Int = (box.color shr 24) and 0xFF
    val r: Int = (box.color shr 16) and 0xFF
    val g: Int = (box.color shr 8) and 0xFF
    val b: Int = box.color and 0xFF

    val fa: Int = (box.fillColor shr 24) and 0xFF
    val fr: Int = (box.fillColor shr 16) and 0xFF
    val fg: Int = (box.fillColor shr 8) and 0xFF
    val fb: Int = box.fillColor and 0xFF

    val camera = mc.field_1773.method_19418()
    val cameraPos = camera.method_19326()
    matrixStack.method_22903()
    matrixStack.method_22904(-cameraPos.field_1352, -cameraPos.field_1351, -cameraPos.field_1350)

    val x1 = box.pos.x1
    val y1 = box.pos.y1
    val z1 = box.pos.z1
    val x2 = box.pos.x2
    val y2 = box.pos.y2
    val z2 = box.pos.z2

    val bufferBuilders = mc.method_22940()
    val outlineProvider = bufferBuilders.method_23000()

    if(!box.cull) {
        lineDepthTestFunction = DepthTestFunction.NO_DEPTH_TEST
        boxDepthTestFunction = DepthTestFunction.NO_DEPTH_TEST
    }

    val consumer1 = outlineProvider.getBuffer(class_1921.method_23594())
    class_9974.method_62292(matrixStack, consumer1,
        x1, y1, z1, x2, y2, z2,
        r / 255f,g / 255f, b / 255f, a / 255f,
    )

    if(box.fill) {
        val consumer2 = outlineProvider.getBuffer(class_1921.method_49047())
        class_9974.method_62300(matrixStack, consumer2,
            x1, y1, z1, x2, y2, z2,
            fr / 255f,fg / 255f, fb / 255f, fa / 255f,
        )
    }

    outlineProvider.method_37104()
    lineDepthTestFunction = oldLineDepthTestFunction
    boxDepthTestFunction = oldBoxDepthTestFunction
    matrixStack.method_22909()
}

object MixinCallback {
    var callback = {
        frameGraphBuilder: class_9909,
        camera: class_4184,
        tickCounter: class_9779,
        profiler: class_3695
        -> }
}

MixinCallback.callback = { frameGraphBuilder, camera, tickCounter, profiler ->
    val framePass = frameGraphBuilder.method_61911("Draw3D")
    val frameBufferSet = frameBufferSetF!!
    frameBufferSet.field_53091 = framePass.method_61933(frameBufferSet.field_53091)

    framePass.method_61929 {
        try {
            RenderSystem.setShaderFog(fogRenderer!!.method_71109(class_4596.field_60101))

            val matrixStack = class_4587()
            profiler.method_15396("d3d")
            FHud.renders.forEach { d3d ->
                d3d.boxes.forEach {
                    draw(it, matrixStack)
                }
            }
            profiler.method_15407()
        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }
}

@CTransformer(class_761::class)
class MixinWorldRenderer {
    @CInject(method = ["method_62202"], target = [CTarget("TAIL")])
    fun onRender(
        frameGraphBuilder: class_9909, _1: class_4604, camera: class_4184,
        positionMatrix: Matrix4f, _4: GpuBufferSlice, _5: Boolean, _6: Boolean,
        tickCounter: class_9779, profiler: class_3695
    ) {
        MixinCallback.callback(frameGraphBuilder, camera, tickCounter, profiler)
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinWorldRenderer::class)
RuntimeTransform.transform()


val glowColors = hashMapOf<String, Int>()
val d3ds = hashMapOf<Pair<Int, Int>, Draw3D>()
val d3dsToRemove = hashSetOf<Pair<Int, Int>>()
var enabled = true
var scanner = World.worldScanner.withStringBlockFilter().contains("").build()


glowColors["minecraft:diamond_ore"] = 0xff0000

fun onChunkLoad(x: Int, z: Int) {
    if(enabled) {
        d3ds[x to z]?.unregister()
        val d3d = Hud.createDraw3D()
        d3ds[x to z] = d3d
        d3d.register()
        scanner.scanChunkRange(x, z, 0).forEach { pos ->
            val block = World.getBlock(pos) ?: return@forEach
            val id = block.blockStateHelper.id

            glowColors[id]?.let { color ->
                val box = d3d.addBox(pos.x, pos.y, pos.z, pos.x + 1, pos.y + 1, pos.z + 1, color, color, (pos.x + pos.y + pos.z).roundToInt() % 2 == 0)
                box.setAlpha(96)
                box.setFillAlpha(48)
            }
        }

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

EventListener(EventType.ChunkLoad, true) {
    onChunkLoad(it.x, it.z)
}

EventListener(EventType.BlockUpdate) {
    if(!enabled) return@EventListener
    val block = it.block

    val d3d = d3ds[(block.x shr 4) to (block.z shr 4)] ?: return@EventListener
    val pos = block.blockPos.toPos3D()
    d3d.boxes.filter {
        it.pos.start.toVector(pos).magnitude < 0.1
    }.forEach {
        d3d.removeBox(it)
    }

    val id = block.blockStateHelper.id
    glowColors[id]?.let { color ->
        val box = d3d.addBox(pos.x, pos.y, pos.z, pos.x + 1, pos.y + 1, pos.z + 1, color, color, (pos.x + pos.y + pos.z).roundToInt() % 2 == 0)
        box.setAlpha(96)
        box.setFillAlpha(48)
    }
}

EventListener(EventType.ChunkUnload) {
    onChunkUnload(it.x, it.z)
}

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
    }).or().or().or().or()
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
    lineDepthTestFunction = oldLineDepthTestFunction
    boxDepthTestFunction = oldBoxDepthTestFunction
}

enable()
Chat.toast("glow block", "enabled")