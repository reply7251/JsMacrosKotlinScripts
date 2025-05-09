package me.hellrevenger.generated.Map_AxolotlEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object AxolotlEntityKt {
    /**
     * field_30390
     */
    val BLUE_BABY_CHANCE by aliasStatic(AxolotlEntity::field_30390)
    /**
     * field_30388
     */
    val PLAY_DEAD_TICKS by aliasStatic(AxolotlEntity::field_30388)
    /**
     * field_30391
     */
    val VARIANT_KEY by aliasStatic(AxolotlEntity::field_30391)
    /**
     * field_30389
     */
    val BUFF_RANGE by aliasStatic(AxolotlEntity::field_30389)
    /**
     * method_38987
     */
    fun canSpawn(type: EntityType<out LivingEntity>, world: ServerWorldAccess, reason: SpawnReason, pos: BlockPos, random: Random) = AxolotlEntity.method_38987(type, world, reason, pos, random)
    /**
     * method_33227
     */
    fun createAxolotlAttributes() = AxolotlEntity.method_33227()
    /**
     * method_35175
     */
    fun appreciatePlayer(world: ServerWorld, axolotl: AxolotlEntity, target: LivingEntity) = AxolotlEntity.method_35175(world, axolotl, target)
}