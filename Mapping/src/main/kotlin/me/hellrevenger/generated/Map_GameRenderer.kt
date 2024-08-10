package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameRenderer

val GameRenderer.blitScreenProgram by alias(GameRenderer::field_29403)
val GameRenderer.firstPersonRenderer by alias(GameRenderer::field_4012)
val GameRenderer.CAMERA_DEPTH by aliasStatic(GameRenderer::field_32686)
fun GameRenderer.setRenderingPanorama(arg0: Boolean) = this.method_35770(arg0)
fun GameRenderer.getProgram(arg0: String) = this.method_35767(arg0)
fun GameRenderer.onCameraEntitySet(arg0: Entity) = this.method_3167(arg0)
fun GameRenderer.tick() = this.method_3182()
fun GameRenderer.getBasicProjectionMatrix(arg0: Double) = this.method_22973(arg0)
fun GameRenderer.isRenderingPanorama() = this.method_35765()
fun GameRenderer.render(arg0: RenderTickCounter, arg1: Boolean) = this.method_3192(arg0, arg1)
fun GameRenderer.updateCrosshairTarget(arg0: Float) = this.method_3190(arg0)
fun GameRenderer.getFarPlaneDistance() = this.method_32796()
fun GameRenderer.showFloatingItem(arg0: ItemStack) = this.method_3189(arg0)
fun GameRenderer.disablePostProcessor() = this.method_3207()
fun GameRenderer.getFov(arg0: Camera, arg1: Float, arg2: Boolean) = this.method_3196(arg0, arg1, arg2)
fun GameRenderer.togglePostProcessorEnabled() = this.method_3184()
fun GameRenderer.preloadPrograms(arg0: ResourceFactory) = this.method_34521(arg0)
fun GameRenderer.createProgramReloader() = this.method_45774()
fun GameRenderer.renderBlur(arg0: Float) = this.method_57796(arg0)
fun KClass<GameRenderer>.getNightVisionStrength(arg0: LivingEntity, arg1: Float) = GameRenderer.method_3174(arg0, arg1)
fun GameRenderer.renderWithZoom(arg0: Float, arg1: Float, arg2: Float) = this.method_35766(arg0, arg1, arg2)
fun GameRenderer.setBlockOutlineEnabled(arg0: Boolean) = this.method_35769(arg0)
fun GameRenderer.reset() = this.method_3203()
fun GameRenderer.onResized(arg0: Int, arg1: Int) = this.method_3169(arg0, arg1)
fun GameRenderer.loadProjectionMatrix(arg0: Matrix4f) = this.method_22709(arg0)
fun GameRenderer.setRenderHand(arg0: Boolean) = this.method_35768(arg0)
fun GameRenderer.renderWorld(arg0: RenderTickCounter) = this.method_3188(arg0)
