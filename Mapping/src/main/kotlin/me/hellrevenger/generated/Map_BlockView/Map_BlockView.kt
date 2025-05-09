package me.hellrevenger.generated.Map_BlockView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8321
 */
fun BlockView.getBlockEntity(pos: BlockPos) = this.method_8321(pos)
/**
 * method_29546
 */
fun BlockView.getStatesInBox(box: Box) = this.method_29546(box)
/**
 * method_30346
 */
fun BlockView.getDismountHeight(blockCollisionShape: VoxelShape, belowBlockCollisionShapeGetter: Supplier<VoxelShape>) = this.method_30346(blockCollisionShape, belowBlockCollisionShapeGetter)
/**
 * method_32880
 */
fun BlockView.raycast(context: BlockStateRaycastContext) = this.method_32880(context)
/**
 * method_8320
 */
fun BlockView.getBlockState(pos: BlockPos) = this.method_8320(pos)
/**
 * method_8316
 */
fun BlockView.getFluidState(pos: BlockPos) = this.method_8316(pos)
/**
 * method_8317
 */
fun BlockView.getLuminance(pos: BlockPos) = this.method_8317(pos)
/**
 * method_17745
 */
fun BlockView.raycastBlock(start: Vec3d, end: Vec3d, pos: BlockPos, shape: VoxelShape, state: BlockState) = this.method_17745(start, end, pos, shape, state)
