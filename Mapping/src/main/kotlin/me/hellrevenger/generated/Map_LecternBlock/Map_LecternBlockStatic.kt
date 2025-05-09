package me.hellrevenger.generated.Map_LecternBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LecternBlockKt {
    /**
     * field_17366
     */
    val HAS_BOOK by aliasStatic(LecternBlock::field_17366)
    /**
     * field_17371
     */
    val EAST_SHAPE by aliasStatic(LecternBlock::field_17371)
    /**
     * field_17372
     */
    val SOUTH_SHAPE by aliasStatic(LecternBlock::field_17372)
    /**
     * field_17370
     */
    val NORTH_SHAPE by aliasStatic(LecternBlock::field_17370)
    /**
     * field_16406
     */
    val BOTTOM_SHAPE by aliasStatic(LecternBlock::field_16406)
    /**
     * field_17365
     */
    val POWERED by aliasStatic(LecternBlock::field_17365)
    /**
     * field_16405
     */
    val MIDDLE_SHAPE by aliasStatic(LecternBlock::field_16405)
    /**
     * field_16403
     */
    val BASE_SHAPE by aliasStatic(LecternBlock::field_16403)
    /**
     * field_16404
     */
    val FACING by aliasStatic(LecternBlock::field_16404)
    /**
     * field_17368
     */
    val COLLISION_SHAPE by aliasStatic(LecternBlock::field_17368)
    /**
     * field_17369
     */
    val WEST_SHAPE by aliasStatic(LecternBlock::field_17369)
    /**
     * field_17367
     */
    val COLLISION_SHAPE_TOP by aliasStatic(LecternBlock::field_17367)
    /**
     * method_17471
     */
    fun setPowered(world: world_World, pos: BlockPos, state: BlockState) = LecternBlock.method_17471(world, pos, state)
    /**
     * method_17473
     */
    fun setHasBook(user: Entity, world: world_World, pos: BlockPos, state: BlockState, hasBook: Boolean) = LecternBlock.method_17473(user, world, pos, state, hasBook)
    /**
     * method_17472
     */
    fun putBookIfAbsent(user: LivingEntity, world: world_World, pos: BlockPos, state: BlockState, stack: ItemStack) = LecternBlock.method_17472(user, world, pos, state, stack)
}