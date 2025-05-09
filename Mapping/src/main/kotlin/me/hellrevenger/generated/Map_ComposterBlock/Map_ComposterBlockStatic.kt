package me.hellrevenger.generated.Map_ComposterBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ComposterBlockKt {
    /**
     * field_31073
     */
    val MAX_LEVEL by aliasStatic(ComposterBlock::field_31073)
    /**
     * field_31072
     */
    val MIN_LEVEL by aliasStatic(ComposterBlock::field_31072)
    /**
     * field_31071
     */
    val NUM_LEVELS by aliasStatic(ComposterBlock::field_31071)
    /**
     * field_17566
     */
    val ITEM_TO_LEVEL_INCREASE_CHANCE by aliasStatic(ComposterBlock::field_17566)
    /**
     * field_17565
     */
    val LEVEL by aliasStatic(ComposterBlock::field_17565)
    /**
     * method_18027
     */
    fun playEffects(world: world_World, pos: BlockPos, fill: Boolean) = ComposterBlock.method_18027(world, pos, fill)
    /**
     * method_26373
     */
    fun compost(user: Entity, state: BlockState, world: ServerWorld, stack: ItemStack, pos: BlockPos) = ComposterBlock.method_26373(user, state, world, stack, pos)
    /**
     * method_26374
     */
    fun emptyFullComposter(user: Entity, state: BlockState, world: world_World, pos: BlockPos) = ComposterBlock.method_26374(user, state, world, pos)
    /**
     * method_17758
     */
    fun registerDefaultCompostableItems() = ComposterBlock.method_17758()
}