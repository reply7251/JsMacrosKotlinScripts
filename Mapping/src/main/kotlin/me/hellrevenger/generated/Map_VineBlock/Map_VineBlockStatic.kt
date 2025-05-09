package me.hellrevenger.generated.Map_VineBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VineBlockKt {
    /**
     * field_11706
     */
    val NORTH by aliasStatic(VineBlock::field_11706)
    /**
     * field_11703
     */
    val UP by aliasStatic(VineBlock::field_11703)
    /**
     * field_11702
     */
    val EAST by aliasStatic(VineBlock::field_11702)
    /**
     * field_11699
     */
    val SOUTH by aliasStatic(VineBlock::field_11699)
    /**
     * field_11696
     */
    val WEST by aliasStatic(VineBlock::field_11696)
    /**
     * field_11697
     */
    val FACING_PROPERTIES by aliasStatic(VineBlock::field_11697)
    /**
     * method_10821
     */
    fun shouldConnectTo(world: BlockView, pos: BlockPos, direction: Direction) = VineBlock.method_10821(world, pos, direction)
    /**
     * method_10828
     */
    fun getFacingProperty(direction: Direction) = VineBlock.method_10828(direction)
}