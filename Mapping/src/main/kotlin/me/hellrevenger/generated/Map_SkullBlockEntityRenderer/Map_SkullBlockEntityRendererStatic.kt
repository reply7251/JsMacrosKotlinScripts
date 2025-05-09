package me.hellrevenger.generated.Map_SkullBlockEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SkullBlockEntityRendererKt {
    /**
     * method_32160
     */
    fun getModels(models: LoadedEntityModels, type: net.minecraft.class_2484.class_2485) = SkullBlockEntityRenderer.method_32160(models, type)
    /**
     * method_32161
     */
    fun renderSkull(direction: Direction, yaw: Float, animationProgress: Float, matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, light: Int, model: SkullBlockEntityModel, renderLayer: RenderLayer) = SkullBlockEntityRenderer.method_32161(direction, yaw, animationProgress, matrices, vertexConsumers, light, model, renderLayer)
    /**
     * method_3578
     */
    fun getRenderLayer(type: net.minecraft.class_2484.class_2485, profile: ProfileComponent, texture: Identifier) = SkullBlockEntityRenderer.method_3578(type, profile, texture)
    /**
     * method_65832
     */
    fun getRenderLayer(type: net.minecraft.class_2484.class_2485, profile: ProfileComponent) = SkullBlockEntityRenderer.method_65832(type, profile)
}