package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockModelRenderer

fun BlockModelRenderer.renderFlat(arg0: BlockRenderView, arg1: BakedModel, arg2: BlockState, arg3: BlockPos, arg4: MatrixStack, arg5: VertexConsumer, arg6: Boolean, arg7: Random, arg8: Long, arg9: Int) = this.method_3373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun BlockModelRenderer.render(arg0: BlockRenderView, arg1: BakedModel, arg2: BlockState, arg3: BlockPos, arg4: MatrixStack, arg5: VertexConsumer, arg6: Boolean, arg7: Random, arg8: Long, arg9: Int) = this.method_3374(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun BlockModelRenderer.renderSmooth(arg0: BlockRenderView, arg1: BakedModel, arg2: BlockState, arg3: BlockPos, arg4: MatrixStack, arg5: VertexConsumer, arg6: Boolean, arg7: Random, arg8: Long, arg9: Int) = this.method_3361(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun BlockModelRenderer.render(arg0: net.minecraft.class_4587.class_4665, arg1: VertexConsumer, arg2: BlockState, arg3: BakedModel, arg4: Float, arg5: Float, arg6: Float, arg7: Int, arg8: Int) = this.method_3367(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
fun KClass<BlockModelRenderer>.enableBrightnessCache() = BlockModelRenderer.method_20544()
fun KClass<BlockModelRenderer>.disableBrightnessCache() = BlockModelRenderer.method_20545()
fun BlockModelRenderer.getQuadDimensions(arg0: BlockRenderView, arg1: BlockState, arg2: BlockPos, arg3: IntArray, arg4: Direction, arg5: FloatArray, arg6: BitSet) = this.method_3364(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
