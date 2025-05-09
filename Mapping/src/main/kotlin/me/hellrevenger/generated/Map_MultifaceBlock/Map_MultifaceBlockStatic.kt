package me.hellrevenger.generated.Map_MultifaceBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MultifaceBlockKt {
    /**
     * field_55497
     */
    val WATERLOGGED by aliasStatic(MultifaceBlock::field_55497)
    /**
     * method_33358
     */
    fun canGrowOn(world: BlockView, direction: Direction, pos: BlockPos, state: BlockState) = MultifaceBlock.method_33358(world, direction, pos, state)
    /**
     * method_33374
     */
    fun getProperty(direction: Direction) = MultifaceBlock.method_33374(direction)
    /**
     * method_41437
     */
    fun flagToDirections(flag: Byte) = MultifaceBlock.method_41437(flag)
    /**
     * method_33366
     */
    fun hasDirection(state: BlockState, direction: Direction) = MultifaceBlock.method_33366(state, direction)
    /**
     * method_41439
     */
    fun directionsToFlag(directions: Collection<Direction>) = MultifaceBlock.method_41439(directions)
    /**
     * method_41440
     */
    fun collectDirections(state: BlockState) = MultifaceBlock.method_41440(state)
    /**
     * method_65162
     */
    fun canGrowOn(world: BlockView, pos: BlockPos, direction: Direction) = MultifaceBlock.method_65162(world, pos, direction)
}