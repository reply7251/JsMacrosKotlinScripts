package me.hellrevenger.generated.Map_BeeEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BeeEntityKt {
    /**
     * field_30279
     */
    val FLOWER_POS_KEY by aliasStatic(BeeEntity::field_30279)
    /**
     * field_30272
     */
    val CROPS_GROWN_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30272)
    /**
     * field_30280
     */
    val HIVE_POS_KEY by aliasStatic(BeeEntity::field_30280)
    /**
     * field_30276
     */
    val TICKS_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30276)
    /**
     * field_30273
     */
    val CANNOT_ENTER_HIVE_TICKS_KEY by aliasStatic(BeeEntity::field_30273)
    /**
     * field_30277
     */
    val HAS_STUNG_KEY by aliasStatic(BeeEntity::field_30277)
    /**
     * field_30278
     */
    val HAS_NECTAR_KEY by aliasStatic(BeeEntity::field_30278)
    /**
     * method_65348
     */
    fun isAttractive(state: BlockState) = BeeEntity.method_65348(state)
    /**
     * method_63007
     */
    fun isNightOrRaining(world: world_World) = BeeEntity.method_63007(world)
    /**
     * method_26880
     */
    fun createBeeAttributes() = BeeEntity.method_26880()
}