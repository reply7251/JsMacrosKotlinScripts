package me.hellrevenger.generated.Map_LivingEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LivingEntityRendererKt {
    /**
     * method_23622
     */
    fun <T, S, M>getOverlay(state: LivingEntityRenderState?, whiteOverlayProgress: Float) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = LivingEntityRenderer.method_23622(state, whiteOverlayProgress)
    /**
     * method_38563
     */
    fun <T, S, M>shouldFlipUpsideDown(entity: LivingEntity?) where T: LivingEntity, S: LivingEntityRenderState, M: EntityModel<in S> = LivingEntityRenderer.method_38563(entity)
}