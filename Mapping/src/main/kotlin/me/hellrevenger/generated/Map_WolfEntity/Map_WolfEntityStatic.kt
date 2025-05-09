package me.hellrevenger.generated.Map_WolfEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object WolfEntityKt {
    /**
     * field_18004
     */
    val FOLLOW_TAMED_PREDICATE by aliasStatic(WolfEntity::field_18004)
    /**
     * method_39450
     */
    fun canSpawn(type: EntityType<WolfEntity>, world: WorldAccess, spawnReason: SpawnReason, pos: BlockPos, random: Random) = WolfEntity.method_39450(type, world, spawnReason, pos, random)
    /**
     * method_26897
     */
    fun createWolfAttributes() = WolfEntity.method_26897()
}