package me.hellrevenger.generated.Map_EntityPredicates
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EntityPredicatesKt {
    /**
     * field_35589
     */
    val CAN_COLLIDE by aliasStatic(EntityPredicates::field_35589)
    /**
     * field_52443
     */
    val CAN_HIT by aliasStatic(EntityPredicates::field_52443)
    /**
     * field_6156
     */
    val EXCEPT_CREATIVE_OR_SPECTATOR by aliasStatic(EntityPredicates::field_6156)
    /**
     * field_6157
     */
    val VALID_LIVING_ENTITY by aliasStatic(EntityPredicates::field_6157)
    /**
     * field_6152
     */
    val VALID_INVENTORIES by aliasStatic(EntityPredicates::field_6152)
    /**
     * field_6153
     */
    val NOT_MOUNTED by aliasStatic(EntityPredicates::field_6153)
    /**
     * field_6154
     */
    val VALID_ENTITY by aliasStatic(EntityPredicates::field_6154)
    /**
     * field_6155
     */
    val EXCEPT_SPECTATOR by aliasStatic(EntityPredicates::field_6155)
    /**
     * method_5911
     */
    fun canBePushedBy(entity: Entity) = EntityPredicates.method_5911(entity)
    /**
     * method_5913
     */
    fun rides(entity: Entity) = EntityPredicates.method_5913(entity)
    /**
     * method_5909
     */
    fun maxDistance(x: Double, arg1: Double, y: Double, arg3: Double) = EntityPredicates.method_5909(x, arg1, y, arg3)
}