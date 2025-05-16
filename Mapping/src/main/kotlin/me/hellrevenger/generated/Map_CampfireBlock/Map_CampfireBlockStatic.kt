package me.hellrevenger.generated.Map_CampfireBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CampfireBlockKt {
    /**
     * field_17564
     */
    val FACING by aliasStatic(CampfireBlock::field_17564)
    /**
     * field_17352
     */
    val LIT by aliasStatic(CampfireBlock::field_17352)
    /**
     * field_17353
     */
    val SIGNAL_FIRE by aliasStatic(CampfireBlock::field_17353)
    /**
     * field_17354
     */
    val WATERLOGGED by aliasStatic(CampfireBlock::field_17354)
    /**
     * method_23895
     */
    fun isLitCampfireInRange(world: world_World?, pos: BlockPos?) = CampfireBlock.method_23895(world, pos)
    /**
     * method_30035
     */
    fun canBeLit(state: BlockState?) = CampfireBlock.method_30035(state)
    /**
     * method_29288
     */
    fun extinguish(entity: Entity?, world: WorldAccess?, pos: BlockPos?, state: BlockState?) = CampfireBlock.method_29288(entity, world, pos, state)
    /**
     * method_17455
     */
    fun spawnSmokeParticle(world: world_World?, pos: BlockPos?, isSignal: Boolean, lotsOfSmoke: Boolean) = CampfireBlock.method_17455(world, pos, isSignal, lotsOfSmoke)
    /**
     * method_23896
     */
    fun isLitCampfire(state: BlockState?) = CampfireBlock.method_23896(state)
}