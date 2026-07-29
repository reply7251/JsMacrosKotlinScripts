package me.hellrevenger.jsmacroskotlinscript.mixin

import me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget.WorldPosWrapper
import net.minecraft.client.renderer.GameRenderer
import org.joml.Matrix4f
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.ModifyArg

@Mixin(GameRenderer::class)
class MixinGameRenderer {
    @ModifyArg(method = ["renderLevel"], at = At(
        value = "INVOKE",
        target = "Lnet/minecraft/client/renderer/ProjectionMatrixBuffer;getBuffer(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"
    ))
    fun onSetProjectionMatrix(projection: Matrix4f): Matrix4f {
        WorldPosWrapper.projection = projection
        return projection
    }
}