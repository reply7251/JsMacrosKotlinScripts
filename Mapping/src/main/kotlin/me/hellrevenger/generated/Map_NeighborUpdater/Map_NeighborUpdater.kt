package me.hellrevenger.generated.Map_NeighborUpdater
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41705
 */
fun NeighborUpdater.updateNeighbors(arg0: BlockPos, arg1: Block, arg2: Direction) = this.method_41705(arg0, arg1, arg2)
/**
 * method_41708
 */
fun KClass<NeighborUpdater>.tryNeighborUpdate(arg0: world_World, arg1: BlockState, arg2: BlockPos, arg3: Block, arg4: BlockPos, arg5: Boolean) = NeighborUpdater.method_41708(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_41703
 */
fun NeighborUpdater.updateNeighbor(arg0: BlockState, arg1: BlockPos, arg2: Block, arg3: BlockPos, arg4: Boolean) = this.method_41703(arg0, arg1, arg2, arg3, arg4)
/**
 * method_42393
 */
fun KClass<NeighborUpdater>.replaceWithStateForNeighborUpdate(arg0: WorldAccess, arg1: Direction, arg2: BlockState, arg3: BlockPos, arg4: BlockPos, arg5: Int, arg6: Int) = NeighborUpdater.method_42393(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_42392
 */
fun NeighborUpdater.replaceWithStateForNeighborUpdate(arg0: Direction, arg1: BlockState, arg2: BlockPos, arg3: BlockPos, arg4: Int, arg5: Int) = this.method_42392(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_41704
 */
fun NeighborUpdater.updateNeighbor(arg0: BlockPos, arg1: Block, arg2: BlockPos) = this.method_41704(arg0, arg1, arg2)
