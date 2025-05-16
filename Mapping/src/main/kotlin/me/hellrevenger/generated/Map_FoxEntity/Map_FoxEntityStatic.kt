package me.hellrevenger.generated.Map_FoxEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FoxEntityKt {
    /**
     * field_30328
     */
    val CROUCHING_FLAG by aliasStatic(FoxEntity::field_30328)
    /**
     * field_30330
     */
    val CHASING_FLAG by aliasStatic(FoxEntity::field_30330)
    /**
     * field_30329
     */
    val ROLLING_HEAD_FLAG by aliasStatic(FoxEntity::field_30329)
    /**
     * method_26885
     */
    fun createFoxAttributes() = FoxEntity.method_26885()
    /**
     * method_39449
     */
    fun canSpawn(type: EntityType<FoxEntity>?, world: WorldAccess?, spawnReason: SpawnReason?, pos: BlockPos?, random: Random?) = FoxEntity.method_39449(type, world, spawnReason, pos, random)
    /**
     * method_18257
     */
    fun canJumpChase(fox: FoxEntity?, chasedEntity: LivingEntity?) = FoxEntity.method_18257(fox, chasedEntity)
}