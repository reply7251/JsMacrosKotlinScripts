package me.hellrevenger.generated.Map_BipedEntityRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_62461
 */
fun <T, S, M>KClass<BipedEntityRenderer<T, S, M>>.updateBipedRenderState(arg0: LivingEntity, arg1: BipedEntityRenderState, arg2: Float, arg3: ItemModelManager) where T: MobEntity, S: BipedEntityRenderState, M: BipedEntityModel<S> = BipedEntityRenderer.method_62461(arg0, arg1, arg2, arg3)
/**
 * method_62366
 */
fun <T, S, M>BipedEntityRenderer<T, S, M>.updateRenderState(arg0: T, arg1: S, arg2: Float) where T: MobEntity, S: BipedEntityRenderState, M: BipedEntityModel<S> = this.method_62366(arg0, arg1, arg2)
