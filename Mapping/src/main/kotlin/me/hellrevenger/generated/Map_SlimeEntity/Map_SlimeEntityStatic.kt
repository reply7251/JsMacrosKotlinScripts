package me.hellrevenger.generated.Map_SlimeEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SlimeEntityKt {
    /**
     * field_30496
     */
    val MIN_SIZE by aliasStatic(SlimeEntity::field_30496)
    /**
     * field_30497
     */
    val MAX_SIZE by aliasStatic(SlimeEntity::field_30497)
    /**
     * method_20685
     */
    fun canSpawn(type: EntityType<SlimeEntity>, world: WorldAccess, spawnReason: SpawnReason, pos: BlockPos, random: Random) = SlimeEntity.method_20685(type, world, spawnReason, pos, random)
}