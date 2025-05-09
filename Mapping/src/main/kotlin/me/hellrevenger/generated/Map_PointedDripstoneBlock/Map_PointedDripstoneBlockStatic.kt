package me.hellrevenger.generated.Map_PointedDripstoneBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PointedDripstoneBlockKt {
    /**
     * field_28050
     */
    val VERTICAL_DIRECTION by aliasStatic(PointedDripstoneBlock::field_28050)
    /**
     * field_28052
     */
    val WATERLOGGED by aliasStatic(PointedDripstoneBlock::field_28052)
    /**
     * field_28051
     */
    val THICKNESS by aliasStatic(PointedDripstoneBlock::field_28051)
    /**
     * method_36375
     */
    fun tryGrow(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) = PointedDripstoneBlock.method_36375(state, world, pos, random)
    /**
     * method_32899
     */
    fun createParticle(world: world_World, pos: BlockPos, state: BlockState) = PointedDripstoneBlock.method_32899(world, pos, state)
    /**
     * method_32772
     */
    fun dripTick(state: BlockState, world: ServerWorld, pos: BlockPos, dripChance: Float) = PointedDripstoneBlock.method_32772(state, world, pos, dripChance)
    /**
     * method_32775
     */
    fun getDripFluid(world: ServerWorld, pos: BlockPos) = PointedDripstoneBlock.method_32775(world, pos)
    /**
     * method_32783
     */
    fun canDrip(state: BlockState) = PointedDripstoneBlock.method_32783(state)
    /**
     * method_32767
     */
    fun getDripPos(world: world_World, pos: BlockPos) = PointedDripstoneBlock.method_32767(world, pos)
}