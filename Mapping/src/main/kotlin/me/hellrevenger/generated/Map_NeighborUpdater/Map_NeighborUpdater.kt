package me.hellrevenger.generated.Map_NeighborUpdater
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41705
 */
fun NeighborUpdater.updateNeighbors(pos: BlockPos, sourceBlock: Block, except: Direction, orientation: WireOrientation) = this.method_41705(pos, sourceBlock, except, orientation)
/**
 * method_41703
 */
fun NeighborUpdater.updateNeighbor(state: BlockState, pos: BlockPos, sourceBlock: Block, orientation: WireOrientation, notify: Boolean) = this.method_41703(state, pos, sourceBlock, orientation, notify)
/**
 * method_42392
 */
fun NeighborUpdater.replaceWithStateForNeighborUpdate(direction: Direction, neighborState: BlockState, pos: BlockPos, neighborPos: BlockPos, flags: Int, maxUpdateDepth: Int) = this.method_42392(direction, neighborState, pos, neighborPos, flags, maxUpdateDepth)
