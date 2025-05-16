package me.hellrevenger.generated.Map_SculkSensorBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SculkSensorBlockKt {
    /**
     * field_28111
     */
    val SCULK_SENSOR_PHASE by aliasStatic(SculkSensorBlock::field_28111)
    /**
     * field_28112
     */
    val POWER by aliasStatic(SculkSensorBlock::field_28112)
    /**
     * field_28113
     */
    val WATERLOGGED by aliasStatic(SculkSensorBlock::field_28113)
    /**
     * method_32909
     */
    fun isInactive(state: BlockState?) = SculkSensorBlock.method_32909(state)
    /**
     * method_32903
     */
    fun setCooldown(world: world_World?, pos: BlockPos?, state: BlockState?) = SculkSensorBlock.method_32903(world, pos, state)
    /**
     * method_32908
     */
    fun getPhase(state: BlockState?) = SculkSensorBlock.method_32908(state)
    /**
     * method_49822
     */
    fun tryResonate(sourceEntity: Entity?, world: world_World?, pos: BlockPos?, frequency: Int) = SculkSensorBlock.method_49822(sourceEntity, world, pos, frequency)
}