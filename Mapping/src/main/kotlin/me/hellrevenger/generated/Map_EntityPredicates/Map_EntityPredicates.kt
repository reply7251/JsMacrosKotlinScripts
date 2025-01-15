package me.hellrevenger.generated.Map_EntityPredicates
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<EntityPredicates>.CAN_COLLIDE by aliasStatic(EntityPredicates::field_35589)
val KClass<EntityPredicates>.EXCEPT_CREATIVE_OR_SPECTATOR by aliasStatic(EntityPredicates::field_6156)
val KClass<EntityPredicates>.VALID_LIVING_ENTITY by aliasStatic(EntityPredicates::field_6157)
val KClass<EntityPredicates>.VALID_INVENTORIES by aliasStatic(EntityPredicates::field_6152)
val KClass<EntityPredicates>.NOT_MOUNTED by aliasStatic(EntityPredicates::field_6153)
val KClass<EntityPredicates>.VALID_ENTITY by aliasStatic(EntityPredicates::field_6154)
val KClass<EntityPredicates>.EXCEPT_SPECTATOR by aliasStatic(EntityPredicates::field_6155)
fun KClass<EntityPredicates>.canBePushedBy(arg0: Entity) = EntityPredicates.method_5911(arg0)
fun KClass<EntityPredicates>.rides(arg0: Entity) = EntityPredicates.method_5913(arg0)
fun KClass<EntityPredicates>.maxDistance(arg0: Double, arg1: Double, arg2: Double, arg3: Double) = EntityPredicates.method_5909(arg0, arg1, arg2, arg3)
