package me.hellrevenger.generated.Map_MobEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MobEntityKt {
    /**
     * field_30084
     */
    val BASE_ENCHANTED_ARMOR_CHANCE by aliasStatic(MobEntity::field_30084)
    /**
     * field_30085
     */
    val BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE by aliasStatic(MobEntity::field_30085)
    /**
     * field_30083
     */
    val DEFAULT_CAN_PICKUP_LOOT_CHANCE by aliasStatic(MobEntity::field_30083)
    /**
     * field_30091
     */
    val BASE_SPAWN_EQUIPMENT_CHANCE by aliasStatic(MobEntity::field_30091)
    /**
     * field_34043
     */
    val DEFAULT_DROP_CHANCE by aliasStatic(MobEntity::field_34043)
    /**
     * method_5948
     */
    fun getEquipmentForSlot(equipmentSlot: EquipmentSlot, equipmentLevel: Int) = MobEntity.method_5948(equipmentSlot, equipmentLevel)
    /**
     * method_20636
     */
    fun canMobSpawn(type: EntityType<out MobEntity>, world: WorldAccess, spawnReason: SpawnReason, pos: BlockPos, random: Random) = MobEntity.method_20636(type, world, spawnReason, pos, random)
    /**
     * method_26828
     */
    fun createMobAttributes() = MobEntity.method_26828()
}