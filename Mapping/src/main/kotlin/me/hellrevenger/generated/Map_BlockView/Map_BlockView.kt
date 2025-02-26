package me.hellrevenger.generated.Map_BlockView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8321
 */
fun BlockView.getBlockEntity(arg0: BlockPos) = this.method_8321(arg0)
/**
 * method_29546
 */
fun BlockView.getStatesInBox(arg0: Box) = this.method_29546(arg0)
/**
 * method_30346
 */
fun BlockView.getDismountHeight(arg0: VoxelShape, arg1: Supplier<VoxelShape>) = this.method_30346(arg0, arg1)
/**
 * method_32880
 */
fun BlockView.raycast(arg0: BlockStateRaycastContext) = this.method_32880(arg0)
/**
 * method_8320
 */
fun BlockView.getBlockState(arg0: BlockPos) = this.method_8320(arg0)
/**
 * method_30347
 */
fun BlockView.getDismountHeight(arg0: BlockPos) = this.method_30347(arg0)
/**
 * method_8316
 */
fun BlockView.getFluidState(arg0: BlockPos) = this.method_8316(arg0)
/**
 * method_35230
 */
fun <T>BlockView.getBlockEntity(arg0: BlockPos, arg1: BlockEntityType<T>) where T: BlockEntity = this.method_35230<T>(arg0, arg1)
/**
 * method_8315
 */
fun BlockView.getMaxLightLevel() = this.method_8315()
/**
 * method_8317
 */
fun BlockView.getLuminance(arg0: BlockPos) = this.method_8317(arg0)
/**
 * method_17745
 */
fun BlockView.raycastBlock(arg0: Vec3d, arg1: Vec3d, arg2: BlockPos, arg3: VoxelShape, arg4: BlockState) = this.method_17745(arg0, arg1, arg2, arg3, arg4)
/**
 * method_17744
 */
fun <T, C>KClass<BlockView>.raycast(arg0: Vec3d, arg1: Vec3d, arg2: C, arg3: BiFunction<C, BlockPos, T>, arg4: function_Function<C, T>) = BlockView.method_17744<T, C>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_17742
 */
fun BlockView.raycast(arg0: RaycastContext) = this.method_17742(arg0)
