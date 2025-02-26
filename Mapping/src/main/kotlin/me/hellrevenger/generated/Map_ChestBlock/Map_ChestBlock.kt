package me.hellrevenger.generated.Map_ChestBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_10772
 */
val KClass<ChestBlock>.WATERLOGGED by aliasStatic(ChestBlock::field_10772)
/**
 * field_10770
 */
val KClass<ChestBlock>.CHEST_TYPE by aliasStatic(ChestBlock::field_10770)
/**
 * field_10768
 */
val KClass<ChestBlock>.FACING by aliasStatic(ChestBlock::field_10768)
/**
 * method_31641
 */
fun ChestBlock.getExpectedEntityType() = this.method_31641()
/**
 * method_17458
 */
fun KClass<ChestBlock>.getInventory(arg0: ChestBlock, arg1: BlockState, arg2: world_World, arg3: BlockPos, arg4: Boolean) = ChestBlock.method_17458(arg0, arg1, arg2, arg3, arg4)
/**
 * method_9758
 */
fun KClass<ChestBlock>.getFacing(arg0: BlockState) = ChestBlock.method_9758(arg0)
/**
 * method_24166
 */
fun KClass<ChestBlock>.getAnimationProgressRetriever(arg0: LidOpenable) = ChestBlock.method_24166(arg0)
/**
 * method_24169
 */
fun KClass<ChestBlock>.getDoubleBlockType(arg0: BlockState) = ChestBlock.method_24169(arg0)
/**
 * method_9756
 */
fun KClass<ChestBlock>.isChestBlocked(arg0: WorldAccess, arg1: BlockPos) = ChestBlock.method_9756(arg0, arg1)
