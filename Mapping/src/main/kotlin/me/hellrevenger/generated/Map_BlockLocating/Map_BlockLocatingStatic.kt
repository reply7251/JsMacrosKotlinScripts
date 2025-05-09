package me.hellrevenger.generated.Map_BlockLocating
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockLocatingKt {
    /**
     * method_34851
     */
    fun findColumnEnd(world: BlockView, pos: BlockPos, intermediateBlock: Block, direction: Direction, endBlock: Block) = BlockLocating.method_34851(world, pos, intermediateBlock, direction, endBlock)
    /**
     * method_30574
     */
    fun getLargestRectangle(center: BlockPos, primaryAxis: net.minecraft.class_2350.class_2351, primaryMaxBlocks: Int, secondaryAxis: net.minecraft.class_2350.class_2351, secondaryMaxBlocks: Int, predicate: Predicate<BlockPos>) = BlockLocating.method_30574(center, primaryAxis, primaryMaxBlocks, secondaryAxis, secondaryMaxBlocks, predicate)
}