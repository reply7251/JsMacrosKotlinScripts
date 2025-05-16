package me.hellrevenger.generated.Map_ChestBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChestBlockKt {
    /**
     * field_10768
     */
    val FACING by aliasStatic(ChestBlock::field_10768)
    /**
     * field_10772
     */
    val WATERLOGGED by aliasStatic(ChestBlock::field_10772)
    /**
     * field_10770
     */
    val CHEST_TYPE by aliasStatic(ChestBlock::field_10770)
    /**
     * method_17458
     */
    fun getInventory(block: ChestBlock?, state: BlockState?, world: world_World?, pos: BlockPos?, ignoreBlocked: Boolean) = ChestBlock.method_17458(block, state, world, pos, ignoreBlocked)
    /**
     * method_9758
     */
    fun getFacing(state: BlockState?) = ChestBlock.method_9758(state)
    /**
     * method_24166
     */
    fun getAnimationProgressRetriever(progress: LidOpenable?) = ChestBlock.method_24166(progress)
    /**
     * method_24169
     */
    fun getDoubleBlockType(state: BlockState?) = ChestBlock.method_24169(state)
    /**
     * method_9756
     */
    fun isChestBlocked(world: WorldAccess?, pos: BlockPos?) = ChestBlock.method_9756(world, pos)
}