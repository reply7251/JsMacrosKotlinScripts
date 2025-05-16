package me.hellrevenger.generated.Map_BeehiveBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BeehiveBlockEntityKt {
    /**
     * field_31313
     */
    val MIN_OCCUPATION_TICKS_WITHOUT_NECTAR by aliasStatic(BeehiveBlockEntity::field_31313)
    /**
     * field_31312
     */
    val MAX_BEE_COUNT by aliasStatic(BeehiveBlockEntity::field_31312)
    /**
     * method_31656
     */
    fun serverTick(world: world_World?, pos: BlockPos?, state: BlockState?, blockEntity: BeehiveBlockEntity?) = BeehiveBlockEntity.method_31656(world, pos, state, blockEntity)
    /**
     * method_23902
     */
    fun getHoneyLevel(state: BlockState?) = BeehiveBlockEntity.method_23902(state)
}