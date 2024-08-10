package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DebugRenderer

val DebugRenderer.neighborUpdateDebugRenderer by alias(DebugRenderer::field_4535)
val DebugRenderer.gameEventDebugRenderer by alias(DebugRenderer::field_28254)
val DebugRenderer.worldGenAttemptDebugRenderer by alias(DebugRenderer::field_4537)
val DebugRenderer.breezeDebugRenderer by alias(DebugRenderer::field_47474)
val DebugRenderer.chunkLoadingDebugRenderer by alias(DebugRenderer::field_4533)
val DebugRenderer.villageDebugRenderer by alias(DebugRenderer::field_18777)
val DebugRenderer.raidCenterDebugRenderer by alias(DebugRenderer::field_19325)
val DebugRenderer.structureDebugRenderer by alias(DebugRenderer::field_4539)
val DebugRenderer.villageSectionsDebugRenderer by alias(DebugRenderer::field_22408)
val DebugRenderer.pathfindingDebugRenderer by alias(DebugRenderer::field_4523)
val DebugRenderer.gameTestDebugRenderer by alias(DebugRenderer::field_20519)
val DebugRenderer.blockOutlineDebugRenderer by alias(DebugRenderer::field_4517)
val DebugRenderer.skyLightDebugRenderer by alias(DebugRenderer::field_4536)
val DebugRenderer.heightmapDebugRenderer by alias(DebugRenderer::field_4538)
val DebugRenderer.goalSelectorDebugRenderer by alias(DebugRenderer::field_18778)
val DebugRenderer.chunkBorderDebugRenderer by alias(DebugRenderer::field_4532)
val DebugRenderer.collisionDebugRenderer by alias(DebugRenderer::field_4534)
val DebugRenderer.supportingBlockDebugRenderer by alias(DebugRenderer::field_44827)
val DebugRenderer.waterDebugRenderer by alias(DebugRenderer::field_4528)
val DebugRenderer.lightDebugRenderer by alias(DebugRenderer::field_44674)
val DebugRenderer.beeDebugRenderer by alias(DebugRenderer::field_21547)
fun KClass<DebugRenderer>.drawBox(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: BlockPos, arg3: Float, arg4: Float, arg5: Float, arg6: Float, arg7: Float) = DebugRenderer.method_23103(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun DebugRenderer.render(arg0: MatrixStack, arg1: net.minecraft.class_4597.class_4598, arg2: Double, arg3: Double, arg4: Double) = this.method_23099(arg0, arg1, arg2, arg3, arg4)
fun KClass<DebugRenderer>.drawString(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: String, arg3: Double, arg4: Double, arg5: Double, arg6: Int) = DebugRenderer.method_23105(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<DebugRenderer>.drawBox(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Box, arg3: Float, arg4: Float, arg5: Float, arg6: Float) = DebugRenderer.method_23102(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun DebugRenderer.toggleShowChunkBorder() = this.method_3713()
fun KClass<DebugRenderer>.getTargetedEntity(arg0: Entity, arg1: Int) = DebugRenderer.method_23101(arg0, arg1)
fun KClass<DebugRenderer>.drawString(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: String, arg3: Double, arg4: Double, arg5: Double, arg6: Int, arg7: Float, arg8: Boolean, arg9: Float, arg10: Boolean) = DebugRenderer.method_23107(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
fun KClass<DebugRenderer>.drawBox(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Double, arg8: Float, arg9: Float, arg10: Float, arg11: Float) = DebugRenderer.method_23098(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
fun KClass<DebugRenderer>.drawString(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: String, arg3: Double, arg4: Double, arg5: Double, arg6: Int, arg7: Float) = DebugRenderer.method_23106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun KClass<DebugRenderer>.drawString(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: String, arg3: Int, arg4: Int, arg5: Int, arg6: Int) = DebugRenderer.method_23108(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun DebugRenderer.reset() = this.method_20413()
fun KClass<DebugRenderer>.drawBox(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: BlockPos, arg3: BlockPos, arg4: Float, arg5: Float, arg6: Float, arg7: Float) = DebugRenderer.method_23104(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun KClass<DebugRenderer>.drawBlockBox(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: BlockPos, arg3: Float, arg4: Float, arg5: Float, arg6: Float) = DebugRenderer.method_54808(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
