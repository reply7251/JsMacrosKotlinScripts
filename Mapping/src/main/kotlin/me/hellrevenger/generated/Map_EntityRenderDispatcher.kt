package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityRenderDispatcher

var EntityRenderDispatcher.camera by alias(EntityRenderDispatcher::field_4686)
val EntityRenderDispatcher.gameOptions by alias(EntityRenderDispatcher::field_4692)
val EntityRenderDispatcher.textureManager by alias(EntityRenderDispatcher::field_4685)
var EntityRenderDispatcher.targetedEntity by alias(EntityRenderDispatcher::field_4678)
fun EntityRenderDispatcher.setRenderShadows(arg0: Boolean) = this.method_3948(arg0)
fun <E>EntityRenderDispatcher.getLight(arg0: E, arg1: Float) where E: Entity = this.method_23839<E>(arg0, arg1)
fun EntityRenderDispatcher.getHeldItemRenderer() = this.method_43336()
fun EntityRenderDispatcher.getSquaredDistanceToCamera(arg0: Entity) = this.method_23168(arg0)
fun EntityRenderDispatcher.setRotation(arg0: Quaternionf) = this.method_24196(arg0)
fun <E>EntityRenderDispatcher.shouldRender(arg0: E, arg1: Frustum, arg2: Double, arg3: Double, arg4: Double) where E: Entity = this.method_3950<E>(arg0, arg1, arg2, arg3, arg4)
fun EntityRenderDispatcher.configure(arg0: world_World, arg1: Camera, arg2: Entity) = this.method_3941(arg0, arg1, arg2)
fun EntityRenderDispatcher.shouldRenderHitboxes() = this.method_3958()
fun <E>EntityRenderDispatcher.render(arg0: E, arg1: Double, arg2: Double, arg3: Double, arg4: Float, arg5: Float, arg6: MatrixStack, arg7: VertexConsumerProvider, arg8: Int) where E: Entity = this.method_3954<E>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
fun EntityRenderDispatcher.setRenderHitboxes(arg0: Boolean) = this.method_3955(arg0)
fun <T>EntityRenderDispatcher.getRenderer(arg0: T) where T: Entity = this.method_3953<T>(arg0)
fun EntityRenderDispatcher.getSquaredDistanceToCamera(arg0: Double, arg1: Double, arg2: Double) = this.method_3959(arg0, arg1, arg2)
fun EntityRenderDispatcher.setWorld(arg0: world_World) = this.method_3944(arg0)
fun EntityRenderDispatcher.getRotation() = this.method_24197()
