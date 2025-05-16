package me.hellrevenger.generated.Map_TropicalFishEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TropicalFishEntityKt {
    /**
     * field_30378
     */
    val BUCKET_VARIANT_TAG_KEY by aliasStatic(TropicalFishEntity::field_30378)
    /**
     * field_41573
     */
    val COMMON_VARIANTS by aliasStatic(TropicalFishEntity::field_41573)
    /**
     * method_6651
     */
    fun getPatternDyeColor(variant: Int) = TropicalFishEntity.method_6651(variant)
    /**
     * method_6649
     */
    fun getToolTipForVariant(variant: Int) = TropicalFishEntity.method_6649(variant)
    /**
     * method_6652
     */
    fun getBaseDyeColor(variant: Int) = TropicalFishEntity.method_6652(variant)
    /**
     * method_38985
     */
    fun canTropicalFishSpawn(type: EntityType<TropicalFishEntity>?, world: WorldAccess?, reason: SpawnReason?, pos: BlockPos?, random: Random?) = TropicalFishEntity.method_38985(type, world, reason, pos, random)
    /**
     * method_47864
     */
    fun getVariety(variant: Int) = TropicalFishEntity.method_47864(variant)
}