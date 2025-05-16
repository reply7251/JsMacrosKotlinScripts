package me.hellrevenger.generated.Map_OcelotEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object OcelotEntityKt {
    /**
     * field_30341
     */
    val NORMAL_SPEED by aliasStatic(OcelotEntity::field_30341)
    /**
     * field_30342
     */
    val SPRINTING_SPEED by aliasStatic(OcelotEntity::field_30342)
    /**
     * field_30340
     */
    val CROUCHING_SPEED by aliasStatic(OcelotEntity::field_30340)
    /**
     * method_20666
     */
    fun canSpawn(type: EntityType<OcelotEntity>?, world: WorldAccess?, spawnReason: SpawnReason?, pos: BlockPos?, random: Random?) = OcelotEntity.method_20666(type, world, spawnReason, pos, random)
    /**
     * method_26887
     */
    fun createOcelotAttributes() = OcelotEntity.method_26887()
}