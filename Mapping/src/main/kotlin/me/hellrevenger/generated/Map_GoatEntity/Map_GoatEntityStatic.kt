package me.hellrevenger.generated.Map_GoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object GoatEntityKt {
    /**
     * field_30402
     */
    val FALL_DAMAGE_SUBTRACTOR by aliasStatic(GoatEntity::field_30402)
    /**
     * field_30403
     */
    val SCREAMING_CHANCE by aliasStatic(GoatEntity::field_30403)
    /**
     * field_30399
     */
    val LONG_JUMPING_DIMENSIONS by aliasStatic(GoatEntity::field_30399)
    /**
     * method_38067
     */
    fun canSpawn(entityType: EntityType<out AnimalEntity>?, world: WorldAccess?, spawnReason: SpawnReason?, pos: BlockPos?, random: Random?) = GoatEntity.method_38067(entityType, world, spawnReason, pos, random)
    /**
     * method_35179
     */
    fun createGoatAttributes() = GoatEntity.method_35179()
}