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
fun EntityRenderDispatcher.setRenderShadows(renderShadows: Boolean) = this.method_3948(renderShadows)
/**
 * method_23839
 */
fun <E>EntityRenderDispatcher.getLight(entity: E, tickDelta: Float) where E: Entity = this.method_23839<E>(entity, tickDelta)
/**
 * method_43336
 */
fun EntityRenderDispatcher.getHeldItemRenderer() = this.method_43336()
/**
 * method_62424
 */
fun <E>EntityRenderDispatcher.render(entity: E, x: Double, arg2: Double, y: Double, arg4: Float, z: MatrixStack?, arg6: VertexConsumerProvider?, tickDelta: Int) where E: Entity = this.method_62424<E>(entity, x, arg2, y, arg4, z, arg6, tickDelta)
/**
 * method_23168
 */
fun EntityRenderDispatcher.getSquaredDistanceToCamera(entity: Entity?) = this.method_23168(entity)
/**
 * method_24196
 */
fun EntityRenderDispatcher.setRotation(rotation: Quaternionf?) = this.method_24196(rotation)
/**
 * method_3950
 */
fun <E>EntityRenderDispatcher.shouldRender(entity: E, frustum: Frustum?, x: Double, arg3: Double, y: Double) where E: Entity = this.method_3950<E>(entity, frustum, x, arg3, y)
/**
 * method_3941
 */
fun EntityRenderDispatcher.configure(world: world_World?, camera: Camera?, target: Entity?) = this.method_3941(world, camera, target)
/**
 * method_3958
 */
fun EntityRenderDispatcher.shouldRenderHitboxes() = this.method_3958()
/**
 * method_3955
 */
fun EntityRenderDispatcher.setRenderHitboxes(renderHitboxes: Boolean) = this.method_3955(renderHitboxes)
/**
 * method_3953
 */
fun <T>EntityRenderDispatcher.getRenderer(entity: T) where T: Entity = this.method_3953<T>(entity)
/**
 * method_3959
 */
fun EntityRenderDispatcher.getSquaredDistanceToCamera(x: Double, arg1: Double, y: Double) = this.method_3959(x, arg1, y)
/**
 * method_3944
 */
fun EntityRenderDispatcher.setWorld(world: world_World?) = this.method_3944(world)
/**
 * method_24197
 */
fun EntityRenderDispatcher.getRotation() = this.method_24197()
