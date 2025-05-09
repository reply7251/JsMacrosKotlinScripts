package me.hellrevenger.generated.Map_BackgroundRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BackgroundRendererKt {
    /**
     * field_32684
     */
    val WATER_FOG_CHANGE_DURATION by aliasStatic(BackgroundRenderer::field_32684)
    /**
     * method_63521
     */
    fun toggleFog() = BackgroundRenderer.method_63521()
    /**
     * method_62185
     */
    fun getFogColor(camera: Camera, tickDelta: Float, world: ClientWorld, clampedViewDistance: Int, skyDarkness: Float) = BackgroundRenderer.method_62185(camera, tickDelta, world, clampedViewDistance, skyDarkness)
    /**
     * method_42588
     */
    fun getFogModifier(entity: Entity, tickDelta: Float) = BackgroundRenderer.method_42588(entity, tickDelta)
    /**
     * method_3211
     */
    fun applyFog(camera: Camera, fogType: net.minecraft.class_758.class_4596, color: Vector4f, viewDistance: Float, thickenFog: Boolean, tickDelta: Float) = BackgroundRenderer.method_3211(camera, fogType, color, viewDistance, thickenFog, tickDelta)
}