package me.hellrevenger.generated.Map_FrogEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FrogEntityKt {
    /**
     * field_38720
     */
    val VARIANT_KEY by aliasStatic(FrogEntity::field_38720)
    /**
     * method_43398
     */
    fun canSpawn(type: EntityType<out AnimalEntity>?, world: WorldAccess?, reason: SpawnReason?, pos: BlockPos?, random: Random?) = FrogEntity.method_43398(type, world, reason, pos, random)
    /**
     * method_41355
     */
    fun createFrogAttributes() = FrogEntity.method_41355()
    /**
     * method_41358
     */
    fun isValidFrogFood(entity: LivingEntity?) = FrogEntity.method_41358(entity)
}