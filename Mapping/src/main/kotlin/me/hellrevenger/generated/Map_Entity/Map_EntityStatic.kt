package me.hellrevenger.generated.Map_Entity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EntityKt {
    /**
     * field_29988
     */
    val DEFAULT_PORTAL_COOLDOWN by aliasStatic(Entity::field_29988)
    /**
     * field_29987
     */
    val MAX_RIDING_COOLDOWN by aliasStatic(Entity::field_29987)
    /**
     * field_29994
     */
    val UUID_KEY by aliasStatic(Entity::field_29994)
    /**
     * field_29989
     */
    val MAX_COMMAND_TAGS by aliasStatic(Entity::field_29989)
    /**
     * field_6027
     */
    val CUSTOM_NAME by aliasStatic(Entity::field_6027)
    /**
     * field_29986
     */
    val PASSENGERS_KEY by aliasStatic(Entity::field_29986)
    /**
     * field_29985
     */
    val ID_KEY by aliasStatic(Entity::field_29985)
    /**
     * field_29992
     */
    val DEFAULT_MIN_FREEZE_DAMAGE_TICKS by aliasStatic(Entity::field_29992)
    /**
     * field_5975
     */
    val NAME_VISIBLE by aliasStatic(Entity::field_5975)
    /**
     * field_29993
     */
    val FREEZING_DAMAGE_INTERVAL by aliasStatic(Entity::field_29993)
    /**
     * field_29974
     */
    val MIN_RISING_BUBBLE_COLUMN_SPEED by aliasStatic(Entity::field_29974)
    /**
     * field_29973
     */
    val DEFAULT_FRICTION by aliasStatic(Entity::field_29973)
    /**
     * method_5840
     */
    fun setRenderDistanceMultiplier(value: Double) = Entity.method_5840(value)
    /**
     * method_5824
     */
    fun getRenderDistanceMultiplier() = Entity.method_5824()
    /**
     * method_20736
     */
    fun adjustMovementForCollisions(entity: Entity, movement: Vec3d, entityBoundingBox: Box, world: world_World, collisions: MutableList<VoxelShape>) = Entity.method_20736(entity, movement, entityBoundingBox, world, collisions)
}