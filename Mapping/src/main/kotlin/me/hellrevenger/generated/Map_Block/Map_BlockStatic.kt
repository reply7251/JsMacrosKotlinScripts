package me.hellrevenger.generated.Map_Block
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockKt {
    /**
     * field_10651
     */
    val STATE_IDS by aliasStatic(Block::field_10651)
    /**
     * field_31030
     */
    val REDRAW_ON_MAIN_THREAD by aliasStatic(Block::field_31030)
    /**
     * field_31022
     */
    val NOTIFY_ALL_AND_REDRAW by aliasStatic(Block::field_31022)
    /**
     * field_31029
     */
    val NO_REDRAW by aliasStatic(Block::field_31029)
    /**
     * field_31033
     */
    val MOVED by aliasStatic(Block::field_31033)
    /**
     * field_31028
     */
    val NOTIFY_LISTENERS by aliasStatic(Block::field_31028)
    /**
     * field_31036
     */
    val NOTIFY_ALL by aliasStatic(Block::field_31036)
    /**
     * field_53822
     */
    val SKIP_REDSTONE_WIRE_STATE_REPLACEMENT by aliasStatic(Block::field_53822)
    /**
     * field_31032
     */
    val SKIP_DROPS by aliasStatic(Block::field_31032)
    /**
     * field_31027
     */
    val NOTIFY_NEIGHBORS by aliasStatic(Block::field_31027)
    /**
     * field_31031
     */
    val FORCE_STATE by aliasStatic(Block::field_31031)
    /**
     * method_9607
     */
    fun shouldDrawSide(state: BlockState?, otherState: BlockState?, side: Direction?) = Block.method_9607(state, otherState, side)
    /**
     * method_9503
     */
    fun getBlockFromItem(item: Item?) = Block.method_9503(item)
    /**
     * method_9610
     */
    fun dropStacks(state: BlockState?, world: WorldAccess?, pos: BlockPos?, blockEntity: BlockEntity?) = Block.method_9610(state, world, pos, blockEntity)
    /**
     * method_9562
     */
    fun getDroppedStacks(state: BlockState?, world: ServerWorld?, pos: BlockPos?, blockEntity: BlockEntity?) = Block.method_9562(state, world, pos, blockEntity)
    /**
     * method_9510
     */
    fun postProcessState(state: BlockState?, world: WorldAccess?, pos: BlockPos?) = Block.method_9510(state, world, pos)
    /**
     * method_9511
     */
    fun dropStacks(state: BlockState?, world: world_World?, pos: BlockPos?, blockEntity: BlockEntity?, entity: Entity?, tool: ItemStack?) = Block.method_9511(state, world, pos, blockEntity, entity, tool)
    /**
     * method_9611
     */
    fun replace(state: BlockState?, newState: BlockState?, world: WorldAccess?, pos: BlockPos?, flags: Int, maxUpdateDepth: Int) = Block.method_9611(state, newState, world, pos, flags, maxUpdateDepth)
    /**
     * method_9577
     */
    fun dropStack(world: world_World?, pos: BlockPos?, stack: ItemStack?) = Block.method_9577(world, pos, stack)
    /**
     * method_9541
     */
    fun createCuboidShape(minX: Double, arg1: Double, minY: Double, arg3: Double, minZ: Double, arg5: Double) = Block.method_9541(minX, arg1, minY, arg3, minZ, arg5)
    /**
     * method_9531
     */
    fun getStateFromRawId(stateId: Int) = Block.method_9531(stateId)
    /**
     * method_16361
     */
    fun hasTopRim(world: BlockView?, pos: BlockPos?) = Block.method_16361(world, pos)
    /**
     * method_30094
     */
    fun replace(state: BlockState?, newState: BlockState?, world: WorldAccess?, pos: BlockPos?, flags: Int) = Block.method_30094(state, newState, world, pos, flags)
    /**
     * method_9582
     */
    fun pushEntitiesUpBeforeBlockChange(from: BlockState?, to: BlockState?, world: WorldAccess?, pos: BlockPos?) = Block.method_9582(from, to, world, pos)
    /**
     * method_9501
     */
    fun isFaceFullSquare(shape: VoxelShape?, side: Direction?) = Block.method_9501(shape, side)
    /**
     * method_9609
     */
    fun getDroppedStacks(state: BlockState?, world: ServerWorld?, pos: BlockPos?, blockEntity: BlockEntity?, entity: Entity?, stack: ItemStack?) = Block.method_9609(state, world, pos, blockEntity, entity, stack)
    /**
     * method_9507
     */
    fun getRawIdFromState(state: BlockState?) = Block.method_9507(state)
    /**
     * method_9614
     */
    fun isShapeFullCube(shape: VoxelShape?) = Block.method_9614(shape)
    /**
     * method_9581
     */
    fun cannotConnect(state: BlockState?) = Block.method_9581(state)
    /**
     * method_20044
     */
    fun sideCoversSmallSquare(world: WorldView?, pos: BlockPos?, side: Direction?) = Block.method_20044(world, pos, side)
    /**
     * method_36992
     */
    fun dropStack(world: world_World?, pos: BlockPos?, direction: Direction?, stack: ItemStack?) = Block.method_36992(world, pos, direction, stack)
    /**
     * method_9497
     */
    fun dropStacks(state: BlockState?, world: world_World?, pos: BlockPos?) = Block.method_9497(state, world, pos)
}