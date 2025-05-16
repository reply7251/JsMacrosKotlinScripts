package me.hellrevenger.generated.Map_RespawnAnchorBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RespawnAnchorBlockKt {
    /**
     * field_31231
     */
    val NO_CHARGES by aliasStatic(RespawnAnchorBlock::field_31231)
    /**
     * field_31232
     */
    val MAX_CHARGES by aliasStatic(RespawnAnchorBlock::field_31232)
    /**
     * field_23153
     */
    val CHARGES by aliasStatic(RespawnAnchorBlock::field_23153)
    /**
     * method_26156
     */
    fun findRespawnPosition(entity: EntityType<*>?, world: CollisionView?, pos: BlockPos?) = RespawnAnchorBlock.method_26156(entity, world, pos)
    /**
     * method_26157
     */
    fun getLightLevel(state: BlockState?, maxLevel: Int) = RespawnAnchorBlock.method_26157(state, maxLevel)
    /**
     * method_27353
     */
    fun isNether(world: world_World?) = RespawnAnchorBlock.method_27353(world)
    /**
     * method_26382
     */
    fun charge(charger: Entity?, world: world_World?, pos: BlockPos?, state: BlockState?) = RespawnAnchorBlock.method_26382(charger, world, pos, state)
}