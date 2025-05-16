package me.hellrevenger.generated.Map_NeighborUpdater
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NeighborUpdaterKt {
    /**
     * method_41708
     */
    fun tryNeighborUpdate(world: world_World?, state: BlockState?, pos: BlockPos?, sourceBlock: Block?, orientation: WireOrientation?, notify: Boolean) = NeighborUpdater.method_41708(world, state, pos, sourceBlock, orientation, notify)
    /**
     * method_42393
     */
    fun replaceWithStateForNeighborUpdate(world: WorldAccess?, direction: Direction?, pos: BlockPos?, neighborPos: BlockPos?, neighborState: BlockState?, flags: Int, maxUpdateDepth: Int) = NeighborUpdater.method_42393(world, direction, pos, neighborPos, neighborState, flags, maxUpdateDepth)
}