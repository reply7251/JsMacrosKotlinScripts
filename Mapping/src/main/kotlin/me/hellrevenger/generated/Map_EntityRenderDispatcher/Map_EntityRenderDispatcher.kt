package me.hellrevenger.generated.Map_EntityRenderDispatcher
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_4686
 */
var EntityRenderDispatcher.camera by alias(EntityRenderDispatcher::field_4686)
/**
 * field_4692
 */
val EntityRenderDispatcher.gameOptions by alias(EntityRenderDispatcher::field_4692)
/**
 * field_4685
 */
val EntityRenderDispatcher.textureManager by alias(EntityRenderDispatcher::field_4685)
/**
 * field_4678
 */
var EntityRenderDispatcher.targetedEntity by alias(EntityRenderDispatcher::field_4678)
/**
 * method_3948
 */
fun EntityRenderDispatcher.setRenderShadows(arg0: Boolean) = this.method_3948(arg0)
/**
 * method_23839
 */
fun <E>EntityRenderDispatcher.getLight(arg0: E, arg1: Float) where E: Entity = this.method_23839<E>(arg0, arg1)
/**
 * method_43336
 */
fun EntityRenderDispatcher.getHeldItemRenderer() = this.method_43336()
/**
 * method_62424
 */
fun <E>EntityRenderDispatcher.render(arg0: E, arg1: Double, arg2: Double, arg3: Double, arg4: Float, arg5: MatrixStack, arg6: VertexConsumerProvider, arg7: Int) where E: Entity = this.method_62424<E>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_23168
 */
fun EntityRenderDispatcher.getSquaredDistanceToCamera(arg0: Entity) = this.method_23168(arg0)
/**
 * method_24196
 */
fun EntityRenderDispatcher.setRotation(arg0: Quaternionf) = this.method_24196(arg0)
/**
 * method_3950
 */
fun <E>EntityRenderDispatcher.shouldRender(arg0: E, arg1: Frustum, arg2: Double, arg3: Double, arg4: Double) where E: Entity = this.method_3950<E>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_3941
 */
fun EntityRenderDispatcher.configure(arg0: world_World, arg1: Camera, arg2: Entity) = this.method_3941(arg0, arg1, arg2)
/**
 * method_3958
 */
fun EntityRenderDispatcher.shouldRenderHitboxes() = this.method_3958()
/**
 * method_3955
 */
fun EntityRenderDispatcher.setRenderHitboxes(arg0: Boolean) = this.method_3955(arg0)
/**
 * method_3953
 */
fun <T>EntityRenderDispatcher.getRenderer(arg0: T) where T: Entity = this.method_3953<T>(arg0)
/**
 * method_3959
 */
fun EntityRenderDispatcher.getSquaredDistanceToCamera(arg0: Double, arg1: Double, arg2: Double) = this.method_3959(arg0, arg1, arg2)
/**
 * method_3944
 */
fun EntityRenderDispatcher.setWorld(arg0: world_World) = this.method_3944(arg0)
/**
 * method_24197
 */
fun EntityRenderDispatcher.getRotation() = this.method_24197()
